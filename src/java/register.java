import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

   

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
            String u = request.getParameter("email");
            String p = request.getParameter("pass");
            String n = request.getParameter("name");
            String y = request.getParameter("year");
            String b= request.getParameter("branch");
            
            UserBean newUser=new UserBean();
            newUser.setUname(u);
            newUser.setPassword(p);
            newUser.setName(n);
            newUser.setyear(y);
            newUser.setBranch(b);
            
            User user = new User();
            int r=user.insertUser(newUser);
            if(r==1)
            {
                
                RequestDispatcher rd=request.getRequestDispatcher("login.html");
                write.print("<h7>You have successfully registered!!!!<h7>");
                rd.include(request,response);
            }
            else
            {
                write.print("<html><h1>User Exists</h1></html>");
                RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
                rd.include(request,response);
            }
            
        } catch (Exception e) {
            //write.print(e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
