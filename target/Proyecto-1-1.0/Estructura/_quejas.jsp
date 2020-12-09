<%@ page import="com.lalomita.clases.Condominio" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.lalomita.clases.ListaCondominios" %>
<%@ page import="com.lalomita.clases.ListaQuejas" %>
<%@ page import="com.lalomita.clases.Queja" %><%--
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
            ListaQuejas listaQuejas = new ListaQuejas() ;


            int filiales = 1;


            PrintWriter prt;
            prt = response.getWriter();
            for(Queja q: listaQuejas.quejas){

                prt.printf("<div class=\"col-%d\">",filiales);
                prt.println(
                        "<p class=atributos>"+"Numero Filial Inicio: "+q.getNumFilialIni()+"</p>"+
                                "<p class=atributos>"+"Numero Filial Destino: "+q.getNumFilialDest()+"</p>"+
                                "<p class=atributos>"+"Descripcion: "+q.getDescripcion()+"</p>"+
                                "<p class=atributos>"+"Estado de la Queja: "+q.getEstado()+"</p>"+
                                "<p class=atributos>"+"Fehca de Ingreso "+q.getFecha()+"</p>"+
                                "<p class=atributos>"+"Observacion: "+q.getObservacion()+"</p>"

                );
                prt.printf("\n<input type=\"button\"class=\"btn-%d\" value=\"Editar\">",filiales++);

                prt.println("<br></div>");


            }
        %>

    </div>

</div>