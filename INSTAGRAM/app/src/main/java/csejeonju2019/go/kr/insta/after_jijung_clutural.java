package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import static android.speech.tts.TextToSpeech.ERROR;

public class after_jijung_clutural extends AppCompatActivity
        implements OnMapReadyCallback {//지정문화ㅏ재
    public String jijung_exp;//설명 임 이거
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

        setContentView(R.layout.after_jijung_culture);  //순서주의주의

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    // 언어를 선택한다.
                    textToSpeech.setLanguage(Locale.KOREAN);
                }
            }
        });

        day=jijung_cultural_property_list_activity.designated_day;
        address=jijung_cultural_property_list_activity.detail_address;
        space_loc1 = jijung_cultural_property_list_activity.location1;
        space_loc2 = jijung_cultural_property_list_activity.location2;
        space_title=jijung_cultural_property_list_activity.title;
        number=jijung_cultural_property_list_activity.designated_number;
        detail=jijung_cultural_property_list_activity.detail_explain;
        //space_classification=space_list_acitivty.Facility_classification;
        final TextView text5=(TextView)findViewById(R.id.jijung_day);
        text5.setText("문화재 지정 일자    :  "+day);
        final TextView text2=(TextView)findViewById(R.id.jijung_explain);
        text2.setText("상세주소  : "+address);
        final TextView text3=(TextView)findViewById(R.id.jijung_title);
        text3.setText(space_title);
        final TextView text10=(TextView)findViewById(R.id.jijung_number);
        text10.setText("지정번호   : "+number);
        final TextView text9=(TextView)findViewById(R.id.jijung_display);
        text9.setText("설명  : " +detail);
        Button share=(Button)findViewById(R.id.jijung_share);
        final String abcd=space_title+address+number+detail;

        Button buttontts= (Button)findViewById(R.id.jijung_tts);
        buttontts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1.0f);
                textToSpeech.setSpeechRate(1.0f);
                textToSpeech.speak(text3.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.speak(text5.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                textToSpeech.speak(text2.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                textToSpeech.speak(text10.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                textToSpeech.speak(text9.getText().toString(),TextToSpeech.QUEUE_ADD,null);

            }
        });

                share.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String mySharedLink = abcd;
                        String mySubject = space_title + "내용을 공유합니다.";

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
    protected void onDestroy() {
        super.onDestroy();
        // TTS 객체가 남아있다면 실행을 중지하고 메모리에서 제거한다.
        if(textToSpeech != null){
            textToSpeech.stop();
            textToSpeech.shutdown();
            textToSpeech = null;
        }
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