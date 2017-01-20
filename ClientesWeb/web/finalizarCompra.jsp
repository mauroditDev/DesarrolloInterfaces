<%-- 
    Document   : finalizarCompra
    Created on : 17-ene-2017, 12:40:35
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
             Clientes cliente = (Clientes)sesion.getAttribute("cliente");
             ArrayList<Articulo> artSeleccionados = (ArrayList<Articulo>)sesion.getAttribute("articulos");
             int idFra = db.ultimaFactura();
             sesion.setAttribute("idFra", idFra);
             boolean ok = true;
             for(Articulo art: artSeleccionados){
                 if(!db.compraOnline(art, idFra, cliente)){
                     ok=false;
                     %>
                     <h1>Error de Pedido, por favor comuníquese con el servicio Técnico</h1>
                     <%
                 }
             }
             
     if(ok){
        %>
        <h1>Pedido Finalizado</h1>
        <p> Si desea imprimir puse <a href="imprimirFactura.jsp">aquí</a> si no desea imprimir la
            factura puede volver a la <a href="gestion-pedidos.jsp">Página principal</a> </p>
        <hr>
        <%
             SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
             String fecha = sdf.format(new Date());
        %>
        <p>
        Fecha: <%=fecha%><br/>
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
            for(Articulo articulo: artSeleccionados){    
            %>
            <tr>
                
                <td><%=articulo.codigo%></td>
                <td><%=articulo.descripcion%></td>
                <td><%=articulo.cantidad%></td>
                <td><%=articulo.precio_compra%></td>
                <% total += articulo.cantidad*articulo.precio_compra; %>
                <td><%=articulo.cantidad*articulo.precio_compra%></td>
                
            </tr>
            <%}%>
        </table>
        <hr>
        <h2 style="text-align: right;">Total Factura (IVA incl.): <%=total%>€</h2>
        <hr>
      <%}%>
    </body>
</html>
