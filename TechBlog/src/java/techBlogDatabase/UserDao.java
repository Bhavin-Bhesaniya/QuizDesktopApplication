package techBlogDatabase;

import techBlogEntity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    //method to use  insert User to database
    public boolean saveUser(User user) {
        boolean f = false;
        try {

            String query = "insert into registration(name,email,password,gender,about) values(?,?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, user.getname());
            pst.setString(2, user.getemail());
            pst.setString(3, user.getpassword());
            pst.setString(4, user.getgender());
            pst.setString(5, user.getabout());
            pst.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    //get user by email and password
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        try {

            String query = "select * from registration where email=? and password=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet set = pst.executeQuery();
            if (set.next()) {
                user = new User();
                //data from db
                String name = set.getString("name");
                //set to user object
                user.setname(name);
                user.setuserid(set.getInt("userid"));
                user.setemail(set.getString("email"));
                user.setpassword(set.getString("password"));
                user.setgender(set.getString("gender"));
                user.setabout(set.getString("about"));
                user.setTimestamp(set.getTimestamp("date"));
                user.setprofile(set.getString("profile"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;

    }
    
    public boolean updateUser(User user)
    {
        boolean f =false;
        
        try {
            
                String query = "update registration set name=? ,password=? ,about=? ,profile=? where userid=? ";
                PreparedStatement pst = con.prepareStatement(query);
                
                pst.setString(1, user.getname());
                pst.setString(2, user.getpassword());
                pst.setString(3, user.getabout());
                pst.setString(4, user.getprofile());
                pst.setInt(5, user.getuserid());
                
                pst.executeUpdate();
                f = true;
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
