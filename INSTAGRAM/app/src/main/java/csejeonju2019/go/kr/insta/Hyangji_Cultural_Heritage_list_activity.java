package csejeonju2019.go.kr.insta;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Hyangji_Cultural_Heritage_list_activity extends AppCompatActivity { //향토문화유산 클래스
    public static String title; //문화재명
    public static String content; //내용
    public static String address; //주소
    public static double location1; //위도
    public static double location2; //경도
    public static String explain; //설명 맨
    ProgressDialog progressDlg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_heritage);
        progressDlg = new ProgressDialog(this);
        progressDlg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        //progressDlg.setIndeterminate(true);
        progressDlg.setTitle("결과를 읽어오는중입니다.....");
        progressDlg.setCancelable(true);
        progressDlg.setMax(100);
        progressDlg.setProgress(0);
        progressDlg.show();
        new Thread(){
            public void run() {
                for(int i=0;i<=100;i++) {
                    progressDlg.setProgress(i);
                    if(i==100)
                        progressDlg.dismiss();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                progressDlg.dismiss();
            }
        }.start();
        String[] hyangji = {
                "만경대 암각서",
                "남고진 사적비",
                "박진 효자비",
                "전주류씨 시사재",
                "전북대 석불입상"
        };
        ListView listView = (ListView) findViewById(R.id.mainmenu_hyangji);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_expandable_list_item_1, hyangji

        );
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    title="만경대 암각서";
                    content="○시대 : 조선시대 ○규모 : 1기";
                    address="전북 전주시 완산구 남고산성1길 33-31";
                    location1=35.8029171;
                    location2=127.15601960000004;
                    explain="만경대 남쪽 바위에는 ‘만경대(萬景臺)’라고 쓴 글씨와 정몽주가 지었다는 시가 새겨져 있다. 이 시는 포은 정몽주가 1380년(고려 우왕 6) 이성계의 종사관으로 운봉에서 황산대첩을 거두고 돌아가는 길에 이곳에 올라 고려를 걱정하며 지은 시라고 한다.";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(getApplicationContext(),after_hyangi_cultural.class);
                    startActivity(intent);
                }else if(position==1)
                {
                    title="남고진 사적비";
                    content="○시대 : 조선시대 ○규모 : 1기";
                    address="전북 전주시 완산구 동서학동";
                    location1=	35.7964539;
                    location2=	127.15513320000002;
                    explain="이 비석은 남고산성의 수축경위와 남고진 설치의 전말을 기록한 것으로 1846년(헌종 12)에 세워졌다. 비신의 높이는 132㎝, 폭은 54㎝, 두께는 26㎝이다. 비석의 글씨는 창암 이삼만이 썼다고 전해진다.";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(getApplicationContext(),after_hyangi_cultural.class);
                    startActivity(intent);
                }else if(position==2)
                {
                    title="박진 효자비";
                    content="○시대 : 조선시대 ○규모 : 1기";
                    address="전북 전주시 완산구 향교길 ";
                    location1=	35.8128303;
                    location2=	127.1571308;
                    explain="이 비석은 1398년(홍무 31)에 세워진 것을 1724년(경종 4)에 중각한 것이다. 비각 안에는 1805년(순조 5)에 후손 필성(必晟)이 지은 ‘전주부 효자박진정려기(全州府 孝子朴晉旌閭記)’가 걸려있다.";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(getApplicationContext(),after_hyangi_cultural.class);
                    startActivity(intent);
                }else if(position==3)
                {
                    title="전주류씨 시사재";
                    content="○시대 : 조선시대 ○규모 : 1기";
                    address="전라북도 전주시 덕진구 안골3길 24";
                    location1=		35.84081949999999;
                    location2=127.15764620000004;
                    explain="없음";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(getApplicationContext(),after_hyangi_cultural.class);
                    startActivity(intent);
                }else if(position==4)
                {
                    title="전북대 석불입상";
                    content="○시대 : 고려시대 ○규모 : 1기";
                    address="전북 전주시 덕진구 백제대로";
                    explain="이 불상은 머리가 결실되고 몸만 대석에 안치되어 있다. 몸체는 단단하면서 풍만한 느낌을 주지만 몸의 굴곡이 전혀 없어 추상적인 느낌을 준다. 법의는 좌견편단으로 어깨에서부터 무릎까지 내려져 있고 그 밑으로는 속옷이 발목까지 덮고 있다.";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                    location1=	35.844182;
                    location2=	127.12927760000002;
                    Intent intent =new Intent(getApplicationContext(),after_hyangi_cultural.class);
                    startActivity(intent);
                }


            }
        });


    }
}
