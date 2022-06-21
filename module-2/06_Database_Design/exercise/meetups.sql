-- Database: Meetups

-- DROP DATABASE "Meetups";
DROP TABLE member_group;
DROP TABLE member_event;
DROP TABLE interest_group CASCADE;
DROP TABLE event;
DROP TABLE member;

START TRANSACTION;

CREATE TABLE member (
	member_id serial,
	last_name varchar(64) NOT NULL,
	first_name varchar(64) NOT NULL,
	email varchar(100) NOT NULL,
	phone_number varchar(11),
	birthday date NOT NULL,
	email_reminder boolean,
	
	CONSTRAINT pk_member_id PRIMARY KEY(member_id)
);

CREATE TABLE interest_group (
	group_id serial,
	name varchar(100) NOT NULL,
	
	CONSTRAINT pk_group PRIMARY KEY(group_id),
	CONSTRAINT uq_group UNIQUE(name)
);

CREATE TABLE member_group (
	member_id serial,
	group_id serial,
	
	CONSTRAINT pk_member_group_id PRIMARY KEY(member_id, group_id),
	CONSTRAINT fk_member_group_member_id FOREIGN KEY(member_id) REFERENCES member(member_id),
	CONSTRAINT fk_group_group_id FOREIGN KEY(group_id) REFERENCES interest_group(group_id)
);

CREATE TABLE event (
	event_id serial,
	name varchar(100) NOT NULL,
	description varchar(500) NOT NULL,
	start_date_and_time timestamp NOT NULL,
	duration_minutes int NOT NULL,
	group_hosting serial,
	
	
	CONSTRAINT min_duration CHECK (duration_minutes >= 30),
	CONSTRAINT pk_event_id PRIMARY KEY(event_id),
	CONSTRAINT fk_group_hosting FOREIGN KEY(group_hosting) REFERENCES interest_group(group_id)
	
);

CREATE TABLE member_event (
	member_id serial,
	event_id serial,
	
	CONSTRAINT pk_member_event_id PRIMARY KEY(member_id, event_id),
	CONSTRAINT fk_member_event_member_id FOREIGN KEY(member_id) REFERENCES member(member_id),
	CONSTRAINT fk_member_event_event_id FOREIGN KEY(event_id) REFERENCES event(event_id)
);

INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Rodriguez', 'Kevin', 'kevin123@yahoo.com', 12164561234, '06-20-1995', true),
	('Smith', 'John', 'john123@yahoo.com', 14567854851, '07-25-1985', true),
	('Bradford', 'Laura', 'laura123@yahoo.com', 15621485554, '03-12-1990', false),
	('Fello', 'Tim', 'coachTim123@yahoo.com', 51457845511, '02-02-1982', true),
	('Smalls', 'Sidney', 'sid123@yahoo.com', 12345495712, '12-14-2002', false),
	('Rivera', 'Lemmy', 'lemmy123@yahoo.com', 14451028547, '01-24-1952', false),
	('Lynch', 'Moira', 'mo123@yahoo.com', 15211234857, '02-20-1948', true),
	('Pope', 'Bethany', 'beth123@yahoo.com', 12161234564, '06-11-1993', false);

INSERT INTO interest_group(name)
	VALUES('Board Game Enthusiasts'),
		('Film Lovers'),
		('Sports Fanatics');	

INSERT INTO event(name, description, start_date_and_time, duration_minutes, group_hosting)
	VALUES('Championship Parade', 'Come celebrate the Cavs winning a championship in downtown Cleveland.', '06-22-2016 12:00:00', 480, 3),
	('Carcassonne Tournament', 'Carcassonne tournament for all you meeples.', '08-12-2022 05:00:00', 180, 1),
	('David Lynch Marathon', 'Come celebrate the films of David Lynch.', '06-22-2016 12:00:00', 480, 2),
	('Settlers of Catan Tournament', 'Catan Tournament at Critical Hit Games', '07-13-2022 12:00:00', 180, 1);
	
INSERT INTO member_group(member_id, group_id)
	VALUES(1,1), (2,1), (3,2), (4,1), (5,2), (3,1), (6,3), (7,1), (8,3), (1,2), (1,3);
	
INSERT INTO member_event(member_id, event_id)
	VALUES(1,2), (1,4), (2,3), (7,4), (5,3), (8,2), (3,2), (4,1), (6,3), (8,1);
	
-- 	SELECT * FROM member
-- 	JOIN member_group ON member_group.member_id = member.member_id
-- 	JOIN interest_group ON member_group.group_id = interest_group.group_id
-- 	JOIN member_event ON member_event.member_id = member.member_id

COMMIT TRANSACTION;