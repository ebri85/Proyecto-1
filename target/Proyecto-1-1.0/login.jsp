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
    <form action="index.jsp" method="get">
        <p class="form">
            <label>Usuario: </label>
            <input type="text" name="usrNombre">
        </p>
        <p class="form">
            <label>Clave: </label>
            <input type="password" name="usrClave">
        </p>
        <input type="submit" name="datos" value="Ingresar">
        <%try{

            usuario = request.getParameter("usrNombre");
            clave = request.getParameter("usrClave");
            response.setContentType("text/html");
            if(usuario.compareTo(usr) == 0 && clave.compareTo(paswd) ==0){
                response.setContentType("text/html");
                response.getWriter().write("<p>Revisando esta parte</p>");


            } else {

                response.getWriter().write("<p>Error con la autenticacion</p>");

            }
        }catch (Exception e){
            out.println("<script>window.alert("+e.getStackTrace()+")</script>");
        }

        %>




        <p><a href="registro">Registrarse</a></p>


    </form>


</div>

<footer>
    <%@include file="Estructura/_footer.jsp" %>
</footer>
</body>
</html>
