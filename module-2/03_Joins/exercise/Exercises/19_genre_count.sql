-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'. 
-- (19 rows, expected result for Action is around 180).
SELECT genre.genre_name, COUNT(movie) AS num_of_movies
FROM movie
JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
JOIN genre ON genre.genre_id = movie_genre.genre_id
GROUP BY genre_name;


