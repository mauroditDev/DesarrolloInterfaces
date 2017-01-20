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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


// Clases para gestionar el parámetro definido en el informe.
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
// Clases de JasperReports.
//import net.sf.jasperreports.engine.*;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.*;

/**
     * <h7>GestorDB: </h7>
    * <ul><h7>public class GestorDB</h7>
    * <ul>
    * <br>
    * Clase de Gestión de base de datos para el proyecto de gestión de almacén.
    * <br>
    * <br>
    * <li>
    *  Tiene un objeto java.sql.Connection para gestionar su conexión
    * </li>
    * <li>
    * Guarda un objeto java.sql.Statement perteneciente el anterior para agilizar
    * la operativa
    * </li>
    * <li>
    *  Requiere la inclusión de las librerías del conector a la base de datos,
    * en este caso (com.mysql.jdbc.Driver)
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/Driver.html">com.mysql.jdbc.Driver</a>
     */
public class GestorDB {
    Connection con;
    Statement stmnt;
    
    /**
     * <h7>GestorDB(): </h7>
    * <ul><h7>public GestorDB()</h7>
    * <ul>
    * <br>
    * Constructor de la clase de Gestión de base de datos para el proyecto de
    * gestión de almacén.
    * <br>
    * <br>
    * <li>
    *  Instancia y carga el driver para conectar a la base de datos MySQL
    * </li>
    * <li>
    *  Crea la conexión y pone el auto commit a false
    * </li>
    * <li>
    *  Crea el objeto para los Statement
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/Driver.html">com.mysql.jdbc.Driver</a>
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/Connection.html">Connection.createStatement()</a>
     */
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
    
    /**
    * <h7>getCodigos(): </h7>
    * <ul><h7>public ArrayList&lt;String&gt; getCodigos()</h7>
    * <ul>
    * <br>
    * Función que devuelve todos los valores del campo "codigo" de la tabla 
    * "clientes"
    * <br>
    * <br>
    * <li>
    *  Query = "SELECT codigo FROM clientes"
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @return ArrayList&lt;String&gt; conteniendo todos los resultados de la
     * tabla en el campo codigo
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/StatementImpl.html#executeQuery%28java.lang.String%29">Statement.executeQuery(String)</a>
     */
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
    
    /**
     * <h7>altaCliente(): </h7>
    * <ul><h7>public boolean altaCliente()</h7>
    * <ul>
    * <br>
    * Función que da de alta un cliente en la aplicación
    * <br>
    * <br>
    * <li>
    *  Realiza un insert en la tabla con todos los campos pasados en forma de
    * un objeto de tipo Cliente
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @param cl el objeto cliente para dar de alta
     * @return true si la inserción ha sido exitosa, false si ha habido alguna
     * excepción
     */
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
    
    /**
    *<h7>bajaCliente(): </h7>
    * <ul><h7>public boolean bajaCliente()</h7>
    * <ul>
    * <br>
    * Función que da de baja un cliente que exista en la aplicación
    * <br>
    * <br>
    * <li>
    *  Sentencia SQL = " DELETE FROM cliente WHERE codigo = 'valor_dado' "
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @param codigo el código del cliente que quiere darse de baja de la 
     * aplicación
     * @return true si el update es correcto, false si ha ocurrido alguna 
     * excepción
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/StatementImpl.html#executeUpdate%28java.lang.String%29"> Statement.executeUpdate(java.lang.String) </a>
     */
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
     /**
    *<h7>getField(): </h7>
    * <ul><h7>public String getField(String campo, String codigo)</h7>
    * <ul>
    * <br>
    * Función que devuelve el valor de un campo de la tabla "clientes" de un
    * único cliente
    * <br>
    * <br>
    * <li>
    *  Sentencia SQL = "SELECT 'campo' FROM clientes WHERE codigo= 'codigo'"
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @param campo nombre de la columna cuyo resultado va a mostrarse.
     * @param codigo identificador del cliente cuyo campo necesita recuperarse.
     * @return String con el valor del campo objetivo.
     */
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
    
    public boolean compraOnline(Articulo art, int num_fra, Clientes cli){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(new Date());
            stmnt.executeUpdate(
                    "insert into compraweb ("
                            + "num_fra," +
                            "cliente," +
                            "articulo," +
                            "unidades," +
                            "fecha)"+
                    "values ("
                            + num_fra +
                            cli.codigo+
                            art.codigo+
                            art.cantidad+
                            fecha+")"
            );
            con.commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public HashMap getTodoFromFra(int idFra){
        try{
            HashMap res = new HashMap();
            
            ResultSet rs = stmnt.executeQuery(
                    "select * from compraweb where num_fra ="+idFra
            );
            ArrayList<Articulo> arts = new ArrayList<>();
            ArrayList<Float> cants = new ArrayList<>();
            if(rs.next()){
                res.put("cli", this.getCliente(rs.getString("cliente")));
                res.put("fecha", rs.getString("fecha"));
                cants.add(rs.getFloat("unidades"));
                arts.add(this.getArticulo(rs.getString("articulo")));
            }
            else{
                return null;
            }
            while(rs.next()){
                cants.add(rs.getFloat("unidades"));
                arts.add(this.getArticulo(rs.getString("articulo")));
            }
            res.put("cantidades", cants);
            res.put("articulos", arts);
            return res;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public int ultimaFactura(){
        try{
            ResultSet rs = stmnt.executeQuery(
                    "select num_fra from compraweb order by id desc limit 1"
            );
            if(rs.next()){
                return rs.getInt("num_fra")+1;
            }
            else{
                return 1;
            }
        }
        catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    
    /**
    *<h7>modCliente(): </h7>
    * <ul><h7>public boolean modCliente()</h7>
    * <ul>
    * <br>
    * Función que modifica los datos que figuran asociados a un cliente en la
    * aplicación.
    * <br>
    * <br>
    * <li>
    *  El cliente se selecciona a través de su código, pero el set de datos
    * nuevos se pasa completo
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio 
     * @param codigo codigo del cliente a modificar
     * @param cl objeto Clientes que contiene los nuevos datos para el cliente
     * @return true si el UPDATE ha sido exitoso y false si ha habido alguna
     * excepción
     */
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
    
    /**
    * <h7>ejecutarInforme: </h7>
    * <ul><h7>public JasperViewer ejecutarInforme(String inicio, String fin)</h7>
    * <ul>
    * <br>
    * Función que crea un informe creado en iReports con los parámetros indicados
    * que visualiza el listado de clientes mostrando algunos de sus datos
    * <br>
    * <br>
    * <li>
    * Requiere la librería JasperReports
    * </li>
    * <li>
    * Las modificaciones al informe deberán aplicarse al archivo que carga la
    * función (/media/Datos/Datos_Mauro/Desarrollo_Interfaces/Calculadora/
    * ClientesDB/mysql-connector-java-5.1.40/report2.jasper)
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @param inicio String que indica el código del primer cliente que se 
     * muestra en el informe
     * @param fin String que indica el código del último cliente mostrado
     * @return un objeto tipo JasperViewer para visualizar el informe generado,
     * en caso de error el retorno será null
     * @see <a href="http://jasperreports.sourceforge.net/api/net/sf/jasperreports/view/JasperViewer.html">JasperViewer</a>
     */
    //public JasperViewer ejecutarInforme(String inicio, String fin) {
    /* Se crea el objeto JasperViewer que devolverá el método.
     * Este objeto contendrá la ventana de la vista previa del informe. */
    //JasperViewer vistaInforme=null;
    //try {
        /* Creamos una cadena que contendrá la ruta completa donde está
         * almacenado el archivo report1.jasper. */
    //    String archivoJasper = "/media/Datos/Datos_Mauro/Desarrollo_Interfaces/"
//                + "Calculadora/ClientesDB/mysql-connector-java-5.1.40/report2.jasper";
            // Se crea un objeto para cargar el informe.
     //       JasperReport informeCargado = null;
     //       try
     //       {
     //           informeCargado = (JasperReport) JRLoader.loadObject(archivoJasper);
     //       }
     //       catch (Exception e)
     //       {
     //           System.out.println("Error al cargar el informe: " + e.getMessage());
     /*       }
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
    */
    /**
    * <h7>ejecutarPie: </h7>
    * <ul><h7>public JasperViewer ejecutarPie()</h7>
    * <ul>
    * <br>
    * Función que crea un informe creado en iReports que muestra un grafico de
    * tipo tarta (pie chart) con los datos de códigos postales y localidades
    * de los clientes en la base de datos.
    * <br>
    * <br>
    * <li>
    * Requiere la librería JasperReports
    * </li>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @return un objeto tipo JasperViewer para visualizar el informe generado,
     * en caso de error el retorno será null
     * @see <a href="http://jasperreports.sourceforge.net/api/net/sf/jasperreports/view/JasperViewer.html">JasperViewer</a>
     */
    //public JasperViewer ejecutarPie() {
    /* Se crea el objeto JasperViewer que devolverá el método.
     * Este objeto contendrá la ventana de la vista previa del informe. */
    //JasperViewer vistaInforme=null;
    //try {
        /* Creamos una cadena que contendrá la ruta completa donde está
         * almacenado el archivo report1.jasper. */
     /*   String archivoJasper = "/media/Datos/Datos_Mauro/Desarrollo_Interfaces"
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
    */
    /**
     * <h7>getCliente: </h7>
    * <ul><h7>public ArrayList&lt;String&gt; getCliente(String codigo, int estado)</h7>
    * <ul>
    * <br>
    * Función que obtiene los datos para imprimir en la aplicación de Gestión de
    * pedidos del cliente o proveedor(según el campo estado)
    * <br>
    * <br>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio 
     * @param codigo codigo del cliente o proveedor que debe recuperarse
     * @param estado entero que indica si el resultado deseado es un cliente: 0
     * o un proveedor: 1
     * @return ArrayList&lt;String&gt; el valor de las columnas nif, nombre,
     * apellidos, domicilio, localidad, codigo_postal,total_ventas de la tabla 
     * correspondiente según el parámetro "codigo". Devolverá un 
     * ArrayList&lt;String&gt; vacío en caso de darse una excepción
     */
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
    
    public Clientes getCliente(String cod){
        try{
            ResultSet rs = stmnt.executeQuery("select * from clientes where codigo ='"+cod+"'");
            if(rs.next()){
                Clientes res = new Clientes();
                res.codigo = rs.getString("codigo");
                res.nif = rs.getString("nif");
                res.apellidos = rs.getString("apellidos");
                res.nombre = rs.getString("nombre");
                res.domicilio = rs.getString("domicilio");
                res.localidad = rs.getString("localidad");
                res.email = rs.getString("email");
                res.codigo_postal = rs.getString("codigo_postal");
                res.total_ventas = rs.getFloat("total_ventas");
                return res;
            }
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * <h7>getArticulo: </h7>
    * <ul><h7>public ArrayList&lt;String&gt; getArticulo(String codigo,
    * int estado)</h7>
    * <ul>
    * <br>
    * Función de la aplicación de Gestión de Pedidos que obtiene los datos 
    * requeridos del artículo indicado
    * <br>
    * <br>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @param codigo codigo identificador del artículo cuyos datos se piden
     * @param estado entero que indica si el resultado deseado es un cliente: 0
     * o un proveedor: 1
     * @return ArrayList&lt;String&gt; el valor de las columnas descripcion, 
     * stock, precio_venta o precio_compra (según corresponda por el estado) de
     * la tabla de artículos. Devolverá un ArrayList&lt;String&gt; vacío en caso
     * de darse una excepción.
     * 
     */
    public ArrayList<String> getArticulo(String codigo, int estado){
        ArrayList<String> valores = new ArrayList<>();
        try{
            String sql = "";
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
    
    public ArrayList<Articulo> getArticulos(){
        ArrayList<Articulo> valores = new ArrayList<>();
        try{
        ResultSet rs = stmnt.executeQuery("select * from articulos");
            
            while(rs.next()){
                Articulo aux = new Articulo();
                aux.codigo = rs.getString("codigo");
                aux.descripcion = rs.getString("descripcion");
                aux.precio_compra = rs.getFloat("precio_compra");
                valores.add(aux);
            }
            
            return valores;
            
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public Articulo getArticulo(String codigo){
        try{
        ResultSet rs = stmnt.executeQuery("select * from articulos where codigo = '"+codigo+"'");
            
            while(rs.next()){
                Articulo aux = new Articulo();
                aux.codigo = rs.getString("codigo");
                aux.descripcion = rs.getString("descripcion");
                aux.precio_compra = rs.getFloat("precio_compra");
                return aux;
            }
            
            return null;
            
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * <h7>actualizar: </h7>
    * <ul><h7>public boolean actualizar(int estado, String codigo,String
    * articulo,int unidades,double importe)</h7>
    * <ul>
    * <br>
    * Función de la aplicación de Gestión de Pedidos que actualiza la BBDD
    * <br>
    * <li>
    * actualiza el total_compras o total_ventas (según estado) del cliente o 
    * proveedor indicado
    * </li>
    * <li>
    * actualiza el stock restante del artículo indicado
    * </li>
    * <br>
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio
     * @param estado entero que indica si el resultado deseado es un cliente: 0
     * o un proveedor: 1 
     * @param codigo String que tiene el código identificador del cliente o
     * proveedor según indique estado
     * @param articulo String que tiene el código identificador del artículo a
     * actualizar
     * @param unidades entero con las unidades compradas/vendidas, para 
     * actualizar el stock
     * @param importe double que se sumará al total_compras o total_ventas 
     * indicado
     * @return true si la actualización se ha hecho con éxito y false si ha
     * saltado alguna excepción
     * 
     */
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
    
    /**
     * <h7>volver: </h7>
    * <ul><h7>public void volver()</h7>
    * <ul>
    * <br>
    * Función de la aplicación de la gestión de almacén que vuelve al estado
    * anterior al último commit
    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio 
     * 
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/ConnectionImpl.html#rollback%28%29">Connection.rollback()</a>
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/ConnectionImpl.html#commit%28%29">Connection.commit()</a>
     */
    public void volver(){
        try{
            con.rollback();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * <h7>facturar: </h7>
    * <ul><h7>public void facturar()</h7>
    * <ul>
    * <br>
    * Función de la aplicación de la gestión de almacén que confirma el estado
    * de la base de datos mediante un commit.

    * </ul>
    * </ul>
     * 
     * @author Mauro di Tullio 
     * 
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/ConnectionImpl.html#rollback%28%29">Connection.rollback()</a>
     * @see <a href="http://www.javafind.net/gate.jsp?q=/library/16/mysql-connector-java-5.1.29/apidocs/com/mysql/jdbc/ConnectionImpl.html#commit%28%29">Connection.commit() </a>
     */
    public void facturar(){
        try{
            con.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * <h7>getTodosArts: </h7>
    * <ul><h7>public Vector getTodosArts(int estado)</h7>
    * <ul>
    * <br>
    * Función de la aplicación de la gestión de almacén que devuelve el listado
    * de los artículos en un {@link java.util.Vector} para su insertarción
     * <br>
     * <li>
     * Devuelve precio_venta o precio_compra según el valor de estado
     * </li>
     * <li>
     * consulta = "SELECT codigo, descripcion, stock, precio FROM articulos"
     * </li>
     * </ul>
     * </ul>
     * @author Mauro di Tullio 
     * @param estado determina si el listado de artículos solicita el precio de
     * venta (0) o el de compra (1)
     * @return Vector conteniendo el listado con todos los valores de la
     * consulta en datos tipo String
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Vector.html">java.util.Vector</a>
     */
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
    
    public ArrayList<String> getCodigosClientes(){
        try{
            ArrayList<String> res = new ArrayList<String>();
            ResultSet rs = stmnt.executeQuery("select codigo from clientes");
            while(rs.next())
                res.add(rs.getString(1));
            return res;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
