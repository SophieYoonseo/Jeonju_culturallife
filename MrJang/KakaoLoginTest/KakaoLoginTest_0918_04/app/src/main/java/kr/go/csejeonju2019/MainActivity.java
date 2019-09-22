package kr.go.csejeonju2019;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.auth.AuthType;
import com.kakao.auth.Session;
import android.content.Context;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Button mKakaoLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        /*
        //카카오 버튼 리스너, 알고보니, 최종구현
        Session session = Session.getCurrentSession();
        session.addCallback(new SessionCallback());
        session.open(AuthType.KAKAO_ACCOUNT, MainActivity.this);
         */

    }
}
