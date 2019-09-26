package csejeonju2019.go.kr.insta;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;
import java.util.ArrayList;

public class show_list_activity extends AppCompatActivity {// 전주 공연
    ArrayList<PerformanceShowItem2> Items;
    ArrayAdapter adapter;
    ProgressDialog progressDlg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        progressDlg = new ProgressDialog(this);
        progressDlg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        //progressDlg.setIndeterminate(true);
        progressDlg.setTitle("결과를 읽어오는중입니다.....");
        progressDlg.setCancelable(true);
        progressDlg.setMax(100);
        progressDlg.setProgress(0);
        progressDlg.show();
        new Thread(){
            public void run() {
                for(int i=0;i<=100;i++) {
                    progressDlg.setProgress(i);
                    if(i==100)
                        progressDlg.dismiss();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                progressDlg.dismiss();
            }
        }.start();

        // 네트워크 API 지연으로 인한 ANR(Android not Responding) 방지
        StrictMode.enableDefaults();
        // 공연 정보 객체, 리스트
        PerformanceShowItem2 item = new PerformanceShowItem2();
        Items = new ArrayList<PerformanceShowItem2>();
        try{
            //API 접근 키
            URL mURL = new URL("http://openapi.jeonju.go.kr/rest/event/getEventList?"
                    +"authApiKey=DDVHRPFFICXVXQQ");
            //XML 파싱을 위한 XmlPullParser 이용
            XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator.newPullParser();

            parser.setInput(mURL.openStream(), null);

            int parserEvent = parser.getEventType();
            //XML 태그 확인
            //END_DOCUMENT = 1, END_TAG = 3, START_DOCUMENT = 0, START_TAG = 2, TEXT = 4
            while(parserEvent != XmlPullParser.END_DOCUMENT) {
                //if(parser.getName().equals(""))
                switch (parserEvent) {
                    case XmlPullParser.START_TAG:
                        // 최하단 태그 존재 여부 확인
                       // if(parser.getName().equals("indexNum")) item.inIndexNum = true;
                        if(parser.getName().equals("startDay")) item.inStartDay = true;
                        if(parser.getName().equals("endDay")) item.inEndDay = true;
                        if(parser.getName().equals("ETime")) item.inETime = true;
                        if(parser.getName().equals("url")) item.inUrl = true;
                        if(parser.getName().equals("sponSor")) item.inSponSor = true;
                        if(parser.getName().equals("mngCo")) item.inMngCo = true;
                        if(parser.getName().equals("place")) item.inPlace = true;
                        if(parser.getName().equals("admfee")) item.inAdmfee = true;
                        if(parser.getName().equals("subject")) item.inSubject = true;
                        if(parser.getName().equals("content")) item.inContent = true;
                        if(parser.getName().equals("mngNm")) item.inMngNm = true;
                        if(parser.getName().equals("orgNm")) item.inOrgNm = true;
                        if(parser.getName().equals("mngTel")) item.inMngTel = true;
                        if(parser.getName().equals("mngEmail")) item.inMngEmail = true;
                        if(parser.getName().equals("regDate")) item.inRegDate = true;
                        if(parser.getName().equals("attidx")) item.inAttidx = true;
                        if(parser.getName().equals("fileCnt")) item.inFileCnt = true;
                        if(parser.getName().equals("mainImg")) item.inMainImg = true;
                        if(parser.getName().equals("category")) item.inCategory = true;
                        if(parser.getName().equals("age")) item.inAge = true;
                        if(parser.getName().equals("posx")) item.inPosx = true;
                        if(parser.getName().equals("posy")) item.inPosy = true;
                        if(parser.getName().equals("address")) item.inAddress = true;

                        if(parser.getName().equals("message")) {
                            // AlertDialog(오류) 메시지 발생
                            AlertDialog.Builder alert = new AlertDialog.Builder(this);
                            alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            });
                            alert.setMessage("파싱 에러");
                            alert.show();
                        }


                        break;

                    case XmlPullParser.TEXT:
                        //태그 내의 데이터 저장
                       if(item.inIndexNum) item.indexNum = parser.getText();
                        if(item.inStartDay) item.startDay = parser.getText();
                        if(item.inEndDay) item.endDay = parser.getText();
                        if(item.inETime) item.ETime = parser.getText();
                        if(item.inUrl) item.url = parser.getText();
                        if(item.inSponSor) item.sponSor = parser.getText();
                        if(item.inMngCo) item.mngCo = parser.getText();
                        if(item.inPlace) item.place = parser.getText();
                        if(item.inAdmfee) item.admfee = parser.getText();
                        if(item.inSubject) item.subject = parser.getText();
                        if(item.inContent) item.content = parser.getText();
                        if(item.inMngNm) item.mngNm = parser.getText();
                        if(item.inOrgNm) item.orgNm = parser.getText();
                        if(item.inMngTel) item.mngTel = parser.getText();
                        if(item.inMngEmail) item.mngEmail = parser.getText();
                        if(item.inRegDate) item.regDate = parser.getText();
                        if(item.inAttidx) item.attidx = parser.getText();
                        if(item.inFileCnt) item.fileCnt = parser.getText();
                        if(item.inMainImg) item.mainImg = parser.getText();
                        if(item.inCategory) item.category = parser.getText();
                        if(item.inAge) item.age = parser.getText();
                        if(item.inPosx) item.posx = parser.getText();
                        if(item.inPosy) item.posy = parser.getText();
                        if(item.inAddress) item.address = parser.getText();
                        item.clear();
                        break;

                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("list")) {
                            // "<list> </list>" 만날경우 실행
                            // 리스트 형태로 추가, 추후 데이터 필요 시 이용가능
                            Items.add(item);
                            item = new PerformanceShowItem2();
                        }
                        break;
                }
                // 다음 API 데이터 호출
                parserEvent = parser.next();
            }
        }
        catch(Exception e) {
            // AlertDialog 메시지 발생
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            alert.setMessage("파싱 에러");
            alert.show();
        }
        //리스트뷰 구현을 위한 ArrayAdapter 이용
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Items);

        ListView listView = (ListView) findViewById(R.id.mainmenu_show);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //ListViewItem 선택 시 이벤트
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //EventDetail_show Activity 실행
                Intent intent = new Intent(getApplicationContext(),EventDetail_show.class);
                //세부사항을 Intent.extra로 EventDetail Activity로 전달
                intent.putExtra("activity", Items.get(i));
                EventDetail_show.show_title=Items.get(i).subject;
                EventDetail_show.show_page=Items.get(i).url;
                EventDetail_show.show_phonenum=Items.get(i).mngTel;
                EventDetail_show.booseoname=Items.get(i).orgNm;
                EventDetail_show.startday=Items.get(i).startDay;
                EventDetail_show.endday=Items.get(i).endDay;
                EventDetail_show.detail_time=Items.get(i).ETime;
                EventDetail_show.show_age=Items.get(i).age;
                EventDetail_show.show_money=Items.get(i).admfee;
                EventDetail_show.show_place=Items.get(i).place;
                //EventDetail_show.show_loc1=Items.get(i).posx; 공연정보는 위도경도표시안대넴
                //EventDetail_show.show_loc2=Items.get(i).posy;
                Toast.makeText(getApplicationContext(),EventDetail_show.show_title, Toast.LENGTH_SHORT).show();
               // EventDetail_show.show_title=Items.get(i).subject;

                startActivity(intent);
                //데이터 삭제, 추가, 변경 시 항상 adapter.notifyDataSetChanged()호출로 displaydata 최신화
                adapter.notifyDataSetChanged();
            }
        });
    }
}
