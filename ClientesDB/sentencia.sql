drop database almacen;

create database almacen;

use almacen;

create table clientes(
	codigo varchar(6) PRIMARY KEY,
	nif varchar(9),
	apellidos varchar(35),
	nombre varchar(15),
	domicilio varchar(40),
	codigo_postal varchar(5),
	telefono varchar(9),
	movil varchar(9),
	fax varchar(9),
	email varchar(20),
	total_ventas float(7,2)
);