package kr.go.dbtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^[a-zA-Z0-9!@.#$%^&*?_~]{4,16}$");

    private FirebaseAuth firebaseAuth;

    private EditText editTextEmail;
    private EditText editTextPassword;

    private String email ="";
    private String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        editTextEmail = findViewById(R.id.et_eamil);
        editTextPassword = findViewById(R.id.et_password);
    }

    private boolean isValidEmail() {
        if(email.isEmpty()) {
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return false;
        } else return true;
    }

    private void createUser(String email, String password) {
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                            Toast.makeText(MainActivity.this, R.string.success_signup, Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, R.string.failed_signup, Toast.LENGTH_SHORT).show();
                    }
        });
    }

    private void loginUser(String email, String password) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) Toast.makeText(MainActivity.this, R.string.success_login, Toast.LENGTH_SHORT).show();
                else Toast.makeText(MainActivity.this, R.string.failed_login, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean isValidPasswd() {
        if (password.isEmpty()) {
            // 비밀번호 공백
            return false;
        } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
            // 비밀번호 형식 불일치
            return false;
        } else {
            return true;
        }
    }

    public void signUp(View view) {
        email = editTextEmail.getText().toString();
        password = editTextPassword.getText().toString();

        if(isValidEmail() && isValidPasswd()) {
            createUser(email, password);
        }
    }

    public void signIn(View view) {
        email = editTextEmail.getText().toString();
        password = editTextPassword.getText().toString();

        if(isValidEmail() && isValidPasswd()) loginUser(email, password);
    }
}
