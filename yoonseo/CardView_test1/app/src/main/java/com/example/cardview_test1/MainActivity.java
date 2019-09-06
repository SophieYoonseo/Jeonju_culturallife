package com.example.cardview_test1;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import android.support.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView rv;
    private LinearLayoutManager llm;
    private List<Integer> count;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.main_rv);
        llm = new LinearLayoutManager(this);

        count = new ArrayList<>();

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn_add : {
                i ++;
                count.add(i);
                RvAdapter adapter = new RvAdapter(getApplication(), count, i);
                rv.setAdapter(adapter);
                Log.d("Count", count + "");
                break;
            }
        }
    }
}
