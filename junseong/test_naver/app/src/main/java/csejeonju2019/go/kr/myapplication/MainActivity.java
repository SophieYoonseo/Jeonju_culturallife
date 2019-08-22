package csejeonju2019.go.kr.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainActivity extends Activity {



    private static String OAUTH_CLIENT_ID = "UCv6ZDmGidD7APXCXsWL";  // 1)에서 받아온 값들을 넣어좁니다

    private static String OAUTH_CLIENT_SECRET = "oS2msl8Vzf";

    private static String OAUTH_CLIENT_NAME = "김준성";



    private static OAuthLogin mOAuthLoginInstance;

    private static Context mContext;



    String email = "";

    String nickname = "";

    String enc_id = "";

    String profile_image = "";

    String age = "";

    String gender = "";

    String id = "";

    String name = "";

    String birthday = "";



    String accessToken = "";

    String tokenType;





    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        mContext = getApplicationContext();



        setContentView(R.layout.activity_main);



        mOAuthLoginInstance = OAuthLogin.getInstance();



        mOAuthLoginInstance.init(mContext, OAUTH_CLIENT_ID,

                OAUTH_CLIENT_SECRET, OAUTH_CLIENT_NAME);



        initSetting();

    }



    private void initSetting() {



        final Button btn_naver = (Button) findViewById(R.id.btn_naver);





        btn_naver.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                mOAuthLoginInstance.startOauthLoginActivity(MainActivity.this,

                        mOAuthLoginHandler);

            }

        });



    }



    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {

        @Override

        public void run(boolean success) {

            if (success) {

                accessToken = mOAuthLoginInstance.getAccessToken(mContext);

                String refreshToken = mOAuthLoginInstance

                        .getRefreshToken(mContext);

                long expiresAt = mOAuthLoginInstance.getExpiresAt(mContext);

                tokenType = mOAuthLoginInstance.getTokenType(mContext);



                Log.d("myLog", "accessToken  " + accessToken);

                Log.d("myLog", "refreshToken  " + refreshToken);

                Log.d("myLog",

                        "String.valueOf(expiresAt)  "

                                + String.valueOf(expiresAt));

                Log.d("myLog", "tokenType  " + tokenType);

                Log.d("myLog",

                        "mOAuthLoginInstance.getState(mContext).toString()  "

                                + mOAuthLoginInstance.getState(mContext)

                                .toString());





                new RequestApiTask().execute(); //로그인이 성공하면  네이버에 계정값들을 가져온다.



            } else {

                String errorCode = mOAuthLoginInstance.getLastErrorCode(

                        mContext).getCode();

                String errorDesc = mOAuthLoginInstance

                        .getLastErrorDesc(mContext);

                // Toast.makeText(mContext, "errorCode:" + errorCode +

                // ", errorDesc:" + errorDesc, Toast.LENGTH_SHORT).show();



                Toast.makeText(MainActivity.this, "로그인이 취소/실패 하였습니다.!",

                        Toast.LENGTH_SHORT).show();

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

            String at = mOAuthLoginInstance.getAccessToken(mContext);

            Pasingversiondata(mOAuthLoginInstance.requestApi(mContext, at, url));



            return null;

        }



        protected void onPostExecute(Void content) {

            Log.d("myLog", "email " + email);

            Log.d("myLog", "name " + name);

            Log.d("myLog", "nickname " + nickname);





            if (email == null) {

                Toast.makeText(MainActivity.this,

                        "로그인 실패하였습니다.  잠시후 다시 시도해 주세요!!",                 Toast.LENGTH_SHORT)

                        .show();

            } else {





            }



        }



        private void Pasingversiondata(String data) { // xml 파싱

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

            email = f_array[0];

            nickname = f_array[1];

            enc_id = f_array[2];

            profile_image = f_array[3];

            age = f_array[4];

            gender = f_array[5];

            id = f_array[6];

            name = f_array[7];

            birthday = f_array[8];



        }

    }

}




