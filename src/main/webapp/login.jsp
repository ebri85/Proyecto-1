<%--
  Created by IntelliJ IDEA.
  User: esau.brizuela
  Date: 10/29/2020
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String usr = "Admin";
    String paswd = "123*456";
    String usuario;
    String clave;



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
    <form action="registro" method="post">
        <p class="form">
            <label>Usuario: </label>
            <input type="text" name="usrNombre">
        </p>
        <p class="form">
            <label>Clave: </label>
            <input type="password" name="usrClave">
        </p>
        <input type="submit" name="datos" value="Ingresar">
        <p><a href="registro">Registrarse</a></p>


    </form>


</div>

<footer>
    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
