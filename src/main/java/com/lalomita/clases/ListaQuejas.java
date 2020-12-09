package com.lalomita.clases;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/listaquejas"})
public class ListaQuejas extends HttpServlet {

    public List<Queja> quejas ;


    public ListaQuejas(){Inicializa();}

    protected void Inicializa(){
            quejas = new ArrayList<Queja>();

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Queja q = new Queja();
            PrintWriter out = resp.getWriter();
            q.setNumFilialIni(req.getParameter("numFilialIni"));
            q.setNumFilialDest(req.getParameter("numFilialDest"));
            q.setDescripcion(req.getParameter("descripcion"));
            q.setEstado(req.getParameter("estado"));
            q.setFecha(req.getParameter("fecha"));
            q.setObservacion(req.getParameter("observacion"));

            quejas.add(q);
            resp.setContentType("text/html");


            out.println("<html>");
            out.println("<style>" +
                    ".atributos{ margin-right: 33%;margin-left: 33%;text-align: center; background: deepskyblue;}</style>");
            out.println("<h2>Se agrego la siguiente queja</h2>\n"+
                    "<p class=atributos>"+"Numero Filial Inicio: "+q.getNumFilialIni()+"</p>"+
                    "<p class=atributos>"+"Numero Filial Destino: "+q.getNumFilialDest()+"</p>"+
                    "<p class=atributos>"+"Descripcion: "+q.getDescripcion()+"</p>"+
                    "<p class=atributos>"+"Estado de la Queja: "+q.getEstado()+"</p>"+
                    "<p class=atributos>"+"Fehca de Ingreso "+q.getFecha()+"</p>"+
                    "<p class=atributos>"+"Observacion: "+q.getObservacion()+"</p>"
            );
            out.println("<a href=\"index.jsp\">Inicio</a></li>");
            out.println("</html>");


        } catch (Exception e) {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
        }
    }
}
