-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population
FROM state
ORDER BY population DESC;


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT census_region, state_name
FROM state
-- WHERE census_region IS NOT NULL
ORDER BY census_region DESC, state_name ASC;




-- The biggest park by area
SELECT park_name, area
FROM park
ORDER BY area DESC
LIMIT 1;


-- LIMITING RESULTS

-- The 10 largest cities by population
SELECT city_name, population
FROM city
ORDER BY population DESC
LIMIT 10;


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT park_name, (CURRENT_DATE - date_established) / 365 AS age
FROM park
ORDER BY age DESC, park_name ASC
LIMIT 20;

-- SELECT park_name, date_part('year', CURRENT_DATE) - date_part('year', date_established) AS age, date_part('month', date_established) AS month 
-- FROM park
-- ORDER BY age DESC, park_name ASC
-- LIMIT 20;

-- SELECT park_name, EXTRACT(year from CURRENT_DATE) - EXTRACT(year from date_established) AS age, date_part('month', date_established) AS month 
-- FROM park
-- ORDER BY age DESC, park_name ASC
-- LIMIT 20;

-- CONCATENATING OUTPUTS

-- All city names and their state abbreviations.
SELECT city_name, state_abbreviation
FROM city
ORDER BY city_name;

SELECT (city_name || ' (' || state_abbreviation || ')') AS city_state
FROM city
ORDER BY city_name;

SELECT CONCAT(city_name, ' (', state_abbreviation, ')') AS city_state
FROM city
ORDER BY city_name;


-- The all parks by name and date established.
SELECT ('Name: ' || park_name || ', Date established: ' || date_established) AS park_date
FROM park
ORDER BY park_name;


-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT (state_name || ' in ' || census_region || ' region') AS state_and_region
FROM state
WHERE census_region IN ('West', 'Midwest')
ORDER BY census_region, state_name;

SELECT (state_name || ' in ' || census_region || ' region') AS state_and_region
FROM state
WHERE census_region ILIKE '%west'
ORDER BY census_region, state_name;

-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS avg_state_population
FROM state;


-- Total population in the West and South census regions
SELECT SUM(population) AS west_south_population
FROM state
WHERE census_region IN ('West', 'South');

-- The number of cities with populations greater than 1 million
SELECT COUNT(population) AS big_cities_count
FROM city
WHERE population > 1000000;


-- The number of state nicknames.
SELECT COUNT(state_nickname) AS nickname_count, COUNT(*) AS row_count
FROM state;


-- The area of the smallest and largest parks.
SELECT MIN(area) As smallest, MAX(area) AS largest
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT(city_name) AS city_count, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY city_count DESC;

-- SELECT city_name 
-- FROM city
-- WHERE state_abbreviation = 'ME';

-- Determine the average park area depending upon whether parks allow camping or not.
-- SELECT * from park;
SELECT has_camping, AVG(area) as avg_park_area
FROM park
GROUP BY has_camping;


-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population) AS sum_city_population, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;


-- The smallest city population in each state ordered by city population.
SELECT MIN(population) AS min_city_population, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY min_city_population;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, state_abbreviation
FROM city
ORDER By city_name
OFFSET 10 ROWS FETCH NEXT 10 ROWS ONLY;


-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT COUNT(city_name) AS city_count, (SELECT state_name FROM state WHERE state_abbreviation = city.state_abbreviation) AS state_name
FROM city
GROUP BY state_abbreviation
ORDER BY city_count DESC;

-- Include the names of the smallest and largest parks
SELECT park_name, area
FROM park AS p,
     (SELECT MIN(area) As smallest, MAX(area) AS largest FROM park WHERE area > 0) as s1
WHERE p.area = s1.smallest OR p.area = s1.largest;

-- List the capital cities for the states in the Northeast census region.
SELECT (SELECT state_name FROM state WHERE state_abbreviation = city.state_abbreviation) AS state_name, city_name
FROM city
WHERE city_id IN (SELECT capital FROM state WHERE census_region = 'Northeast')
ORDER BY state_name;

SELECT state_name, (SELECT city_name FROM city WHERE city_id = capital) AS name
FROM state
WHERE census_region = 'Northeast'
ORDER BY state_name;

