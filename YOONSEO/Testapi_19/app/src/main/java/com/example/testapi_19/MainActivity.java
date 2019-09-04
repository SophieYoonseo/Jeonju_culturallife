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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PerformanceShowItem item1 = new PerformanceShowItem();
        final String[] items={};
        int i = 0;
        while(true){
            if(items[i] == null)    break;
            items[i] = item1.toString();
            i++;
        }

        final Button button1 = (Button) findViewById(R.id.button);

        Spinner spinner = (Spinner) findViewById(R.id.entertainment);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);

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
                        intent.putExtra("activity", items[position]);
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



        Spinner spinner2 = (Spinner) findViewById(R.id.experience);
        spinner2.setAdapter(adapter);

        //아이템 선택 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            //아이템 선택되었을 때 호출됨
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                // textView.setText(items[position]);
            }

            //아무것도 선택되지 않았을 때 호출됨
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
                // textView.setText("");
            }
        });

        Spinner spinner3 = (Spinner) findViewById(R.id.culturalSpace);
        spinner3.setAdapter(adapter);

        //아이템 선택 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            //아이템 선택되었을 때 호출됨
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                // textView.setText(items[position]);
            }

            //아무것도 선택되지 않았을 때 호출됨
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
                // textView.setText("");
            }
        });



    }
}
