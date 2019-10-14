package csejeonju2019.go.kr.insta;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.content.SharedPreferences;
public class NewPostActivity extends BaseActivity {

    private static final String TAG = "NewPostActivity";
    private static final String REQUIRED = "Required";
    long now = System.currentTimeMillis();
    SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
    Date date = new Date();
    String strDate = dateFormat.format(date);
    public static int datanum;





    private DatabaseReference mDatabase;
    private FirebaseFirestore db;
    // [END declare_database_ref]

    private EditText mTitleField;
    private EditText mBodyField;
    private FloatingActionButton mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        datanum = pref.getInt("key1", datanum);
        datanum++;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        // [START initialize_database_ref]
        mDatabase = FirebaseDatabase.getInstance().getReference();
        db = FirebaseFirestore.getInstance();
        // [END initialize_database_ref]

        mTitleField = findViewById(R.id.field_title);
        mBodyField = findViewById(R.id.field_body);
        mSubmitButton = findViewById(R.id.fab_submit_post);



        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitPost();
            }
        });
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("key1", datanum);
        editor.commit();
        editor.apply();


    }

    private void submitPost() {
        final String title = mTitleField.getText().toString();
        final String body = mBodyField.getText().toString();

        // Title is required
        if (TextUtils.isEmpty(title)) {
            mTitleField.setError(REQUIRED);
            return;
        }

        // Body is required
        if (TextUtils.isEmpty(body)) {
            mBodyField.setError(REQUIRED);
            return;
        }
        // Disable button so there are no multi-posts
        setEditingEnabled(false);
        datanum++;
        Toast.makeText(this, "Posting...", Toast.LENGTH_SHORT).show();
        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("key1", datanum);
        editor.commit();
        editor.apply();
        // [START single_value_read]
        final String userId = getUid();
        DocumentReference docRef = db.collection("users").document(userId);
        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                User user = documentSnapshot.toObject(User.class);
                if (user == null) {
                    Log.e(TAG, "User " + userId + " is unexpectedly null");
                    Toast.makeText(NewPostActivity.this,
                            "Error: could not fetch user.",
                            Toast.LENGTH_SHORT).show();
                } else {

                    writeNewPost(userId, user.username, title, body,datanum);
                }

                // Finish this Activity, back to the stream
                setEditingEnabled(true);
                finish();
            }
        });
    }

    private void setEditingEnabled(boolean enabled) {
        mTitleField.setEnabled(enabled);
        mBodyField.setEnabled(enabled);
        if (enabled) {
            mSubmitButton.setVisibility(View.VISIBLE);
        } else {
            mSubmitButton.setVisibility(View.GONE);
        }
    }

    // [START write_fan_out]
    public void  writeNewPost(String userId, String username, String title, String body,int datanum) {
        Post post = new Post(userId, username, title, body,datanum);
        db.collection("posts").add(post);
    }    // [END write_fan_out]
}
