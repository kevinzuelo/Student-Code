-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT person.person_name, movie.title
FROM movie_actor
JOIN person ON person.person_id = movie_actor.actor_id
JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE person.person_name LIKE '% Jones'
ORDER BY person_name;
