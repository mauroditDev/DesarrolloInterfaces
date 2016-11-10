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
            vistaInforme.setTitle("Ejemplo de iReport");
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
            vistaInforme.setTitle("Ejemplo de iReport");
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        return vistaInforme;
}
}
