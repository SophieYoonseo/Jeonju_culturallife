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

public class recommend3sanchak extends AppCompatActivity
        implements OnMapReadyCallback {

///////
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend3sanchak);  //순서주의주의
        Toast.makeText(this, "사진을 클릭하면 해당 페이지로 이동합니다 사진은 좌우로 밀어 변경할수있고 경로 전체를 보여줍니다", Toast.LENGTH_LONG).show();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
      Adapter3  adapter=new Adapter3(this);
        ViewPager viewPager=(ViewPager)findViewById(R.id.rec3);
        viewPager.setAdapter(adapter);


        viewPager.setCurrentItem(0);

        CircleIndicator circleIndicator1=(CircleIndicator)findViewById(R.id.circle_indicator);

        circleIndicator1.setupWithViewPager(viewPager);
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
        BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.mappin_saram);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, 75, 75, false);
        BitmapDrawable bitmapdraw2=(BitmapDrawable)getResources().getDrawable(R.drawable.mappinstart);
        Bitmap b2=bitmapdraw2.getBitmap();
        Bitmap smallMarker2 = Bitmap.createScaledBitmap(b2, 80, 80, false);
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(smallMarker2));
        markerOptions2.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions3.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions4.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions5.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions6.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions7.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions8.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        markerOptions9.icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        mMap.addMarker(markerOptions6);
        mMap.addMarker(markerOptions7);
        mMap.addMarker(markerOptions8);
        mMap.addMarker(markerOptions9);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(center, 15));//지도 시작시 애니메이션 효과
    }
}