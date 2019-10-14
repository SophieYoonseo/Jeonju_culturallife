package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public abstract class PostListFragment extends Fragment {

    private static final String TAG = "PostListFragment";

    // [START define_database_reference]
    private FirebaseFirestore db;
    // [END define_database_reference]

    private PostAdapter mAdapter;
    private RecyclerView mRecycler;
    private LinearLayoutManager mManager;

    public PostListFragment() {}

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_all_posts, container, false);
        String sort_column_name="date";
        com.google.firebase.database.Query sortbydate= FirebaseDatabase.getInstance().getReference().child("id_list").orderByChild(sort_column_name);
        // [START create_database_reference]
        db = FirebaseFirestore.getInstance();
        // [END create_database_reference]

        mRecycler = rootView.findViewById(R.id.messages_list);
        mRecycler.setHasFixedSize(true);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Set up Layout Manager, reverse layout
        mManager = new LinearLayoutManager(getActivity());
        mManager.setReverseLayout(true);
        mManager.setStackFromEnd(true);
        mRecycler.setLayoutManager(mManager);

        // Set up FirebaseRecyclerAdapter with the Query
        Query postsQuery = getQuery(db);

        mAdapter = new PostAdapter(postsQuery);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycler.setAdapter(mAdapter);
        String sort_column_name="date";
        com.google.firebase.database.Query sortbydate= FirebaseDatabase.getInstance().getReference().child("id_list").orderByChild(sort_column_name);
    }

    class PostAdapter extends FirestoreAdapter<PostViewHolder> {

        PostAdapter(Query query) {
            super(query);
        }

        @Override
        public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            String sort_column_name="date";
            com.google.firebase.database.Query sortbydate= FirebaseDatabase.getInstance().getReference().child("id_list").orderByChild(sort_column_name);
            return new PostViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_post, parent, false));
        }

        @Override
        public void onBindViewHolder(PostViewHolder viewHolder, int position) {
            DocumentSnapshot documentSnapshot = getSnapshot(position);
            Post post = documentSnapshot.toObject(Post.class);
            String sort_column_name="date";
            com.google.firebase.database.Query sortbydate= FirebaseDatabase.getInstance().getReference().child("id_list").orderByChild(sort_column_name);
            final String postKey = documentSnapshot.getId();

            // Set click listener for the whole post view
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Launch PostDetailActivity
                    Intent intent = new Intent(getActivity(), csejeonju2019.go.kr.insta.PostDetailActivity.class);
                    intent.putExtra(csejeonju2019.go.kr.insta.PostDetailActivity.EXTRA_POST_KEY, postKey);
                    startActivity(intent);
                }
            });
            // Determine if the current user has liked this post and set UI accordingly
            if (post.stars.indexOf(getUid())>-1) {
                //if (post.stars.containsKey(getUid())) {
                viewHolder.starView.setImageResource(R.drawable.ic_likered);
            } else {
                viewHolder.starView.setImageResource(R.drawable.ic_like);
            }

            // Bind Post to ViewHolder, setting OnClickListener for the star button
            viewHolder.bindToPost(post, new View.OnClickListener() {
                @Override
                public void onClick(View starView) {
                    db.collection("posts").document(postKey).get()
                            .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                                @Override
                                public void onSuccess(DocumentSnapshot documentSnapshot) {
                                    Post post = documentSnapshot.toObject(Post.class);
                                    if (post.stars.indexOf(getUid())==-1) {
                                        post.stars.add(getUid());
                                    } else {
                                        post.stars.remove(getUid());
                                    }
                                    post.starCount = post.stars.size();
                                    documentSnapshot.getReference().set(post);
                                }
                            });
                }
            });
        }
    }


    @Override
    public void onStart() {
        super.onStart();
        if (mAdapter != null) {
            mAdapter.startListening();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAdapter != null) {
            mAdapter.stopListening();
        }
    }


    public String getUid() {
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

    public abstract Query getQuery(FirebaseFirestore databaseReference);

}
