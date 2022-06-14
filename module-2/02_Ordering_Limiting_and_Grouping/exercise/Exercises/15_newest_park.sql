-- 15. The name and date established of the newest national park.
-- (1 row)
SELECT park_name, date_established
FROM park
ORDER BY (CURRENT_DATE - date_established) ASC
LIMIT 1;


