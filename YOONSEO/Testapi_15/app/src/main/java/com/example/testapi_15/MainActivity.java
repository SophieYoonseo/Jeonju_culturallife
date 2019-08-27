package com.example.testapi_15;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml을 파싱하여 저장할 ArrayList를 선언한다.
        ArrayList<String> items = new ArrayList<String>();

        try{

            // custom_list.xml 을 가져와 XmlPullParser 에 넣는다.
            XmlPullParser customList = getResources().getXml(R.xml.custom_list);

            // 파싱한 xml 이 END_DOCUMENT(종료 태그)가 나올때 까지 반복한다.
            while(customList.getEventType()!=XmlPullParser.END_DOCUMENT){
                // 태그의 첫번째 속성일 때,
                if(customList.getEventType()==XmlPullParser.START_TAG){
                    // 이름이 "custom" 일때, 첫번째 속성값을 ArrayList에 저장
                    if(customList.getName().equals("custom")){
                        items.add(customList.getAttributeValue(0));
                    }

                }
                // 다음 태그로 이동
                customList.next();
            }
        }catch(XmlPullParserException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        // ArrayAdapter에 ArrayList를 넣어서 ListView에 등록한다.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        ListView listView1 = (ListView)findViewById(R.id.ListView1);
        listView1.setAdapter(adapter);
    }
}

