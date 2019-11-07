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

public class recommend4yeoksa extends AppCompatActivity
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend4yeoksa);  //순서주의주의
        Toast.makeText(this, "사진을 클릭하면 해당 페이지로 이동합니다 사진은 좌우로 밀어 변경할수있고 경로 전체를 보여줍니다", Toast.LENGTH_LONG).show();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
       Adapter4 adapter=new Adapter4(this);
        ViewPager viewPager=(ViewPager)findViewById(R.id.rec4);
        viewPager.setAdapter(adapter);


        viewPager.setCurrentItem(0);

        CircleIndicator circleIndicator1=(CircleIndicator)findViewById(R.id.circle_indicator);

        circleIndicator1.setupWithViewPager(viewPager);
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;
        LatLng hanbeok = new LatLng(35.81204, 127.15839);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(hanbeok);
        markerOptions.title("전주한벽문화관");

        LatLng moohyeong = new LatLng(35.81019, 127.1606);

        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(moohyeong);
        markerOptions2.title("전주무형유산원");

        LatLng choong = new LatLng(35.80508, 127.15691);

        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(choong);
        markerOptions3.title("충경사");
        LatLng namgo = new LatLng(35.7988, 127.15872);

        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(namgo);
        markerOptions4.title("남고사");
        LatLng namgosan = new LatLng(35.8, 127.15763);

        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(namgosan);
        markerOptions5.title("남고산성");

        LatLng kwansung = new LatLng(35.7965, 127.16025);

        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.position(kwansung);
        markerOptions6.title("관성묘");
        /*
        LatLng sansung = new LatLng(36.68832, 126.83207);

        MarkerOptions markerOptions7 = new MarkerOptions();
        markerOptions7.position(kwansung);
        markerOptions7.title("산성천길"); 왜 충청도를 ;;;;
*/
        mMap.addPolyline(new PolylineOptions().add(hanbeok,moohyeong).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(moohyeong,choong).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(choong,namgo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(namgo,namgosan).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(namgosan,kwansung).width(5).color(Color.RED));
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


        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        mMap.addMarker(markerOptions6);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(choong, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(choong, 14));//지도 시작시 애니메이션 효과
    }
}