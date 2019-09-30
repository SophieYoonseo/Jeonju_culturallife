package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class after_show extends AppCompatActivity // 파싱에러뜰경우 여기로이동
         {
             public String aftertitle;
             public String afterstart;
             public String afterend;
             public String aftertime;
             public String aftername;
             public String afterage;
             public String aftertel;
             public String fee;
             public String address;
             public String content;
             public String you;
             public String url;
             private WebView mWebView; // 웹뷰 선언
             private WebSettings mWebSettings; //웹뷰세팅

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_show);
        aftertitle=show_error_list_activity.title;
        afterstart=show_error_list_activity.start;
        afterend=show_error_list_activity.end;
        aftertime=show_error_list_activity.time;
        aftername=show_error_list_activity.damname;
        afterage=show_error_list_activity.age;
        fee=show_error_list_activity.fee;
        address=show_error_list_activity.address;
        content=show_error_list_activity.explain;
        you=show_error_list_activity.youtube;
        aftertel=show_error_list_activity.tel;
        url=show_error_list_activity.homepage;
        TextView title=(TextView)findViewById(R.id.errorshow_title);
        title.setText(aftertitle);
        Button buttonurl=(Button)findViewById(R.id.errorshow_phonenum);
        buttonurl.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent phonecall=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+aftertel));
                startActivity(phonecall);
            }
        });
        Button buttonpage=(Button)findViewById(R.id.errorshow_url);
        buttonpage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
//                if(show_title.contains("http:")) {
                //                  Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http:"+show_page));
                //                startActivity(intent);
                //          }
                //        else{
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
                //      }

            }
        });


        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.errorresult_show);

        result.setText(content);

        mWebView = (WebView) findViewById(R.id.webview23);

        TextView showstart=(TextView)findViewById(R.id.errorshow_startday);
        showstart.setText(afterstart);
        TextView showend=(TextView)findViewById(R.id.errorshow_endday);
        showend.setText(afterend);
        TextView showsebutime=(TextView)findViewById(R.id.errorshow_sebutime);
        showsebutime.setText(aftertime);
        TextView textbooseoname=(TextView)findViewById(R.id.errorshow_buseoname);
        textbooseoname.setText(aftername);
        TextView textshowage=(TextView)findViewById(R.id.errorshow_age);
        textshowage.setText(afterage);
        TextView textshowphone=(TextView)findViewById(R.id.errorshow_phonenumber);
        textshowphone.setText(aftertel);
        TextView textshowprice=(TextView)findViewById(R.id.errorshow_price);
        textshowprice.setText(fee);
        TextView textshowplace=(TextView)findViewById(R.id.errorshow_place);
        textshowplace.setText(address);

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
        //int index=show_title.indexOf("-");
        //String show_subtitle=show_title.substring(0,index);


        mWebView.loadUrl("https://www.youtube.com/results?search_query="+you); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작

        Button festivalshare=(Button)findViewById(R.id.errorshow_share);
        festivalshare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = aftertime+ content ;
                String mySubject = aftertitle+"내용및 시간을 공유합니다.";
                
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, mySubject);
                intent.putExtra(Intent.EXTRA_TEXT, mySharedLink);;
                startActivity(Intent.createChooser(intent, "공유합니다."));
            }
        });
    }

}

