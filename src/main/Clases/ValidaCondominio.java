import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/validacondominio"})
public class ValidaCondominio extends HttpServlet {




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Condominio condominio = new Condominio();

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


        resp.getWriter().println("<h1>"+condominio.toString()+"</h1>");


    }
}
