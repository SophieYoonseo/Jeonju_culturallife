package csejeonju2019.go.kr.insta;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MyTopPostsFragment extends PostListFragment {

    public MyTopPostsFragment() {}

    @Override
    public Query getQuery(FirebaseFirestore databaseReference) {
        // [START my_top_posts_query]
        // My top posts by number of stars
        String myUserId = getUid();
        // [END my_top_posts_query]

        return databaseReference.collection("posts").whereEqualTo("uid", getUid()).orderBy("starCount", Query.Direction.DESCENDING).orderBy("datanum", Query.Direction.DESCENDING);
    }
}
