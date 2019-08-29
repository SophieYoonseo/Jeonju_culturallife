package kr.go.testapi_jb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.enableDefaults();

        TextView status1 = (TextView)findViewById(R.id.result);

        Boolean inIndexNum = false, inStartDay = false, inEndDay = false, inETime = false, inUrl = false, inSponSor = false;
        Boolean inMngCo = false, inPlace = false, inAdmfee = false, inSubject = false, inContent = false, inMngNm  = false;
        Boolean inOrgNm = false, inMngTel = false, inMngEmail = false, inRegDate = false, inAttidx = false, inFileCnt = false;
        Boolean inMainlmg = false, inCategory = false, inAge = false, inPosx = false, inPosy = false, inAddress = false;

        String indexNum = null, startDay = null, endDay = null, ETime = null, url = null, sponSor = null, mngCo = null;
        String place = null, admfee = null, subject = null, content= null, mngNm = null, orgNm = null, mngTel = null;
        String  mngEmail = null, regDate = null, attidx = null, fileCnt = null, mainlmg = null, category = null, age = null;
        String posx = null, posy = null, address = null;


    }
}
