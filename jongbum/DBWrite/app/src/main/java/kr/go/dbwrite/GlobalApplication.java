package kr.go.dbwrite;

//0913 MrJang KaKao Create!!

import android.app.Application;
import android.content.Intent;

import com.kakao.auth.KakaoSDK;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;

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

        // Kakao Sdk 초기화
        KakaoSDK.init(new KakaoSDKAdapter());


        /* 문제점 발견, but 해결못함
        UserManagement.requestLogout(new LogoutResponseCallback() {
            @Override
            public void onCompleteLogout() {
                //로그아웃 성공 후 하고싶은 내용 코딩 ~
            }
        });
        */

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        instance = null;
    }

}
