import java.beans.*;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UserBean implements Serializable{
    private String uname;
    private String password;
    private String name;
    private String branch;
    private String year;
    public String getUname()
    {
       return uname;
    }
    public void setUname(String uname)
    {
        this.uname=uname;
    }
    
     public String getName()
    {
       return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public String getBranch()
    {
       return branch;
    }
    
    public void setyear(String year)
    {
        this.year=year;
    }
    public String getyear()
    {
       return year;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    
    
}
