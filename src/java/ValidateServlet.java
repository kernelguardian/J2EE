
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/ValidateServlet"})
public class ValidateServlet extends HttpServlet {

  

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String u = request.getParameter("email");
        String p = request.getParameter("pass");
        User user = new User();
        PrintWriter write = response.getWriter();
        try {
            if (user.validate(u, p)){ //user.validate(u, p)
                UserBean LoggedUser=user.getUserBean();
                if(LoggedUser!=null)
                {
                    HttpSession session=request.getSession();
                    session.setAttribute("s_name",LoggedUser.getName());
                    session.setAttribute("s_uname",LoggedUser.getUname());
                    session.setAttribute("s_branch",LoggedUser.getBranch());
                    session.setAttribute("s_year",LoggedUser.getyear());
                    RequestDispatcher rd_=request.getRequestDispatcher("landing.jsp");
                    request.setAttribute("username",u);
                    rd_.forward(request,response);
                }
   
            }
             else
            {
                write.print("<html><h1>Password incorrect or SQL Error</h1></html>");
                RequestDispatcher rd=request.getRequestDispatcher("index.html");
                rd.include(request,response);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
            RequestDispatcher rd_=request.getRequestDispatcher("error.html");
            rd_.forward(request,response);

        }

    }

}