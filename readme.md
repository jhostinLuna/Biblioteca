# Biblioteca
Este es un Ejercicio de desarrollo de clase de DAM, consiste en realizar una base de datos que tenga 3 tablas (libro, lector y prestamo)
Para crear la bases de datos podemos usar XAMP que crea tanto el servidor como la base de datos y a tra ves de la interfaz de usuario phpmyadmin
podemos crear las bases de datos, el siguiente codigo es el que deberia ejecutarse para crear la base de datos para que la app escrita en Java 
se conecte a las bases de datos: 
CREATE TABLE Libro (
    id INT AUTO_INCREMENT,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    aniopublicación INT,
    disponible BOOLEAN,
    PRIMARY KEY (id)
);

CREATE TABLE Lector (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    email VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE Préstamo (
    id INT AUTO_INCREMENT,
    fecha_prestamo DATE,
    fecha_devolucion DATE,
    libro_id INT,
    lector_id INT,
    FOREIGN KEY (libro_id) REFERENCES Libro(id),
    FOREIGN KEY (lector_id) REFERENCES Lector(id),
    PRIMARY KEY (id)
);
Esta app utiliza la biblioteca de Hibernate para el mapeo de las bases de datos relacionales y JDBC para la conexión.
