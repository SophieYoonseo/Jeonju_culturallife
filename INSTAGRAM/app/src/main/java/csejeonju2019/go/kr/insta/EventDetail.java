package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.w3c.dom.Text;


public class EventDetail extends AppCompatActivity  implements OnMapReadyCallback {//////문화체험

   public double loc1;
   public  double loc2;
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
        loc1=Double.parseDouble(experience_list_activitiy.posx_double);
        loc2=Double.parseDouble(experience_list_activitiy.posy_double);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(final GoogleMap googleMap) {
        loc1=Double.parseDouble(experience_list_activitiy.posx_double);
        loc2=Double.parseDouble(experience_list_activitiy.posy_double);
        mMap = googleMap;
        LatLng SEOUL = new LatLng(loc2, loc1);
       // LatLng SEOUL = new LatLng(35.844226, 127.129396);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//지도 시작시 애니메이션 효과


    }
}
