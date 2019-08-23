package csejeonju2019.go.kr.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

public class MainActivity extends AppCompatActivity {
    OAuthLogin mOAuthLoginModule;
    OAuthLoginButton authLoginButton;
    Context mContext;
    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
        @Override
        public void run(boolean success) {
            if (success) {
                final String accessToken = mOAuthLoginModule.getAccessToken(mContext);

                String refreshToken = mOAuthLoginModule.getRefreshToken(mContext);
                long expiresAt = mOAuthLoginModule.getExpiresAt(mContext);
                String tokenType = mOAuthLoginModule.getTokenType(mContext);
            } else {
                String errorCode = mOAuthLoginModule.getLastErrorCode(mContext).getCode();
                String errorDesc = mOAuthLoginModule.getLastErrorDesc(mContext);
                Toast.makeText(mContext, "errorCode:" + errorCode
                        + ", errorDesc:" + errorDesc, Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        authLoginButton = (OAuthLoginButton) findViewById(R.id.buttonOAuthLoginImg);
        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init(
                MainActivity.this
                ,"3nKYuB6z9lxtwInkIkMw"
                ,"HlnRPJycsD"
                ,"Client Name"
                //,OAUTH_CALLBACK_INTENT
                // SDK 4.1.4 버전부터는 OAUTH_CALLBACK_INTENT변수를 사용하지 않습니다.

        );
        if (mOAuthLoginModule.getAccessToken(this) != null) {
            startActivity(new Intent(this,AfterActivity.class));
        } else {
            authLoginButton.setOAuthLoginHandler(mOAuthLoginHandler);

            //위 코드가 네이버 아이디 로그인을 요청하는 코드입니다.
        }


    }
}
