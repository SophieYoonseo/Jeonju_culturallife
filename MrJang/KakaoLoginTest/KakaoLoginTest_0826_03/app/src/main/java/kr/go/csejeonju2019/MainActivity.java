package kr.go.csejeonju2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.kakao.auth.Session;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doLogout(View view)
    {
        if (Session.getCurrentSession().isOpened()) {
            Toast.makeText(this, "Login 되어있습니다.", Toast.LENGTH_SHORT).show();
        } else {


        }
    }

}
