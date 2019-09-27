package csejeonju2019.go.kr.insta;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class RecentPostsFragment extends PostListFragment {

    String sort_column_name="date";
     com.google.firebase.database.Query sortbydate= FirebaseDatabase.getInstance().getReference().child("id_list").orderByChild(sort_column_name);

    public RecentPostsFragment() {
//        sortbydate.addListenerForSingleValueEvent();

    }

    @Override
    public Query getQuery(FirebaseFirestore databaseReference) {
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys

        return databaseReference.collection("posts").orderBy("datanum", Query.Direction.DESCENDING);



    }
}
