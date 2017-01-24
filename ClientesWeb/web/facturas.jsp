<%-- 
    Document   : facturas
    Created on : 24-ene-2017, 11:01:46
    Author     : alumno
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="clientesdb.*" %>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
             String error="";
             HttpSession sesion = request.getSession();
             ArrayList<Articulo> artSeleccionados = (ArrayList<Articulo>)sesion.getAttribute("articulos");
             GestorDB db = (GestorDB)sesion.getAttribute("db");
             if(request.getParameter("cod_cliente")!=null)
                sesion.setAttribute("cliente",db.getCliente(request.getParameter("cod_cliente")));
             Clientes cliente = (Clientes)sesion.getAttribute("cliente");
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             ArrayList<HashMap> facturas = new ArrayList<>();
             String fechaIni = (String)request.getParameter("fechaIni");
             String fechaFin =  (String)request.getParameter("fechaFin");
             sesion.setAttribute("fechaIni", fechaIni);
             sesion.setAttribute("fechaFin", fechaFin);
             ArrayList<Integer> numerosFactura = db.getFacturasEntreFechas(
                     fechaIni, fechaFin, cliente.codigo);
             if(numerosFactura != null){
                 if(numerosFactura.size()!=0)
                    for(int idFra: numerosFactura){
                        HashMap datos = db.getTodoFromFra(idFra);
                        facturas.add(datos);
                    }
                 else{
                     error= "<h2>No ha hecho ninguna compra en el período seleccionado</h2>";
                 }
             }
             else{
                 error = "<h2>Hay problemas en la base de datos para buscar su factura, <br/>"
                         + "Por favor contacte al servicio técnico</h2>";
             }
                
                 
        %>
    </head>
    <body>
       <h2>Datos de Cliente</h2>
        <table>
            <tr>
                <th>Código</th><th>NIF</th><th>Nombre</th><th>Apellidos</th>
            </tr>
            
            <tr>
                <td><%=((Clientes)sesion.getAttribute("cliente")).codigo%></td>
                <td><%=((Clientes)sesion.getAttribute("cliente")).nif%></td>
                <td><%=((Clientes)sesion.getAttribute("cliente")).nombre%></td>
                <td><%=((Clientes)sesion.getAttribute("cliente")).apellidos%></td>
            </tr>
            <tr>
                <th>Domicilio</th><th>CP</th><th>Localidad</th><th>Total</th>
            </tr>
            <tr>
                <td><%=((Clientes)sesion.getAttribute("cliente")).domicilio%></td>
                <td><%=((Clientes)sesion.getAttribute("cliente")).codigo_postal%></td>
                <td><%=((Clientes)sesion.getAttribute("cliente")).localidad%></td>
                <td><%=((Clientes)sesion.getAttribute("cliente")).total_ventas%></td>
            </tr>
        </table>
            <style>
                table, td, th { text-align: left; border-collapse: collapse; border: 1px solid black;}
            </style>
            <hr>
            <%=error%>
            <%if (error.equals("")){
                sesion.setAttribute("facturas", facturas);
                sesion.setAttribute("numerosFactura", numerosFactura);
            %>
                <%
                int j = 0;
                for(HashMap factura: facturas){
                    String fechaS = (String) factura.get("fecha");
                    ArrayList<Float> cantidades = (ArrayList<Float>) factura.get("cantidades");
                    ArrayList<Articulo> articulos = (ArrayList<Articulo>) factura.get("articulos");
                    Integer numeroFactura = numerosFactura.get(j);
                 %>
                 <h3>Factura nº:<%=numeroFactura%></h3>
                 <h4>Fecha de la factura: <%=fechaS%></h4>
                    <br/><br/>
                    <table style="margin: 12px auto;">
                        <tr>
                            <th>Artículo</th><th>Descripcion</th><th>Unidades</th><th>Precio</th><th>Importe</th>
                        </tr>
                        <% 
                        float total = 0;
                        int i = 0;
                        for(Articulo articulo: articulos){    
                        %>
                        <tr>
                            <% 
                                float canti = cantidades.get(i);
                                total += canti*articulo.precio_compra;
                            %>
                            <td><%=articulo.codigo%></td>
                            <td><%=articulo.descripcion%></td>
                            <td><%=canti%></td>
                            <td><%=articulo.precio_compra%></td>
                            <td><%=canti*articulo.precio_compra%></td>

                        </tr>
                        <%
                        i++;
                        }%>
                    </table>
                <h4 style="text-align: right;">Total Factura (IVA incl.): <%=total%>€</h4>
                <%
                    if(j<facturas.size()-1){%>
                    <hr>
                    <%}
                j++;
                }%>
                <hr>
               <p> Si desea imprimir puse <a href="imprimirFacturaMult.jsp">aquí</a> si no desea imprimir la<br/>
                 factura puede volver a la <a href="index.jsp">Página principal</a> </p>
            <%}%>
            <hr>
            <a href="index.jsp">Página principal</a> | <a href="extractos.jsp">Nuevo Cliente</a>
            <hr>
    </body>
</html>
