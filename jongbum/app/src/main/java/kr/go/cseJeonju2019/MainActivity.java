package kr.go.cseJeonju2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

import org.json.JSONObject;

import mobileflow.co.kr.R;

import static com.nhn.android.naverlogin.OAuthLogin.mOAuthLoginHandler;
import static kr.go.cseJeonju2019.LoginActivity.mOAuthLoginInstance;

public class MainActivity extends AppCompatActivity {
    public static OAuthLogin mOAuthLoginModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init(
                this
                ,"0PSGjaLXb_f6WljImx1S"
                ,"7mzm8tggH6"
                ,"cseJeonju2019"
                //,OAUTH_CALLBACK_INTENT
                // SDK 4.1.4 버전부터는 OAUTH_CALLBACK_INTENT변수를 사용하지 않습니다.
        );
    }

    public void naverlogin(View v){
        mOAuthLoginInstance.startOauthLoginActivity(new LoginActivity(), mOAuthLoginHandler);
    }


}
