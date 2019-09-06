package com.example.cardview_test1;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ItemRepository itemRepository = new ItemRepository();

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), itemRepository.getAllItems());
        mRecyclerView.setAdapter(recyclerViewAdapter);

    }
}