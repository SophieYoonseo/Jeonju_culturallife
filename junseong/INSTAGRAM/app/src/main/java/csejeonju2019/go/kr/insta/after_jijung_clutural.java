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

public class after_jijung_clutural extends AppCompatActivity
        implements OnMapReadyCallback {
    public String exp;//설명 임 이거
    public double space_loc1;//주소
    public double space_loc2;//주소
    public String day;//지정일자
    private GoogleMap mMap;
    public String space_telephone;
    public String space_title;//문화재명
    public String space_classification;
    public String testtest;
    public String number;//지정일자
    public String address; //상세주소
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //exp=space_list_acitivty.explain;
        setContentView(R.layout.after_jijung_culture);//순서주의주의
        //testtest=jijung_cultural_property_list_activity.explain;
        day=jijung_cultural_property_list_activity.designated_day;
        address=jijung_cultural_property_list_activity.detail_address;
        space_loc1 = jijung_cultural_property_list_activity.location1;
        space_loc2 = jijung_cultural_property_list_activity.location2;
        space_title=jijung_cultural_property_list_activity.title;
        number=jijung_cultural_property_list_activity.designated_number;
        //space_classification=space_list_acitivty.Facility_classification;
        TextView text5=(TextView)findViewById(R.id.jijung_day);
        text5.setText("문화재 지정 일자:"+day);
        TextView text2=(TextView)findViewById(R.id.jijung_explain);
        text2.setText("상세주소:"+address);
        TextView text3=(TextView)findViewById(R.id.jijung_title);
        text3.setText(space_title);
        TextView text10=(TextView)findViewById(R.id.jijung_number);
        text10.setText("지정번호:"+number);
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
        //markerOptions.snippet(space_classification);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//지도 시작시 애니메이션 효과


    }
}