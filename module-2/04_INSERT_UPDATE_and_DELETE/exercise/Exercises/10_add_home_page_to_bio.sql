-- 10. For all people born before 1950 and have a home page, add the home page to the end of their biography. (142 rows)
-- Note: Assume all biographies end in a period with no trailing spaces. You'll need to also add a space before the website address.
UPDATE person
SET biography = biography || ' ' || home_page
WHERE birthday < '1950-1-1' AND home_page IS NOT NULL;

SELECT * FROM person
WHERE birthday < '1950-1-1' AND home_page IS NOT NULL;