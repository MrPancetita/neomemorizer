DROP SCHEMA IF EXISTS memorizersin CASCADE;
CREATE SCHEMA IF NOT EXISTS memorizersin; 

SET SCHEMA memorizersin; 

CREATE TABLE IF NOT EXISTS
     tarjetamemoria (id IDENTITY NOT NULL PRIMARY KEY,
                numero INT NOT NULL, 
                palabra VARCHAR(100) NOT NULL,
                imagen VARCHAR(100) NOT NULL);
