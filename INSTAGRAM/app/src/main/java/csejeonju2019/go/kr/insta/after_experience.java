package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class after_experience extends AppCompatActivity // 파싱에러뜰경우 여기로이동
        implements OnMapReadyCallback {

    public   double location1;
    public   double location2;
    public  String address;
    public  String explain;  //설명
    public  String title;
    public  String tel;
    public  String homepage;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //exp=Frag5.explain;
        setContentView(R.layout.after_experience);
        title=experience_error_list_activity.title;
        address=experience_error_list_activity.address;
        location1 = experience_error_list_activity.location1;
        location2 = experience_error_list_activity.location2;
        homepage=experience_error_list_activity.homepage;

        explain=experience_error_list_activity.explain;
        tel=experience_error_list_activity.tel;
        Button festivalshare=(Button)findViewById(R.id.exreience_share2);
        festivalshare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = explain;
                String mySubject = title+"내용을 공유합니다.";

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, mySubject);
                intent.putExtra(Intent.EXTRA_TEXT, mySharedLink);

                startActivity(Intent.createChooser(intent, "공유합니다."));
            }
        });

        TextView text20=(TextView)findViewById(R.id.experience_title2);
        text20.setText(title);

        TextView text2=(TextView)findViewById(R.id.experience_address2);
        text2.setText("상세주소 : "+ address);
        TextView text3=(TextView)findViewById(R.id.experience_exp2);
        text3.setText("설명 : "+ explain);
        TextView phonetext=(TextView)findViewById(R.id.experience_phone2);
        phonetext.setText("전화 번호 :  "+tel);
        // TextView text10=(TextView)findViewById(R.id.button_exp_page2);
        //text10.setText("홈페이지 : "+ f_homepage);
        //TextView text9=(TextView)findViewById(R.id.festival_tel);
        //text9.setText("연락처 : " + f_telephone);   축제관련전화번호 다 null이길래 주석처리로없앰(굿)
        Button fetsivaltel=(Button)findViewById(R.id.button_exp_phonenum2);
        fetsivaltel.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent phonecall=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+tel));
                startActivity(phonecall);
            }
        });
        Button buttonpage=(Button)findViewById(R.id.button_exp_page2);
        buttonpage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent homepage1=new Intent(Intent.ACTION_VIEW, Uri.parse(homepage));
                startActivity(homepage1);
            }
        });
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map23);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        //loc1=Frag5.location1;
        //loc2=Frag5.location2;

        mMap = googleMap;

        LatLng SEOUL = new LatLng(location1, location2);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        markerOptions.title(title);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));//지도 시작시 애니메이션 효과


    }

}

