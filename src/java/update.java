import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/update"})
public class update extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter write=response.getWriter();
           
           
        try {
            response.setContentType("text/html");
            String u = (String) request.getParameter("email");
            String n = (String) request.getParameter("name");
            String y = (String) request.getParameter("year");
            String b= (String) request.getParameter("branch");
            
            UserBean newUser=new UserBean();
            newUser.setUname(u);
            newUser.setName(n);
            newUser.setyear(y);
            newUser.setBranch(b);
            
            User user = new User();
            int r=user.updateUser(newUser);
            if(r==1)
            {
                
                RequestDispatcher rd=request.getRequestDispatcher("landing.jsp");
                write.print("<h7>Profile Updated<h7>");
                rd.forward(request,response);
            }
          
            } catch (Exception e) {
            write.print(e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
