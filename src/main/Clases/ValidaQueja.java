import javax.json.Json;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.logging.XMLFormatter;

@WebServlet(urlPatterns = {"/validaqueja"})
public class ValidaQueja extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{

        Queja queja = new Queja();

        queja.setNumFilialIni(Integer.parseInt(req.getParameter("numFilialIni")));
        queja.setNumFilialDest(Integer.parseInt(req.getParameter("numFilialDest")));
        queja.setDescripcion(req.getParameter("descripcion"));
        queja.setFecha(req.getParameter("fecha"));
        queja.setEstado(req.getParameter("estado"));
        queja.setObservacion(req.getParameter("observacion"));

        req.setAttribute("listaquejas",queja.toString());

       // RequestDispatcher rd = req.getRequestDispatcher("/quejas");

        //rd.forward(req,resp);


        resp.sendRedirect("listaquejas");

        }  catch (Exception e) {
        resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
        }

    }
}
