package kr.go.testapi_jb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.enableDefaults();

        TextView status = (TextView)findViewById(R.id.result);

        Boolean inIndexNum = false, inStartDay = false, inEndDay = false, inETime = false, inUrl = false, inSponSor = false;
        Boolean inMngCo = false, inPlace = false, inAdmfee = false, inSubject = false, inContent = false, inMngNm  = false;
        Boolean inOrgNm = false, inMngTel = false, inMngEmail = false, inRegDate = false, inAttidx = false, inFileCnt = false;
        Boolean inMainImg = false, inCategory = false, inAge = false, inPosx = false, inPosy = false, inAddress = false;
        Boolean inList = false;

        String indexNum = null, startDay = null, endDay = null, ETime = null, url = null, sponSor = null, mngCo = null;
        String place = null, admfee = null, subject = null, content= null, mngNm = null, orgNm = null, mngTel = null;
        String  mngEmail = null, regDate = null, attidx = null, fileCnt = null, mainImg = null, category = null, age = null;
        String posx = null, posy = null, address = null;

        try{
            URL mURL = new URL("http://openapi.jeonju.go.kr/rest/event/getEventList?"
            +"authApiKey=DDVHRPFFICXVXQQ");

            XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator.newPullParser();

            parser.setInput(mURL.openStream(), null);

            int parserEvent = parser.getEventType();
            while(parserEvent != XmlPullParser.END_DOCUMENT) {
                //if(parser.getName().equals(""))
                switch (parserEvent) {
                    case XmlPullParser.START_TAG:
                        if(parser.getName().equals("indexNum")) inIndexNum = true;
                        if(parser.getName().equals("startDay")) inStartDay = true;
                        if(parser.getName().equals("endDay")) inEndDay = true;
                        if(parser.getName().equals("ETime")) inETime = true;
                        if(parser.getName().equals("url")) inUrl = true;
                        if(parser.getName().equals("sponSor")) inSponSor = true;
                        if(parser.getName().equals("mngCo")) inMngCo = true;
                        if(parser.getName().equals("place")) inPlace = true;
                        if(parser.getName().equals("admfee")) inAdmfee = true;
                        if(parser.getName().equals("subject")) inSubject = true;
                        if(parser.getName().equals("content")) inContent = true;
                        if(parser.getName().equals("mngNm")) inMngNm = true;
                        if(parser.getName().equals("orgNm")) inOrgNm = true;
                        if(parser.getName().equals("mngTel")) inMngTel = true;
                        if(parser.getName().equals("mngEmail")) inMngEmail = true;
                        if(parser.getName().equals("regDate")) inRegDate = true;
                        if(parser.getName().equals("attidx")) inAttidx = true;
                        if(parser.getName().equals("fileCnt")) inFileCnt = true;
                        if(parser.getName().equals("mainImg")) inMainImg = true;
                        if(parser.getName().equals("category")) inCategory = true;
                        if(parser.getName().equals("age")) inAge = true;
                        if(parser.getName().equals("posx")) inPosx = true;
                        if(parser.getName().equals("posy")) inPosy = true;
                        if(parser.getName().equals("address")) inAddress = true;
                        if(parser.getName().equals("message"))
                            status.setText(status.getText()+"Error!\n\n");
                        break;
                    case XmlPullParser.TEXT:
                        if(inIndexNum) indexNum = parser.getText();
                        if(inStartDay) startDay = parser.getText();
                        if(inEndDay) endDay = parser.getText();
                        if(inETime) ETime = parser.getText();
                        if(inUrl) url = parser.getText();
                        if(inSponSor) sponSor = parser.getText();
                        if(inMngCo) mngCo = parser.getText();
                        if(inPlace) place = parser.getText();
                        if(inAdmfee) admfee = parser.getText();
                        if(inSubject) subject = parser.getText();
                        if(inContent) content = parser.getText();
                        if(inMngNm) mngNm = parser.getText();
                        if(inOrgNm) orgNm = parser.getText();
                        if(inMngTel) mngTel = parser.getText();
                        if(inMngEmail) mngEmail = parser.getText();
                        if(inRegDate) regDate = parser.getText();
                        if(inAttidx) attidx = parser.getText();
                        if(inFileCnt) fileCnt = parser.getText();
                        if(inMainImg) mainImg = parser.getText();
                        if(inCategory) category = parser.getText();
                        if(inAge) age = parser.getText();
                        if(inPosx) posx = parser.getText();
                        if(inPosy) posy = parser.getText();
                        if(inAddress) address = parser.getText();
                        inIndexNum = inStartDay = inEndDay = inETime = inUrl = inSponSor = false;
                        inMngCo = inOrgNm = inMngTel = inMngEmail = inRegDate = inAttidx = inFileCnt = false;
                        inMainImg = inCategory = inAge = inPosx = inPosy = inAddress = false;
                        inPlace = inAdmfee = inSubject = inContent = inMngNm = false;
                        break;
                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("list")) {
                            status.setText(status.getText() +
                                            "\n행사 제목 : " + subject +
                                            "\n데이터 번호 : " + indexNum +
                                            "\n행사 시작일 : " + startDay +
                                            "\n행사 종료일 : " + endDay +
                                            "\n세부시간 : " +  ETime +
                                            "\n관련 사이트 : " + url +
                                            "\n주최 : " + sponSor +
                                            "\n주관 : " + mngCo +
                                            "\n장소 : " + place +
                                            "\n비용 : " + admfee +
                                    "\n행사내용 : " + content +
                                    "\n주관부서 : " + mngNm +
                                    "\n부서이름 : " + orgNm +
                                    "\n주관부서연락처 : " + mngTel + " / " + mngEmail +
                                    "\n등록일 : " + regDate +
                                    "\n첨부파일번호 : " + attidx +
                                    "\n첨부파일수 : " + fileCnt +
                                    "\n대표이미지 : " + mainImg +
                                    "\n분류 : " + category +
                                    "\n연령층" + age +
                                    "\n공연장소 경도 : " + posx +
                                    "\n공연장소 위도 : " + posy +
                                    "\n공연장소 지번주소 : " + address +
                                    "\n ------------------------------------------------------------------------------------"
                                    + "\n");
                            inList = false;
                        }
                        break;
                }
                parserEvent = parser.next();
            }
        }
        catch(Exception e) {
            status.setText("예외 발생");
        }
    }
}
