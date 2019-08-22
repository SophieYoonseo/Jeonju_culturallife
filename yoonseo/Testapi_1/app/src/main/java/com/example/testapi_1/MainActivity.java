package com.example.testapi_1;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.net.URL;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.enableDefaults();

        TextView status1 = (TextView)findViewById(R.id.result); //파싱된 결과확인!

        boolean resultCode = false, resultMsg = false, pageIndex = false, pageSize = false, startPage = false, totalCount = false;
        boolean addr = false, addrDtl = false, boardSid = false, cultureSpNm = false, dataContent = false;
        boolean dataSid = false, dataTitle = false, expCommente = false, experName = false, fileCnt = false;
        boolean homepage = false, lowCost = false, maxCost = false, memberCnt = false, posx = false, posy = false;
        boolean regDt = false, reqTime = false, tel = false, zipcode = false, charge = false;
        boolean indata = false;

        String s_resultCode = null, s_resultMsg = null, s_pageIndex = null, s_pageSize = null, s_startPage = null, s_totalCount = null;
        String s_addr = null, s_addrDtl = null, s_boardSid = null, s_cultureSpNm = null, s_dataContent = null;
        String s_dataSid = null, s_dataTitle = null, s_expCommente = null, s_experName = null, s_fileCnt = null;
        String s_homepage = null, s_lowCost = null, s_maxCost = null, s_memberCnt = null, s_posx = null, s_posy = null;
        String s_regDt = null, s_reqTime = null, s_tel = null, s_zipcode = null, s_charge = null;


        try{
            URL url = new URL("http://openapi.jeonju.go.kr/rest/experience/getExperienceList?" +
                    "+authApiKey=ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D" +
                    "&dataValue=%EC%98%88%EB%8B%A4%EC%9B%90"); //검색 URL부분

            XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator.newPullParser();

            parser.setInput(url.openStream(), null);

            int parserEvent = parser.getEventType();
            System.out.println("파싱시작합니다.");

            while (parserEvent != XmlPullParser.END_DOCUMENT){
                switch(parserEvent){
                    case XmlPullParser.START_TAG://parser가 시작 태그를 만나면 실행

                        if(parser.getName().equals("resultCode")){ //title 만나면 내용을 받을수 있게 하자
                            resultCode = true;
                        }
                        if(parser.getName().equals("resultMsg")){ //address 만나면 내용을 받을수 있게 하자
                            resultMsg = true;
                        }
                        if(parser.getName().equals("pageIndex")){ //mapx 만나면 내용을 받을수 있게 하자
                            pageIndex = true;
                        }
                        if(parser.getName().equals("pageSize")){ //mapx 만나면 내용을 받을수 있게 하자
                            pageSize = true;
                        }
                        if(parser.getName().equals("startPage")){ //mapy 만나면 내용을 받을수 있게 하자
                            startPage = true;
                        }
                        if(parser.getName().equals("totalCount")){ //mapy 만나면 내용을 받을수 있게 하자
                            totalCount = true;
                        }
                        if(parser.getName().equals("addr")){ //mapy 만나면 내용을 받을수 있게 하자
                            addr = true;
                        }
                        if(parser.getName().equals("addrDtl")){ //mapy 만나면 내용을 받을수 있게 하자
                            addrDtl = true;
                        }
                        if(parser.getName().equals("boardSid")){ //mapy 만나면 내용을 받을수 있게 하자
                            boardSid = true;
                        }
                        if(parser.getName().equals("cultrueSpNm")){ //mapy 만나면 내용을 받을수 있게 하자
                            cultureSpNm = true;
                        }
                        if(parser.getName().equals("dataContent")){ //mapy 만나면 내용을 받을수 있게 하자
                            dataContent = true;
                        }
                        if(parser.getName().equals("dataSid")){ //title 만나면 내용을 받을수 있게 하자
                            dataSid = true;
                        }
                        if(parser.getName().equals("dataTitle")){ //address 만나면 내용을 받을수 있게 하자
                            dataTitle = true;
                        }
                        if(parser.getName().equals("expCommente")){ //mapx 만나면 내용을 받을수 있게 하자
                            expCommente = true;
                        }
                        if(parser.getName().equals("experName")){ //mapx 만나면 내용을 받을수 있게 하자
                            experName = true;
                        }
                        if(parser.getName().equals("fileCnt")){ //mapy 만나면 내용을 받을수 있게 하자
                            fileCnt = true;
                        }
                        if(parser.getName().equals("homepage")){ //mapy 만나면 내용을 받을수 있게 하자
                            homepage = true;
                        }
                        if(parser.getName().equals("lowCost")){ //mapy 만나면 내용을 받을수 있게 하자
                            lowCost = true;
                        }
                        if(parser.getName().equals("maxCost")){ //mapy 만나면 내용을 받을수 있게 하자
                            maxCost = true;
                        }
                        if(parser.getName().equals("memberCnt")){ //mapy 만나면 내용을 받을수 있게 하자
                            memberCnt = true;
                        }
                        if(parser.getName().equals("posx")){ //mapy 만나면 내용을 받을수 있게 하자
                            posx = true;
                        }
                        if(parser.getName().equals("posy")){ //mapy 만나면 내용을 받을수 있게 하자
                            posy = true;
                        }
                        if(parser.getName().equals("regDt")){ //mapy 만나면 내용을 받을수 있게 하자
                            regDt = true;
                        }
                        if(parser.getName().equals("reqTime")){ //mapy 만나면 내용을 받을수 있게 하자
                            reqTime = true;
                        }
                        if(parser.getName().equals("tel")){ //mapy 만나면 내용을 받을수 있게 하자
                            tel = true;
                        }
                        if(parser.getName().equals("zipcode")){ //mapy 만나면 내용을 받을수 있게 하자
                            zipcode = true;
                        }
                        if(parser.getName().equals("charge")){ //mapy 만나면 내용을 받을수 있게 하자
                            charge = true;
                        }
                        if(parser.getName().equals("message")){ //message 태그를 만나면 에러 출력
                            status1.setText(status1.getText()+"에러");
                            //여기에 에러코드에 따라 다른 메세지를 출력하도록 할 수 있다.
                        }
                        break;

                    case XmlPullParser.TEXT://parser가 내용에 접근했을때

                        if(resultCode){ //isTitle이 true일 때 태그의 내용을 저장.
                            s_resultCode = parser.getText();
                            resultCode = false;
                        }
                        if(resultMsg){ //isAddress이 true일 때 태그의 내용을 저장.
                            s_resultMsg = parser.getText();
                            resultMsg = false;
                        }
                        if(pageIndex){ //isMapx이 true일 때 태그의 내용을 저장.
                            s_pageIndex = parser.getText();
                            pageIndex = false;
                        }
                        if(pageSize){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_pageSize = parser.getText();
                            pageSize = false;
                        }
                        if(startPage){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_startPage = parser.getText();
                            startPage = false;
                        }
                        if(totalCount){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_totalCount = parser.getText();
                            totalCount = false;
                        }

                        if(addr){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_addr = parser.getText();
                            addr = false;
                        }
                        if(addrDtl){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_addrDtl = parser.getText();
                            addrDtl = false;
                        }
                        if(boardSid){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_boardSid = parser.getText();
                            boardSid = false;
                        }
                        if(cultureSpNm){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_cultureSpNm = parser.getText();
                           cultureSpNm = false;
                        }
                        if(dataContent){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_dataContent = parser.getText();
                            dataContent = false;
                        }

                        if(dataSid){ //isTitle이 true일 때 태그의 내용을 저장.
                            s_dataSid = parser.getText();
                            dataSid = false;
                        }
                        if(dataTitle){ //isAddress이 true일 때 태그의 내용을 저장.
                            s_dataTitle = parser.getText();
                            dataTitle = false;
                        }
                        if(expCommente){ //isMapx이 true일 때 태그의 내용을 저장.
                            s_expCommente = parser.getText();
                            expCommente = false;
                        }
                        if(experName){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_experName = parser.getText();
                            experName = false;
                        }
                        if(fileCnt){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_fileCnt = parser.getText();
                            fileCnt = false;
                        }
                        if(homepage){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_homepage = parser.getText();
                            homepage = false;
                        }
                        if(lowCost){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_lowCost = parser.getText();
                            lowCost = false;
                        }
                        if(maxCost){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_maxCost = parser.getText();
                            maxCost = false;
                        }
                        if(memberCnt){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_memberCnt = parser.getText();
                            memberCnt = false;
                        }
                        if(posx){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_posx = parser.getText();
                            posx = false;
                        }
                        if(posy){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_posy = parser.getText();
                            posy = false;
                        }
                        if(regDt){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_regDt = parser.getText();
                            regDt = false;
                        }
                        if(reqTime){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_reqTime = parser.getText();
                            reqTime = false;
                        }
                        if(tel){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_tel = parser.getText();
                            tel = false;
                        }
                        if(zipcode){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_zipcode = parser.getText();
                            zipcode = false;
                        }
                        if(charge){ //isMapy이 true일 때 태그의 내용을 저장.
                            s_charge = parser.getText();
                            charge = false;
                        }

                        break;
                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("data")){
                            status1.setText(status1.getText()+
                                    "결과코드 : "+ s_resultCode + "\n 결과메시지: "+ s_resultMsg +"\n 쿼리 페이지 시작점 : " + s_pageIndex//+"\n 페이지 크기 : " + s_pageSize +  "\n 시작 페이지 : " + s_startPage + "\n 전체 결과 수 : " + s_totalCount
                                    +"\n 데이터 번호 : " + s_dataSid + "\n 게시판 번호 : " + s_boardSid + "\n 장소 : " + s_dataTitle
                                    +"\n 기타내용 : " + s_dataContent
                                    +"\n 체험명 : " + s_experName + "\n 소요시간 : " + s_reqTime
                                   +"\n 인원 및 비용 관련 설명 : " + s_expCommente +  "\n 연락처 : " + s_tel + "\n 홈페이지 : " + s_homepage
                                    +"\n 체험위지 우편번호 : " + s_zipcode
                                    +"\n 체험공간명 : " + s_cultureSpNm +"\n 인원 : " + s_memberCnt + "\n 최소비용 : " + s_lowCost
                                    +"\n 최대비용 : " + s_maxCost +  "\n 경도 : " + s_posx + "\n 위도 : " + s_posy
                                    +"\n 등록일 : " + s_regDt + "\n 첨부파일 수 : " + s_fileCnt + "\n 체험비용 : " + s_charge
                                    +"\n ------------------------------------------------------------------------------------"
                                    + "\n"

                            );
                            indata = false;
                        }
                        break;
                }
                parserEvent = parser.next();
            }
        } catch(Exception e){
            status1.setText("에러가..났습니다...");
        }
    }
}
