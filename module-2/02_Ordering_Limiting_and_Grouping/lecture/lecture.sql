-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT population
FROM state
ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region
FROM state
-- WHERE census_region IS NOT NULL
ORDER BY census_region DESC, state_name ASC;

-- The biggest park by area
SELECT park_name, area
FROM park
ORDER BY area DESC
LIMIT 1;

-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
FROM city
ORDER BY population DESC
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT park_name, (CURRENT_DATE - date_established) / 365 AS age
FROM park
ORDER BY age DESC, park_name ASC
LIMIT 20;

-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT (city_name || ' ' || state_abbreviation) AS city_name_and_state
FROM city;

-- The all parks by name and date established.
SELECT CONCAT('Name: ', park_name , ', Date: ',date_established) AS park_name_and_date
FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT CONCAT(state_name, ' in ', census_region, ' region')
FROM state
WHERE census_region IN ('West', 'Midwest')
ORDER BY state_name;

SELECT CONCAT(state_name, ' in ', census_region, ' region')
FROM state
WHERE census_region ILIKE ('%west')
ORDER BY state_name;

-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS avg_state_population
FROM state;

-- Total population in the West and South census regions
SELECT SUM(population) AS total_population_in_southwest
FROM state
WHERE census_region IN ('West', 'South');

-- The number of cities with populations greater than 1 million
SELECT COUNT(population) AS big_city_count
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT(state_name)
FROM state
WHERE state_nickname IS NOT NULL;

-- The area of the smallest and largest parks.
SELECT MIN(area) as smallest, MAX(area) as largest
FROM park;

-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT(city_name) AS city_count, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY city_count DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT has_camping, AVG(area) AS avg_area
FROM park
GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population), state_abbreviation AS sum_city_population
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
ORDER BY city_name
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;

-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT COUNT(city_name) AS city_count, (SELECT state_name FROM state WHERE state_abbreviation = c.state_abbreviation) 
FROM city AS c
GROUP BY state_abbreviation
ORDER BY city_count DESC;

-- Include the names of the smallest and largest parks
SELECT park_name, area FROM park p,
(SELECT MIN(area) AS smallest, MAX(area) AS largest FROM park WHERE area > 0) AS s1
WHERE p.area = s1.smallest OR p.area = s1.largest;

-- List the capital cities for the states in the Northeast census region.

SELECT state_abbreviation, city_name
FROM city
WHERE city_id IN (SELECT capital FROM state WHERE census_region = 'Northeast')
ORDER BY state_abbreviation;
