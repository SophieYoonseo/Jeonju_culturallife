package csejeonju2019.go.kr.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager ;
    private TextViewAdapter pagerAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager) ;
        pagerAdapter = new TextViewAdapter(this) ;
        viewPager.setAdapter(pagerAdapter) ;
    }
}
