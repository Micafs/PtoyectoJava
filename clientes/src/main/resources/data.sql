CREATE TABLE cliente (
    dni int NOT NULL,
    nombre varchar(60) NOT NULL,
    apellido varchar(40),
    fecha_nacimiento date,
    PRIMARY KEY (dni)
);

insert into cliente(dni,nombre,apellido,fecha_nacimiento)
values (39874926,'micaela','flores','1996-09-23');