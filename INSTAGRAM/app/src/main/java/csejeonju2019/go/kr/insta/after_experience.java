package csejeonju2019.go.kr.insta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Map;

public class after_experience extends AppCompatActivity //이거 버리는 클래스임  문화체험은 EventDetail로 이동
        implements OnMapReadyCallback {

    public  double loc1;
    public  double loc2;
    public String exp;  //설명
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        exp=Frag5.explain;
        setContentView(R.layout.after_experience);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        loc1=Frag5.location1;
        loc2=Frag5.location2;

        mMap = googleMap;

        LatLng SEOUL = new LatLng(loc1, loc2);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//지도 시작시 애니메이션 효과


    }

}

