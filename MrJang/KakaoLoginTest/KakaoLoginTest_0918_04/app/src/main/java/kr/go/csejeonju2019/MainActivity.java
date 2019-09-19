package kr.go.csejeonju2019;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.kakao.auth.AuthType;
import com.kakao.auth.Session;
import android.content.Context;


public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Button btn_custom_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        Session session = Session.getCurrentSession();
        session.addCallback(new SessionCallback());
        session.open(AuthType.KAKAO_LOGIN_ALL, MainActivity.this);
;
    }

}
