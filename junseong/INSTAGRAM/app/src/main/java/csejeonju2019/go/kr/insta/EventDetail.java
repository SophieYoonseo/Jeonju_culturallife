package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class EventDetail extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_detail);

        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result);
        PerformanceShowItem item = (PerformanceShowItem)intent.getSerializableExtra("activity");
        //출력
        result.setText(item.showDetail());
    }
}
