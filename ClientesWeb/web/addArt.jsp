<%-- 
    Document   : addArt
    Created on : 16-ene-2017, 13:01:46
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clientesdb.*" %>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="reset()">
        <%
             HttpSession sesion = request.getSession();
             
             GestorDB db = (GestorDB)sesion.getAttribute("db");
             Clientes cliente = (Clientes)sesion.getAttribute("cliente");
             sesion.setAttribute("articulo",db.getArticulo(request.getParameter("txt_art")));
             Articulo articulo = (Articulo)sesion.getAttribute("articulo");
        %>
        
        <h1>Artículo <%=articulo.codigo%></h1>
        <form method="post" action="logIn.jsp" onsubmit="return comprobar()">
        <table>
            <tr>
                <th>Artículo</th><th>Descripcion</th><th>Unidades</th><th>Precio</th><th>Importe</th>
            </tr>
            
            <tr>
                <td><%=articulo.codigo%></td>
                <td><%=articulo.descripcion%></td>
                <td><input type="text" name="unidades" id="uds" value="1" onkeyup="actualizar()"></td>
                <td id="precio"><%=articulo.precio_compra%></td>
                <td><span id="importe"></span></td>
            </tr>
            
        </table>
            <br>
            <input type="hidden" value="<%=articulo.codigo%>" name="cod_art">
            <input type="submit" value="Aceptar"/><input type="button" onclick="reset()" value="Cancelar"/>
        </form>
            <hr>
            <a href="gestion-pedidos.jsp">Página principal</a> | <a href="logIn.jsp">Nuevo Artículo</a>
            <hr>
        <script>
            
            function reset(){
                document.getElementById("uds").value = "";
                document.getElementById("uds").focus();
                document.getElementById("importe").textContent = "0";
            }
            
            function actualizar(){
                console.log("aaaaaaaaaaaaaaa");
                console.log("unidadesTxt ",parseFloat(document.getElementById("uds").value));
                var uds = parseFloat(document.getElementById("uds").value);
                console.log("unidades ",uds);
                var precio = parseFloat(document.getElementById("precio").textContent);
                console.log("precioText: ", document.getElementById("precio").textContent);
                console.log("precio: ", precio);
                var total = uds * precio;
                console.log(total);
                if(isNaN(total))
                    document.getElementById("importe").textContent = "--";
                else
                    document.getElementById("importe").textContent = total;
            }
            
            function comprobar(){
                var uds = parseFloat(document.getElementById("uds").value);
                if( isNaN(uds) || document.getElementById("uds").value < 1){
                    document.getElementById("uds").value = document.getElementById("uds").value%1;
                    alert("unidades mal introducidas");
                    return false;
                }
                else{
                    
                    alert("adquiridas ".concat(document.getElementById("uds").value," unidades de <%=articulo.descripcion%>"));
                    return true;
                }
                
            }
            </script>

        </script>
        
        
    </body>
</html>
