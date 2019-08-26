package csejeonju2019.go.kr.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

    }
}
