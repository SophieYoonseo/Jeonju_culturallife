package com.example.testapi_19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

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

        StrictMode.enableDefaults();
        // 문화공간 정보 객체, 리스트
        PerformanceShowItem item = new PerformanceShowItem();
        Items = new ArrayList<PerformanceShowItem>();
        try {
            //API 접근 키
            URL mURL = new URL("http://openapi.jeonju.go.kr/rest/culture/getCultureList?" +
                    "authApiKey=ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D");
            //XML 파싱을 위한 XmlPullParser 이용
            XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator.newPullParser();

            parser.setInput(mURL.openStream(), null);

            int parserEvent = parser.getEventType();
            //XML 태그 확인
            //END_DOCUMENT = 1, END_TAG = 3, START_DOCUMENT = 0, START_TAG = 2, TEXT = 4
            while (parserEvent != XmlPullParser.END_DOCUMENT) {
                //if(parser.getName().equals(""))
                switch (parserEvent) {
                    case XmlPullParser.START_TAG:
                        // 최하단 태그 존재 여부 확인
                        if (parser.getName().equals("addr")) item.inAddr = true;
                        if (parser.getName().equals("addrDtl")) item.inAddrDtl = true;
                        if (parser.getName().equals("dataContent")) item.inDataContent = true;
                        if (parser.getName().equals("dataSid")) item.inDataSid = true;
                        if (parser.getName().equals("dataTitle")) item.inDataTitle = true;
                        if (parser.getName().equals("fileCnt")) item.inFileCnt = true;
                        if (parser.getName().equals("posx")) item.inPosx = true;
                        if (parser.getName().equals("posy")) item.inPosy = true;
                        if (parser.getName().equals("tel")) item.inTel = true;
                        if (parser.getName().equals("userHomepage")) item.inUserHomepage = true;
                        if (parser.getName().equals("Zipcode")) item.inZipCode = true;

                        if (parser.getName().equals("message")) {
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
                        if (item.inAddr) item.addr = parser.getText();
                        if (item.inAddrDtl) item.addrDtl = parser.getText();
                        if (item.inDataContent) item.dataContent = parser.getText();
                        if (item.inDataSid) item.dataSid = parser.getText();
                        if (item.inDataTitle) item.dataTitle = parser.getText();
                        if (item.inFileCnt) item.fileCnt = parser.getText();
                        if (item.inPosx) item.posx = parser.getText();
                        if (item.inPosy) item.posy = parser.getText();
                        if (item.inTel) item.tel = parser.getText();
                        if (item.inUserHomepage) item.userHomepage = parser.getText();
                        if (item.inZipCode) item.zipCode = parser.getText();
                        item.clear();
                        break;

                    case XmlPullParser.END_TAG:
                        if (parser.getName().equals("list")) {
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
        } catch (Exception e) {
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

        final Button button1 = (Button) findViewById(R.id.button);

        Spinner spinner = (Spinner) findViewById(R.id.entertainment);
        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, Items);

        spinner.setAdapter(adapter);

        //아이템 선택 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            //아이템 선택되었을 때 호출됨
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       final int position, long id) {
               // textView.setText(items[position])
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //EventDetail Activity 실행
                        Intent intent = new Intent(getApplicationContext(), EventDetail.class);
                        //세부사항을 Intent.extra로 EventDetail Activity로 전달
                        intent.putExtra("activity", Items.get(position));
                        startActivity(intent);
                        //데이터 삭제, 추가, 변경 시 항상 adapter.notifyDataSetChanged()호출로 displaydata 최신화
                        adapter.notifyDataSetChanged();

                    }
                });
            }

            //아무것도 선택되지 않았을 때 호출됨
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
               // textView.setText("");
            }
        });


    }
}
