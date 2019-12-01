DROP TABLE IF EXISTS Cars;
 
CREATE TABLE Cars (
  registration_no INT PRIMARY KEY,
  model VARCHAR(250) NOT NULL,
  owner_name VARCHAR(250) NOT NULL,
  manufacturing_year INT
);
 
INSERT INTO Cars (registration_no, model, owner_name,manufacturing_year) VALUES
  (10001,'Ferrari', 'Dangote', 2009),
  (10002,'Lambo', 'Gates', 2010),
  (10003,'Tesla', 'Alakija', 2015);