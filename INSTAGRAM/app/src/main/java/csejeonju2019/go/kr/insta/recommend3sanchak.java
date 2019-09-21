package csejeonju2019.go.kr.insta;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class recommend3sanchak extends AppCompatActivity  ///향토문화 세부 사항
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend3sanchak);  //순서주의주의

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;
        LatLng poongnam = new LatLng(35.81349, 127.14759);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(poongnam);
        markerOptions.title("풍남문");
        LatLng jj = new LatLng(35.81332, 127.14925);
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(jj);
        markerOptions2.title("전동성당");
        LatLng kyongki = new LatLng(35.81498, 127.14996);
        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(kyongki);
        markerOptions3.title("경기전");
        LatLng ohmok = new LatLng(35.81405, 127.1545);
        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(ohmok);
        markerOptions4.title("오목대");
        LatLng hyangyo = new LatLng(35.81285, 127.15712);
        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(hyangyo);
        markerOptions5.title("전주향교");
        LatLng bonmoon = new LatLng(35.8119, 127.15802);
        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.position(bonmoon);
        markerOptions6.title("완판본문화관");
        LatLng ohmokyo = new LatLng(35.81107, 127.15813);
        MarkerOptions markerOptions7 = new MarkerOptions();
        markerOptions7.position(ohmokyo);
        markerOptions7.title("오목교");
        LatLng moo = new LatLng(35.81019, 127.1606);
        MarkerOptions markerOptions8 = new MarkerOptions();
        markerOptions8.position(moo);
        markerOptions8.title("국립무형유산원");
        LatLng namcheon = new LatLng(35.81091, 127.15315);
        MarkerOptions markerOptions9 = new MarkerOptions();
        markerOptions9.position(namcheon);
        markerOptions9.title("남천교");
        LatLng center=new LatLng(35.81261, 127.15412);
        mMap.addPolyline(new PolylineOptions().add(poongnam,jj).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(jj,kyongki).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kyongki,ohmok).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(ohmok,hyangyo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(hyangyo,bonmoon).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(bonmoon,ohmokyo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(ohmokyo,moo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(moo,namcheon).width(5).color(Color.RED));

        mMap.addMarker(markerOptions);


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(center, 16));//지도 시작시 애니메이션 효과
    }
}