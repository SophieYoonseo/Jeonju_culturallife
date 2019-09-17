package kr.go.dbwrite;



import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.kakao.usermgmt.LoginButton;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;


//0913 MrJang KaKao Create!!
public class GlobalApplication extends Application {

    private static GlobalApplication instance;

    public static GlobalApplication getGlobalApplicationContext() {

        if (instance == null) {
            throw new IllegalStateException("This Application does not inherit com.kakao.GlobalApplication");
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        //Toast 메세지 삭제(by. jjongbumee)
        //Toast.makeText(GlobalApplication.this,"Hello World!",Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onTerminate() {
        super.onTerminate();
        instance = null;
    }
}
