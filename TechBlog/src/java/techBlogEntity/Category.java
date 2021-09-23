package techBlogEntity;

public class Category {

    private int cid;
    private String cname;
    private String cdescription;

    public Category(int cid, String cname, String cdescription) {
        this.cid = cid;
        this.cname = cname;
        this.cdescription = cdescription;

    }

    public Category() {
    }

    public Category(String cname, String cdescription) {

        this.cname = cname;
        this.cdescription = cdescription;

    }

    public int getcid() {
        return cid;
    }

    public void setcid(int cid) {
        this.cid = cid;
    }

    public String getcname() {
        return cname;
    }

    public void setcname(String cname) {
        this.cname = cname;
    }

    public String getcdescription() {
        return cdescription;
    }

    public void setcdescription(String cdescription) {
        this.cdescription = cdescription;
    }

}
