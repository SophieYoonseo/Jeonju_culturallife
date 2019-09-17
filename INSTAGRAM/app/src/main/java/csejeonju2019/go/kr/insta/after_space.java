package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class after_space extends AppCompatActivity
        implements OnMapReadyCallback {
    public String exp;  //설명 임 이거
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
        exp=space_list_acitivty.explain;
        setContentView(R.layout.after_space);   //순서주의주의
        testtest=space_list_acitivty.explain;

        space_loc1 = space_list_acitivty.location1;
        space_loc2 = space_list_acitivty.location2;
        space_title=space_list_acitivty.title;
        space_classification=space_list_acitivty.Facility_classification;

        TextView text2=(TextView)findViewById(R.id.textView2);
        text2.setText(testtest);
        TextView text3=(TextView)findViewById(R.id.textView3);
        text3.setText(space_title);
        Button share=(Button)findViewById(R.id.space_share);
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = testtest;
                String mySubject = space_title+"내용을 공유합니다.";

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, mySubject);
                intent.putExtra(Intent.EXTRA_TEXT, mySharedLink);

                startActivity(Intent.createChooser(intent, "공유합니다."));
            }
        });
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