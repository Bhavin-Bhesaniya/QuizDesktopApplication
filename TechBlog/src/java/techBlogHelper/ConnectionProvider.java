package techBlogHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection() {
        try {
           if(con==null)
           {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "1234@");
           }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return con;
    }
}
