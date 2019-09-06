package com.example.cardview_test1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<DataSet> mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview1);

// use this setting to improve performance if you know that changes
// in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

// use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

// specify an adapter (see also next example)
        mDataset = new ArrayList<>();
        mAdapter = new MyAdapter(getApplicationContext(),mDataset);
        mRecyclerView.setAdapter(mAdapter);

//insert 20data
        for (int i = 0; i < 20; i++) {
            mDataset.add(new DataSet( "이름 : 홍길동" + i,
                    "주소 : 대한민국" + i,
                    "전화번호 : 123-4567",
                    R.mipmap.test_img));
        } //end of for (int i = 0; i < 20; i++) {
    }//end of protected void onCreate(Bundle savedInstanceState) {
} //end of public class MainActivity extends Activity {
