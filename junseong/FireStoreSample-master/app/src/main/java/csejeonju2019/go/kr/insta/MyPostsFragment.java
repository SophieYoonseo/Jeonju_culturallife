package csejeonju2019.go.kr.insta;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import csejeonju2019.go.kr.insta.PostListFragment;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(FirebaseFirestore databaseReference) {
        // All my posts
        return databaseReference.collection("posts").whereEqualTo("uid", getUid());
    }
}
