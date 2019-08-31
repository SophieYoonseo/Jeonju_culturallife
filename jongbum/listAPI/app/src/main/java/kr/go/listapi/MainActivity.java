package kr.go.listapi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
    ArrayList<String> Items;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.enableDefaults();
        PerformanceShowItem item = new PerformanceShowItem();
        Items = new ArrayList<String>();
        try{
            URL mURL = new URL("http://openapi.jeonju.go.kr/rest/event/getEventList?"
                    +"authApiKey=DDVHRPFFICXVXQQ");

            XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator.newPullParser();

            parser.setInput(mURL.openStream(), null);

            int parserEvent = parser.getEventType();
            while(parserEvent != XmlPullParser.END_DOCUMENT) {
                //if(parser.getName().equals(""))
                switch (parserEvent) {
                    case XmlPullParser.START_TAG:
                        if(parser.getName().equals("indexNum")) item.inIndexNum = true;
                        if(parser.getName().equals("startDay")) item.inStartDay = true;
                        if(parser.getName().equals("endDay")) item.inEndDay = true;
                        if(parser.getName().equals("ETime")) item.inETime = true;
                        if(parser.getName().equals("url")) item.inUrl = true;
                        if(parser.getName().equals("sponSor")) item.inSponSor = true;
                        if(parser.getName().equals("mngCo")) item.inMngCo = true;
                        if(parser.getName().equals("place")) item.inPlace = true;
                        if(parser.getName().equals("admfee")) item.inAdmfee = true;
                        if(parser.getName().equals("subject")) item.inSubject = true;
                        if(parser.getName().equals("content")) item.inContent = true;
                        if(parser.getName().equals("mngNm")) item.inMngNm = true;
                        if(parser.getName().equals("orgNm")) item.inOrgNm = true;
                        if(parser.getName().equals("mngTel")) item.inMngTel = true;
                        if(parser.getName().equals("mngEmail")) item.inMngEmail = true;
                        if(parser.getName().equals("regDate")) item.inRegDate = true;
                        if(parser.getName().equals("attidx")) item.inAttidx = true;
                        if(parser.getName().equals("fileCnt")) item.inFileCnt = true;
                        if(parser.getName().equals("mainImg")) item.inMainImg = true;
                        if(parser.getName().equals("category")) item.inCategory = true;
                        if(parser.getName().equals("age")) item.inAge = true;
                        if(parser.getName().equals("posx")) item.inPosx = true;
                        if(parser.getName().equals("posy")) item.inPosy = true;
                        if(parser.getName().equals("address")) item.inAddress = true;
                        if(parser.getName().equals("message")) {
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

                        break;
                    case XmlPullParser.TEXT:
                        if(item.inIndexNum) item.indexNum = parser.getText();
                        if(item.inStartDay) item.startDay = parser.getText();
                        if(item.inEndDay) item.endDay = parser.getText();
                        if(item.inETime) item.ETime = parser.getText();
                        if(item.inUrl) item.url = parser.getText();
                        if(item.inSponSor) item.sponSor = parser.getText();
                        if(item.inMngCo) item.mngCo = parser.getText();
                        if(item.inPlace) item.place = parser.getText();
                        if(item.inAdmfee) item.admfee = parser.getText();
                        if(item.inSubject) item.subject = parser.getText();
                        if(item.inContent) item.content = parser.getText();
                        if(item.inMngNm) item.mngNm = parser.getText();
                        if(item.inOrgNm) item.orgNm = parser.getText();
                        if(item.inMngTel) item.mngTel = parser.getText();
                        if(item.inMngEmail) item.mngEmail = parser.getText();
                        if(item.inRegDate) item.regDate = parser.getText();
                        if(item.inAttidx) item.attidx = parser.getText();
                        if(item.inFileCnt) item.fileCnt = parser.getText();
                        if(item.inMainImg) item.mainImg = parser.getText();
                        if(item.inCategory) item.category = parser.getText();
                        if(item.inAge) item.age = parser.getText();
                        if(item.inPosx) item.posx = parser.getText();
                        if(item.inPosy) item.posy = parser.getText();
                        if(item.inAddress) item.address = parser.getText();
                        item.clear();
                        break;
                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("list")) {
                            // list태그 만날경우
                            Items.add(item.subject);
                        }
                        break;
                }
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


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Items);

        ListView listView = (ListView) findViewById(R.id.result);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, (String)adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                Items.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
