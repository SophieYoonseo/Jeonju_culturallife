package csejeonju2019.go.kr.insta;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class culture_experience extends AppCompatActivity {
    ListView resultlistview = (ListView) findViewById(R.id.result);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_experience);
        HashMap<String, String> nameaddress = new HashMap<>();
        nameaddress.put("한지산업지원센터", "전북 전주시 완산구 현무 1길");
        List<HashMap<String, String>> listitems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listitems, R.layout.list_item_experience, new String[]{"first line", "secnd line"}, new int[]{R.id.text_ex1, R.id.text_ex2});


        Iterator it=nameaddress.entrySet().iterator();
        while(it.hasNext())
        {
            HashMap<String,String> resultmap=new HashMap<>();
            Map.Entry pair=(Map.Entry)it.next();
            resultmap.put("First line",pair.getKey().toString());
            resultmap.put("Second line",pair.getValue().toString());
            listitems.add(resultmap);
        }
        resultlistview.setAdapter(adapter);
    }


}