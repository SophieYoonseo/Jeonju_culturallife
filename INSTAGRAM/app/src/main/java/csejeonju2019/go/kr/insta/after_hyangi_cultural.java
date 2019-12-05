package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.speech.tts.TextToSpeech;
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

import android.speech.tts.TextToSpeech;
import java.util.Locale;
import static android.speech.tts.TextToSpeech.ERROR;

public class after_hyangi_cultural extends AppCompatActivity  ///향토문화 세부 사항
        implements OnMapReadyCallback {
//import android.support.v7.app.AppCompatActivity;
    public String exp;//설명 임 이거
    public double space_loc1;//주소
    public double space_loc2;//주소
    public String day;//지정일자
    private GoogleMap mMap;
    public String space_telephone;
    public String space_title;//문화재명
    public String space_classification;
    public String number;//지정일자
    public String address; //상세주소
    public String detail;
    public TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.after_hyangi_cultural_heritage);  //순서주의주의

        //day=Hyangji_Cultural_Heritage_list_activity.designated_day;
        address=Hyangji_Cultural_Heritage_list_activity.address;
        space_loc1 = Hyangji_Cultural_Heritage_list_activity.location1;
        space_loc2 = Hyangji_Cultural_Heritage_list_activity.location2;
        space_title=Hyangji_Cultural_Heritage_list_activity.title;
        exp=Hyangji_Cultural_Heritage_list_activity.explain;
        //number=Hyangji_Cultural_Heritage_list_activity.designated_number;
        detail=Hyangji_Cultural_Heritage_list_activity.content;
        //space_classification=space_list_acitivty.Facility_classification;
        //TextView text5=(TextView)findViewById(R.id.jijung_day);
        //text5.setText("문화재 지정 일자 : "+day);
        final TextView text2=(TextView)findViewById(R.id.hyangi_address);
        text2.setText("상세주소 : "+address);
        final TextView text3=(TextView)findViewById(R.id.hyangi_title);
        text3.setText(space_title);
        //TextView text10=(TextView)findViewById(R.id.jijung_number);
       // text10.setText("지정번호 : "+number);
        final TextView text9=(TextView)findViewById(R.id.hyangi_content);
        text9.setText("내용 : " +detail);
        ImageView imageView=(ImageView)findViewById(R.id.hyangi_image);
        final TextView text12=(TextView)findViewById(R.id.hyangi_explain);
        text12.setText("설명 : "+ exp);
        if(space_title=="만경대 암각서")
        {
            imageView.setImageResource(R.drawable.amkak);
        }
        else if(space_title=="남고진 사적비")
        {
            imageView.setImageResource(R.drawable.namgo);
        } else if(space_title=="박진 효자비")
        {
            imageView.setImageResource(R.drawable.parkjin);
        }
        else if(space_title=="전주류씨 시사재")
        {
            imageView.setImageResource(R.drawable.sisa);
        }
        else if(space_title=="전북대 석불입상")
        {
            imageView.setImageResource(R.drawable.seokbul);
        }
        Button share=(Button)findViewById(R.id.hyangi_share);
        final String abcd=detail+exp+address;
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = abcd;
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

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    // 언어를 선택한다.
                    textToSpeech.setLanguage(Locale.KOREAN);
                }
            }
        });

        Button button_tts= (Button)findViewById(R.id.hyangi_tts);
        button_tts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1.0f);
                textToSpeech.setSpeechRate(1.0f);
                textToSpeech.speak(text3.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.speak(text2.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                textToSpeech.speak(text9.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                textToSpeech.speak(text12.getText().toString(),TextToSpeech.QUEUE_ADD,null);

            }
        });

    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;

        LatLng JJ = new LatLng(space_loc1, space_loc2);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(JJ);
        markerOptions.title(space_title);
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(JJ, 16));//지도 시작시 애니메이션 효과


    }
}