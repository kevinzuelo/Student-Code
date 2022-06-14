-- 14. The name and date established of the top 10 oldest national parks.
-- Order the results with the oldest park first.
-- (10 rows)

SELECT park_name, date_established
FROM park
ORDER BY (CURRENT_DATE - date_established) DESC
LIMIT 10;