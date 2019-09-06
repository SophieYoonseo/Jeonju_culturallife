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

public class after_space extends AppCompatActivity
        implements OnMapReadyCallback {
    public String exp;//설명 임 이거
    public double space_loc1;
    public double space_loc2;
    private GoogleMap mMap;
    public String space_telephone;
    public String space_title;
    public String space_classification;
    public String testtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        exp=Frag2.explain;
        setContentView(R.layout.after_space);//순서주의주의
        testtest=Frag2.explain;

        space_loc1 = Frag2.location1;
        space_loc2 = Frag2.location2;
        space_title=Frag2.title;
        space_classification=Frag2.Facility_classification;

        TextView text2=(TextView)findViewById(R.id.textView2);
        text2.setText(testtest);
        TextView text3=(TextView)findViewById(R.id.textView3);
        text3.setText(space_title);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;

        LatLng JJ = new LatLng(space_loc1, space_loc2);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(JJ);
        markerOptions.title(space_title);
        markerOptions.snippet(space_classification);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//지도 시작시 애니메이션 효과


    }
}