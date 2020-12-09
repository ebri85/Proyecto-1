<%--suppress ALL --%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.lalomita.clases.Condominio" %><%--
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
<%@include file="Estructura/_header.jsp"%>
</header>
<div class="container" id="registroCondo">
    <form action="condos" onclick="validaCondominio" method="get" >

            <label for="cedula">Cedula: </label>
            <input class="condiminio" id="cedula" type="text" name="cedula">
        <p id="errorCedula"></p>


            <label for="nombre" >Nombre Completo: </label>
            <input class="condiminio" id="nombre"  type="text" name="nombre">
        <p id="errorNombre"></p>


            <label for="telefono">Telefono: </label>
            <input class="condiminio" id="telefono"  type="text"  name="telefono">
        <p id="errortelefono"></p>


            <fieldset>
                <legend>Tipo Filial</legend>
                <select class="condominio" name="filial" id="tipoFilial">
                     <optgroup>
                         <option value="Modelo Rio">Modelo Rio</option>
                         <option value="Modelo Cascada">Modelo Cascada</option>
                         <option value="Modelo Mar">Modelo Mar</option>
                     </optgroup>
                </select>
            </fieldset>



        <fieldset>
            <legend>Moroso</legend>
            <select class = "condominio"name="moroso" id="moroso">
                <optgroup>
                    <option value="true">Si</option>
                    <option value="false">No</option>
                </optgroup>
            </select>
        </fieldset>



            <label for="pendMes">Cuota Pendiente: </label>
            <input class="condiminio" id="pendMes" type="text"  name="pendMes">
        <p id="errorPendMes"></p>


            <label for="pendAgua">Monto Pendiente Agua: </label>
            <input class="condiminio"  id="pendAgua" type="text"  name="pendAgua">
        <p id="errorPendAgua"></p>


            <label for="pendAcumMes">Monto Total Cuota: </label>
            <input class="condiminio" id="pendAcumMes" type="text"  name="pendAcumMes">
        <p id="errorAcumMes"></p>

        <p class="form">
            <label for="pendAcumAgua">Monto Total Agua: </label>
            <input class="condiminio" id="pendAcumAgua" type="text"  name="pendAcumAgua">
        <p id="errorPendAcumAgua"></p>



            <label for="mntFavor">Monto a Favor: </label>
            <input class="condiminio" id="mntFavor"  type="text"  name="mntFavor">
        <p id="errorMntFavor"></p>


            <label for="cantVehiculo">Cantidad de Vehiculos: </label>
            <input class="condiminio" id="cantVehiculo" type="text"  name="cantVehiculo">
        <p id="errorCantVehiculo"></p>



        <input type="submit" id="registraCond" name="condominio" value="Submit">
        <p id="errorFormulario"> </p>

    </form>

</div>

<footer>
    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
