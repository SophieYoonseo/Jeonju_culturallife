package kr.go.csejeonju2019;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;
import static com.nhn.android.naverlogin.OAuthLogin.mOAuthLoginHandler;


public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;
    OAuthLogin mOAuthLoginModule;
    OAuthLoginButton mOAuthLoginButton;
    Context mContext;
    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
        @Override
        public void run(boolean success) {
            if (success) {
                String accessToken = mOAuthLoginModule.getAccessToken(mContext);
                String refreshToken = mOAuthLoginModule.getRefreshToken(mContext);
                long expiresAt = mOAuthLoginModule.getExpiresAt(mContext);
                String tokenType = mOAuthLoginModule.getTokenType(mContext);
                //Toast.makeText(getApplicationContext(), accessToken, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), AfterActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);

            } else {
                String errorCode = mOAuthLoginModule.getLastErrorCode(mContext).getCode();
                String errorDesc = mOAuthLoginModule.getLastErrorDesc(mContext);
                Toast.makeText(mContext, "errorCode:" + errorCode
                        + ", errorDesc:" + errorDesc, Toast.LENGTH_SHORT).show();
            }
        };
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_MENU) {
            Toast.makeText(getApplicationContext(), "afterActivitiy 결과코드 :" + resultCode, Toast.LENGTH_LONG).show();
            if(resultCode == RESULT_OK) {
                String name = data.getExtras().getString("name");
                Toast.makeText(getApplicationContext(), "응답으로 전달된 name : "+ name, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init(
                MainActivity.this
                , "0PSGjaLXb_f6WljImx1S"
                , "7mzm8tggH6"
                , "CSEJEONJU"
                //,OAUTH_CALLBACK_INTENT
                // SDK 4.1.4 버전부터는 OAUTH_CALLBACK_INTENT변수를 사용하지 않습니다.
        );
        mOAuthLoginButton = findViewById(R.id.buttonOAuthLoginImg);
        mOAuthLoginButton.setOAuthLoginHandler(mOAuthLoginHandler);
        //mOAuthLoginButton.setBgResourceId(R.drawable.img_loginbtn_usercustom);
        //mOAuthLoginModule.startOauthLoginActivity(this, mOAuthLoginHandler);
    }
    public void onDestroy(){
        mOAuthLoginModule.logout(mContext);
        Toast.makeText(MainActivity.this, "로그아웃되었습니다", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
