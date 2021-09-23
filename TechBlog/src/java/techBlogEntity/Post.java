package techBlogEntity;

import java.sql.Timestamp;

public class Post {

    private int pid;
    private String ptitle;
    private String pcontent;
    private String pcode;
    private String ppic;
    private Timestamp pdate;
    private int catid;
    private int userid;

    public Post() {
    }

    public Post(int pid, String ptitle, String pcontent, String pcode, String ppic, Timestamp pdate, int catid,int userid) {
        this.pid = pid;
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
        this.pdate = pdate;
        this.catid = catid;
        this.userid = userid;
    }

    public Post(String ptitle, String pcontent, String pcode, String ppic, Timestamp pdate, int catid,int userid) {

        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
        this.pdate = pdate;
        this.catid = catid;
        this.userid = userid;
    }

    public int getpid() {
        return pid;
    }

    public void setpid(int pid) {
        this.pid = pid;
    }

    public String getptitle() {
        return ptitle;
    }

    public void setptitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getpcontent() {
        return pcontent;
    }

    public void setpcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getpcode() {
        return pcode;
    }

    public void setpcode(String pcode) {
        this.pcode = pcode;
    }

    public String getppic() {
        return ppic;
    }

    public void setppic(String ppic) {
        this.ppic = ppic;
    }

    public Timestamp getpdate() {
        return pdate;
    }

    public void setpdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    public int getcatid() {
        return catid;
    }

    public void setcatid(int catid) {
        this.catid = catid;
    }
    public int getuserid() {
        return userid;
    }

    public void setuserid(int userid) {
        this.userid = userid;
    }
}
