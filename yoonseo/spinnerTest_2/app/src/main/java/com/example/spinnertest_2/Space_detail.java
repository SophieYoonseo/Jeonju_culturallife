package com.example.spinnertest_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Space_detail extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.space_detail);

        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result);
        Space_showItem item = (Space_showItem)intent.getSerializableExtra("activity");
        //출력
        result.setText(item.showDetail());
    }
}
