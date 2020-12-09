<%@ page import="com.lalomita.clases.Condominio" %>
<%@ page import="java.util.*" %>
<%@ page import="java.awt.print.PrinterAbortException" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: esau.brizuela
  Date: 10/29/2020
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

<head>
    <%@include file="Estructura/_head.jsp" %>
</head>
<body>
<header>
    <%@include file="Estructura/_header.jsp" %>
</header>
<div class="inicio">
    <div class="mensaje">
        <h1>Sistema de Administracion de La Lomita</h1>
    </div>
    <div class="imagen">
        <img src="imagenes/logo.jpg">

    </div>

</div>
<br>


<div class="filiales">
    <h2>Estas son las filiales registradas de momento</h2>
    <%@include file="Estructura/_filiales.jsp" %>
</div>

<footer>

    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
