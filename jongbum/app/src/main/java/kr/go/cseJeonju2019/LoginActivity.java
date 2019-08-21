package kr.go.cseJeonju2019;

import android.os.AsyncTask;
import android.provider.SyncStateContract;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    ////NaverLogin
    public static OAuthLogin        mOAuthLoginInstance;
    public Map<String,String>       mUserInfoMap;


    /****************************************************************************************************************
     * Naver
     ****************************************************************************************************************/
    private  void initNaver(){
        //Naver Init

        mOAuthLoginInstance = OAuthLogin.getInstance();
        mOAuthLoginInstance.init(this, "0PSGjaLXb_f6WljImx1S", "7mzm8tggH6", "cseJeonju2019");
        /*
         * 2015년 8월 이전에 등록하고 앱 정보 갱신을 안한 경우 기존에 설정해준 callback intent url 을 넣어줘야 로그인하는데 문제가 안생긴다.
         * 2015년 8월 이후에 등록했거나 그 뒤에 앱 정보 갱신을 하면서 package name 을 넣어준 경우 callback intent url 을 생략해도 된다.
         */
        //mOAuthLoginInstance.init(mContext, OAUTH_CLIENT_ID, OAUTH_CLIENT_SECRET, OAUTH_CLIENT_NAME, OAUTH_callback_intent_url);

    }

    /**
     * startOAuthLoginActivity() 호출시 인자로 넘기거나, OAuthLoginButton 에 등록해주면 인증이 종료되는 걸 알 수 있다.
     */
    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
        @Override
        public void run(boolean success) {
            if (success) {
                String accessToken = mOAuthLoginInstance.getAccessToken(mActivity);
                String refreshToken = mOAuthLoginInstance.getRefreshToken(mActivity);
                long expiresAt = mOAuthLoginInstance.getExpiresAt(mActivity);
                String tokenType = mOAuthLoginInstance.getTokenType(mActivity);
                Log.d(TAG,accessToken);
                Log.d(TAG,refreshToken);
                Log.d(TAG,String.valueOf(expiresAt));
                Log.d(TAG,tokenType);
                Log.d(TAG, mOAuthLoginInstance.getState(mActivity).toString());
                new RequestApiTask().execute();
            } else {
                String errorCode = mOAuthLoginInstance.getLastErrorCode(mActivity).getCode();
                String errorDesc = mOAuthLoginInstance.getLastErrorDesc(mActivity);
                Toast.makeText(mActivity, "errorCode:" + errorCode + ", errorDesc:" + errorDesc, Toast.LENGTH_SHORT).show();
            }
        };
    };


    private class RequestApiTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {

        }

        @Override
        protected Void doInBackground(Void... params) {
            String url = "https://openapi.naver.com/v1/nid/getUserProfile.xml";
            String at = mOAuthLoginInstance.getAccessToken(mActivity);
            mUserInfoMap = requestNaverUserInfo(mOAuthLoginInstance.requestApi(mActivity, at, url));
            return null;
        }

        protected void onPostExecute(Void content) {
            if (mUserInfoMap.get("email") == null) {
                Toast.makeText(mActivity, "로그인 실패하였습니다.  잠시후 다시 시도해 주세요!!", Toast.LENGTH_SHORT).show();
            } else {
                Log.d(TAG, String.valueOf(mUserInfoMap));

            }

        }
    }
    private Map<String,String> requestNaverUserInfo(String data) { // xml 파싱
        String f_array[] = new String[9];

        try {
            XmlPullParserFactory parserCreator = XmlPullParserFactory
                    .newInstance();
            XmlPullParser parser = parserCreator.newPullParser();
            InputStream input = new ByteArrayInputStream(
                    data.getBytes("UTF-8"));
            parser.setInput(input, "UTF-8");

            int parserEvent = parser.getEventType();
            String tag;
            boolean inText = false;
            boolean lastMatTag = false;

            int colIdx = 0;

            while (parserEvent != XmlPullParser.END_DOCUMENT) {
                switch (parserEvent) {
                    case XmlPullParser.START_TAG:
                        tag = parser.getName();
                        if (tag.compareTo("xml") == 0) {
                            inText = false;
                        } else if (tag.compareTo("data") == 0) {
                            inText = false;
                        } else if (tag.compareTo("result") == 0) {
                            inText = false;
                        } else if (tag.compareTo("resultcode") == 0) {
                            inText = false;
                        } else if (tag.compareTo("message") == 0) {
                            inText = false;
                        } else if (tag.compareTo("response") == 0) {
                            inText = false;
                        } else {
                            inText = true;

                        }
                        break;
                    case XmlPullParser.TEXT:
                        tag = parser.getName();
                        if (inText) {
                            if (parser.getText() == null) {
                                f_array[colIdx] = "";
                            } else {
                                f_array[colIdx] = parser.getText().trim();
                            }

                            colIdx++;
                        }
                        inText = false;
                        break;
                    case XmlPullParser.END_TAG:
                        tag = parser.getName();
                        inText = false;
                        break;

                }

                parserEvent = parser.next();
            }
        } catch (Exception e) {
            Log.e("dd", "Error in network call", e);
        }
        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("email"           ,f_array[0]);
        resultMap.put("nickname"        ,f_array[1]);
        resultMap.put("enc_id"          ,f_array[2]);
        resultMap.put("profile_image"   ,f_array[3]);
        resultMap.put("age"             ,f_array[4]);
        resultMap.put("gender"          ,f_array[5]);
        resultMap.put("id"              ,f_array[6]);
        resultMap.put("name"            ,f_array[7]);
        resultMap.put("birthday"        ,f_array[8]);
        return resultMap;
    }
}
