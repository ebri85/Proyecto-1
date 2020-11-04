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


</header>
<div class="container">
    <form action="validacion" method="post">
        <p class="form">
            <label>Usuario: </label>
            <input id="usr" type="text" name="usrNombre">
        </p>
        <p class="form">
            <label>Clave: </label>
            <input id="pass" type="password" name="usrClave">
        </p>
        <input type="submit" id="btIngresar" name="datos" value="Ingresar">

        <p><a href="registro">Registrarse</a></p>
    </form>
    <p id="msg"><h1></h1></p>
</div>

<footer>
    <script src="javascript/script.js"></script>

    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
