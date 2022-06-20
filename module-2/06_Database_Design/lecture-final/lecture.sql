
-- Drop all the tables
DROP TABLE art_artist CASCADE;
DROP TABLE art;
DROP TABLE person;

START TRANSACTION;

-- Create each table 
CREATE TABLE person
(
	person_id serial,
	first_name varchar(64) not null,
	last_name varchar(64) not null,
	address varchar(100) not null,
	phone varchar(11),
	
	constraint pk_person primary key(person_id)
);

CREATE TABLE art
(
	art_id serial,
	title varchar(100),
	
	constraint pk_painting primary key(art_id)
);


CREATE TABLE art_artist
(
	art_id int not null,
	artist_id int not null,
	
	constraint pk_art_artist primary key (art_id, artist_id),
	constraint fk_art foreign key(art_id) references art(art_id),
	constraint fk_artist foreign key(artist_id) references person(person_id)

);

-- ALTER TABLE art_artist 
-- (
-- 	add	constraint fk_art foreign key(art_id) references art(art_id),
-- 	add constraint fk_artist foreign key(artist_id) references person(person_id)

-- )

--   Define primary key
--   Define each attribute and its type (and possibly constrints)

-- Add some data

INSERT INTO person (first_name, last_name, address, phone) VALUES ('Elizabeth','Jackson', '123 - 4th Avenue, Fonthill, ON L3J 4S4', '12062846783');

INSERT INTO person (first_name, last_name, address, phone) VALUES ('Jackson','Pollack', 'n/a', '');

INSERT INTO person (first_name, last_name, address, phone) VALUES ('Carol','Channing', 'n/a', '');


INSERT INTO art (title) 
VALUES ('Laugh with Teeth');

INSERT INTO art (title) 
VALUES ('At the Movies');

INSERT INTO art (title) 
VALUES ('South Toward Emerald Sea');

COMMIT TRANSACTION;

SELECT * from art_artist
