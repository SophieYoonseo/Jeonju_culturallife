package csejeonju2019.go.kr.insta;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class festival_list_activity extends AppCompatActivity {
    public static String title; //축제명
    public static String content; //내용z
    public static String address; //주소
    public static double location1; //위도
    public static double location2; //경도
    public static String homepage;  //홈페이지
    public static String date;  //날짜
    public static String tel;   //연락처
    public static String explain; //설명
    ProgressDialog progressDlg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);
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
        String[] festivalName = {
                "전주 한지 문화 축제",
                "전주 세계소리축제",
                "전주 대사습놀이",
                "전주 국제영화제",
                "전주 문화재야행"
        };
        ListView listView = (ListView) findViewById(R.id.mainmenu_festival);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_expandable_list_item_1, festivalName);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    title="전주 한지 문화축제";

                    address="전라북도 전주시 완산구 경원동3가 현무1길 20 한지산업지원센터 1층";
                    location1=35.8029171;
                    location2=127.15601960000004;

                    homepage ="http://www.jhanji.or.kr";
                    tel = "063-271-2503";
                    date = "2019년 5월 4일 토 - 5월 6일 월";
                    explain=" 1997년 시작으로 전라북도 전주시에 5월에 개최하는 축제로, 천년전주 한지의 우수성을 널리 알리고\n" +
                            "전국의 우수 공예인을 발굴 및 전주 한지 공예발전에 기여하고자 합니다.";
                    Intent intent =new Intent(getApplicationContext(), after_jeonju_festival.class);
                    startActivity(intent);
                }else if(position==1)
                {
                    title="전주 세계소리축제";

                    address="전라북도 전주시 덕진구 소리로 31 한국소리문화의전당 국제회의장 1층";
                    location1=	35.7964539;
                    location2=	127.15513320000002;

                    homepage ="http://www.sorifestival.com";
                    tel = "063-232-8398";
                    date = "2019년 10월 2일 ~ 10월 6일";
                    explain="전통음악과 월드뮤직, 두 날개로 비상하는 전주세계소리축제\n" +
                            "전주세계소리축제에서 다루는 메인 장르는 크게 두 가지를 근간으로 하고 있습니다.\n" +
                            "그 하나가 전통음악이고, 두 번째가 월드뮤직입니다.\n" +
                            "전통음악에서는 특히 판소리와 산조, 정가, 기악, 한국형 월드뮤직(퓨전) 등을 주목하고 있습니다. 전라북도 전주에서 전주세계소리축제를 개최하는 이유는 무엇일까요. 예로부터 전라북도는 ‘소리(판소리)’의 유구한 전통과 역사, 인물, 그리고 귀명창이라고 부르는 관객들의 두터운 소리 인프라를 지니고 있습니다. 이 ‘소리’ 자산은 전라북도를 대표하는 가장 중요한 문화적 자원으로 이해되고 발전시켜야 할 과제이기도 합니다. 소리축제는 이러한 미션을 수행하는 전진기지이기도 합니다. 그것은 우리가 우리인 이유, 존재의 의미를 확증하고, 미래세대들에게 새로운 가치로써 전해주어야 하기 때문입니다.\n" +
                            "그리고 월드뮤직입니다. 월드뮤직을 사전적으로 풀면 ‘세계 음악’ 정도가 될 것 같습니다. 그러나 소리축제에서 다루는 월드뮤직은 민속음악을 토대로 벌어지는 하나의 경향입니다. 지금 현재, 동시대를 살고 있는 음악가들이 전통을 통해 고민하고 치열하게 매달리는 새로운 음악의 화두입니다. 지금 현재 벌어지고 있는 음악적 현상입니다. 그래서 대중적이기보다는 각 나라의 전통이 깃든 민속음악을 기반으로 한 새로운 경향, 흐름이 담긴 음악들을 초청해 보여줍니다.\n" +
                            "우리가 우리의 전통과 그 전통을 어떻게 현대적으로 해석하고 발전시켜 나가느냐를 고민하듯, 세계 각 나라의 음악가들도 이런 고민을 합니다. 그들을 모아놓고 비교해보고 수용하고 확장하는 곳이 바로 소리축제입니다. 전통 혹은 각 나라 민속음악의 현재의 흐름, 미래의 경향을 들여다보고 비교하는 자리, 그것이 소리축제의 기본 테마입니다.\n" +
                            "소리축제에는 수많은 기대와 요구가 있습니다. 하늘의 별만큼이나 음악의 장르와 종류가 많기 때문입니다.\n" +
                            "그러나 지금 소리축제를 만드는 사람들은 소리축제의 방향을 이렇게 이해하고 실현해가고 있습니다.\n" +
                            "가을날, 우리음악의 과거와 현재, 미래를 그리며 그 고민의 결과물들을 풀어놓는 자리.\n" +
                            "낯선 것은 가끔 불편하기도 하고 어렵기도 합니다.\n" +
                            "그렇지만 원래부터 불편하고 어려운 것은 없습니다.\n" +
                            "낯설지 않게 소리축제를 통해 계속 만나고 접해 보시길 바랍니다. 그러다 보면, 우리의 전통도, 세계 각 나라의 민속음악도 우리 곁으로 바짝 다가와 있는 순간이 있을 것입니다.\n" +
                            "그것이 우리가 지금 존재하는 이유, 그리고 앞으로도 그 존재의 이유를 확인하고 미래로 향하는 길일 것입니다.\n" +
                            "전통은 곧 미래입니다.\n" +
                            "소리축제에서 미래를 만나시기 바랍니다.\n";
                    Intent intent =new Intent(getApplicationContext(), after_jeonju_festival.class);
                    startActivity(intent);
                }else if(position==2)
                {
                    title="전주 대사습놀이";

                    address="전라북도 전주시 완산구 태조로 44";
                    location1=	35.8128303;
                    location2=	127.1571308;

                    homepage ="http://www.jjdss.or.kr/";
                    tel = "063-252-6792";
                    date = "2019년 6월 7일 금 ~ 6월 10일 월";
                    explain="조선조 숙종 때의 마상궁술대회 및 영조대의 물놀이와 판소리, 백일장 등 민속 무예놀이를 종합하여 \"사습놀이\"라 합니다.\n" +
                            "영조 8년 지방 재인청(신청)과 가무 대사습청의 설치에 따라 전주에 4개정(군사정, 의방정, 다기정, 진북정)을 두어 최초로 전주에서 대ㅅ사습대회가 베풀어진 뒤\n" +
                            "매년 연례행사로 실시하여 대사습대회에서 선발된 권삼득, 신재호, 송만갑 등 15명의 광대에게 의관, 통정, 검찰, 오위장, 참봉, 선달 등의 벼슬을 \n" +
                            "직접 제수하고 명창칭호를 하사한 바도 있습니다.\n" +
                            "그 후 정조, 순조대까지 계속 벼슬을 전승하여 오다가 외침으로 중단된 이후\n" +
                            "1974년도에 전주에서 전통예술에 뜻이 있는 인사들이 모임을 갖고 추진위원을 결성, 대사습놀이를 부활시켜\n" +
                            "1975년도에 추진위원회 주관으로 5개부문(판소리, 농악, 무용, 시조, 궁도)으로 대화를 시작하였고,\n" +
                            "1977년도에 사단법인 전주대사습놀이보존회 설립등기를 마치고 계속 대회를 주관하여 오다가\n" +
                            "1983년도 부터 판소리명창부, 농악부, 무용부, 기악부, 시조부, 민요부, 가야금병창부, 판소리일반부, 궁도부 등 9개 부문으로 개최\n" +
                            "2010년도에 명고수부 신설로 10개 부분으로 전주대사습놀이 전국대회를 개최하고 있습니다.";
                    Intent intent =new Intent(getApplicationContext(), after_jeonju_festival.class);
                    startActivity(intent);
                }else if(position==3)
                {
                    title="전주 국제영화제";

                    address="전라북도 전주시 덕진구 안골3길 24";
                    location1=		35.84081949999999;
                    location2=127.15764620000004;

                    homepage ="http://www.jiff.or.kr/";
                    tel = "(063)288-5433";
                    date = "2019년 5월 2일 ~ 5월 11일";
                    explain="2000년 출범한 전주국제영화제는 국제영화제의 지형에서 독특한 위치를 점해 왔다. \n" +
                            "전주의 모토는 동시대 영화 예술의 대안적 흐름, 독립, 예술영화의 최전선에 놓인 작품들을 소개하는 것이다. \n" +
                            "전주의 프로그램은 재능 있고 혁신적인 감독의 작품을 통해 영화의 예술적, 기술적, 매체적 진화를 체험할 수 있도록 하는데 주안점을 둔다. \n" +
                            "‘예술을 통한 수익의 추구’라는 하나의 방향으로 줄달음치는 영화산업의 편향성을 극복하기 위해 전주는 ‘취향의 다양성’, ‘새로운 영화 체험’이라는 가치를 전면에 내걸었다. \n" +
                            "미래 영화의 주역이 될 수 있는 재능의 발굴, 창의적인 실험과 독립정신을 지지하며, 전 세계 영화작가들이 만나고 연대하는 기회를 제공한다.\n";
                    Intent intent =new Intent(getApplicationContext(), after_jeonju_festival.class);
                    startActivity(intent);
                }else if(position==4)
                {
                    title="전주 문화재야행";

                    address="전라북도 전주시 완산구 풍남동3가";
                    location1=	35.844182;
                    location2=	127.12927760000002;

                    homepage ="http://www.jeonjunight.com/";
                    tel = "063)232-9937";
                    date = "2019년 9월 21일 토 ~ 9월 22일 일";
                    explain=" 그 곳에 가장 전주다운 모습으로 기억될 문화재 술사의 야심작이 한 상 가득 차려져 있다.\n" +
                            "2019전주문화재야행(夜行)은 지난해 28개 지자체 중 문화재 활용사업 평가에서 “전국 1등, 최우수상”을 수상하면서 “전주의 밤을 가장 전주답게 발현해냈다”라고 평가받는 문화재 대표 활용 프로그램이다.\n" +
                            "전주 8야 프로그램을 진행합니다.";
                    Intent intent =new Intent(getApplicationContext(), after_jeonju_festival.class);
                    startActivity(intent);
                }


            }
        });


    }
}
