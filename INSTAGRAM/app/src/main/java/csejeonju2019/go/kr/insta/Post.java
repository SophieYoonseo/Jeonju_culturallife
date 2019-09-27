package csejeonju2019.go.kr.insta;

import com.google.firebase.database.Exclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {

    public String uid;
    public String author;
    public String title;
    public String body;
    public int datanum=0;
    public int starCount = 0;
    public List<String> stars = new ArrayList<String>();

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String uid, String author, String title, String body,int datanum) {
        this.uid = uid;
        this.author = author;
        this.title = title;
        this.body = body;
        this.datanum=datanum;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("title", title);
        result.put("body", body);
        result.put("starCount", starCount);
        result.put("datanum",datanum);
        //result.put("stars", stars);

        return result;
    }
    // [END post_to_map]

}
// [END post_class]
