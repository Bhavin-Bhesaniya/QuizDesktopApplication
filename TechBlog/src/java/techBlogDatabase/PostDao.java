package techBlogDatabase;

import techBlogEntity.Category;
import techBlogEntity.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDao {

    Connection con;
    

    public PostDao(Connection con) {
        this.con = con;
    }

    public ArrayList<Category> getAllCategoreies() {
        ArrayList<Category> list = new ArrayList<>();

        try {
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery("Select * from categoreies");
            while (rst.next()) {
                int cid = rst.getInt("cid");
                String name = rst.getString("cname");
                String desc = rst.getString("cdescription");
                Category c = new Category(cid, name, desc);
                list.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean savepost(Post p) {
        boolean f = false;
        try {

            String q = "insert into blogpost(ptitle,pcontent,pcode,ppic,catid,userid) values(?,?,?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(q);
            pst.setString(1, p.getptitle());
            pst.setString(2, p.getpcontent());
            pst.setString(3, p.getpcode());
            pst.setString(4, p.getppic());
            pst.setInt(5, p.getcatid());
            pst.setInt(6, p.getuserid());
            pst.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    //get all posts
    public List<Post> getAllPosts() {
        List<Post> list = new ArrayList<>();
        //fecth all post
        try {
            PreparedStatement pst = con.prepareStatement("select * from blogpost order by pid desc");
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                int pid = rst.getInt("pid");
                String ptitle = rst.getString("ptitle");
                String pcontent = rst.getString("pcontent");
                String pcode = rst.getString("pcode");
                String ppic = rst.getString("ppic");
                Timestamp date = rst.getTimestamp("pdate");
                int catid = rst.getInt("catid");
                int userid = rst.getInt("userid");
                Post ppost = new Post(pid, ptitle, pcontent, pcode, ppic, date, catid, userid);

                list.add(ppost);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<Post> getPostsById(int catid) {
        List<Post> catlist = new ArrayList<>();
        //fecth all post by id

        try {
            PreparedStatement pst = con.prepareStatement("select * from blogpost where catid = ?");
            pst.setInt(1, catid);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                int pid = rst.getInt("pid");
                String ptitle = rst.getString("ptitle");
                String pcontent = rst.getString("pcontent");
                String pcode = rst.getString("pcode");
                String ppic = rst.getString("ppic");
                Timestamp date = rst.getTimestamp("pdate");
                int userid = rst.getInt("userid");
                Post catpost = new Post(pid, ptitle, pcontent, pcode, ppic, date, catid, userid);

                catlist.add(catpost);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return catlist;
    }

    public Post getPostById(int postid) {
        try {
            Post post = null;
            String q = "select * from blogpost where pid =?";
            PreparedStatement pst = this.con.prepareStatement(q);
            pst.setInt(1, postid);
            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                int pid = rst.getInt("pid");
                String ptitle = rst.getString("ptitle");
                String pcontent = rst.getString("pcontent");
                String pcode = rst.getString("pcode");
                String ppic = rst.getString("ppic");
                Timestamp date = rst.getTimestamp("pdate");
                int catid = rst.getInt("catid");
                int userid = rst.getInt("userid");

                post = new Post(pid, ptitle, pcontent, pcode, ppic, date, catid, userid);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        Post post = null;

        return post;
    }
}
