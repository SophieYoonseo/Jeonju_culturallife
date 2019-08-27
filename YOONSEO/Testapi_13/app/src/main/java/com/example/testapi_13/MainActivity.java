package com.example.testapi_13;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends Activity {

    //우체국 오픈api인증키
    private String key = "우체국 API키";
    private TextView addressEdit;
    private Button searchBtn;
    private ListView addressListView;
    private ArrayAdapter<String> addressListAdapter;
    //사용자가 입력한 주소
    private String putAddress;
    //우체국으로부터 반환 받은 우편주소 리스트
    private ArrayList<String> addressSearchResultArr = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addressEdit = (EditText) findViewById(R.id.addressedit);
        searchBtn = (Button) findViewById(R.id.btnsearch);
        addressListView = (ListView) findViewById(R.id.addresslist);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getAddress(addressEdit.getText().toString());
            }
        });


    }

    private void getAddress(String kAddress) {
        putAddress = kAddress;
        new GetAddressDataTask().execute();
    }

    private class GetAddressDataTask extends AsyncTask<String, Void, HttpResponse> {
        @Override
        protected HttpResponse doInBackground(String... urls) {
            HttpResponse response = null;
            final String apiurl = "http://biz.epost.go.kr/KpostPortal/openapi";
            ArrayList<String> addressInfo = new ArrayList<String>();
            HttpURLConnection conn = null;
            try {
                StringBuffer sb = new StringBuffer(3);
                sb.append(apiurl);
                sb.append("?regkey=" + key + "&target=post&query=");
                sb.append(URLEncoder.encode(putAddress, "EUC-KR"));
                String query = sb.toString();
                URL url = new URL(query);
                conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("accept-language", "ko");
                DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                byte[] bytes = new byte[4096];
                InputStream in = conn.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                while (true) {
                    int red = in.read(bytes);
                    if (red < 0) break;
                    baos.write(bytes, 0, red);
                }
                String xmlData = baos.toString("utf-8");
                baos.close();
                in.close();
                conn.disconnect();
                Document doc = docBuilder.parse(new InputSource(new StringReader(xmlData)));
                Element el = (Element) doc.getElementsByTagName("itemlist").item(0);
                for (int i = 0; i < ((Node) el).getChildNodes().getLength(); i++) {
                    Node node = ((Node) el).getChildNodes().item(i);
                    if (!node.getNodeName().equals("item")) {
                        continue;
                    }
                    String address = node.getChildNodes().item(1).getFirstChild().getNodeValue();
                    String post = node.getChildNodes().item(3).getFirstChild().getNodeValue();
                    Log.w("jaeha", "address = " + address);
                    addressInfo.add(address + "\n우편번호:" + post.substring(0, 3) + "-" + post.substring(3));
                }
                addressSearchResultArr = addressInfo;
                publishProgress();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) conn.disconnect();
                } catch (Exception e) {
                }
            }
            return response;
        }

        @Override
        protected void onProgressUpdate(Void... values) {

//TODO Auto-generated method stub

            super.onProgressUpdate(values);
            String[] addressStrArray = new String[addressSearchResultArr.size()];
            addressStrArray = addressSearchResultArr.toArray(addressStrArray);
            addressListAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, addressStrArray);
            addressListView.setAdapter(addressListAdapter);
        }
    }
}


