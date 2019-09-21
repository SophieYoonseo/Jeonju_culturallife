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

public class recommend2golmok extends AppCompatActivity  ///향토문화 세부 사항
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend2golmok);  //순서주의주의

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;
        LatLng ohmok = new LatLng(35.81405, 127.1545);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(ohmok);
        markerOptions.title("오목대");
        LatLng taezo = new LatLng(35.81439, 127.15101);
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(taezo);
        markerOptions2.title("태조로");
        LatLng jj = new LatLng(35.81332, 127.14925);

        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(jj);
        markerOptions3.title("전동성당");
        LatLng kyongki = new LatLng(35.81498, 127.14996);

        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(kyongki);
        markerOptions4.title("경기전");
        LatLng kyodong = new LatLng(35.81548, 127.15119);

        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(kyodong);
        markerOptions5.title("교동미술관");
        LatLng choi = new LatLng(35.8157, 127.1513);

        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.position(choi);
        markerOptions6.title("최명희문학관");
        LatLng boochae = new LatLng(35.81544, 127.15195);

        MarkerOptions markerOptions7 = new MarkerOptions();
        markerOptions7.position(boochae);
        markerOptions7.title("전주부채문화관");
        LatLng eunhang = new LatLng(35.81551, 127.15243);

        MarkerOptions markerOptions8 = new MarkerOptions();
        markerOptions8.position(eunhang);
        markerOptions8.title("은행로");
        LatLng hanzi = new LatLng(35.81577, 127.15369);

        MarkerOptions markerOptions9 = new MarkerOptions();
        markerOptions9.position(boochae);
        markerOptions9.title("전주전통한지원");
        LatLng minbak = new LatLng(35.81663, 127.1535);

        MarkerOptions markerOptions10 = new MarkerOptions();
        markerOptions10.position(minbak);
        markerOptions10.title("승광재민박");
        LatLng sool = new LatLng(35.81699, 127.1535);

        MarkerOptions markerOptions11 = new MarkerOptions();
        markerOptions11.position(sool);
        markerOptions11.title("전주전통술박물관");
        LatLng sori = new LatLng(35.81765, 127.15334);

        MarkerOptions markerOptions12 = new MarkerOptions();
        markerOptions12.position(sori);
        markerOptions12.title("전주소리문화관");
        LatLng kimchi = new LatLng(35.81754, 127.15239);

        MarkerOptions markerOptions13 = new MarkerOptions();
        markerOptions13.position(kimchi);
        markerOptions13.title("전주김치문화관");
        mMap.addPolyline(new PolylineOptions().add(ohmok,taezo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(taezo,jj).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(jj,kyongki).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kyongki,kyodong).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kyodong,choi).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(choi,boochae).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(boochae,eunhang).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(eunhang,taezo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(taezo,hanzi).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(hanzi,minbak).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(minbak,sool).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(sool,sori).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(sori,kimchi).width(5).color(Color.RED));
        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        mMap.addMarker(markerOptions6);
        mMap.addMarker(markerOptions7);
        mMap.addMarker(markerOptions8);
        mMap.addMarker(markerOptions9);
        mMap.addMarker(markerOptions10);
        mMap.addMarker(markerOptions11);
        mMap.addMarker(markerOptions12);
        mMap.addMarker(markerOptions13);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(eunhang, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(eunhang, 16));//지도 시작시 애니메이션 효과
    }
}