package com.example.testapi_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textView1);

        new GetXMLTask().execute();
    }
}

private class GetXMLTask extends AsyncTask<String, Void, Document> {
    @Override
    protected Document doInBackground(String... urls) {
        URL url;
        try {
            url = new URL("http://apis.data.go.kr/6260000/BusanBicycleInfoService/getBicycleRackInfo?numOfRows=10&ServiceKey=??");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new InputSource(url.openStream()));
            doc.getDocumentElement().normalize();

        } catch (Exception e) {
            Toast.makeText(getBaseContext(), "Parsing Error", Toast.LENGTH_SHORT).show();
        }
        return doc;
    }

    private Context getBaseContext() {
    }

    @Override
    protected void onPostExecute(Document doc) {

        String s = "";
        NodeList nodeList = doc.getElementsByTagName("item");

        for(int i = 0; i< nodeList.getLength(); i++){

            Node node = nodeList.item(i);
            Element fstElmnt = (Element) node;

            NodeList idx = fstElmnt.getElementsByTagName("idx");
            s += "idx = "+  idx.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            NodeList gugun = fstElmnt.getElementsByTagName("gugun");
            s += "gugun = "+  gugun.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            NodeList instt  = fstElmnt.getElementsByTagName("instt");
            s += "instt = "+ instt.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            NodeList spot = fstElmnt.getElementsByTagName("spot");
            s += "spot = "+  spot.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            NodeList spotGubun = fstElmnt.getElementsByTagName("spotGubun");
            s += "spotGubun = "+  spotGubun.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            NodeList airPump = fstElmnt.getElementsByTagName("airPump");
            s += "airPump = "+  airPump.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            NodeList updtDate = fstElmnt.getElementsByTagName("updtDate");
            s += "updtDate = "+  updtDate.item(0).getChildNodes().item(0).getNodeValue() +"\n";
        }

        textview.setText(s);

        super.onPostExecute(doc);
    }
}