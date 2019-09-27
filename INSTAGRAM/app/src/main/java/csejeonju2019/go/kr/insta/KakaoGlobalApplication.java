package csejeonju2019.go.kr.insta;

import android.app.Application;
import com.kakao.auth.KakaoSDK;

public class KakaoGlobalApplication extends Application {
    private static KakaoGlobalApplication instance;

    public static KakaoGlobalApplication getGlobalApplicationContext() {
        if (instance == null) {
            throw new IllegalStateException("This Application does not inherit com.kakao.GlobalApplication");
        }

        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        KakaoSDK.init(new KakaoSDKAdapter());

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        instance = null;
    }
}