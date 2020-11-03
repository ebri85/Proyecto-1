import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = {"/registro"})
public class RegistroUsuario extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String usr = "Admin";
        final String paswd = "123*456";
        String usuario;
        String clave;
        boolean _isUsr= false;
        boolean _isPaswd = false;


        usuario = req.getParameter("usrNombre");
        clave = req.getParameter("usrClave");

        _isUsr =  usuario.matches(usr);
        _isPaswd = clave.matches(paswd);

        if(_isUsr==true && _isPaswd == true){

            resp.sendRedirect("index.jsp");

        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            //resp.sendRedirect("index.jsp");
        }
     }


}
