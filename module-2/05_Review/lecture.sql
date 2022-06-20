-- Review day stuff

-- How many movies in each genre
SELECT COUNT(*) AS movies_in_genre, genre.genre_name
FROM movie
JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
JOIN genre ON movie_genre.genre_id = genre.genre_id
GROUP BY genre.genre_name

-- For each actor, number of movies of each genre they have been in
SELECT genre_name, person.person_name, COUNT(*) AS person_genre_count
FROM person
JOIN movie_actor ON person.person_id = movie_actor.actor_id
JOIN movie_genre ON movie_actor.movie_id = movie_genre.movie_id
JOIN genre ON movie_genre.genre_id = genre.genre_id 
JOIN movie ON movie_actor.movie_id = movie.movie_id
GROUP BY person.person_name, genre.genre_name

-- SELECT genre_name, person.person_name, COUNT(*) AS person_genre_count
-- FROM person
-- JOIN movie_actor ON person.person_id = movie_actor.actor_id
-- JOIN movie_genre ON movie_actor.movie_id = movie_genre.movie_id
-- JOIN genre ON movie_genre.genre_id = genre.genre_id 
-- JOIN movie ON movie_actor.movie_id = movie.movie_id
-- GROUP BY genre.genre_name, person.person_name
