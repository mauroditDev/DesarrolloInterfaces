
drop database if exists almacen;

create database almacen;

use almacen;

create table clientes(
	codigo varchar(6) PRIMARY KEY,
	nif varchar(9),
	apellidos varchar(35),
	nombre varchar(15),
	domicilio varchar(40),
	localidad varchar(20),
	codigo_postal varchar(5),
	telefono varchar(9),
	movil varchar(9),
	fax varchar(9),
	email varchar(20),
	total_ventas float(7,2)
);

create table proveedores(
	codigo varchar(6) PRIMARY KEY,
	nif varchar(9),
	apellidos varchar(35),
	nombre varchar(15),
	domicilio varchar(40),
	localidad varchar(20),
	codigo_postal varchar(5),
	telefono varchar(9),
	fax varchar(9),
	movil varchar(9),
	email varchar(20),
	total_compras float(7,2)
);

create table articulos (
	codigo varchar(6) PRIMARY KEY,
	descripcion varchar(25),
	stock INT,
	stock_minimo INT,
	precio_compra float(7,2),
	precio_venta float(7,2)
);

insert into articulos VALUES (
	"000001",
	"Lampara de pie",
	100,
	10,
	25,
	63.11
),(
	"000002",
	"Lampara de mesa",
	200,
	20,
	9,
	14.22
),(
	"000003",
	"Reloj despertador",
	300,
	30,
	4,
	9.33
),(
	"000004",
	"Lámpara de lava",
	400,
	40,
	16,
	28.44
);

insert into proveedores VALUES(
	"000001",
	"55577789P",
	"asd","asd",
	"domicilio",
	"Villalba",
	"28400",
	"111111111","111111111","111111111",
	"email",0.0
	),(
	"000002",
	"55577789P",
	"asd","asd",
	"domicilio",
	"Villalba",
	"28400",
	"222222222","222222222","222222222",
	"email",0.0
	),(
	"000003",
	"55577789P",
	"asd","asd",
	"domicilio",
	"Villalba",
	"28400",
	"333333333","333333333","333333333",
	"email",0.0
);

insert into clientes VALUES (
"000001",
"12345645C",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"000002",
"12345645C",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"000003",
"12345645C",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"000004",
"12345645C",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"000005",
"12345645C",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"000006",
"12345645C",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
);