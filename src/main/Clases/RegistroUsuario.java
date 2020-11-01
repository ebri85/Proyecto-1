import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/registro"})
public class RegistroUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String usr = "Admin";
        final String paswd = "123*456";
        String usuario;
        String clave;

        usuario = req.getParameter("usrNombre");
        clave = req.getParameter("usrClave");

        if(usuario.compareTo(usr) == 0 && clave.compareTo(paswd) ==0){
            resp.sendRedirect("index.jsp");

        } else {

            resp.sendRedirect("index.jsp");
        }
    }
}
