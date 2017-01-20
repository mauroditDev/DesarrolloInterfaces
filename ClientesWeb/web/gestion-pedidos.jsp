<%-- 
    Document   : gestion-pedidos
    Created on : 10-ene-2017, 10:56:47
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
        <%
            HttpSession sesion = request.getSession();
            GestorDB db = (GestorDB)sesion.getAttribute("db");
            sesion.setAttribute("articulos", new ArrayList<Articulo>());
            %>
    </head>
    <body onLoad="document.getElementById('inputCliente').focus()">
        <h1>Gestión de Pedidos</h1>
        <form name = "frm" action="logIn.jsp" onsubmit="return comprobar()" method="post">
            <input type="text" name="cod_cliente" id="inputCliente"/><br/>
            <input type="submit" > <button onclick="reset()">Cancelar</button><br/>
        </form>
        <script>
            
    function reset(){
                document.getElementById("inputCliente").value = "";
                document.getElementById("inputCliente").focus();
            }
            
            function comprobar(){
                var cod = document.getElementById("inputCliente").value;
                while(cod.length<6){
                    cod = "0".concat(cod);
                    console.log(cod);
                }
                <%
                    for(String cod: db.getCodigosClientes()){
                %>
                if( <%=cod%> == cod){
                    document.getElementById("inputCliente").value = cod;
                    return true;
                }
                <%
                    }
                %>
                alert("el codigo de usuario no existe");
                return false;
            }
        </script>
        <a href="index.jsp">Página inicial</a>
    </body>
</html>
