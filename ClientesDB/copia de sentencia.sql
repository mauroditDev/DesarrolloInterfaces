drop database almacen;

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

insert into clientes VALUES (
"z00001",
"12345645T",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"z00002",
"12345645T",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"z00003",
"12345645T",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"z00004",
"12345645T",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"z00005",
"12345645T",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"z00006",
"12345645T",
"asd","asd",
"domicilio",
"Villalba",
"28400",
"111111111","111111111","111111111",
"email",0.0
),(
"zx0001",
"12345645T",
"asd","asd",
"domicilio",
"Torrelodones",
"28440",
"111111111","111111111","111111111",
"email",0.0
),(
"zx0002",
"12345645T",
"asd","asd",
"domicilio",
"Torrelodones",
"28440",
"111111111","111111111","111111111",
"email",0.0
),(
"zx0003",
"12345645T",
"asd","asd",
"domicilio",
"Torrelodones",
"28440",
"111111111","111111111","111111111",
"email",0.0
),(
"zx0004",
"12345645T",
"asd","asd",
"domicilio",
"Torrelodones",
"28440",
"111111111","111111111","111111111",
"email",0.0
);