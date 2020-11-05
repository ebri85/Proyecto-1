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

</header>
<div class="container">
    <form action="validaqueja" method="post">
        <p class="form">
            <label for="numFilialIni">Filial Inicial: </label>
            <input class="queja" id="numFilialIni" type="text" name="numFilialIni">
        </p>
        <p class="form">
            <label for="numFilialDest" >Filial Destino: </label>
            <input class="queja" id="numFilialDest"  type="text" name="numFilialDest">
        </p>

            <label for="descripcion">Descripcion: </label>
        <textarea class="queja" id="descripcion"  name="descripcion"></textarea>
        <p class="form">
            <label for="fecha" >Filial Destino: </label>
            <input class="queja" id="fecha"  type="date" name="fecha">
        </p>

        <p class="form">
        <fieldset>
            <legend>Estado Solicitud</legend>
            <select name="estado" id="estado">
                <optgroup>
                    <option value="Enviada">Enviada</option>
                    <option value="Proceso">En Proceso</option>
                    <option value="Cerrada">Cerrada</option>
                </optgroup>
            </select>
        </fieldset>

        </p>

                <label for="observacion">Observacion: </label>
                <textarea class="queja" id="observacion"  name="observacion"></textarea>

        <input type="submit" id="registraCond" name="condominio" value="Registrar">

    </form>

</div>

<footer>


    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
