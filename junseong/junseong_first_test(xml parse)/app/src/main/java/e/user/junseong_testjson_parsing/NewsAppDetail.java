package e.user.junseong_testjson_parsing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class NewsAppDetail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //스크롤뷰를 설정
        ScrollView scroller = new ScrollView(this);
        //TextView설정
        TextView tv=new TextView(this);

        //텍스트뷰에 기사내용 출력
        tv.setText(MainActivity.newsDescriptionVector.get(MainActivity.index));

        //텍스트뷰를 스크롤러뷰에 추가.
        scroller.addView(tv);


        setContentView(scroller);

    }//onCreate
}
