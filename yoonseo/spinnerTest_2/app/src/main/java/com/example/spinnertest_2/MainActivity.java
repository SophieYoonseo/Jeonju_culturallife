package com.example.spinnertest_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Space_showItem> Items;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, CulturalSpace.class);
        startActivity(intent);

        final Button button1 = (Button) findViewById(R.id.button);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Items);

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
                        Intent intent1 = new Intent(getApplicationContext(), Space_detail.class);
                        //세부사항을 Intent.extra로 EventDetail Activity로 전달
                        intent1.putExtra("activity", Items.get(position));
                        startActivity(intent1);
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
