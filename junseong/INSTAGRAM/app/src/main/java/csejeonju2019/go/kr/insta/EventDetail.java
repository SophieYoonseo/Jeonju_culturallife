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

import org.w3c.dom.Text;


public class EventDetail extends AppCompatActivity  implements OnMapReadyCallback {//////문화체험
  
    double loc1;
    double loc2;
    private GoogleMap mMap;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_detail);
        TextView title=(TextView)findViewById(R.id.experience_title);
        title.setText(experience_list_activitiy.exp_title);
        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result);
        PerformanceShowItem item = (PerformanceShowItem)intent.getSerializableExtra("activity");
        //출력
        result.setText(item.showDetail());

    }
    public void onMapReady(final GoogleMap googleMap) {

        loc1=experience_list_activitiy.location1;
        loc2=experience_list_activitiy.location2;

        mMap = googleMap;

        LatLng SEOUL = new LatLng(loc1, loc2);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//지도 시작시 애니메이션 효과


    }
}
