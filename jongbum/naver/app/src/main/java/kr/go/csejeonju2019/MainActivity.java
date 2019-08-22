package kr.go.csejeonju2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;
import static com.nhn.android.naverlogin.OAuthLogin.mOAuthLoginHandler;


public class MainActivity extends AppCompatActivity {
    OAuthLogin mOAuthLoginModule;
    OAuthLoginButton mOAuthLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init(
                MainActivity.this
                ,"0PSGjaLXb_f6WljImx1S"
                ,"7mzm8tggH6"
                ,"CSEJEONJU"
                //,OAUTH_CALLBACK_INTENT
                // SDK 4.1.4 버전부터는 OAUTH_CALLBACK_INTENT변수를 사용하지 않습니다.
        );

}
}
