
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

create table compraweb (
	id INT(6) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	num_fra int(6),
	cliente varchar(6),
	articulo varchar(6),
	unidades FLOAT(6,2),
	fecha DATE
);

ALTER TABLE compraweb
	ADD FOREIGN KEY (cliente)
	REFERENCES clientes (codigo);
	
ALTER TABLE compraweb
	ADD FOREIGN KEY (articulo)
	REFERENCES articulos (codigo);

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

insert into compraweb (
	num_fra,
	cliente,
	articulo,
	unidades,
	fecha
) values (
	1,
	'000002',
	'000003',
	30.0,
	'2017-01-23'
),(
	2,
	'000001',
	'000001',
	1000.0,
	'2017-01-21'
),(
	3,
	'000002',
	'000001',
	10.0,
	'2017-01-25'
),(
	3,
	'000002',
	'000002',
	15.0,
	'2017-01-25'
),(
	4,
	'000003',
	'000001',
	10.0,
	'2017-01-24'
),(
	4,
	'000003',
	'000004',
	5.0,
	'2017-01-24'
),(
	4,
	'000003',
	'000002',
	2.0,
	'2017-01-24'
),(
	5,
	'000004',
	'000001',
	100.0,
	'2017-01-26'
),(
	5,
	'000004',
	'000002',
	12.0,
	'2017-01-26'
),(
	6,
	'000001',
	'000004',
	12.0,
	'2017-01-13'
),(
	6,
	'000001',
	'000001',
	9.0,
	'2017-01-13'
),(
	7,
	'000002',
	'000002',
	120.0,
	'2017-01-18'
),(
	7,
	'000001',
	'000001',
	1.0,
	'2017-01-18'
);


