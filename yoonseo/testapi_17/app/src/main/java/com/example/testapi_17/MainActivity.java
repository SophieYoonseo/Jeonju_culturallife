package com.example.testapi_17;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<PerformanceShowItem> Items;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 네트워크 API 지연으로 인한 ANR(Android not Responding) 방지
        StrictMode.enableDefaults();
        // 공연 정보 객체, 리스트
        PerformanceShowItem item = new PerformanceShowItem();
        Items = new ArrayList<PerformanceShowItem>();
        try{
            //API 접근 키
            URL mURL = new URL("http://openapi.jeonju.go.kr/rest/event/getEventList?"
                    +"authApiKey=ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D"
            +"&dataValue=%EC%A0%95%EC%9D%8D%EA%B3%A0%ED%83%9D");
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
                        if(parser.getName().equals("addr")) item.inAddr = true;
                        if(parser.getName().equals("addrDtl")) item.inAddrDtl = true;
                        if(parser.getName().equals("dataContent")) item.inDataContent = true;
                        if(parser.getName().equals("dataSid")) item.inDataSid = true;
                        if(parser.getName().equals("dataTitle")) item.inDataTitle = true;
                        if(parser.getName().equals("fileCnt")) item.inFileCnt = true;
                        if(parser.getName().equals("posx")) item.inPosx = true;
                        if(parser.getName().equals("posy")) item.inPosy = true;
                        if(parser.getName().equals("tel")) item.inTel = true;
                        if(parser.getName().equals("userHomepage")) item.inUserHomepage = true;
                        if(parser.getName().equals("zipCode")) item.inZipCode = true;

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
                        if(item.inAddr) item.addr = parser.getText();
                        if(item.inAddrDtl) item.addrDtl = parser.getText();
                        if(item.inDataContent) item.dataContent = parser.getText();
                        if(item.inDataSid) item.dataSid = parser.getText();
                        if(item.inDataTitle) item.dataTitle = parser.getText();
                        if(item.inFileCnt) item.fileCnt = parser.getText();
                        if(item.inPosx) item.posx = parser.getText();
                        if(item.inPosy) item.posy = parser.getText();
                        if(item.inTel) item.tel = parser.getText();
                        if(item.inUserHomepage) item.userHomepage = parser.getText();
                        if(item.inZipCode) item.zipCode = parser.getText();
                        item.clear();
                        break;

                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("list")) {
                            // "<list> </list>" 만날경우 실행
                            // 리스트 형태로 추가, 추후 데이터 필요 시 이용가능
                            Items.add(item);
                            item = new PerformanceShowItem();
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

        ListView listView = (ListView) findViewById(R.id.result);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //ListViewItem 선택 시 이벤트
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //EventDetail Activity 실행
                Intent intent = new Intent(getApplicationContext(), EventDetail.class);
                //세부사항을 Intent.extra로 EventDetail Activity로 전달
                intent.putExtra("activity", Items.get(i));
                startActivity(intent);
                //데이터 삭제, 추가, 변경 시 항상 adapter.notifyDataSetChanged()호출로 displaydata 최신화
                adapter.notifyDataSetChanged();
            }
        });
    }
}