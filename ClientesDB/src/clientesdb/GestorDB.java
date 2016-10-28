/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesdb;

import clientesdb.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                    + cl.codigo + ','
                    + cl.nif + ','
                    + cl.apellidos + ','
                    + cl.nombre + ','
                    + cl.domicilio + ','
                    + cl.localidad + ','
                    + cl.codigo_postal + ','
                    + cl.telefono + ','
                    + cl.movil + ','
                    + cl.fax + ','
                    + cl.email + ','
                    + cl.total_ventas
                    + ")");
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}