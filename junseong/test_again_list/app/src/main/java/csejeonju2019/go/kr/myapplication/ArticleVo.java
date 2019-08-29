package csejeonju2019.go.kr.myapplication;

public class ArticleVo {
    private String subject;
    private String author;
    private int hitCoutn;
    public ArticleVo(String subject, String author, int hitCoutn) {
        this.subject = subject;
        this.author = author;
        this.hitCoutn = hitCoutn;
    }
    public String getSubject(){
        return subject;
    }
    public String getAuthor(){
        return author;
    }
    public int getHitCoutn(){
        return hitCoutn;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setHitCoutn(int hitCoutn){
        this.hitCoutn=hitCoutn;
    }






}
