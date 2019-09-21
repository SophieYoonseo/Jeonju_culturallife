package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class recommend1hanok extends AppCompatActivity  ///향토문화 세부 사항
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend1hanok);  //순서주의주의

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;
        //전동 성당 35.81332, 127.14925
        LatLng JJ = new LatLng(35.81332, 127.14925);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(JJ);
        markerOptions.title("전동성당");
        LatLng kyongki=new LatLng(35.81498, 127.14996);
        // 35.81498, 127.14996
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(kyongki);
        markerOptions2.title("경기전");
        LatLng kyodong=new LatLng(35.81548, 127.15119);
        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(kyodong);
        markerOptions3.title("교동미술관");
        LatLng choi=new LatLng(35.8157, 127.1513);
        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(choi);
        markerOptions4.title("최명희문학관");
        LatLng boochae=new LatLng(35.81544, 127.15195);
        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(boochae);
        markerOptions5.title("전주부채문화관");
        LatLng eunhang=new LatLng(35.81551, 127.15243);
        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.position(eunhang);
        markerOptions6.title("은행로");
        LatLng taezo=new LatLng(35.81439, 127.15101);
        MarkerOptions markerOptions7 = new MarkerOptions();
        markerOptions7.position(taezo);
        markerOptions7.title("태조로");
        LatLng ohmok=new LatLng(35.81405, 127.1545);
        MarkerOptions markerOptions8 = new MarkerOptions();
        markerOptions8.position(ohmok);
        markerOptions8.title("오목대");
        mMap.addPolyline(new PolylineOptions().add(JJ,kyongki).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kyongki,kyodong).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kyodong,choi).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(choi,boochae).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(boochae,eunhang).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(eunhang,taezo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(taezo,ohmok).width(5).color(Color.RED));

        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        mMap.addMarker(markerOptions6);
        mMap.addMarker(markerOptions7);
        mMap.addMarker(markerOptions8);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(choi, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(choi, 16));//지도 시작시 애니메이션 효과


    }
}

