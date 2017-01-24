<%-- 
    Document   : extractos
    Created on : 23-ene-2017, 13:55:51
    Author     : alumno
--%>

<%@page import="clientesdb.*"%>
<%@page import="java.text.SimpleDateFormat"%>
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
    <body onload="reset()">
        <h1>Seleccione cliente y período</h1>
        <h3>Código de Cliente</h3>
        <form name = "frm" action="facturas.jsp" onsubmit="return comprobar()" method="post">
            <input type="text" name="cod_cliente" id="inputCliente"/><br/>
            <input type="date" value="<%
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                out.print(sdf.format(new Date()));
            %>" name="fechaIni"/>
            <input type="date" value="<%
                out.print(sdf.format(new Date()));
            %>" name="fechaFin"/>
            <br/><br/>
            <input type="submit" /> 
            <input type="reset" onclick="document.getElementById('inputCliente').focus()" value="Cancelar"/><br/>
            
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
                var aleCod = true;
                <%
                    for(String cod: db.getCodigosClientes()){
                %>
                if( <%=cod%> == cod){
                    document.getElementById("inputCliente").value = cod;
                    var fechaI = document.frm.fechaIni.value;
                    var fechaF = document.frm.fechaFin.value;
                    var chk = fechaI.split("-");
                    if(chk.length === 3){
                        var ok = true;
                        for(i=0;i<3;i++){
                             if(isNaN(parseFloat(chk[i]))) ok = false;
                        }
                        var chk = fechaF.split("-");
                        if(chk.length === 3){
                            for(i=0;i<3;i++){
                                 if(isNaN(parseFloat(chk[i]))) ok = false;
                            }
                        }
                        else{
                            ok = false;
                        }
                        
                        if(ok){
                            return true;
                        }
                        else{
                            aleCod = false;
                            alert("Formato de fechas ilegible");
                        }
                    }
                    else{
                        aleCod = false;
                        alert("Formato de fechas ilegible")
                    }
                }
                <%
                    }
                %>
                if(aleCod)
                    alert("el código de usuario no existe");
                return false;
            }
        </script>
        <a href="index.jsp">Página inicial</a>
    </body>
</html>
