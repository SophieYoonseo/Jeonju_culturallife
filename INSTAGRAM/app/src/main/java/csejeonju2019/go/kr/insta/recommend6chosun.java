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

public class recommend6chosun extends AppCompatActivity
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend6chosun);  //순서주의주의

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;
        LatLng kyongki = new LatLng(35.81498, 127.14996);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(kyongki);
        markerOptions.title("경기전");

        LatLng uhzin = new LatLng(35.8162, 127.1494);

        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(uhzin);
        markerOptions2.title("어진박물관");

        LatLng taezo = new LatLng(35.81439, 127.15101);

        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(taezo);
        markerOptions3.title("태조로");


        LatLng ohmok = new LatLng(35.81405, 127.1545);

        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(ohmok);
        markerOptions4.title("오목대");
        LatLng eemok = new LatLng(35.81426, 127.15613);

        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(eemok);
        markerOptions5.title("이목대");
        LatLng jaman = new LatLng(35.81421, 127.15721);

        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.position(jaman);
        markerOptions6.title("자만벽화마을");

        mMap.addPolyline(new PolylineOptions().add(kyongki,uhzin).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(uhzin,taezo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(taezo,ohmok).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(ohmok,eemok).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(eemok,jaman).width(5).color(Color.RED));

        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        LatLng center=new LatLng(35.81474, 127.1526);





        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(center, 15));//지도 시작시 애니메이션 효과
    }
}