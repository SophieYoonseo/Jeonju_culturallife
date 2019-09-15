package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

import org.w3c.dom.Text;


public class EventDetail extends AppCompatActivity  implements OnMapReadyCallback {//////문화체험
   public static String exp_title;
   public static String loc1;
   public static String loc2;
   public static String phone_num;
   public double loc1_double;
   public double loc2_double;
    private GoogleMap mMap;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_detail);
        TextView title=(TextView)findViewById(R.id.experience_title);
        title.setText(exp_title);
        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result);
        PerformanceShowItem item = (PerformanceShowItem)intent.getSerializableExtra("activity");
        Button phonebutton=(Button)findViewById(R.id.experience_phone_number);
        phonebutton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent phonecall=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+phone_num));
                startActivity(phonecall);
            }
        });
        //출력
        result.setText(item.showDetail());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(final GoogleMap googleMap) {
       loc1_double=Double.parseDouble(loc1);
       loc2_double = Double.parseDouble(loc2); //스트링을 더블로
        mMap = googleMap;
        LatLng SEOUL = new LatLng(loc2_double, loc1_double);


        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        markerOptions.title(exp_title);

        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//지도 시작시 애니메이션 효과


    }
}
