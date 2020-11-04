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
<%
    Condominio condominio = new Condominio();
    String nombre = request.getParameter("cedula");
%>

</header>
<div class="container">
    <form action="registrocondominio" method="post">
        <p class="form">
            <label>Cedula: </label>
            <input class="condiminio" type="text" name="cedula">
        </p>
        <p class="form">
            <label>Nombre Completo: </label>
            <input class="condiminio"  type="text" name="nombre">
        </p>
        <p class="form">
            <label>Telefono: </label>
            <input class="condiminio"  type="text" name="telefono">
        </p>
        <p class="form">
            <label>Tipo Filial: </label>
            <input class="condiminio"  type="range"  name="tipoFilial">
        </p>
        <p class="form">
            <label>Moroso: </label>
            <input class="condiminio"  type="checkbox"  name="moroso">
        </p>
        <p class="form">
            <label>Cuota Pendiente: </label>
            <input class="condiminio"  type="text"  name="pendMes">
        </p>
        <p class="form">
            <label>Monto Pendiente Agua: </label>
            <input class="condiminio"  type="text"  name="pendAgua">
        </p>
        <p class="form">
            <label>Monto Total Cuota: </label>
            <input class="condiminio"  type="text"  name="pendAcumMes">
        </p>
        <p class="form">
            <label>Monto Total Agua: </label>
            <input class="condiminio"  type="text"  name="pendAcumAgua">
        </p>

        <p class="form">
            <label>Monto a Favor: </label>
            <input class="condiminio"  type="text"  name="mntFavor">
        </p>
        <p class="form">
            <label>Cantidad de Vehiculos: </label>
            <input class="condiminio"  type="text"  name="cantVehiculo">
        </p>'

        </p>
        <input type="submit" id="registraCond" name="datos" value="Ingresar">
        <p><a href="registro">Registrarse</a></p>
    </form>
    <h3><p id="msg"></p></h3>
</div>

<footer>


    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
