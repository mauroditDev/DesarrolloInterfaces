<%-- 
    Document   : imprimirFactura
    Created on : 20-ene-2017, 9:51:31
    Author     : alumno
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clientesdb.*" %>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             HttpSession sesion = request.getSession();
             
             GestorDB db = (GestorDB)sesion.getAttribute("db");
             int idFra = (int)sesion.getAttribute("idFra");
             
             HashMap datos = db.getTodoFromFra(idFra);
             
             Clientes cliente = (Clientes)datos.get("cli");
             String fechaS = (String) datos.get("fecha");
             ArrayList<Float> cantidades = (ArrayList<Float>) datos.get("cantidades");
             ArrayList<Articulo> articulos = (ArrayList<Articulo>) datos.get("articulos");
             
        %>
        <hr>
        <%
             SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
             String fecha = sdf.format(new Date());
        %>
        <p>
        Fecha: <%=fechaS%><br/>
        FACTURA N.:<%=idFra%>
        </p>
        <hr>
        <h3 style="text-align: center;">Empresa Proyecto Web</h3>
        <h4 style="text-align: center;">N.I.F. A48585636J</h4>
        <h4 style="text-align: center;">c/ playa de Samil, 14 - 28400 Collado Villalba, Madird</h4>
        <hr>
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
        <hr>
        <h2 style="text-align: right;">Total Factura (IVA incl.): <%=total%>€</h2>
        <hr>
    </body>
</html>
