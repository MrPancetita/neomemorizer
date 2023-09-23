DROP SCHEMA IF EXISTS neomemorizer CASCADE;

CREATE SCHEMA IF NOT EXISTS neomemorizer; 

SET SCHEMA neomemorizer; 

CREATE TABLE IF NOT EXISTS
     tarjetamemoria (id IDENTITY NOT NULL PRIMARY KEY,
                numero INT NOT NULL, 
                palabra VARCHAR(100) NOT NULL,
                imagen VARCHAR(100) NOT NULL);
