package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
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

public class recommend1hanok extends AppCompatActivity
        implements OnMapReadyCallback {
   FirstFragment fragment1=new FirstFragment();
   SecondFragment fragment2=new SecondFragment();
   ThirdFragment fragment3=new ThirdFragment();
    Adapter adapter;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend1hanok);  //순서주의주의

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        adapter=new Adapter(this);
        final ViewPager viewPager=(ViewPager)findViewById(R.id.rec1);
        viewPager.setAdapter(adapter);
        Toast.makeText(this, "사진을 클릭하면 해당 페이지로 이동합니다 사진은 좌우로 밀어 변경할수있고 경로 전체를 보여줍니다", Toast.LENGTH_LONG).show();



        viewPager.setCurrentItem(0);



        /*
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=12942911&query=%EC%B2%9C%EC%A3%BC%EA%B5%90%EC%A0%84%EB%8F%99%EA%B5%90%ED%9A%8C"));
                startActivity(homepage);
                return false;
            }
        });



         */

        /*
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
             if(position==0)
             {

                 Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=12942911&query=%EC%B2%9C%EC%A3%BC%EA%B5%90%EC%A0%84%EB%8F%99%EA%B5%90%ED%9A%8C"));
                 startActivity(homepage);
             }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

         */
        CircleIndicator circleIndicator1=(CircleIndicator)findViewById(R.id.circle_indicator);

        circleIndicator1.setupWithViewPager(viewPager);
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
        mMap.addPolyline(new PolylineOptions().add(JJ,kyongki).width(5).color(Color.GREEN));
        mMap.addPolyline(new PolylineOptions().add(kyongki,kyodong).width(5).color(Color.GREEN));
        mMap.addPolyline(new PolylineOptions().add(kyodong,choi).width(5).color(Color.GREEN));
        mMap.addPolyline(new PolylineOptions().add(choi,boochae).width(5).color(Color.GREEN));
        mMap.addPolyline(new PolylineOptions().add(boochae,eunhang).width(5).color(Color.GREEN));
        mMap.addPolyline(new PolylineOptions().add(eunhang,taezo).width(5).color(Color.GREEN));
        mMap.addPolyline(new PolylineOptions().add(taezo,ohmok).width(5).color(Color.GREEN));
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
        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        mMap.addMarker(markerOptions6);
        mMap.addMarker(markerOptions7);
        mMap.addMarker(markerOptions8);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(choi, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(choi, 15));//지도 시작시 애니메이션 효과


    }
}

