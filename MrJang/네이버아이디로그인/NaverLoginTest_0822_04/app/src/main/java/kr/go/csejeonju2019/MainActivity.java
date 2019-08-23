package kr.go.csejeonju2019;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.nhn.android.naverlogin.OAuthLogin;

public class MainActivity extends AppCompatActivity
{
    OAuthLogin mOAuthLoginModule;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init
        (
                this
                ,"0PSGjaLXb_f6WljImx1S"
                ,"7mzm8tggH6"
                ,"MrJang0303"
                //,OAUTH_CALLBACK_INTENT
                // SDK 4.1.4 버전부터는 OAUTH_CALLBACK_INTENT변수를 사용하지 않습니다.
        );
    }
}
