<%--suppress ALL --%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: esau.brizuela
  Date: 10/29/2020
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(session.isNew()){
        out.println("<style> nav{display:none;}</style>");
    }
%>

<html>

<head>
    <%@include file="Estructura/_head.jsp" %>
</head>
<body>
<header>
    <%@include file="Estructura/_header.jsp" %>
</header>
<div class="container">
    <form action="listaquejas" method="get">

            <label for="numFilialIni">Filial Inicial: </label>
            <input type="text" class="queja" id="numFilialIni"  name="numFilialIni">


            <label for="numFilialDest" >Filial Destino: </label>
            <input type="text" class="queja" id="numFilialDest"  name="numFilialDest">


            <label for="descripcion">Descripcion: </label>
        <textarea class="queja" id="descripcion"  name="descripcion"></textarea>

            <label for="fecha" >Filial Destino: </label>
            <input type="date" class="queja" id="fecha"   name="fecha">



        <fieldset>
            <legend>Estado Solicitud</legend>
            <select name="estado" name="estado" id="estado">
                <optgroup>
                    <option value="Enviada">Enviada</option>
                    <option value="Proceso">En Proceso</option>
                    <option value="Cerrada">Cerrada</option>
                </optgroup>
            </select>
        </fieldset>



                <label for="observacion">Observacion: </label>
                <textarea class="queja" id="observacion"  name="observacion"></textarea>

        <input type="submit" id="registraQueja" name="queja" value="Submit">

    </form>

</div>

<footer>


    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
