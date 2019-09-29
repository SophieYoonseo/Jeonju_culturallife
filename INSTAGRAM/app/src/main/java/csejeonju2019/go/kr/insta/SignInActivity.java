package csejeonju2019.go.kr.insta;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.Session;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeResponseCallback;
import com.kakao.usermgmt.response.model.UserProfile;
import com.kakao.util.exception.KakaoException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SignInActivity extends BaseActivity implements View.OnClickListener, ISessionCallback {

    private static final String TAG = "SignInActivity";

    private FirebaseFirestore db;
    private FirebaseAuth mAuth;

    private EditText mEmailField;
    private EditText mPasswordField;
    private Button mSignInButton;
    private Button mSignUpButton;

    //0928 MrJang Add : for kakao login
    private Context mContext;
    private ImageButton btn_custom_login;

    //0929 MrJang Add : for kakao SessionCallback
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    String nickname;
    String email;
    String profileImagePath;
    String thumnailPath;
    String UUID;
    long id;
    String stringID;
    String kakaoType;

    //시간에 관한 변수 선언
    Date mDate = new Date(System.currentTimeMillis());
    String timestamp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(mDate); //로그인 시간

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();

        // Views
        mEmailField = findViewById(R.id.field_email);
        mPasswordField = findViewById(R.id.field_password);
        mSignInButton = findViewById(R.id.button_sign_in);
        mSignUpButton = findViewById(R.id.button_sign_up);

        // Click listeners
        mSignInButton.setOnClickListener(this);
        mSignUpButton.setOnClickListener(this);

        //0928 MrJang Add : for kakao login
        mContext = getApplicationContext();
        btn_custom_login = findViewById(R.id.btn_custom_kakao_login);
        btn_custom_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Session session = Session.getCurrentSession();
                session.addCallback(new SignInActivity());
                session.open(AuthType.KAKAO_LOGIN_ALL, SignInActivity.this);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        // Check auth on Activity start
        if (mAuth.getCurrentUser() != null) {
            onAuthSuccess(mAuth.getCurrentUser());
        }
    }

    private void signIn() {
        Log.d(TAG, "signIn");
        if (!validateForm()) {
            return;
        }

        showProgressDialog();
        String email = mEmailField.getText().toString();
        String password = mPasswordField.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "signIn:onComplete:" + task.isSuccessful());
                        hideProgressDialog();

                        if (task.isSuccessful()) {
                            onAuthSuccess(task.getResult().getUser());
                        } else {
                            Toast.makeText(SignInActivity.this, "Sign In Failed",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void signUp() {
        Log.d(TAG, "signUp");
        if (!validateForm()) {
            return;
        }

        showProgressDialog();
        String email = mEmailField.getText().toString();
        String password = mPasswordField.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "createUser:onComplete:" + task.isSuccessful());
                        hideProgressDialog();

                        if (task.isSuccessful()) {
                            onAuthSuccess(task.getResult().getUser());
                        } else {
                            Toast.makeText(SignInActivity.this, "Sign Up Failed",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void onAuthSuccess(FirebaseUser user) {
        String username = usernameFromEmail(user.getEmail());

        // Write new user
        writeNewUser(user.getUid(), username, user.getEmail());

        // Go to MainActivity
        startActivity(new Intent(SignInActivity.this, signmain.class));
        finish();
    }

    private String usernameFromEmail(String email) {
        if (email.contains("@")) {
            return email.split("@")[0];
        } else {
            return email;
        }
    }

    public boolean validateForm() {
        boolean result = true;
        if (TextUtils.isEmpty(mEmailField.getText().toString())) {
            mEmailField.setError("Required");
            result = false;
        } else {
            mEmailField.setError(null);
        }

        if (TextUtils.isEmpty(mPasswordField.getText().toString())) {
            mPasswordField.setError("Required");
            result = false;
        } else {
            mPasswordField.setError(null);
        }

        return result;
    }

    // [START basic_write]
    private void writeNewUser(String userId, String name, String email) {
        User user = new User(name, email);

<<<<<<< HEAD
=======
        db.collection("users").document(userId).set(user);
>>>>>>> parent of da599128... kakao 로그인시, Cloud에 잘 등록됨
    }
    // [END basic_write]

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button_sign_in) {
            signIn();
        } else if (i == R.id.button_sign_up) {
            signUp();
        }
    }

    //0928 MrJang Add : for kakao login
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Session.getCurrentSession().removeCallback(this);

    }

    //0928 MrJang Add : for kakao login
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (Session.getCurrentSession().handleActivityResult(requestCode, resultCode, data)) {
            return;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

<<<<<<< HEAD

    /*0929 MrJang Add : KakaoSessionCallback !
    *
    *
    *
    *
     */

    // 로그인에 성공한 상태
    @Override
    public void onSessionOpened() {
        requestMe();
    }

    // 로그인에 실패한 상태
    @Override
    public void onSessionOpenFailed(KakaoException exception) {
        Log.e("SessionCallback :: ", "onSessionOpenFailed : " + exception.getMessage());
    }

    // 사용자 정보 요청
    public void requestMe() {
        // 사용자정보 요청 결과에 대한 Callback

        UserManagement.getInstance().requestMe(new MeResponseCallback() {
            // 세션 오픈 실패. 세션이 삭제된 경우,
            @Override
            public void onSessionClosed(ErrorResult errorResult) {
                Log.e("SessionCallback :: ", "onSessionClosed : " + errorResult.getErrorMessage());
            }

            // 회원이 아닌 경우,
            @Override
            public void onNotSignedUp() {
                Log.e("SessionCallback :: ", "onNotSignedUp");
            }

            // 사용자정보 요청에 성공한 경우,
            @Override
            public void onSuccess(UserProfile userProfile) {
                Log.e("SessionCallback :: ", "onSuccess");

                nickname = userProfile.getNickname();
                email = userProfile.getEmail();
                profileImagePath = userProfile.getProfileImagePath();
                thumnailPath = userProfile.getThumbnailImagePath();
                UUID = userProfile.getUUID();
                id = userProfile.getId();
                stringID = String.valueOf(id);
                kakaoType = "kakao";

                Log.e("Profile : ", nickname + "");
                Log.e("Profile : ", email + "");
                Log.e("Profile : ", profileImagePath  + "");
                Log.e("Profile : ", thumnailPath + "");
                Log.e("Profile : ", UUID + "");
                Log.e("Profile : ", id + "");

                //realtime에 DB 넣기 시작!
                DatabaseReference ref = databaseReference.child("accounts");
                final KakaoAccount kakaoAccount = new KakaoAccount(stringID, timestamp,kakaoType);
                ref.push().setValue(kakaoAccount);

                //cloud DB에 넣기 시작!
                mAuth = FirebaseAuth.getInstance();
                db = FirebaseFirestore.getInstance();
                //mSignActivity = new SignInActivity();

                // Write new user

// Create a new user with a first and last name
                Map<String, Object> user = new HashMap<>();
                user.put("email", stringID+"@"+kakaoType);
                user.put("username", nickname);

// Add a new document with a generated ID
                db.collection("users")
                        .add(user)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Log.d("sucess! firestore : ", "DocumentSnapshot added with ID: " + documentReference.getId());

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w("failure firestore : ", "Error adding document", e);
                            }
                        });

            }

            // 사용자 정보 요청 실패
            @Override
            public void onFailure(ErrorResult errorResult) {
                Log.e("SessionCallback :: ", "onFailure : " + errorResult.getErrorMessage());
            }
        });
    }

=======

>>>>>>> parent of da599128... kakao 로그인시, Cloud에 잘 등록됨
}
