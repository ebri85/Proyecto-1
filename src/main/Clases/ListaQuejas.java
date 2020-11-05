import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/listaquejas"})
public class ListaQuejas extends HttpServlet {



    ArrayList<Queja> quejas = new ArrayList<Queja>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            //String queja = req.getParameter("listaquejas");
           // Object ob = queja;

            //Queja q = (Queja) ob;
            resp.getWriter().println("<h1>Lista de Quejas</h1>");
           // resp.getWriter().println(ob.toString());
        } catch (Exception e) {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
        }
    }
}
