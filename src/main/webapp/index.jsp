<%--
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
<div class="inicio">
    <div class="mensaje">
        <h1>Sistema de Administracion de Condominio La Lomita</h1>
    </div>
    <div class="imagen">
        <img src="imagenes/logo.jpg">

    </div>
    <div class="ingreso">
        <h2>Si desea ingresar a las siguientes opciones por favor loguearse</h2>
        <h3 id="cntSesion"><a href="login.jsp" >INGRESAR</a></h3>
    </div>
</div>

<footer>

    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
