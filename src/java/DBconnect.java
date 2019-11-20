
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/techfest";
    static final String USER="root";
    static final String PASS="root";
    
    static Connection  conn = null;
    
    public static Connection makeConnection() throws ClassNotFoundException,SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connection successful");
            return conn;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static void closeconnection() throws SQLException{
        conn.close();
    }
    
   
    
}
