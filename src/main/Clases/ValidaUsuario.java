import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = {"/validacion"})
public class ValidaUsuario extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String usr = "Admin";
        final String paswd = "123*456";
        String usuario;
        String clave;

        usuario = req.getParameter("usrNombre");
        clave = req.getParameter("usrClave");
        PrintWriter out= resp.getWriter();
        HttpSession session = req.getSession();



       // _isUsr =  usuario.matches(usr);
        //_isPaswd = clave.matches(paswd);

        if(usuario.equals(usr) && clave.equals(paswd) && usuario !=null){

            resp.sendRedirect("index.jsp");
            return;


        } else {

            session.invalidate();
            resp.sendRedirect("login.jsp");
        }
     }


}
