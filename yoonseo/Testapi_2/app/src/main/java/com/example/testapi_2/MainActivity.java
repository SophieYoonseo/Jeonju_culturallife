package com.example.testapi_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.enableDefaults();
    }

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        MainActivity http = new MainActivity();
        http.sendGet();
    }

    // HTTP GET request
    private void sendGet() throws Exception {

        TextView status1 = (TextView)findViewById(R.id.result); //파싱된 결과확인!

        String url = "http://openapi.jeonju.go.kr/rest/experience/getExperienceList?authApiKey=ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D&dataValue=%EC%98%88%EB%8B%A4%EC%9B%90";
        Node dataTitle = null;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        // add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.getResponseCode();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while((inputLine = in.readLine()) != null) {
            status1.setText(status1.getText() + inputLine);
            response.append(inputLine);
        }
        in. close();

        // print result
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            FileOutputStream output = new FileOutputStream("./Experience_jeonju");
            output.write(response.toString().getBytes());
            output.close();

            Document doc = dBuilder.parse("./Experience_jeonju");
            doc.getDocumentElement().normalize();

            Element body = (Element) doc.getElementsByTagName("body").item(0);
            Element data = (Element) body.getElementsByTagName("data").item(0);
            Element list = (Element) data.getElementsByTagName("list").item(0);
            //Element dataContent = (Element) list.getElementsByTagName("dataContent").item(0);
            dataTitle = list.getElementsByTagName("dataTitle").item(0);

            status1.setText(status1.getText()+
                     dataTitle.getNodeName()
                    + "\n" + dataTitle.getChildNodes().item(0).getNodeValue());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
