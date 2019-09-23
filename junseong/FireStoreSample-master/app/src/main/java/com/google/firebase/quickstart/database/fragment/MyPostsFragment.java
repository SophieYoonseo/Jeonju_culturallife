package com.google.firebase.quickstart.database.fragment;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(FirebaseFirestore databaseReference) {
        // All my posts
        return databaseReference.collection("posts").whereEqualTo("uid", getUid());
    }
}
