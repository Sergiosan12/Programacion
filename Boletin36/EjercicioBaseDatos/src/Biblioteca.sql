CREATE DATABASE Biblioteca;

USE Biblioteca;

CREATE TABLE Libros (
                        ID SERIAL PRIMARY KEY,
                        Titulo VARCHAR(255),
                        Autor VARCHAR(255),
                        AnoPublicacion INT,
                        Disponible BOOLEAN
);