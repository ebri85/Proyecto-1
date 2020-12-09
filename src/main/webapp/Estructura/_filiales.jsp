<%@ page import="com.lalomita.clases.Condominio" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.lalomita.clases.ListaCondominios" %><%--
  Created by IntelliJ IDEA.
  User: ebri_
  Date: 12/8/2020
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class = "rows">
    <div class="row">
        <%
            ListaCondominios lista= new ListaCondominios();


            int filiales = 1;


                   PrintWriter prt;
            prt = response.getWriter();
            for(Condominio c: lista.condos){

                prt.printf("<div class=\"col-%d\">",filiales);
                prt.println(
                  "<p class=atributos>"+"Cedula: "+c.getCedula()+"</p>"+
                  "<p class=atributos>"+"Nombre: "+c.getNombreCompleto()+"</p>"+
                          "<p class=atributos>"+"Telefono: "+c.getTelefono()+"</p>"+
                          "<p class=atributos>"+"Numero Filial: "+c.getNumFilial()+"</p>"+
                          "<p class=atributos>"+"Tipo Filial "+c.getTipoFilial()+"</p>"+
                          "<p class=atributos>"+"Moroso: "+c.isMoroso()+"</p>"+
                          "<p class=atributos>"+"Monto Mes Pendiente: "+c.getPendMes()+"</p>"+
                          "<p class=atributos>"+"Monto Pendiente Agua: "+c.getPendAgua()+"</p>"+
                          "<p class=atributos>"+"Monto pendiente Acumulado Mes: "+c.getPendAcumMes()+"</p>"+
                          "<p class=atributos>"+"Monto pendiente acumulado agua: "+c.getPendAcumAgua()+"</p>"+
                          "<p class=atributos>"+"Monto a Favor: "+c.getMntFavor()+"</p>"+
                          "<p class=atributos>"+"Cantidad de Vehiculos: "+c.getCantVehiculo()+"</p>"

                );
                prt.printf("\n<input type=\"button\"class=\"btn-%d\" value=\"Editar\">",filiales++);

                prt.println("<br></div>");


            }
        %>

    </div>

</div>