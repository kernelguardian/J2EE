import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    static Connection c;
    PreparedStatement ps;
    ResultSet rs;
    UserBean userLogged=new UserBean();
    public boolean validate(String u,String p) throws SQLException, ClassNotFoundException
    {   

          c=DBconnect.makeConnection();
          if(c==null){
              return false;
          }
        ps=c.prepareStatement("Select *from user where email=? AND password=?;");
        ps.setString(1,u);
        ps.setString(2,p);
        rs=ps.executeQuery();
        if(rs.next())
        {
            setUserBean(rs);
            return true;
        }
        else{
            return false;
        }
          
    }
    

    public void deleteuser(String u, String p) throws SQLException,ClassNotFoundException {
        c= DBconnect.makeConnection();
        ps = c.prepareStatement("delete from user where email=? AND password=?");
        ps.setString(1, u);
        ps.setString(2, p);
      
        
    }

    public int updateUser(UserBean newUser) throws SQLException, ClassNotFoundException
    {
        int k=0;
        try{
            c=DBconnect.makeConnection();
            ps=c.prepareStatement("update user set year=?,branch=?,name=? where email=?");
            ps.setString(1,newUser.getyear());
            ps.setString(2,newUser.getBranch());
            ps.setString(3,newUser.getName());
            ps.setString(4,newUser.getUname());
            k=ps.executeUpdate();
        }
        
       catch(Exception e)
            {
                e.printStackTrace();
                k=-1;
            }
        return k;
    }
    
    public int insertUser(UserBean newUser) throws SQLException, ClassNotFoundException {
        c = DBconnect.makeConnection();
        ps=c.prepareStatement("select * from user where email=? and password=?");
        ps.setString(1,newUser.getUname());
        ps.setString(2,newUser.getPassword());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            return 0;
        }
        else{
        
        
        ps = c.prepareStatement("insert into user(email, password, name, year, branch)" + "values( ?,  ?,  ?,  ?,  ?)");
        ps.setString(1, newUser.getUname());
        ps.setString(2, newUser.getPassword());
        ps.setString(3, newUser.getName());
        ps.setString(4, newUser.getyear());
        ps.setString(5, newUser.getBranch());
        ps.executeUpdate();
        return 1;
        }
    
}
    void setUserBean(ResultSet rs)throws SQLException{
        String email,name,branch,year;
        email=rs.getString("email");
        name=rs.getString("name");
        branch=rs.getString("branch");
        year=rs.getString("year");
        userLogged.setUname(email);
        userLogged.setName(name);
        userLogged.setBranch(branch);
        userLogged.setyear(year);
        
    }
    UserBean getUserBean()
    {
        if(userLogged!=null)
            return userLogged;
        else
            return null;
    }
}