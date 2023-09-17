CREATE SCHEMA IF NOT EXISTS memorizersin; 

SET SCHEMA memorizersin; 

CREATE TABLE IF NOT EXISTS
     materialsin (id IDENTITY NOT NULL PRIMARY KEY,
                numero INT NOT NULL, 
                palabra VARCHAR(100) NOT NULL,
                imagenPath VARCHAR(100) NOT NULL);
