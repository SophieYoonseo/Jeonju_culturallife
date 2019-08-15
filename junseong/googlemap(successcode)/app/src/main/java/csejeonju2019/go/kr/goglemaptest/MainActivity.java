package csejeonju2019.go.kr.goglemaptest;



import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private FragmentManager fragmentManager;
    private MapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        mapFragment=(MapFragment)fragmentManager.findFragmentById(R.id.goggleMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng location=new LatLng(35.824167, 127.147958);//전주시청우치
        MarkerOptions markerOptions=new MarkerOptions();
        markerOptions.title("전주시");//타이틀
        markerOptions.snippet("문화와 공연의 도시 전주");//설명
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,16));//16배 줌가능
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,16));//지도 시작시 애니메이션 효과

    }
}
