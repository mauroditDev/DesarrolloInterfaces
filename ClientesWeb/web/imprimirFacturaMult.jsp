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
             Clientes cliente = (Clientes)sesion.getAttribute("cliente");
             ArrayList<HashMap> facturas = 
                     (ArrayList<HashMap>)sesion.getAttribute("facturas");
             ArrayList<Integer> numerosFactura = 
                     (ArrayList<Integer>)sesion.getAttribute("numerosFactura");
             
        %>
        <hr>
        <p>
            Extracto desde el <%=sesion.getAttribute("fechaIni")%><br/>
            hasta el <%=sesion.getAttribute("fechaFin")%>
        </p>
        <hr>
        <h3 style="text-align: center;">Empresa Proyecto Web</h3>
        <h4 style="text-align: center;">N.I.F. A48585636J</h4>
        <h4 style="text-align: center;">c/ playa de Samil, 14 - 28400 Collado Villalba, Madird</h4>
        <hr>
        <h5>Cliente:</h5>
        <p>
            NIF:<%=((Clientes)sesion.getAttribute("cliente")).nif%>, 
            Nombre:  <%=((Clientes)sesion.getAttribute("cliente")).apellidos%>, 
            <%=((Clientes)sesion.getAttribute("cliente")).nombre%></p>
        <p>
            Domicilio: <%=((Clientes)sesion.getAttribute("cliente")).domicilio%>, 
            <%=((Clientes)sesion.getAttribute("cliente")).localidad%>
            (CP <%=((Clientes)sesion.getAttribute("cliente")).codigo_postal%>)
        </p>
        <hr>
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
    </body>
</html>
