package com.example.testapi_14;

import android.os.Environment;
import android.os.StrictMode;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TrainInfo extends Thread {

    private StationInfo fi;

    TrainInfo()
    {
        path = Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+"/TEST_TEXT_WRITE";
//        path = this.m.getFilesDir()+File.separator+"/TEST_TEXT_WRITE";
        run();
    }

    int ctCode[] = {11,21,22,23,24,25,26,31,32,33,34,35,36,37,38}; // 지역 코드 정보 조회
    private ArrayList<stationinfo> connectServer(int citycode) {

        ArrayList<stationinfo> list = new ArrayList<stationinfo>();
        if(android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }
        try {

            String key = "할당 받은 키 값을 입력하시면 됩니다.";

            URL url = new URL("http://openapi.tago.go.kr/openapi/service/TrainInfoService/getCtyAcctoTrainSttnList?ServiceKey=" + key +
                    "&cityCode="+citycode);

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

            XmlPullParser parser = factory.newPullParser();

            parser.setInput(url.openStream(), null);

            int parserEvent = parser.getEventType();
            while (parserEvent != XmlPullParser.END_DOCUMENT) {
                if(parserEvent == XmlPullParser.START_TAG) {

                    String tagName = parser.getName();

                    if(tagName.equals("nodeid")) {
                        fi = new StationInfo();

                        fi.setStationCode(parser.nextText());

                        parserEvent = parser.next();
                        tagName = parser.getName();
                    } if(tagName.equals("nodename")) {
                        fi.setStationName(parser.nextText());
                        list.add(fi);
                    }
                }
                parserEvent = parser.next();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }


    @Override
    public void run() {
        super.run();
        for(int i = 0; i < ctCode.length; i++) {
            ArrayList<stationinfo> temp = connectServer(ctCode[i]);
            for(int j = 0; j < temp.size(); j++)
            {
                onTexStationNameWriting(temp.get(j));
                onTexStationCodetWriting(temp.get(j));
            }
        }
    }

    private String path;
    private void onTexStationNameWriting(StationInfo temp) {
        File file;
        file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        file = new File(path + File.separator + "InfoTrainStation" + ".txt");
        try {
            BufferedWriter buw = new BufferedWriter(new FileWriter(file,true));


            buw.write(temp.getStationName());
            buw.newLine();
            buw.close();
        } catch (IOException e) {

        }
    }


    private void onTexStationCodetWriting(StationInfo temp) {
        File file;
        file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        file = new File(path + File.separator + "InfoTrainStationCode" + ".txt");
        try {
            BufferedWriter buw = new BufferedWriter(new FileWriter(file,true));


            buw.write(temp.getStationCode());
            buw.newLine();
            buw.close();
        } catch (IOException e) {

        }
    }
}
