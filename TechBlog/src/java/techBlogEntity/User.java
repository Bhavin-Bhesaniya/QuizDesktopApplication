package techBlogEntity;

import java.sql.Timestamp;

public class User {

    private int userid;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String about;
    private Timestamp date;
    private String profile;

    public User(int userid, String name, String email, String password, String gender, String about, Timestamp date) {
        this.userid = userid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.about = about;
        this.date = date;
    }

    public User() {

    }

    public User(String name, String email, String password, String gender, String about) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.about = about;
    
    }

    public int getuserid() {
        return userid;
    }

    public void setuserid(int userid) {
        this.userid = userid;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getabout() {
        return about;
    }

    public void setabout(String about) {
        this.about = about;
    }

    public Timestamp getTimestamp() {
        return date;
    }

    public void setTimestamp(Timestamp date) {
        this.date = date;
    }
    
    public String getprofile() {
        return profile;
    }

    public void setprofile(String profile) {
        this.profile = profile;
    }
}

