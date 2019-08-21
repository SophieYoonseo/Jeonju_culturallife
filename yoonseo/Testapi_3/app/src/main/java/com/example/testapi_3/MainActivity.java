package com.example.testapi_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MainActivity extends AppCompatActivity {

    private final String TAG = "myTag";
    private final String key = "ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D";
    private final String endPoint = "http://openapi.jeonju.go.kr/rest/experience";

    //xml 변수
    private EditText xmlDataTitle;
    private TextView xmlDataContent;

    // 파싱을 위한 필드 선언
    private URL url;
    private InputStream is;
    private XmlPullParserFactory factory;
    private XmlPullParser xpp;
    private String tag;
    private int eventType;

    // xml의 값 입력 변수
    private String dataTitle; //이름
   // private String dataContent = ""; //
    private StringBuffer buffer;

    // 데이터 검색
    private String dataTitleId; // 이름 Id
    //private String dataContentId;//  Id
    //private String addrId; // 주소

    private String content1;
    //private String content2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //상태바 없애기(FullScreen)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //xml 아이디 얻어오기
        xmlDataTitle = findViewById(R.id.dataTitle);
        buffer = new StringBuffer();
    }

    // Url, XmlPullParser 객체 생성 및 초기화
    public void setUrlNParser(String quary) {
        try {
            url = new URL(quary); //문자열로 된 요청 url을 URL객체로 생성
            is = url.openStream();

            factory = XmlPullParserFactory.newInstance();
            xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8")); //inputStream으로부터 xml입력받기

            xpp.next();
            eventType = xpp.getEventType();
        } catch (Exception e) {

        }

    }



    //검색하기 onclick버튼
    public void search(View view) {
        //사용자한테 출발정류장, 도착정류장 알아오기.
        dataTitle = xmlDataTitle.getText().toString();
        content1 = null;
        buffer = null;
        buffer = new StringBuffer();
        xmlDataContent.setText("");

        /*
        //입력값 검사 함수
        if(exmineData()) {
            // 입력값 검사 함수에서 true를 return할 경우 값이 잘못된 것..
            // 종료..
            return;
        }
*/
        new Thread(new Runnable() {
            @Override
            public void run() {

                getDataTitle(dataTitle);

                // UI setText 하는 곳..
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d(TAG, content1);

                        if(content1 == null) {
                            buffer.append("찾는 정보 없음");
                        } else {
                            buffer.append("전주 문화체험 정보\n");

                        }
                        xmlDataContent.setText(buffer.toString());
                    }
                });
            }
        }).start();
    }

    public void getDataTitle(String dataTitle1) {
        String title1 = endPoint + "getExperienceList?authApiKey=" + key +"&dataSid=56810";
        Log.d(TAG,"이름 : " + title1);

        try {
            setUrlNParser(title1);

            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        break;
                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if (tag.equals("data")) ; //첫번째 검색 결과
                        else if (tag.equals("list")) {
                            xpp.next();
                            dataTitleId = xpp.getText();
                        }
                        else if (tag.equals("buslinenum")) ;
                        else if (tag.equals("bustype")) ;
                        else if (tag.equals("companyid")) ;
                        else if (tag.equals("endpoint")) ;
                        else if (tag.equals("stoptype")) ;
                        else if (tag.equals("firsttime")) ;
                        else if (tag.equals("endtime")) ;
                        else if (tag.equals("headway")) ;
                        else if (tag.equals("headwayNorm")) ;
                        else if (tag.equals("headwayPeak")) ;
                        else if (tag.equals("headwayHoli")) ;
                        break;
                    case XmlPullParser.TEXT:
                        break;
                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();
                        if (tag.equals("data")); // 첫번째 검색 결과 종료.. 줄바꿈
                        break;
                } //end of switch~case
                eventType = xpp.next();
            } //end of while
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    // 사용자가 입력한 값을 검사하는 함수
    public boolean exmineData() {

        // 사용자가 하나 이상의 값을 입력하지 않은 경우
        if (dataTitle.equals("")) {
            Toast.makeText(this, "값을 입력해주세요!", Toast.LENGTH_SHORT).show();
            return true;
        }

        //String[] arr = new String[] {busNum, stationArsno};
        String regExp = "([ㄱ-ㅎ])"; // 입력값은 반드시 숫자여야하므로 정규 표현식으로 설정
        Pattern pattern_symbol = Pattern.compile(regExp);

        //버스 번호 유효성 검사
        Matcher matcher_dataTitle = pattern_symbol.matcher(dataTitle); // 입력값이 유효하다면 true return
        if (matcher_dataTitle.find() == false) {
            Toast.makeText(this, "프로그램명을 다시 입력해주세요!", Toast.LENGTH_SHORT).show();
            return true;
        }


        return false; //모든 값이 정상
    }
    */
}
