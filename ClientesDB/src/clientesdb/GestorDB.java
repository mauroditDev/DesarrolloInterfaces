/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesdb;

import java.io.File;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


// Clases para gestionar el parámetro definido en el informe.
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
// Clases de JasperReports.
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;

/**
 *
 * @author alumno
 */
public class GestorDB {
    Connection con;
    Statement stmnt;
    
    public GestorDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           
           con = DriverManager.getConnection("jdbc:mysql://localhost/almacen",
                   "root","root");
           
           con.setAutoCommit(false);
           
           stmnt = con.createStatement();
            
        }catch(ClassNotFoundException | InstantiationException |
                IllegalAccessException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> getCodigos(){
        ArrayList<String> res = new ArrayList();
        try{
            ResultSet rs = stmnt.executeQuery("SELECT codigo FROM clientes");
            while(rs.next()){
                res.add(rs.getString(1));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return res;
    }
    
    public boolean altaCliente(Clientes cl){
        try{     
            stmnt.executeUpdate("INSERT INTO clientes VALUES("
                    + '"' + cl.codigo + '"' + ','
                    + '"' + cl.nif + '"' + ','
                    + '"' + cl.apellidos + '"' + ','
                    + '"' + cl.nombre + '"' + ','
                    + '"' + cl.domicilio + '"' + ','
                    + '"' + cl.localidad + '"' + ','
                    + '"' + cl.codigo_postal + '"' + ','
                    + '"' + cl.telefono + '"' + ','
                    + '"' + cl.movil + '"' + ','
                    + '"' + cl.fax + '"' + ','
                    + '"' + cl.email + '"' + ','
                    + '"' + cl.total_ventas + '"' 
                    + ");");
            con.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean bajaCliente(String codigo){
        try{
            stmnt.executeUpdate("DELETE FROM clientes WHERE codigo=\""+codigo+"\";");
            con.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public String getField(String campo, String codigo){
        try{
            ResultSet rs = stmnt.executeQuery(
                    "SELECT "+campo+" FROM clientes WHERE codigo= \""+codigo+"\";");
            
            while(rs.next()){
                if(campo.equals("total_ventas")){
                    float aux = rs.getFloat(1);
                    return String.valueOf(aux);
                }
                return (rs.getString(1));
            }
            return ""; 
            
            
            
        }catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }
    
    public boolean modCliente(String codigo, Clientes cl){
        try{     
            stmnt.executeUpdate("UPDATE clientes SET"
                    +" nif = "+
                    '"' + cl.nif + '"' + ','
                    +" apellidos = "+
                    '"' + cl.apellidos + '"' + ','
                    +" nombre = "+
                    '"' + cl.nombre + '"' + ','
                    +" domicilio = "+
                    '"' + cl.domicilio + '"' + ','
                    +" localidad = "+
                    '"' + cl.localidad + '"' + ','
                    +" codigo_postal = "+
                    '"' + cl.codigo_postal + '"' + ','
                    +" telefono = "+
                    '"' + cl.telefono + '"' + ','
                    +" movil = "+
                    '"' + cl.movil + '"' + ','
                    +" fax = "+
                    '"' + cl.fax + '"' + ','
                    +" email = "+
                    '"' + cl.email + '"' 
                    + " WHERE codigo = " + '"' + cl.codigo + '"'+
                    ";");
            con.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
    public JasperViewer ejecutarInforme(String inicio, String fin) {
    /* Se crea el objeto JasperViewer que devolverá el método.
     * Este objeto contendrá la ventana de la vista previa del informe. */
    JasperViewer vistaInforme=null;
    try {
        /* Creamos una cadena que contendrá la ruta completa donde está
         * almacenado el archivo report1.jasper. */
        String archivoJasper = "/media/Datos/Datos_Mauro/Desarrollo_Interfaces/"
                + "Calculadora/ClientesDB/mysql-connector-java-5.1.40/report2.jasper";
            // Se crea un objeto para cargar el informe.
            JasperReport informeCargado = null;
            try
            {
                informeCargado = (JasperReport) JRLoader.loadObject(archivoJasper);
            }
            catch (Exception e)
            {
                System.out.println("Error al cargar el informe: " + e.getMessage());
            }
            Map parametro = new HashMap();
            parametro.put("fin", fin);
            parametro.put("inicio",inicio);
            JasperPrint informe =
                    JasperFillManager.fillReport(informeCargado,parametro,con);
            vistaInforme = new JasperViewer(informe,false);
            vistaInforme.setTitle("Informe");
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        return vistaInforme;
    }
    
    public JasperViewer ejecutarPie() {
    /* Se crea el objeto JasperViewer que devolverá el método.
     * Este objeto contendrá la ventana de la vista previa del informe. */
    JasperViewer vistaInforme=null;
    try {
        /* Creamos una cadena que contendrá la ruta completa donde está
         * almacenado el archivo report1.jasper. */
        String archivoJasper = "/media/Datos/Datos_Mauro/Desarrollo_Interfaces"
                + "/Calculadora/ClientesDB/mysql-connector-java-5.1.40/report2-graf.jasper";
            // Se crea un objeto para cargar el informe.
            JasperReport informeCargado = null;
            try
            {
                informeCargado = (JasperReport) JRLoader.loadObject(new File(archivoJasper));
            }
            catch (Exception e)
            {
                System.out.println("Error al cargar el informe: " + e.getMessage());
            }
            Map parametro = new HashMap();
            JasperPrint informe =
                    JasperFillManager.fillReport(informeCargado,parametro,con);
            vistaInforme = new JasperViewer(informe,false);
            vistaInforme.setTitle("Gráfico");
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        return vistaInforme;
    }
    
    public ArrayList<String> getCliente(String codigo, int estado){
        ArrayList<String> valores = new ArrayList<>();
        try{
            String sql = "";
            switch(estado){
                case 0: sql="SELECT nif, nombre, apellidos, domicilio, localidad, codigo_postal,"
                            + " total_ventas FROM clientes WHERE codigo= \""+codigo+"\";";
                    break;
                case 1: sql="SELECT nif, nombre, apellidos, domicilio, localidad, codigo_postal,"
                            + " total_compras FROM proveedores WHERE codigo= \""+codigo+"\";";
                    break;
            }
            
            ResultSet rs = stmnt.executeQuery(sql);
            
            while(rs.next()){
                for(int i = 1; i<8; i++){
                    if(i==7){
                        valores.add(String.valueOf(rs.getFloat(i)));
                        System.out.println(String.valueOf(rs.getFloat(i)));
                    }
                    else
                        valores.add(rs.getString(i));
                }
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return valores;
    }
    
    public ArrayList<String> getArticulo(String codigo, int estado){
        ArrayList<String> valores = new ArrayList<>();
        try{
            String sql = "";
            /*
            descripcion varchar(25),
	stock INT,
	stock_minimo INT,
	precio_compra float(7,2),
	precio_venta float(7,2)
            */
            switch(estado){
                case 0:
                    sql="SELECT descripcion, stock, precio_venta ";   
                    break;
                case 1:
                    sql="SELECT descripcion, stock, precio_compra ";
                    break;
            }
            sql += "FROM articulos WHERE codigo= \""+codigo+"\";";
            
            ResultSet rs = stmnt.executeQuery(sql);
            
            while(rs.next()){
                for(int i = 1; i<4; i++){
                    valores.add(rs.getString(i));
                }
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return valores;
    }
    
    public boolean actualizar(int estado, String codigo,String articulo,int unidades,double importe){
        try{
            switch(estado){
                case 0:
                    stmnt.executeUpdate("UPDATE clientes SET total_ventas "
                        + "= total_ventas + " + String.valueOf(importe)
                            + "WHERE codigo = \"" + codigo + "\""
                    +";");
                    break;
                case 1:
                    stmnt.executeUpdate("UPDATE proveedores SET total_compras "
                        + "= total_compras + " + String.valueOf(importe)
                        + "WHERE codigo = \"" + codigo + "\""
                    +";");
                    break;
            }
            switch(estado){
                case 0:
                    stmnt.executeUpdate("UPDATE articulos SET stock = stock-"
                    +String.valueOf(unidades)
                    +" WHERE codigo = \""
                    +articulo+"\""
                    +";");
                    break;
                case 1:
                    stmnt.executeUpdate("UPDATE articulos SET stock = stock+"
                    +String.valueOf(unidades)
                    +" WHERE codigo = \""
                    +articulo+"\""
                    +";");
                    break;
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void volver(){
        try{
            con.rollback();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void facturar(){
        try{
            con.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Vector getTodosArts(int estado){
        Vector res = new Vector();
        try{
            String sql = new String();
            switch(estado){
                case 0:
                    sql="SELECT codigo, descripcion, stock, precio_venta ";   
                    break;
                case 1:
                    sql="SELECT codigo, descripcion, stock, precio_compra ";
                    break;
            }
            sql += "FROM articulos";
            
            ResultSet rs = stmnt.executeQuery(sql);
            
            int j=0;
            while(rs.next()){
                for(int i = 1; i<5; i++){
                    res.insertElementAt(rs.getString(i), j++);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
    
}
