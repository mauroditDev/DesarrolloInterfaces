<%-- 
    Document   : logIn
    Created on : 10-ene-2017, 11:52:59
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
    <body onload="reset()">
        <%
             HttpSession sesion = request.getSession();
             ArrayList<Articulo> artSeleccionados = (ArrayList<Articulo>)sesion.getAttribute("articulos");
             GestorDB db = (GestorDB)sesion.getAttribute("db");
             if(request.getParameter("cod_cliente")!=null)
                sesion.setAttribute("cliente",db.getCliente(request.getParameter("cod_cliente")));
             if(request.getParameter("unidades")!=null){
                 Articulo art = db.getArticulo(request.getParameter("cod_art"));
                 art.cantidad = Float.valueOf(request.getParameter("unidades"));
                 artSeleccionados.add(art);
             }
             float totalCompra = 0;
                 
        %>
        <h1>Gestión de Pedidos</h1>
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
            
            <%
            if(!artSeleccionados.isEmpty()){
            %>
            <hr>
            <h3>Artículos Pedidos</h3>
            <table>
                <tr>
                    <th>Codigo</th><th>Cantidad</th><th>Descripción</th><th>Sub Total</th>
                </tr>
                <%for(Articulo a: artSeleccionados){%>
                <tr>
                    <%float subtotal = a.cantidad * a.precio_compra;
                    totalCompra += subtotal;%>
                    <td><%=a.codigo%></td><td><%=a.cantidad%></td><td><%=a.descripcion%></td><td><%=subtotal%></td>
                </tr>
                <%}%>
            </table>
            <%
            }  
            %>
            
            <hr>
            
            <h2>Realizar Pedido</h2>
            <form name = "frm" action="addArt.jsp" onsubmit="return comprobar()" method="post">
                <input type="text" id="txt_art" name="txt_art"/>
                <label for="num_art" >Código de Artículo</label>
                <br><br>
                <input type="submit" value="Aceptar"/><button onclick="reset()">Cancelar</button>
            </form>
            <script>
                
            function reset(){
                document.getElementById("txt_art").value = "";
                document.getElementById("txt_art").focus();
            }
            
            function comprobar(){
                var cod_art = document.getElementById("txt_art").value;
                while(cod_art.length<6)
                    cod_art = "0".concat(cod_art);
                <%
                    for(Articulo art: db.getArticulos()){
                %>
                if( <%=art.codigo%> == cod_art){
                    document.getElementById("txt_art").value = cod_art;
                    alert(document.getElementById("txt_art").value);
                    return true;
                }
                <%
                    }
                %>
                alert("El Artículo seleccionado no existe");
                return false;
            }
            </script>
            
            <%
            if(totalCompra != 0){
            %>
            <hr>
            <h3>Total compras: <%=totalCompra%></h3>
            <form action="finalizaCompra.jsp" method="post">
                <input type="submit" value="ValidarCompra"/>
            </form>
            <%
            }  
            %>
            
        <hr>
         <a href="index.jsp">Página inicial</a> | <a href="gestion-pedidos.jsp">Cliente nuevo</a>   
    </body>
</html>
