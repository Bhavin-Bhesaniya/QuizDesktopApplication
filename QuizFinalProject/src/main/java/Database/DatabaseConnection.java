package Database;
import java.sql.*;
public class DatabaseConnection {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalquizapp", "root", "your_password");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}
