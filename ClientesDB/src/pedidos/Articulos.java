/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author alumno
 */
public class Articulos {
    /*
    codigo varchar(6) PRIMARY KEY,
	descripcion varchar(25),
	stock INT,
	stock_minimo INT,
	precio_compra float(7,2),
	precio_venta float(7,2)
    */
    public String codigo;
    public String descripcion;
    public int stock;
    public int stock_minimo;
    public float precio_compra;
    public float precio_venta;
}
