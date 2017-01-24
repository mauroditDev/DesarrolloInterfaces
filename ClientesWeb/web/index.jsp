<%-- 
    Document   : index
    Created on : 09-ene-2017, 13:26:46
    Author     : alumno
--%>
<%@page import="clientesdb.*" %>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            HttpSession sesion = request.getSession();
            GestorDB db = new GestorDB();
            sesion.setAttribute("db", db);
            sesion.setAttribute("articulos", new ArrayList<Articulo>());
            sesion.setAttribute("cliente", new Clientes());
        %>
        <h1>Proyecto Web con Base de Datos</h1>
        <a href="gestion-pedidos.jsp">Gestión de Pedidos</a><br/>
        <a href="extractos.jsp">Extractos</a><br/>
    </body>
</html>
