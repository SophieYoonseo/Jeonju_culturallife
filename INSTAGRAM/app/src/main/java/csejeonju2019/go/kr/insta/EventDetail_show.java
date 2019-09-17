package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class EventDetail_show extends AppCompatActivity  {   ///공연정보 (위도 , 경도 지원안댐)

    public static String show_title;

    public static String startday;//행사시작날 o
    public static String endday;//행사 종료날 o
    public static String detail_time;//행사 세부시간 o
    public static String booseoname; //부서이름 o
    public static String show_page;//쇼 관련사이트 o
    public static String show_age; //연령층 o
    public static String show_phonenum;//주관부서 연락처 o
    public static String show_money;//비용 o
    public static String show_place;//장소 o
    private WebView mWebView; // 웹뷰 선언
    private WebSettings mWebSettings; //웹뷰세팅
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        TextView title=(TextView)findViewById(R.id.show_title);
        title.setText(show_title);
        Button buttonurl=(Button)findViewById(R.id.show_phonenum);
        buttonurl.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent phonecall=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+show_phonenum));
                startActivity(phonecall);
            }
        });
        Button buttonpage=(Button)findViewById(R.id.show_url);
        buttonpage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
//                if(show_title.contains("http:")) {
  //                  Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http:"+show_page));
    //                startActivity(intent);
      //          }
        //        else{
                    Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(show_page));
                    startActivity(intent);
          //      }

            }
        });

        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result_show);

        PerformanceShowItem2 item = (PerformanceShowItem2)intent.getSerializableExtra("activity");
        //출력
        result.setText(item.showDetail());
        Button festivalshare=(Button)findViewById(R.id.show_share);
        final String abcd=result.getText().toString();
        mWebView = (WebView) findViewById(R.id.webview);

        TextView showstart=(TextView)findViewById(R.id.show_startday);
        showstart.setText(startday);
        TextView showend=(TextView)findViewById(R.id.show_endday);
        showend.setText(endday);
        TextView showsebutime=(TextView)findViewById(R.id.show_sebutime);
        showsebutime.setText(detail_time);
        TextView textbooseoname=(TextView)findViewById(R.id.show_buseoname);
        textbooseoname.setText(booseoname);
        TextView textshowage=(TextView)findViewById(R.id.show_age);
        textshowage.setText(show_age);
        TextView textshowphone=(TextView)findViewById(R.id.show_phonenumber);
        textshowphone.setText(show_phonenum);
        TextView textshowprice=(TextView)findViewById(R.id.show_price);
        textshowprice.setText(show_money);
        TextView textshowplace=(TextView)findViewById(R.id.show_place);
        textshowplace.setText(show_place);

        mWebView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
        mWebSettings = mWebView.getSettings(); //세부 세팅 등록
        mWebSettings.setJavaScriptEnabled(true); // 웹페이지 자바스클비트 허용 여부
        mWebSettings.setSupportMultipleWindows(false); // 새창 띄우기 허용 여부
        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false); // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
        mWebSettings.setLoadWithOverviewMode(true); // 메타태그 허용 여부
        mWebSettings.setUseWideViewPort(true); // 화면 사이즈 맞추기 허용 여부
        mWebSettings.setSupportZoom(false); // 화면 줌 허용 여부
        mWebSettings.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN); // 컨텐츠 사이즈 맞추기
        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 브라우저 캐시 허용 여부
        mWebSettings.setDomStorageEnabled(true); // 로컬저장소 허용 여부
        if(show_title=="졸탄쇼 위대한 쇼맨 -전주공연")
        {
            mWebView.loadUrl("https://www.youtube.com/results?search_query="+"졸탄쇼 위대한 쇼맨");
        }
        else
        {
            mWebView.loadUrl("https://www.youtube.com/results?search_query="+show_title); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작
        }

        festivalshare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = abcd;
                String mySubject = show_title+"내용을 공유합니다.";

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, mySubject);
                intent.putExtra(Intent.EXTRA_TEXT, mySharedLink);

                startActivity(Intent.createChooser(intent, "공유합니다."));
            }
        });
    }

}
