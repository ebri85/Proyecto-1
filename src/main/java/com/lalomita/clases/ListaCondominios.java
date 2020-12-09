package com.lalomita.clases;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/condos"})
public class ListaCondominios extends HttpServlet {

    Condominio condo1 = new Condominio("11212","Esau Brizuela","88881111",1,"Modelo Rio",true,1000,100,1000,100,0,2);
    Condominio condo2 = new Condominio("2232323","Carlos Vargas","2233222",2,"Modelo Cascada",true,2000,200,200,200,0,1);
    Condominio condo3 = new Condominio("3434333","Carolina Aragon","454545",3,"Modelo Mar",false,3000,300,300,300,0,2);
    public List<Condominio> condos = new ArrayList<Condominio>();

    public ListaCondominios(){
        InicializaCondos();
    }
    protected void InicializaCondos(){
        condos.add(condo1);
        condos.add(condo2);
        condos.add(condo3);
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // String condo = req.getParameter("condos");

        Condominio condominio = new Condominio();
        PrintWriter out = resp.getWriter();


        condominio.setCedula(req.getParameter("cedula"));

        condominio.setNombreCompleto(req.getParameter("nombre")) ;
        condominio.setTelefono(req.getParameter("telefono"));
        condominio.setTipoFilial(req.getParameter("filial"));
        condominio.setMoroso(Boolean.parseBoolean(req.getParameter("moroso")));
        condominio.setPendMes(Double.parseDouble(req.getParameter("pendMes")));
        condominio.setPendAgua(Double.parseDouble(req.getParameter("pendAgua")));
        condominio.setPendAcumMes(Double.parseDouble(req.getParameter("pendAcumMes")));
        condominio.setPendAcumAgua(Double.parseDouble(req.getParameter("pendAcumAgua")));
        condominio.setMntFavor(Double.parseDouble(req.getParameter("mntFavor")));
        condominio.setCantVehiculo(Integer.parseInt(req.getParameter("cantVehiculo")));

        condos.add(condominio);
        resp.setContentType("text/html");


        out.println("<html>");
        out.println("<style>" +
                ".atributos{ margin-right: 33%;margin-left: 33%;text-align: center; background: deepskyblue;}</style>");
        out.println("<h2>Se agrego el siguiente condominio</h2>\n"+
                "<p class=atributos>"+"Cedula: "+condominio.getCedula()+"</p>"+
                        "<p class=atributos>"+"Nombre: "+condominio.getNombreCompleto()+"</p>"+
                        "<p class=atributos>"+"Telefono: "+condominio.getTelefono()+"</p>"+
                        "<p class=atributos>"+"Numero Filial: "+condominio.getNumFilial()+"</p>"+
                        "<p class=atributos>"+"Tipo Filial "+condominio.getTipoFilial()+"</p>"+
                        "<p class=atributos>"+"Moroso: "+condominio.isMoroso()+"</p>"+
                        "<p class=atributos>"+"Monto Mes Pendiente: "+condominio.getPendMes()+"</p>"+
                        "<p class=atributos>"+"Monto Pendiente Agua: "+condominio.getPendAgua()+"</p>"+
                        "<p class=atributos>"+"Monto pendiente Acumulado Mes: "+condominio.getPendAcumMes()+"</p>"+
                        "<p class=atributos>"+"Monto pendiente acumulado agua: "+condominio.getPendAcumAgua()+"</p>"+
                        "<p class=atributos>"+"Monto a Favor: "+condominio.getMntFavor()+"</p>"+
                        "<p class=atributos>"+"Cantidad de Vehiculos: "+condominio.getCantVehiculo()+"</p>"

        );
        out.println("<a href=\"index.jsp\">Inicio</a></li>");
        out.println("</html>");



    }
}
