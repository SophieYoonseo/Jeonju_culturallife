package e.user.junseong_testjson_parsing;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.LDAPCertStoreParameters;
import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity implements OnItemClickListener {
    //title을 저장할 Vector
    Vector<String> newsTitleVector;
    //기사의 내용을 저장할 Vector
    static Vector<String> newsDescriptionVector;

    //사이트 주소 저장변수
    String uri = "http://rss.hankyung.com/new/news_column.xml";
    //실제 사이트에 접속하기 위한 객체 선언
    URL newsURL;

    String tagName="", title="", description="";  //초기값을 주지않으면 처음 저장된값이 null값이므로 주의

    static int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //리스트뷰를 생성
        ListView lv = getListView();

        //public void setTextFilterEnabled (boolean textFilterEnabled)
        //쿼티 자판에서 글자를 누르거나,혹은 소프트 키보드에서 자판을 누를 때
        //그 값을 필터 윈도우로 보여줄 것인지 여부를 세팅하는 메서드
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(this);



        //기사의 타이틀을 ListView에 출력
        //android.widget.ArrayAdapter.ArrayAdapter<String>(Context context, int textViewResourceId, List<String> objects)
        setListAdapter(new ArrayAdapter<String>(this, R.layout.listitem_row, getData()));

    }//onCreate

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //position은 내가 리스트 뷰에서 몇번째 항목을 클릭했는지에 대한 정보가 저장되는 변수

        index=position; //내클래스와 화면에 보여질 클래스를 서로 연결.
        Intent intent = new Intent().setClass(MainActivity.this, NewsAppDetail.class);

        //intent.putExtra("index", position);
        startActivity(intent);


    }//onItemClick


    //title과 기사의 내용을 저장할 메소드를 호출
    public Vector getData(){

        //저장 객체를 생성
        newsTitleVector = new Vector<String>();
        newsDescriptionVector = new Vector<String>();

        try {
            //uri에 저장된 사이트에 접속
            newsURL = new URL(uri);

            //xml데이터를 읽어서 inpuitstream에 저장
            InputStream in = newsURL.openStream();

            //XmlPullParser를 사용하기 위해서
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

            //네임스페이스 사용여부
            factory.setNamespaceAware(true);
            //xml문서를 이벤트를 이용해서 데이터를 추출해주는 객체
            XmlPullParser xpp = factory.newPullParser();

            //XmlPullParser xml데이터를 저장
            xpp.setInput(in, "euc-kr");

            //이벤트 저장할 변수선언
            int eventType = xpp.getEventType();

            boolean isItemTag = false; // <item> .영역에 인지 여부 체크

            //xml의 데이터의 끝까지 돌면서 원하는 데이터를  얻어옴
            while(eventType != XmlPullParser.END_DOCUMENT){


                if(eventType == XmlPullParser.START_TAG){ //시작 태그를 만났을때.
                    //태그명을 저장
                    tagName = xpp.getName();
                    if(tagName.equals("item")) isItemTag = true;

                }else if(eventType == XmlPullParser.TEXT){ //내용
                    //tagName에 저장된 태그명 title태그일때 제목을 저장
                    if(isItemTag && tagName.equals("title")) {
                        title += xpp.getText();
                        Log.i("NewsApp",title);
                    }
                    //기사의 내용을 저장
                    if(isItemTag && tagName.equals("description")) description += xpp.getText();
                    Log.e("NewsApp","e=>"+title);

                }else if(eventType == XmlPullParser.END_TAG){ //닫는 태그를 만났을때
                    //태그명을 저장
                    tagName=xpp.getName();

                    if(tagName.equals("item")){
                        newsTitleVector.add(title);
                        newsDescriptionVector.add(description);


                        title=""; //초기화
                        description=""; //초기화
                        isItemTag = false; //초기화

                    }


                }

                eventType = xpp.next(); //다음 이벤트 타입
            }

        } catch (Exception e) {

            Log.e("NewsApp", "예외발생 :"+e.getMessage());
        }


        return newsTitleVector;
    }




}//end

