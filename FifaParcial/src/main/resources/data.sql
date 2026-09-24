INSERT INTO COUNTRY(name, code, confederation) VALUES ('Colombia', '001', 'FCF');
INSERT INTO COUNTRY(name, code, confederation) VALUES ('Argentina', '002', 'FAF');
INSERT INTO COUNTRY(name, code, confederation) VALUES ('Peru', '003', 'FPF');


INSERT INTO MATCHES(match_date, stadium, home_country_id, away_country_id) VALUES (CURRENT_TIMESTAMP, 'Colombia vs Argentina', 1, 2);
INSERT INTO MATCHES(match_date, stadium, home_country_id, away_country_id) VALUES (CURRENT_TIMESTAMP, 'Colombia vs Peru', 1, 3);
INSERT INTO MATCHES(match_date, stadium, home_country_id, away_country_id) VALUES (CURRENT_TIMESTAMP, 'Argentina vs Peru', 2, 3);

INSERT INTO PLAYER(name, birth_date, country_id, position, fifa_score) VALUES ('James R', CURRENT_TIMESTAMP, 1, 'MC', 98);
INSERT INTO PLAYER(name, birth_date, country_id, position, fifa_score) VALUES ('L Messi', CURRENT_TIMESTAMP, 1, 'DC', 105);
INSERT INTO PLAYER(name, birth_date, country_id, position, fifa_score) VALUES ('Cristiano R', CURRENT_TIMESTAMP, 2, 'DC', 105);


INSERT INTO CLUB(name, city, country_id, founded) VALUES ('club1', 'cali', 1, CURRENT_TIMESTAMP);
INSERT INTO CLUB(name, city, country_id, founded) VALUES ('club2', 'Bogota', 1, CURRENT_TIMESTAMP);
INSERT INTO CLUB(name, city, country_id, founded) VALUES ('club3', 'cali', 2, CURRENT_TIMESTAMP);

INSERT INTO player_club(player_id, club_id, start_date, end_date) VALUES (1, 1, CURRENT_TIMESTAMP, NULL);
INSERT INTO player_club(player_id, club_id, start_date, end_date) VALUES (2, 1, CURRENT_TIMESTAMP, NULL);
INSERT INTO player_club(player_id, club_id, start_date, end_date) VALUES (3, 3, CURRENT_TIMESTAMP, NULL);
INSERT INTO player_club(player_id, club_id, start_date, end_date) VALUES (2, 3, CURRENT_TIMESTAMP, NULL);
INSERT INTO player_club(player_id, club_id, start_date, end_date) VALUES (1, 3, CURRENT_TIMESTAMP, NULL);