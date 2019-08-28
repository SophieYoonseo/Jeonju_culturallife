package com.example.testapi_16;

import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.coremodeling.naver.image.Image;
import com.coremodeling.naver.image.ImageBaseAdapter;
import com.coremodeling.naver.image.ImageFeedParser;
import com.coremodeling.naver.image.SaxImageFeedParser;

public class MainActivity extends ListActivity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagelist);
    }

    public void onClickSearch(View view) {
        loadData();
    }

    private void loadData() {
        String imageUrl = "http://openapi.naver.com/search?key=네이버검색키 입력" +
                "&target=image&start=1&display=20&query=";

        EditText editText = (EditText)findViewById(R.id.editImageSearch);
        String query = editText.getText().toString();
        ImageFeedParser imageFeedParser = new SaxImageFeedParser(imageUrl + query);
        List<Image> imageList = imageFeedParser.parse();
        ImageBaseAdapter imageBaseAdapter = new ImageBaseAdapter(this, imageList);
        setListAdapter(imageBaseAdapter);
    }
}