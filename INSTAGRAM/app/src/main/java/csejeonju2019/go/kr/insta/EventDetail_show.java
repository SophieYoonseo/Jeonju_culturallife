package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class EventDetail_show extends AppCompatActivity  {   ///공연정보 (위도 , 경도 지원안댐)
    public static String show_loc1;
    public static String show_loc2;
    public static String show_title;
    public double loc1_double;
    public double loc2_double;
    private GoogleMap mMap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        TextView title=(TextView)findViewById(R.id.show_title);
        title.setText(show_title);
        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result_show);

        PerformanceShowItem2 item = (PerformanceShowItem2)intent.getSerializableExtra("activity");
        //출력
        result.setText(item.showDetail());
    }

}
