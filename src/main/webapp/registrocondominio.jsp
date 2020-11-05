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
    <form action="validacondominio" method="post">
        <p class="form">
            <label for="cedula">Cedula: </label>
            <input class="condiminio" id="cedula" type="text" name="cedula">
        </p>
        <p class="form">
            <label for="nombre" >Nombre Completo: </label>
            <input class="condiminio" id="nombre"  type="text" name="nombre">
        </p>
        <p class="form">
            <label for="telefono">Telefono: </label>
            <input class="condiminio" id="telefono"  type="text"  name="telefono">
        </p>
        <p class="form">
            <fieldset>
                <legend>Tipo Filial</legend>
                <select name="filial" id="tipoFilial">
                     <optgroup>
                         <option value="Modelo Rio">Modelo Rio</option>
                         <option value="Modelo Cascada">Modelo Cascada</option>
                         <option value="Modelo Mar">Modelo Mar</option>
                     </optgroup>
                </select>
            </fieldset>

        </p>
        <p class="form">
        <fieldset>
            <legend>Moroso</legend>
            <select name="moroso" id="moroso">
                <optgroup>
                    <option value="true">Si</option>
                    <option value="false">No</option>
                </optgroup>
            </select>
        </fieldset>

        </p>

        <p class="form">
            <label for="pendMes">Cuota Pendiente: </label>
            <input class="condiminio" id="pendMes" type="text"  name="pendMes">
        </p>
        <p class="form">
            <label for="pendAgua">Monto Pendiente Agua: </label>
            <input class="condiminio"  id="pendAgua" type="text"  name="pendAgua">
        </p>
        <p class="form">
            <label for="pendAcumMes">Monto Total Cuota: </label>
            <input class="condiminio" id="pendAcumMes" type="text"  name="pendAcumMes">
        </p>
        <p class="form">
            <label for="pendAcumAgua">Monto Total Agua: </label>
            <input class="condiminio" id="pendAcumAgua" type="text"  name="pendAcumAgua">
        </p>

        <p class="form">
            <label for="mntFavor">Monto a Favor: </label>
            <input class="condiminio" id="mntFavor"  type="text"  name="mntFavor">
        </p>
        <p class="form">
            <label for="cantVehiculo">Cantidad de Vehiculos: </label>
            <input class="condiminio" id="cantVehiculo" type="text"  name="cantVehiculo">
        </p>

        </p>
        <input type="submit" id="registraCond" name="condominio" value="Registrar">

    </form>

</div>

<footer>


    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
