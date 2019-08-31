package csejeonju2019.go.kr.insta;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup extends AppCompatActivity {
    private static final String TAG="signupactivity";
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        mAuth=FirebaseAuth.getInstance();
        findViewById(R.id.sign_up_button).setOnClickListener(onClickListener);
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    View.OnClickListener onClickListener=new View.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.sign_up_button:
                    sign();
                    Log.e("클릭","클릭");
                    break;
            }
        }
    };

    private void sign(){
        String email=((EditText)findViewById(R.id.email_text)).getText().toString();
        String password=((EditText)findViewById(R.id.password_text)).getText().toString();



        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                           // updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                           // Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                             //       Toast.LENGTH_SHORT).show();
                         //   updateUI(null);
                        }

                        // ...
                    }
                });
    }
}
