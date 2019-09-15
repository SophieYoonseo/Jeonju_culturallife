package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class EventDetail_show extends AppCompatActivity  {   ///공연정보 (위도 , 경도 지원안댐)
    public static String show_loc1;
    public static String show_loc2;
    public static String show_title;
    public double loc1_double;
    public double loc2_double;
    private GoogleMap mMap;
    public static String show_page;
    public static String show_phonenum;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        TextView title=(TextView)findViewById(R.id.show_title);
        title.setText(show_title);
        Button buttonurl=(Button)findViewById(R.id.show_phonenum);
        buttonurl.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent phonecall=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+show_phonenum));
                startActivity(phonecall);
            }
        });
        Button buttonpage=(Button)findViewById(R.id.show_url);
        buttonpage.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
//                if(show_title.contains("http:")) {
  //                  Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http:"+show_page));
    //                startActivity(intent);
      //          }
        //        else{
                    Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(show_page));
                    startActivity(intent);
          //      }

            }
        });
        //Intent Extra Value 가져오기
        Intent intent = getIntent();
        TextView result = (TextView)findViewById(R.id.result_show);

        PerformanceShowItem2 item = (PerformanceShowItem2)intent.getSerializableExtra("activity");
        //출력
        result.setText(item.showDetail());
    }

}
