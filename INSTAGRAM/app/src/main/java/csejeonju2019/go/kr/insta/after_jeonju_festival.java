package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class after_jeonju_festival extends AppCompatActivity implements OnMapReadyCallback { //전주축제class
    public String f_title;  //타이틀명
    public double space_loc1;   //주소
    public double space_loc2;   //주소
    public String f_date;   //일시
    private GoogleMap mMap;
    public String f_telephone;  //연락처
    public String f_homepage;   //홈페이지
    public String f_address;    //상세주소
    public String f_explain;    //설명


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.after_festival);  //순서주의주의

        f_title=festival_list_activity.title;
        f_address=festival_list_activity.address;
        space_loc1 = festival_list_activity.location1;
        space_loc2 = festival_list_activity.location2;
        f_homepage=festival_list_activity.homepage;
        f_date=festival_list_activity.date;
        f_explain=festival_list_activity.explain;
        f_telephone=festival_list_activity.tel;
        /*
        ImageView imageView=findViewById(R.id.festivalimage);
        if(f_title=="전주 한지 문화축제")
        {
            imageView.setImageResource(R.drawable.hanji);
        }else if(f_title=="전주 세계소리축제")
        {
            imageView.setImageResource(R.drawable.slide2);
        }else if(f_title=="전주 대사습놀이")
        {
            imageView.setImageResource(R.drawable.sasup);
        }else if(f_title=="전주 국제영화제")
        {
            imageView.setImageResource(R.drawable.jeonjumovie);
        }else if(f_title=="전주 문화재야행")
        {
            imageView.setImageResource(R.drawable.yahang);
        }

         */
        Button festivalshare=(Button)findViewById(R.id.festival_share);
        festivalshare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = f_explain;
                String mySubject = f_title+"내용을 공유합니다.";

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, mySubject);
                intent.putExtra(Intent.EXTRA_TEXT, mySharedLink);

                startActivity(Intent.createChooser(intent, "공유합니다."));
            }
        });

        TextView text20=(TextView)findViewById(R.id.festival_title);
        text20.setText(f_title);
        TextView text21=(TextView)findViewById(R.id.festival_date);
        text21.setText("축제 일시 : "+f_date);
        TextView text2=(TextView)findViewById(R.id.festival_address);
        text2.setText("상세주소 : "+ f_address);
        TextView text3=(TextView)findViewById(R.id.festival_explain);
        text3.setText("설명 : "+ f_explain);
        TextView phonetext=(TextView)findViewById(R.id.festival_phone);
        phonetext.setText("전화 번호 :  "+f_telephone);
       // TextView text10=(TextView)findViewById(R.id.festival_homepage);
        //text10.setText("홈페이지 : "+ f_homepage);
        //TextView text9=(TextView)findViewById(R.id.festival_tel);
        //text9.setText("연락처 : " + f_telephone);   축제관련전화번호 다 null이길래 주석처리로없앰(굿)
        Button fetsivaltel=(Button)findViewById(R.id.festival_phonenum);
        fetsivaltel.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent phonecall=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+f_telephone));
                startActivity(phonecall);
            }
        });
        Button buttonpage=(Button)findViewById(R.id.button_festival_page);
        buttonpage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse(f_homepage));
                startActivity(homepage);
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
        markerOptions.title(f_title);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//지도 시작시 애니메이션 효과


    }
}
