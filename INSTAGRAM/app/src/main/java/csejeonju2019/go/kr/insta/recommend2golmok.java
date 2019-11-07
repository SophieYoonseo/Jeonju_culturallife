package csejeonju2019.go.kr.insta;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.pm10.library.CircleIndicator;

public class recommend2golmok extends AppCompatActivity
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend2golmok);  //순서주의주의
        Toast.makeText(this, "사진을 클릭하면 해당 페이지로 이동합니다 사진은 좌우로 밀어 변경할수있고 경로 전체를 보여줍니다", Toast.LENGTH_LONG).show();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
       Adapter2 adapter2=new Adapter2(this);
        ViewPager viewPager=(ViewPager)findViewById(R.id.rec2);
        viewPager.setAdapter(adapter2);


        viewPager.setCurrentItem(0);

        CircleIndicator circleIndicator1=(CircleIndicator)findViewById(R.id.circle_indicator);

        circleIndicator1.setupWithViewPager(viewPager);
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
        BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.mappin_saram);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, 75, 75, false);
        BitmapDrawable bitmapdraw2=(BitmapDrawable)getResources().getDrawable(R.drawable.mappinstart);
        Bitmap b2=bitmapdraw2.getBitmap();
        Bitmap smallMarker2 = Bitmap.createScaledBitmap(b2, 85, 85, false);
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(smallMarker2));
        markerOptions2.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions3.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions4.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions5.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions6.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions7.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions8.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions9.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions10.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions11.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions12.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions13.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
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
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(eunhang, 15));//지도 시작시 애니메이션 효과
    }
}