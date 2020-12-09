package com.lalomita.clases;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    String logueo;



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String datos = getServletInfo().toString();
        resp.setContentType("text/html");
        resp.getWriter().println("<p>Probando</p>");
    }
}
