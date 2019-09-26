package csejeonju2019.go.kr.insta;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;

public class jijung_cultural_property_list_activity extends AppCompatActivity {
    public static String title;
    public static String designated_number;
    public static String designated_day;
    public static String detail_address;
    public static String detail_explain;
    ProgressDialog progressDlg;
    public static double location1;
    public static double location2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_jijung_culture);

        /*
        ProgressBar progressBar = (ProgressBar)findViewById(R.id.spin_kit);
        Sprite doubleBounce = new DoubleBounce();
        progressBar.setIndeterminateDrawable(doubleBounce);
        doubleBounce.start();
       */


        //이거슨 주황원


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
                        Thread.sleep(12);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                progressDlg.dismiss();
            }
        }.start();

        String[] jijungculture= {"남고사지",
                "지행당",
                "전주부 지도",
                "황강서원",
                "전주 경기전",
                "동고사",
                "인후동 석불입상",
                "승암사 소장 불서",
                "반곡서원",
                "예종대왕 태실 및 비",
                "전라감영지",
                "회안대군묘",
                "전주 경기전 정전",
                "전주 남고산성",
                "학소암",
                "오목대·이목대",
                "전주항교소장 완영책판",
                "문학대",
                "한벽당",
                "조경단",
                "화산서원비",
                "전주항교",
                "전주 경기전 하마비",
                "익산 왕궁리 오층석탑 내 발견유물",
                "극락암 목조 여래좌상",
                "전주항교 대성전",
                "전주 풍패지관",
                "서서학동 석불입상",
                "전주 풍남문",
                "전주 전동성당",
                "조경묘",
                "전주이씨 칠산군파 종중문서",
                "천주교 순교자 묘",
                "천양정",
                "학인당",
                "전주 삼천동 곰솔나무",
                "추천대",
                "동고산성",
                "여래불적도",
                "충신이흥발지려",
                "관성묘",
                "숲정이",
                "전주이씨고림군파 종중문서",
                "전동성당 사제관",
                "조선 태조어진",
                "천고사 석불좌상",
                "이형부인 동래정씨 의복"

        };
        ListView listView=(ListView)findViewById(R.id.mainmenu_jijungculture);

        ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_expandable_list_item_1,jijungculture

        );
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    title="남고사지";
                    designated_number="전라북도 기념물 제 72호";
                    designated_day="1985.08.16";
                    location1=	35.7996931;
                    location2=	127.15898340000001;
                    detail_address="전라북도 전주시 완산구 남고산성1길 53-88";
                    detail_explain="남고사는 보덕화상(普德和尙)의 수제자인 명덕화상(明德和尙)이 창건한 사찰로서 원래는 남고연국사(南固燕國寺)라 하였으나 후일에 남고사라 했는데 언제부터 칭하게 되었는지는 알 수 없다. 남고사는 고려시대까지 교종계통의 사찰로 내려오다가 조선조 세종 때 모든 종파의 불교가 교. 선 양종(敎. 禪 兩宗)으로 통합되어 48개의 사찰만 공인하게 되었을 때 탈락되어 사세가 크게 위축된 것으로 추정된다. 임진왜란 이후 선종이 크게 신장하자 선종계(禪宗系)의 사찰이 되었다. 남고사지는 현재 남고사 대웅전 우측(서쪽) 전방의 건물이 있는 곳이다. 현 건물의 건립연대는 약 100년 전 내외로 추정되며 석가모니불을 주불로 우측에 약사여래불(藥師如來佛)이 봉안되어 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                } else if (i == 1) {
                    title="지행당";
                    designated_number="전라북도 기념물 제 7호";
                    designated_day="1973.06.23";
                    location1=	35.8692253;
                    location2=	127.15486420000002;
                    detail_address="전북 전주시 덕진구 초당길 60-23";
                    detail_explain="지행당은 조선 영조 8년(1732)에 당시의 학덕이 높고 효행이 지극한 강서린(姜瑞麟)을 추모하기 위해 세운 것으로써 그의 호를 지행당이라 사(賜)하고 관비로 건립한 것이다. [지행당]이라는 현판은 당시 공조판서 이익회(李翊會)가 쓴 것이며 규모는 정면 3칸 측면 2칸의 팔작지붕으로 된 한옥 기와집이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    title="전주부 지도";
                    designated_number="전라북도 유형문화재 제 80호";
                    designated_day="1997.12.31";
                    location1=	35.844182;
                    location2=	127.12927760000002;
                    detail_address="전라북도 전주시 덕진구 백제대로 567";
                    detail_explain="전주부지도는 전주부(全州府) 성내(城內)를 중심으로 부내의 전역을 그린 대형지도로써 4폭의 병풍식으로 되어 있으며 성의 표시와 성문 그리고 관아의 배치.향교.서원.수목 등이 그려져있고 부성(府城) 밖은 산천의 지형이 고식(古式) 표현에 의하여 그려져 있으며 각면의 이름을 써붙이고 있다. 귀퉁이에는 전주부의 사방거리와 이웃 군현으로부터의 거리를 표시하고 있고 부내 4면의 원호(元戶) 3783호 부외(府外) 각면(各面)의 원호(元戶) 12215호 등 총 31개면에 원호 15998호를 명기하고 있다.";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                }else if (i == 3) {
                    title="황강서원";
                    designated_number="전라북도 문화재자료 제 12호";
                    designated_day="1984.04.01";
                    location1=	35.829055;
                    location2=	127.10323459999995;
                    detail_address="전북 전주시 완산구 황강서원5길 8-7 ";
                    detail_explain="이 서원은 원래 전주 곤지산(坤止山) 아래에 있었으나 조선 선조 때 임진왜란으로 말미암아 불타버렸다. 그 후 정조 5년에 중건되었으나 고종 5년(1868) 서원철폐령에 의해 철거되었던 것을 광무 2년(1898)에 현위치로 이전 중건하였다. 이 곳은 본 서원의 주벽인 황강(黃岡) 이문정(李文挺)의 유허지(遺墟地)이다. 그는 나라가 숭불(崇佛)하여 학교를 폐하니 공(公)이 항의하는 소를 올려서 학교를 부활하였다. 고려 말 공민왕 때 정당문학(正堂文學)의 벼슬을 지냈으며 그는 고향으로 돌아와 문학대(文學臺)라는 강당을 건립하여 후배를 양성하기도 하였다. 현재 이 곳에는 황강(黃岡) 이문정(李文挺)을 주벽으로 하여 양후공(良厚公) 이백유(李伯由) 추탄(楸灘) 이경동(李瓊仝) 정간공(貞簡公) 한재 이목(寒齋 李穆) 금곡(金谷) 이덕린(李德린) 죽계(竹溪) 유인홍(柳仁洪) 졸암(拙菴) 강해우(姜海遇)를 배향하고 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 4) {
                    title="전주 경기전";
                    designated_number="사적 제 339호";
                    designated_day="1991.01.09";
                    location1=	35.815133;
                    location2=	127.15019259999997;
                    detail_address="전북 전주시 완산구 풍남동3가 102번지";
                    detail_explain="전주한옥마을의 상징인 경기전. 경기전은 조선이 건국되자 태조 어진을 모시기 위해 태종 10년(1410년)에 지어진 건물이다. 이후 경기전은 선조 30년(1597년) 정유재란 때 소실되었다가광해군 6년(1614년) 11월에 중건됐다. 경기전에는 두 개의 숨은 문화코드가 있는데 하나는 경기전 정문 밖 도로가에 있는 하마비요 또 하나는 진전의 거북이 이야기이다. 하마비에는“지차개하마 잡인무득입(至此皆下馬雜人毋得入)라고 쓰여져 있다. 이곳에 이르는 자는 계급의 높고 낮음 신분의 귀천을 떠나 모두 말에서 내리고 잡인들은 출입을 금한다는 뜻이다. 조선왕조의 상징인 태조어진을 봉안한 곳이어서 이 수문장의 위력은 대단했을 것이라 짐작된다. 진전에는 거북이가 붙어 있는데 경기전을 완성한 목공이 그 영원함을 위해 지붕에 암수 두 마리의 거북이를 올려놓았던것으로 전해지고 있다. 거북이가 물에서 살고 진전이 목조건축인 점에서 화재막이용 거북이일 가능성이 높다고 보고 있다. 경기전에서 보이는 앞산 승암산이 화산이라는 점에서 더욱 그런 생각이 든다고 한다. 가을 풍경이 특히 아름다운 경기전 경기전은 주변 경관이 수려해 역사 드라마와 영화 촬영지로 주목받는 곳이기도 하다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 5) {
                    title="동고사";
                    designated_number="전라북도 문화재자료 제 2호";
                    designated_day="1984.04.01";
                    location1=		35.8103537;
                    location2=	127.16620599999999;
                    detail_address="전라북도 전주시 완산구 교동 산10-1";
                    detail_explain="이 절은 기린봉 기슭에 있었다고 전해오고 있으나 확실한 창건연대는 알 수 없다. 다만 후백제 견훤이 이 곳에 도읍을 정하기 이전 즉 신라 경문왕(景文王) 때 도선국사(道詵國師)가 창건하고 그 후 허주화상(虛舟和尙)이 중건했다고 하는 설이 있으며 전주의 동쪽에 위치하고 있다 하여 동고사라 칭하였다 한다.동고사는 임진왜란 때 소실되었으며 그 후 현종 10년(1844) 허주대선사(虛舟大禪師)가 현 위치에 중창한 후 소실되었던 동고사의 이름을 따서 동고사라 하였다. 1946년 영담(暎潭) 김용욱(金容郁)이 주지로 취임하여 대웅전 요사 및 부속건물을 건립하여 오늘에 이르고 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 6) {
                    title="인후동 석불입상";
                    designated_number="전라북도 문화재자료 제 10호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 덕진구 견훤로 177";
                    location1=		35.8275578;
                    location2=	127.15972650000003;
                    detail_explain="이 석불은 1920년 주지 김유희(金裕喜)가 재건한 용화사(龍華寺)에 보존되어 있다. 고려말에 제작된 것으로 추정되며 하신부는 땅속에 묻고 바닥을 시멘트로 발라 버렸다. 현재 높이는 270m 두장(頭長) 65cm 신폭(身幅) 97cm 신후(身厚) 40cm이다. 두부(頭部)는 큰 편이며 볼과 턱이 중후하고 이마에는 백호(白虎)를 새겼고 머리에 육계는 없다. 귀는 긴 편이고 목은 삼도가 새겨졌으나 절단되어 시멘트로 접합시켰다. 오른손은 굽혀 들어 가슴 앞에서 손바닥을 안으로 하고 왼손은 가슴 높이에서 굽혀 손바닥을 밖으로 하여 여원시무외인(與願施無畏印)을 짓고 있다. 왼쪽 어깨에서 흐른 옷주름은 왼쪽 팔에서 밑으로 드리우고 있는데 하반신은 통의(筒衣)의 주름을 새겼을 뿐이다. 오른쪽 귀가 훼손된 것은 임진왜란 때 가등청정(加藤淸正)이 칼로 쳤다는 전설이 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 7) {
                    title="승암사 소장 불서";
                    designated_number="전라북도 유형문화재 제209호";
                    designated_day="2006.06.16";
                    location1=	35.8009943;
                    location2=	127.09333049999998;
                    detail_explain="승암사는 신라 헌강왕 때 도선(道詵)이 창건한 고찰로 조선시대에는 대표적인 불서 간행 사찰이었다. 근세에는 해안 만응 대종사들이 주석하면서 한벽선원 승암강원 등을 개설하여 이 지역 불교계의 학풍을 크게 진작시켰다. 이곳에 소장되어 있는 《묘법연화경》 등 3권의 불서는 부처가 세상에 나타난 근본의 뜻을 밝힌 경전으로 1443년에 효령대군 등 많은 왕실의 종친들이 세종대왕의 장수와 태종대왕의 극락왕생을 빌기 위하여 간행하였다. 현존하는 판본이 매우 드물어 자료적 가치가 크다.";
                    detail_address="전라북도 전주시 완산구 쑥고개로 259";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 8) {
                    title="반곡서원";
                    designated_number="전라북도 문화재자료 제 11호";
                    designated_day="1984.04.01";
                    location1=	35.8101921;
                    location2=	127.15622370000006;
                    detail_address="전라북도 전주시 완산구 동서학동 2가 210";
                    detail_explain="창건년대는 정확히 알 수 없으나 고종(高宗) 5년(1868)에 철거 되었다가 그 후 고종 15년(1878)에 중건되었다. 이 곳에는 문정공(文正公) 팔송(八松) 윤황(尹煌)을 주벽으로 시습제(時習濟) 이영선(李榮先) 육곡(六谷) 서필원(徐必遠)을 배향하고 있다. 윤황은 병자호란 당시 척화(斥和)를 상소한 사람이며 이영선은 문원공(文元公) 김사계(金沙溪)에게서 수학하였으며 서필원은 판서에까지 이르러 당시 제현(諸賢)들과 함께 문장으로 이름을 떨쳤다. 현재 이곳에는 사당(祠堂)과 강당(講堂)이 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 9) {
                    title="예종대왕 태실 및 비";
                    designated_number="전라북도 민속자료 제 26호";
                    designated_day="1986.09.08";
                    detail_address="전라북도 전주시 완산구 태조로 44 ";
                    location1=			35.8153146;
                    location2=	127.14975690000006;
                    detail_explain="완주군 구이면에 있던 것을 1970년 경기전으로 옮겼다. 이 태실은 부도와 같은 형태로 전체 높이는 2.35미터이다. 예종대왕의 태를 묻은 것으로 비석전면에 [睿宗大王胎室]이라 새기고 뒷면에는 [万曆六年十月初二日建]이라 보인다. 선조 12년(1578)에 세웠는데 그후 156년이 지난 영조 10년(1734)에 다시 세웠다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 10) {
                    title="전라감영지";
                    designated_number="전라북도 기념물 제 107호";
                    designated_day="2000.09.08";
                    detail_address="전라북도 전주시 완산구 전라감영로 57 ";
                    location1=			35.8162751;
                    location2=	127.14590010000006;
                    detail_explain="이 일대는 조선시대에 전라감영이 있던 자리이다. 전라감영은 지금의 전라북도와 전라남도 그리고 제주도 등을 모두 관할하였으며 감사가 총책임자였다. 조선초기에 지은 전라감영은 정문인 포정문(布政門) 감사 집무실인 선화당(宣化堂) 감사의 주거 공간인 연신당(燕申堂) 등 모두 40 여 채의 건물을 거느린 웅장한 규모였다. 그러나 대부분의 건물이 근대화 과정에서 사라지거나 사고로 인해 불타버렸다. 이 곳은 조선시대 전라도 행정의 중심지로서 뿐만 아니라 1894년 동학농민혁명 당시 농민군 자치 기구인 집강소의 총본부 대도소(大都所)가 설치된 선화당이 있던 자리로서 역사적 의미가 매우 큰 곳이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 11) {
                    title="회안대군묘";
                    designated_number="전라북도 기념물 제 123호";
                    designated_day="2005.12.16";
                    detail_address="덕진구 금상동 59-5 ";
                    location1=			35.8438407;
                    location2=		127.19890559999999;
                    detail_explain="회안대군묘는 전주시 금상동 법사산에 위치한다. 묘의 형태는 조선시대의 일반적 형태와 달리 태인의 정극인 묘처럼 부부묘가 세로로 되어 있는데 아래의 묘가 부인의 묘이며 위의 묘가 회안대군 이방간의 묘이다. 이 묘자리가 군왕지지(君王之地)라 하여 지기가 흐르는 곳에 뜸을 떠버렸다는 것은 유명한 이야기다. 지금도 뜸을 뜬 자리가 남아 있다. 회안대군은 태조 이성계의 넷째아들로 그 동생 태종 방원과 함께 자웅을 겨루었던 조선초 인물이다. 방간은 방원에게 패배함으로서 평생 유배의 길을 걸었는데 그는 박포와 달리 죽음은 면했지만 태종의 끝없는 견제로 한 곳에 오래 머물지 못하고 유배지를 옮겨다녔다. 이방간은 조선초 정치사의 한 주역일 뿐만 아니라 전주 지역사와 관련 관련해서도 주목된다. 전주는 조선왕조의 발상지로서 역사문화적 특질과 유산을 지니고 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 12) {
                    title="전주 경기전 정전";
                    designated_number="보물 제 1578호";
                    designated_day="2008.12.01";
                    detail_address="전북 전주시 완산구 풍남동3가 102번지";
                    location1=	35.815133;
                    location2=	127.15019259999997;
                    detail_explain="사적 제339호의 전주 경기전은 조선 왕조를 개국시킨 태조 이성계의 어진을 봉안한 곳이다. 태조 어진을 모신 곳을 어용전 태조진전 등으로 명명하던 것을 1442년(세종24년)에 경기전이라고 명명하였다. 1410년에 창건된 경기전은 1597년 정유재란 때 소실되고 1614년에 중건했다. 1872년 태조 어진을 새롭게 모사하여 봉안하면서(태조어진 국보 제317호) 경기전의 전반적인 보수가 이루어졌다. 정전은 다포계 양식으로 외3출목 내3출목이고 5량 구조의 맞배 겹처마 지붕이다. 살미의 쇠서가 발달되어 있고 내부에서는 초각 처리되어 안정된 조선 중기의 형식이 반영되어 있다. 배례청은 이익공을 가진 익공계 양식으로 겹처마 맞배지붕이며 배례청의 박공면은 정전의 정면 모습이 된다. 정전과 배례청은 화강암 원형 초석 위에 민흘림의 원기둥을 세웠다. 내부의 5.8m나 되는 2개의 고주는 종보를 직접 받고 있으며 양측면의 기둥도 대들보를 받는 고주로 되어 측부재 구조가 간결하고 견고하게 짜여있다. 포작의 내부 살미 조각과 보아지 및 종도리를 받는 파련 대공의 섬세한 조각과 우물천정 단청 등의 의장이 화려한 편으로 다른 유교 건축과 차별화된 권위성을 볼 수 있다. 구조 부재들의 이음과 맞춤이 정확하며 견고하고 조선 중기의 전통 건축 기법이 잘 전수된 안정된 구조와 부재의 조형 비례는 건축적 품위를 돋보여준다. 조선왕조를 개국한 태조 어진이 봉안된 정전 기능과 품위에 기준한 내신문 내의 신로 및 향로의 엄격한 격식 그리고 정전과 배례청 평면 조합 및 어방구조 등이 보물로서의 문화재 가치가 인정된다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 13) {
                    title="전주 남고산성";
                    designated_number="사적 제 294호";
                    designated_day="1981.12.10";
                    detail_address="전북 전주시 완산구 동서학동 산228번지";
                    location1=	35.7964539;
                    location2=	127.15513320000002;
                    detail_explain="서기 900년 경 후백제 견훤왕이 전주에 도읍하면서 축성한 산성으로 당초 성둘레가 3000여m 였다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 14) {
                    title="학소암";
                    designated_number="전라북도 문화재자료 제 3호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 완산구 평화동2가 산51번지";
                    location1=	35.7867;
                    location2=127.1463483;
                    detail_explain="학소암은 조선 정조 10년(1786) 광혜화상(廣惠和尙)이 창건하고 춘곡화상(春谷和尙)과 이만선(李萬善)씨에 의해 중수되었다. 자음전(慈蔭殿)은 익공계 구조의 맞배지붕으로써 정면 3간 측면 1간의 소규모 건물이다. 내부의 공포는 전면이 연봉각(蓮峯刻)으로 처리되었지만 후면은 초익공의 형식이고 기둥은 각주(角柱)로 되어 있으며 홑처마 형식인데 이것으로 보아 후면보다 전면의 의장처리에 더치중하였음을 알 수 있다. 정면의 문은 어칸과 협칸에 2분합(分閤)의 문을 달았고 창살의 형식과 천장의 구조는 단순하며 본래 연등천장이었지만 최근에 반자를 붙였으며 마루도 온돌방으로 개조하였다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 15) {
                    title="오목대·이목대";
                    designated_number="전라북도 기념물 제 16호";
                    designated_day="1974.09.24";
                    detail_address="없음";
                    location1=35.8146408;
                    location2=127.15492289999997;
                    detail_explain="한옥마을 관광안내소에서 태조로를 따라 오른쪽으로 보이는 곳이 오목대이며 오목대와 연결되어 있는 구름다리를 따라 내려가면 이목대가 나온다. 이성계가 남원 운봉 황산에서 발호하던 왜구 아지발도(阿只拔道)의 무리를 정벌하고 승전고를 울리며 개선하여 개경으로 돌아갈 때 전주의 이곳에서 야연(野宴)을 베풀었다는 곳이다. 여기에서 이성계는 한나라를 창업한 유방이 불렀다는 대풍가를 읊었다. 즉 자신의 새로운 나라를 세우겠다는 야심을 넌지시 비쳤다. 그러자 이를 모를리 없는 종사관 정몽주가 자리를 박차고 일어나 홀로 말을 달려 남고산성 만경대에 올라 비분강개한 마음을 시로 읊었다. 현재만경대에는 그 시가 새겨져 있다. 오목대와 이목대에는 고종의 친필로 새긴 비석이 세워져 있고 비각이 건립되어 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 16) {
                    title="전주향교소장 완영책판";
                    designated_number="전랍구도 유형문화재 제 204호";
                    designated_day="호\t2005.12.16";
                    detail_address="전라북도 전주시 덕진구 백제대로 567";
                    location1=35.844182;
                    location2=	127.12927760000002;
                    detail_explain="이 완영책판은 원래 전라감영에서 서적을 간행할 때 사용하였던 것으로 전라감영 내에 보존․관리되고 있었으나 1899년 당시 전라관찰사이었던 조한국의 명으로 전라감영 내에 분산되어 있던 책판을 모아 전주향교에 보존하게 되었다. 1920년대에 책고를 지어 관리해 오다가 1987년 전주시에서 장판각을 건립하고 목재로 서가를 만들어 오늘에 이르고 있다. 장판각에 소장된 완영책판은 총 5059개에 9830면이 서각되어 있으며 서각되지 않은 면수는 288면이다. 이들 목판의 책판 종류는 자치통감강목(1775개) 동의보감(151개) 주자대전(1471개) 율곡전서(491개) 성리대전(576개) 증수무원록언해(53개) 사기(484개) 사략(56개) 호남삼강록(1개) 주서백선(1개) 등 19종이다. 원래는 1987년에 지어진 전주향교내의 장판각 건물에 목재의 서가를 설치하여 보존하고 있었으나 현재는 전북대박물관 수장고에 보존․관리되고 있다. 재질은 자작나무과에 속하는 목재로 구성되어 있는데 대체로 가로 40-70cm 세로 20-30cm 두께 2-5cm 이내의 판목으로 양면에 서각되어 있으며 마구리의 경우 92.2%가 결락되어 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 17) {
                    title="문학대";
                    designated_number="전라북도 기념물 제 24호";
                    designated_day="1976.04.02";
                    detail_address="전라북도 전주시 완산구 황강서원5길 8-7 ";
                    location1=	35.829055;
                    location2=127.10323459999995;
                    detail_explain="문학대는 황강(黃岡) 이문정(李文挺)이 공민왕(恭愍王) 때 불교의 숭상으로 윤기(倫紀)가 문란하게 됨을 개탄하여 수차 상소하여 이를 바로 잡았다 하며 그 후 귀향하여 전주시 마전 부락앞 삼천변(三川邊)에 집을 짓고 나물과 낚시로 여생을 보냈다. 문학대는 임진왜란 때 소실되어 집터만 남아있던 것을 순조 24년(1824)에 이르러 여러 후손들이 중건하였다. 1977년에 현 위치에 목조와즙평가(木造瓦葺平家)에 마루를 놓고 가운데에 온돌방 하나를 만들었다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 18) {
                    title="한벽당";
                    designated_number="전라북도 유형문화재 제 15호";
                    designated_day="1971.12.02";
                    detail_address="전북 전주시 완산구 기린대로 2 ";
                    location1=35.8118759;
                    location2=127.16088209999998;
                    detail_explain="한벽당은 승암산 기슭인 발산 머리의 절벽을 깎아 세운 누각으로써 한벽청연이라 하여 전주 8경의 하나로 꼽았으며 그 서쪽 일대는 자만동 또는 주류동이라 불리었다. 한벽당은 우리고장 뿐만 아니라 호남의 명승으로 알려져 시인 묵객들이 쉴새 없이 찾았던 곳으로서 제영한 시가 많이 전해 오고 있으며 <>에는 이경전 이경여 이기발 김진상 등 19명의 저명한 인사들의 시문이 담겨 있어 그 시절의 풍류를 살 필 수 있다. 한벽당이라 처음 불리게 된 연대는 확실치는 않으나 당초에는 월당루로 불린 것 같은데 한벽이란 어귀는 벽옥한류란 글귀에서 따온 것으로서 후세 사람이 붙인 것으로 추정된다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 19) {
                    title="조경단";
                    designated_number="전라북도 기념물 제 3호";
                    designated_day="1973.06.23";
                    detail_address="전북 전주시 덕진구 덕진동1가 산28번지";
                    location1=	35.8515074;
                    location2=127.136347;
                    detail_explain="조경단은 광무 3년(1899) 5월에 이 곳에 단을 쌓고 비를 세워 전주이씨 시조의 묘소를 정하고 [대한조경단(大韓肇慶壇)] 이라 하였다. 조경단은 장방형의 돌을 사용하여 담을 쌓았으며 동. 서. 남. 북에 문이 있다. 서향의 문과 일직선상에 대문을 남향의 문에서 20미터 떨어진 곳에 비석이 있다. 이 비석은 대리석이며 너비 180센티미터 두께 30센티미터 높이 202센티미터이다. 앞면에는 고종의 어필로 [대한조경단]이라고 새겨져 있다. 비각은 한 변이7.2미터의 정방형의 3칸 팔각지붕으로 되어있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 20) {
                    title="화산서원비";
                    designated_number="전라북도 문화재자료 제 4호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 완산구 중화산동 산33-2번지";
                    location1=	35.8240417;
                    location2=127.12596610000003;
                    detail_explain="화산서원은 조선 선조 13년(1580) 전주사람들이 건립하였으며 이언적(李彦迪) 송인수(宋麟壽) 등을 봉사(奉祀)하고 있다. 전북지방에서는 최고(最古)의 서원으로 이 자리에 향교가 있었으나 현재는 교동으로 이전하였으며 영조·대원군이 많은 서원을 철폐 정비한 까닭에 서원 자리에는 비를 세워 그 흔적을 후세인에게 전하고 있다. 비문은 송시열(宋時烈)이 찬(撰)하였다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 21) {
                    title="전주향교";
                    designated_number="사적 제 379호";
                    designated_day="1992.12.23";
                    detail_address="전북 전주시 완산구 교동 26-3번지";
                    location1=	35.8128303;
                    location2=	127.1571308;
                    detail_explain="전주향교는 고려시대에 창건되었다고 전해지고 있으며 현재 건물은 조선 선조 때 건립되었다고 한다. 대성전 중앙에는 공자를 비롯하여 안자 자사 증자 맹자 등 다섯 성인의 위패가 모셔져 있다. 전주향교의 현존 건물의 배치형태를 보면 대성전을 중심으로 좌우에 동.서무가 있고 정면에 일월문 그앞에 만화루가 있으며 대성전 뒷담을 사이로 명륜당이 있고 서쪽으로 장서각 계성사 양사재 와 사마재 그리고 주위에 교직사 등 여러 건물이 있다. 이곳 배향위패는 서울의 성균관과 같이 대성전에는 공자를 주벽으로 사성 과 십철 송대 육현을 배향하고 있으며 동서 양무에는 공자의 제자를 비롯한 중국의 유학자 7인과 우리나라 18현 등 총 25인을 배향하고 있다. 특히 계성사에는 5성(오성)의 위패가 있으며 대성전은 효종4년(1653)에 부윤 심택과 판관 한진기가 중건하였는데 이기발이 중건기를 남겼다. 명륜당은 광무 8년(1904)에 군수 권직상이 중수하였다. 또한 대성전은 융희 원년(1907)에 당시 군수였던 이중익이 중수하여 현재에 이르고 있다. 향교에는 다섯 그루의 크고 오래된 은행나무가 있는데 향교 내 서문 앞 은행나무 수령이 400년이나 된다. 향교에 은행나무를 심은 뜻이 은행나무가 벌레를 타지 않듯 유생들도 건전하게 자라 바른 사람이 되라는 의미를 담았다고 한다. 재미있는 사실은 향교 내 대성전 우측 은행나무는“수컷이 암컷으로 변하여 은행이 열게 되었다”하여 자웅나무라고 부르는데 이 은행을 따서 지금도 제사를 지내고 있으며 또한 일월문 앞 250년 된 은행나무는 은행을 따서 공을 빌면 과거에 급제한다는 전설이 내려져 오고 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 22) {
                    title="전주 경기전 하마비";
                    designated_number="전라북도 유형문화재 제 222호";
                    designated_day="2013.11.15";
                    detail_address="전라북도 전주시 완산구 태조로 44";
                    location1=35.8153146;
                    location2=	127.14975690000006;
                    detail_explain="경기전 하마비(慶基殿 下馬碑)는 임진왜란 후 경기전이 중건되던 1614년(광해군 6)에 처음 세워졌으며 1856년(철종 7)에 중각(重刻)되었다. 비석에는 ‘지차개하마 잡인무득입(至此皆下馬 雜人毋得入)’이라고 새겨 계급의 높고 낮음 신분의 귀천을 떠나 모두 말에서 내리고 잡인들의 출입을 금한다는 내용이 담겨져 있다. 경기전 하마비는 여느 하마비와는 다르게 판석위에 비를 올리고 그 판석을 두 마리의 사자(혹은 해태)가 등으로 받치고 있는 특이한 형태로 단지 하마(下馬)의 의미로서만이 아닌 경기전 수호의 의미를 지니고 있는 것으로 판단된다. 이러한 비석의 형태는 다른 곳에서 보기 힘든 특이한 형태여서 조형적인 가치 뿐만 아니라 내용적인 측면에서도 경기전이 어떤 곳인가를 간접적으로 보여주는 상징물이기도 하다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 23) {
                    title="익산 왕궁리 오층석탑 내 발견유물";
                    designated_number="국보 제 123호";
                    designated_day="1966.07.26";
                    detail_address="전라북도 전주시 완산구 쑥고개로 249";
                    location1=	35.8010305;
                    location2=127.09013709999999;
                    detail_explain="이 유물은 1965년 왕궁리 오층석탑을 해체 수리할 때 제 1층 지붕 윗면 중앙에 장치된 사각형 모양의 홈 안에서 발견된 것으로 금제금강경판․금동사리함․금동불상․사리병 등이다. 이들 유물 가운데 가장 주목되는 유물은 순금판으로 만든 금강경판으로 순금판 19장에 각각 17행의 금강경문이 새겨져 있다. 사리병은 녹색의 유리병으로 곡선을 매우 기품 있게 나타낸 작품이다.사리장치를 안치했던 금으로 만든 사리함은 뚜껑 위에 반쯤 핀 연꽃 봉오리를 장식했다. 구리로 만든 간소한 형식의 좀더 큰그릇은 사리를 담은 그릇을 안에 넣어 보호하기 위한 것이다. 금동으로 만든 불상에는 덩굴 풀 무늬와 불꽃무늬가 장식되어 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 24) {
                    title="극락암 목조 여래좌상";
                    designated_number="전라북도 문화재자료 제 151호";
                    designated_day="2000.03.31";
                    detail_address="전북 전주시 덕진구 우아동1가 산3번지";
                    location1=35.8287275;
                    location2=127.18058889999998;
                    detail_explain="이 불상은 50여 년 전부터 극락암에 보존되어 있었던 석가여래상으로 근래 새로 금칠하여 이곳에 봉안하고 있다. 고개를 앞으로 숙인 채 책상다리를 하고 앉아 있는 모습인데 단정한 신체와 안정된 자세 등 조선후기 불상의 특징을 보여준다. 얼굴은 사각형에 가까우면서도 온화한 인상이다. 이목구비 역시 단아한데 가늘고 길게 뜬 눈 아담한 코 단정하게 다문 입 짧은 턱 등이 돋보인다. 옷차림새는 두 어깨를 모두 가린 형식을 취하고 있다. 이 불상은 양식적 특징으로 보아 17세기경의 작품으로 보인다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 25) {
                    title="전주향교 대성전";
                    designated_number="전라북도 유형문화재 제 7호";
                    designated_day="1971.12.02";
                    detail_address="전북 전주시 완산구 교동 26-3번지";
                    location1=	35.8128303;
                    location2=127.1571308;
                    detail_explain="대성전은 공자를 모신 사당이다. 유교를 통치이념으로 삼았던 조선시대에는 향교에 공자를 모신 사당을 두고 유학을 장려했다. 이 대성전은 효종 4년(1653)에 다시 세우고 대한제국 융희 원년(1907)에 다시 고쳐 오늘에 이르고 있다. 대성전에는 공자의 위패를 가운데 모시고 동․서쪽으로 맹자 등 네 성인 공자의 제자 열 사람 주자 등 중국 송나라 때 유학자 여섯 사람을 함께 모셨다. 동무․서무에는 신라시대 설총을 비롯하여 중국과 우리 나라 유학자 분들의 위패를 모시고 있다. 향교에서는 매달 음력 초하루와 보름에 사당에 향불을 피워 올리고 매년 봄․가을에는 석전대제(釋典大祭)를 지냈다. 관청의 후원을 받아 향교의 선비들이 주관하여 치렀던 이 제사는 공자의 뜻을 기리는 큰 행사이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 26) {
                    title="전주 풍패지관";
                    designated_number="보물 제 583호";
                    designated_day="1975.03.31";
                    detail_address="전북 전주시 완산구 중앙동3가 1번지";
                    location1=	35.8186358;
                    location2=127.14528389999998;
                    detail_explain="전주 풍패지관은 조선초 전주부성을 창건할 때 같이 지은것으로 추정된다. 그 뒤 성종3년(1473)에 전주 부윤(府尹) 조근(趙瑾)이 전주사고(全州史庫)를 창설할 때 남은 재력으로 객사를 개축했다는 기록이 있다. 이곳은 대청 중앙 북쪽 벽의 감실에 [闕]자가 새겨진 전패(殿牌 - 위패)를 모시고 국왕에 대하여 예(禮)를 행하던 곳이며 조정의 칙사가 오면 이 곳에 유숙하면서 교지(敎旨)를 전하기도 하였다. 또한 이성계 태조의 출생지에 경영된 객사라 해서 고사에서 따 풍패지관이라고 편액했으며 중앙에 주관이 있고 좌우에 동익헌·서익헌이 있고 수직사로 구성되어있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 27) {
                    title="서서학동 석불입상";
                    designated_number="전라북도 문화재자료 제 9호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 완산구 석불3길 19";
                    location1=35.8012817;
                    location2=127.14791719999994;
                    detail_explain="이 석상은 단판(單瓣) 16엽(葉)의 연화조대(蓮花座臺) 위에 세워진 여래입상(如來立像)이다. 통견의(通肩衣)를 걸치고 옷주름은 양어깨에서 가슴과 양팔에 곡선으로 흘러내려 있으며 옷소매는 길게 드리워져 있고 양다리에도 옷주름이 새겨져 있다. 오른손은 아래로 내리고 왼손은 굽혔는데 두 손 부분은 후세에 끼운 것이지만 원래는 항마촉지인(降魔觸地印)을 짓고 있었다. 머리 위에는 낮은 육계가 있고 목에는 삼도(三道)를 새겼다. 좌대는 타원형의 16판복연문(瓣伏蓮紋)을 새겼고 윗면에 1단의 괴임이 있는데 그 이하는 땅에 묻혀 알 수 없다. 높이 2.60m 어깨와 밑너비는 모두 0.90m 좌대 너비 1.30m이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 28) {
                    title="전주 풍남문";
                    designated_number="보물 제 308호";
                    designated_day="1959.12.18";
                    detail_address="전북 전주시 완산구 풍남문3길 1";
                    location1=	35.813494;
                    location2=127.1475931;
                    detail_explain="전주를 상징하는 전주 풍남문은 원래 전주부성의 4대문 가운데 남문으로 고려 공양왕 원년인 서기 1389년에 전라관찰사 최유경이 전주부성과 함께 창건했다. 건축양태는 조선 후기의 문루 형식으로 비교적 잘 보존되어 있는 형태로 지목되고 있다. 원래 도성이나 읍성 산성 등은 으레 성문이 있기 마련이고 그 위에 문루를 세우는 것이 중요한 형식이자 관례로 되어 있다. 그러나 조선조 영조 43년(1767)에 당시 성내를 휩쓴 정해년 대화로 불타버려 영조 44년(1768) 전라관찰사 홍낙인이 증건했지만 종전처럼 3층루가 아닌 현 모습으로 수축하여 이때부터 풍남문이라 불렀다. 1905년 조선통감부의 폐성령에 의해 전주부성 4대문중 풍남문만 제외한 3대문이 동시에 철거되는 수난을 겪었다. 1978년 문루 보수과정에서 옹성의 기단이 풍남문 홍예문으로부터 12m 지점에서 발굴됨에 따라 이 기단대로 연장 97.5m의 여담쌓기와 치석 6856개로서 옹성 1933㎡를 축조하여 복원하였다. 전주 풍남문의 누대를 겸한 석문은 성벽을 따라 안쪽으로 내밀게 구형을 쌓고 이 석축 중앙에 통로를 뚫고 통로 내외면에 무지개끝 석물을 쌓아 윗면에 문루를 설치한 것이다. 이 누대는 너비는 동서 23.6m 남북 10.6m이며 높이는 17.2m에 이른다. 문루의 서편에는 종각이 있고 좌편에는 포루가 있었다. 문루는 2층의 팔각지붕인데 정면 측면이 모두 3칸이고 윗층의 정면은 3칸이나 측면은 1칸이다. 1980년 종각과 포루 전주 풍남문 바깥쪽 출성인 옹성을 복원하여 현재의 모습을 찾았다. 전주 풍남문은 전주사람들에게는 전주를 대표하는 일종의 상징물이다. 전주 풍남문에는 풍남문이라는 고유의 이름 외에 \"명견루\"라는 별호가 있다. 전주 풍남문을 중심으로 전주한옥마을과 남부시장이 연결된다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 29) {
                    title="전주 전동성당";
                    designated_number="사적 제 288호";
                    designated_day="1981.09.25";
                    detail_address="전북 전주시 완산구 태조로 51";
                    location1=35.8134083;
                    location2=	127.149495;
                    detail_explain="한옥마을 초입에 있는 전동성당은 소박하고 아담하다. 전동성당은 한국 천주교회 최초의 순교자인 윤지충과 권상연이 1791년 신해박해 때에 처형당한 풍남문(豊南門)이 있던 바로 그 자리에 건립됐다. 1907년부터 1914년에 걸쳐 세워진 전동성당은 순교지를 보존하고 있는 신앙의 요람이다. 처형지인 풍남문 성벽을 헐어 낸 돌로 성당 주춧돌을 세웠다고 한다. 호남 최초의 로마네스크 양식의 서양식 건물로 순교지를 알리는 머릿돌과 순교자 권상연과 윤지충 유중철·이순이 동정 부부를 채색화한 스테인드글라스가 눈길을 끈다. 곡선미를 최대로 살린 로마네스크 및 비잔틴 양식의 아름다움과 웅장함이 동양에서 제일가는 성당건물 중의 하나이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 30) {
                    title="조경묘";
                    designated_number="전라북도 유형문화재 제 16호";
                    designated_day="1973.06.23";
                    detail_address="전라북도 전주시 완산구 태조로 44";
                    location1=35.8153146;
                    location2=127.14975690000006;
                    detail_explain="조경묘는 전주이씨의 시조 이한공과 시조비의 위패를 봉안한 곳으로써 영조 47년(1771)에 건립되었으며 현재 경기전 안 북쪽에 위치하고 있다. 이한공은 태조의 21대조로서 신라사공이었다 하며 시조비는 김씨로서 신라 태종 10세손인 군윤 김은의의 딸로 전해지고 있다. 조경묘는 철종 5년(1854) 10월에 경기전과 함께 중수되었고 고종31년(1894) 5월 갑오동학혁명 때 전주 부성이 점령되려 하자 경기전의 태조 영정과 함께 위봉사의 행궁에 안치되었다가 7월 17일에 다시 전주로 되돌아오게 되었다. 조경묘에는 영조 47년(1771)에 영조가 친필로 써서 보낸 ''시조고신라사공신위 시조비경주김씨신위''라고 쓰여진 위패가 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 31) {
                    title="전주이씨 칠산군파 종중문서";
                    designated_number="전라북도 유형문화재 제 103호";
                    designated_day="1982.08.30";
                    detail_address="전북 전주시 덕진구 와룡2길 14";
                    location1=		35.8671026;
                    location2=		127.11272639999993;
                    detail_explain="이 종중문서는 고림군 이훈(高林君 李薰)의 적자(赤子)인 칠산군 이선손(漆山君 李璿孫)으로부터 10여대에 이르는 문서들로써 약 500년이나 되는 중요한 문화재적 가치가 있는 문적(文籍)들이다. 한자에 쓰여진 이 문서는 조선시대의 가족제도 노예제도 경제제도 관습의례 윤리도덕 문화예술 사회구조 및 당시의 이두를 연구하는데 소중한 자료이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 32) {
                    title="천주교 순교자 묘";
                    designated_number="전라북도 기념물 제 68호";
                    designated_day="1984.09.20";
                    detail_address="전라북도 전주시 완산구 낙수정2길 103-88";
                    location1=		35.8072184;
                    location2=	127.16626539999993;
                    detail_explain="17세기 초 천주교는 중국에서 들여온 교회 서적을 통하여 한국에 처음 소개되어 일부 학자들 사이에서 연구되기 시작했다. 하지만 당시 유교 이외의 어떤 종교나 학문도 엄격히 금지되었던 시절이어서 1886년 종교의 자유가 허용되기 전까지 혹독한 박해로 10000명 이상이 순교했다. 한국 천주교회는 외국 선교사에 의해 전래된 것이 아니라 한국 사람들의 자발적인 노력에 의하여 세워진 교회 역사상 유례없는 사례로 전해지고 있다. 특히 전주는 박해를 피해 피신해 온 신자들이 많았으며 한국 최초의 순교자 역시 전주지방 출신이었다. 이곳 전주는 한국 최초의 자치 교구이다. 1790년에 박해가 한창 심할 때 전주의 한 동정부부(童貞夫婦)가 순교하였다. 유항검(柳恒儉)의 아들 종철(鍾喆)과 그의 아내인 이윤하(李潤夏)의 딸 이누갈다(유혜=일명 順伊)이다. 유종철은 순조 2년(1802)에 전주 형옥(刑獄)에서 교살(絞殺)이라는 형을 받아 순교하였다. 그의 아내 이누갈다는 남편이 옥중 교살된 지 나흘만에 벽동(碧潼;지금의 평북 벽동군) 관비로 가라는 선고가 내려졌다. 이누갈다는 관리에게 죽여줄 것을 요청하면서 벽동에 가는 것을 한사코 거부하였다. 그 후 곧바로 숲정이 형장으로 끌려가 처형되었다. 1937년에 구(具)마르시노 신부는 이들 동정부부와 유항검의 처 신희 유관검의 처 이육희 유항검의 장조카 유중성(강주도령)그리고 유종철의 동생 문철의 시신을 이서에서 이 곳 승암산(치명자 성지 혹은 중바위)으로 큰십자가를 세워 그 신앙심을 기리고 있다. 전주교구에서는 이 곳을 새로이 단장하여 묘 앞에는 제대를 세우고 지하에는 성당을 지었다.";
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 33) {
                    title="천양정";
                    designated_number="전라북도 문화재자료 제 6호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 완산구 중화산동1가 196번지";
                    location1=		35.8154323;
                    location2=		127.1379263;
                    detail_explain="숙종 38년(1712)에 처음 다가천 서쪽 냇기슭에 세웠을 때 [천양정]이란 이름이 생겼으나 9년 만에 홍수로 정자가 떠내려감과 동시에 그 이름도 끊기게 되었다. 그 이름이 다시 부활된 것은 순조 30년(1830) 8월 2일이다. 홍수로 떠내려간 지 118년 만의 일이다. 그동안 다가정(多佳亭)을 북쪽에 대신 세웠는데 이 천양정은 남쪽을 향하여 세우게 되었다. 일제 침략 직후인 1911년 5월에 군자 다가 읍양 등 3정의 사원(射員)과 한자리에 모여 전원이 이 사정의 사원이 되었다가 1918년 5월 29일에는 다른 사정은 모두 폐하고 전주천양정사회(全州穿楊亭射會)로 발족을 보게 되었는데 이와 같이 통합시켜 그 재산까지 학교에 기부하게 한 것은 우리나라 상무의 전통을 말살하려는 일제의 식민정치의 일환이라 볼 수 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 34) {
                    title="학인당";
                    designated_number="전라북도 민속자료 제 8호";
                    designated_day="1976.04.02";
                    detail_address="전라북도 전주시 완산구 향교길 45";
                    detail_explain="서울 북촌에 윤보선 고택이 있다면 전주한옥마을에는 학인당이 있다. 삼원당 뒤쪽에 위치한 학인당은 한옥마을에 있는 700여 채의 한옥 가운데 격식을 갖춰 지은지 100년된 대형 한옥이다. 조선 말 한국 전통 건축기술을 전승받아 지은 건물로 당시의 상류층 주택 전형을 보여주고 있다. 학인당은 건축 당시에는 99칸집 2천평 규모의 대저택이었으나 지금은 대지 520평에 건물이 69평 정도다. 효자로 소문난 인재 백락중의 사후를 기리기 위해 지어졌다고 한다. 당시 일류 도편수나 목공 등 연인원 4280명이 압록강 오대산 등지의 목재를 사용해 2년 8개월에 걸쳐 건축했다고 전한다. 한인당의 솟을 대문에는 백낙중지려라는 현판을 걸었고 팔작지붕처리가 흥미롭다. 학인당은 70년대 용인민속촌에 이 집을 통째로 옮기기 위해 삼성그룹 이병철회장이 거액을 제시하며 두 차례나 팔기를 권유했다는 이야기가 전해온다. 또한 백범 김구선생이 묶은 곳으로도 유명하다. 전통문화체험장으로 개방된 학인당에는 최근 전통찻집 선다원이 문을 열었다. 학인당에서 차 한잔 여유와 휴식을 즐기며 학인당에 얽힌 이야기를 듣는 즐거움도 크다. 한옥생활체험숙박 - 객실수 : 4 - 수용인원 : 2인1실 ~ 4인1실 - 요금 : 4인1실(10만원) / 3인1실(7만원) / 2인1실(5만원) - 비고 : 전통다례체험";
                    location1=35.8121174;
                    location2=	127.15201179999997;
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 35) {
                    title="전주 삼천동 곰솔나무";
                    designated_number="천연기념물 제 355호";
                    designated_day="1988.04.30";
                    detail_address="전라북도 전주시 완산구 삼천1동 732-17";
                    detail_explain="전주 삼천동 주공아파트 동쪽 150m 부근에 있는 곰솔은 약 5백여 년 수령으로 높이 10m 가슴높이의 둘레는 3.8m 가지가 뻗은 길이는 20m이다. 인동장씨 묘역에 있는 곰솔은 1920년 장재철씨가 나무둘레에 축대를 쌓았고 장씨산송정(장씨산송정)표석을 세웠다.";
                    location1=	35.8001041;
                    location2=	127.12859819999994;
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 36) {
                    title="추천대";
                    designated_number="전라북도 문화재자료 제 8호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 덕진구 팔복동3가 26번지";
                    location1=35.8442937;
                    location2=	127.09575410000002;
                    detail_explain="추천대는 조선 성종 때 대사헌(大司憲)과 예조참판(禮曺參判) 동지의금부도사(同知義禁府都事)를 지낸 추탄(楸灘) 이경동(李瓊仝)이 낙향하여 추천(楸川)에 낚시를 드리우고 만년을 보낸 곳이다. 이 곳에 후손인 정호(正鎬)가 사방 2간의 누정을 세우고 [추천대]라는 현액을 걸었다. 상량(上樑)에 [세기해 2월 11일 입주상량(歲己亥 二月 十一日 立住上樑)]이라 하여 이는 광무 3년(1899)에 건립되었음을 알 수 있다. 1947년에는 공의 후손들이 그 자리에 정자를 세웠다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 37) {
                    title="동고산성";
                    designated_number="전라북도 기념물 제 44호";
                    designated_day="1981.04.01";
                    detail_address="전북 전주시 완산구 교동 산9-1번지";
                    location1=35.812846;
                    location2=127.1691012;
                    detail_explain="산성지는 승암산(僧岩山)의 기암절벽에 의지하고 서북방으로는 수구가 뚫린 삼태기형 산곡을 포용한 사고중관(四高中寬)의 지형을 이용한데다가 남북에 익성(翼城;出城)을 설치한 특이한 형식이다. 산성의 구조는 산능선을 내성곽(內城郭)으로 하고 그 외사면에 회랑도를 설치하고 그 외변에 석축을 한 수법으로서 성벽의 높이는 6미터 내외가 된다. 성곽의 크기는 외성곽(外城郭)의 주위가 1588.3미터 동서축(東西軸)의 길이 314.0미터 남북축의 길이 256.0미터 북익성(北翼城)의 길이 112.0미터 남익성(南翼城)의 길이 123.0미터에 이른다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 38) {
                    title="여래불적도";
                    designated_number="전라북도 유형문화재 제 79호";
                    designated_day="1977.12.31";
                    detail_address="전라북도 전주시 덕진구 백제대로 567";
                    location1=35.844182;
                    location2=	127.12927760000002;
                    detail_explain="석가여래유적도는 목판에 새긴 것으로써 크기는 가로 33cm 세로 74cm 두께 3.7cm이다. 전면에는 석가라는 문자가 없어지고 여래불적도라 양각되어 있는데 그 크기는 길이 50cm 넓이 17cm이다. 양 발바닥의 무늬 14개로 되어 있다. 또한 그 아래에는 발원문이 기록되어 있다. 후면 아래에는 '가경 17년 임신 춘 경상우도 지리산 안국암 개간' 등이 양각되어 있다. 이것으로 보아 이 불적도는 순조 12년(1812)에 제작된 것임을 알 수 있다. 여기에는 석가대불을 중심으로 오른쪽에 아미타불 왼쪽에 미륵존불 그리고 하단에 지장보살을 중심으로 오른쪽에 도명존자 왼쪽에 무독귀주 양쪽 상단으로 이어지면서 지옥의 수 및 보살의 수가 정연하게 나열 타원형을 이루고 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 39) {
                    title="충신이흥발지려";
                    designated_number="전라북도 기념물 문화재자료 제168호";
                    designated_day="2000.11.17";
                    detail_address="전북 전주시 완산구 삼천3동 산64-3번지";
                    location1=	35.7744277;
                    location2=127.08044640000003;
                    detail_explain="이 정려각은 조선 중기의 충신 이흥발의 행적을 기리기 위해 영조 29년(1753)에 나라에서 건립한 것이다. 이흥발은 정묘호란 이전 해인 인조 4년(1626)에 상소를 올려 청나라 사신을 목벨 것을 요청했으며 병자호란에서 청나라에 패하자 관직을 버렸다. 이 정려각은 현존하는 정려의 대부분이 효자와 열녀에 관한 것인데 비해 충신의 정려라는 점에서 주목되며 전형적인 정려각 건축 형식을 그대로 갖추고 있다. 정려각 위에는 이흥발의 묘소가 있고 아래에는 근래 건립한 종중 재실이 있다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 40) {
                    title="관성묘";
                    designated_number="전라북도 문화재자료 제 5호";
                    designated_day="1984.04.01";
                    detail_address="전라북도 전주시 완산구 남고산성1길 159-9";
                    location1=	35.7966656;
                    location2=127.16014150000001;
                    detail_explain="관성묘는 남고산성내 만경대(萬景臺) 남동쪽에 위치하고 있는데 주왕묘(周王廟) 또는 관제묘(關帝廟)라고도 하며 중국 후한(後漢)의 성장(聖將)인 주우(周羽)를 무신(武神)으로 제사 지내는 곳이다. 우리나라에서 관우 신장을 신봉하는 신당이 널리 전파되기는 임진왜란 때로써 당시 명나라 유격장군이었던 진인(陣寅)이 울산 싸움에서 부상을 입고 지금 서울에 있는 남묘(南廟)자리에 머물러 치료를 받고 있었는데 명나라 군사들은 싸움터에서 자주 관우신장의 영(靈)을 통하여 그 가호를 받았다고 믿는 데에서 열렬한 관우숭배자인 그는 이곳에 묘를 세우고 관우의 신상을 안치했다고 한다. 전주의 관성묘는 고종 32년(1895)에 당시 전라도관찰사 김성근(金聲根)과 남고별장(南固別將) 이신문(李信文)의 발기로 각처 유지들의 헌납성금으로 건립되었다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 41) {
                    title="숲정이";
                    designated_number="전라북도 기념물 제 71호";
                    designated_day="1984.09.20";
                    detail_address="전라북도 전주시 덕진구 공북로 19";
                    location1=	35.8254193;
                    location2=127.13348769999993;
                    detail_explain="정조 15년(1791 신해) 순조원년(1801 신유) 순조 27년(1827년정해) 헌종 5년(1839 을해) 고종 3년(1866 병인) 박해가 있을때마다 전주지방은 순교의 피로 점철되고 전주. 여산. 고산. 진산. 김제 등에도 교세가 확장되었다. 전라감사 김달순은 정조 8년(1801) 3월 유항검과 그의 서제 유관검 평신도 윤지헌(윤지충의 동생) 김유산 이우집 등을 체포하여 유항검 형제는 9월 17일 남문 밖에서 육시형을 그 외는 교수형을 당하였다. 1839년(을해) 박해에 잊을 수 없는 순교자는 신태보(베드로)로서 1827년 4월 22일 전주 포교에게 체포되어 13년간의 옥고를 치른 후 다른 5명과 함께 1839년 4월 참수 치명하였다. 1866년(병인) 박해는 전주에서 치명한 수만도 22명이나 되며 그 중 숲정이에서 치명한 분은 7명에 이른다. 현재는 진북동 동국아파트 단지 옆에 있지만 이 곳이 당시 형장으로써 논밭으로 경작되었다. 천주교 신자들은 이 곳을 매입하여 1935년 자그마한 순교십자비를 세웠다. 그러나 해방이후 토지개혁령으로 지가증권만 가지고 있고 토지는 경작자에게 넘어갔다. 이 토지를 재차 매입하여 숲정이 치명탑(致命塔)을 다시 크게 세웠다. 그러나 원래의 자리에서 상당한 거리를 두고 서게 되었다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 42) {
                    title="전주이씨고림군파 종중문서";
                    designated_number="보물 제 718호";
                    designated_day="1981.03.18";
                    detail_address="전북 전주시 완산구 쑥고개로 249, 국립전주박물관";
                    location1=	35.8010305;
                    location2=127.09013709999999;
                    detail_explain="이 문서는 전주 이씨 고림군파에서 보관해 온 것으로 모두 네 가지로 구성되어 있다. 조선 연산군 8년(1502)에 작성한 ｢허여문기(許與文記)｣는 고림군이 아들 칠산군(漆山君)에게 과거 합격 기념으로 노비를 지급한 문서이다. 중종 32년(1537) 이전에 작성된 것으로 보이는 ｢동복화회문기(同腹和會文記)｣는 칠산군이 9남매에게 유산을 나누어 준 기록이다. 중종 34년의 ｢동복화회입의(同腹和會立議)｣는 칠산군이 죽은 2년 뒤 유족들이 모여 작성한 것이다. 선조 26년(1593)의 ｢동복화회성문(同腹和會成文)｣은 고림군의 3대손인 이수언의 6남매가 모여 재산분배를 위해 작성한 문서이다. 이 문서들은 조선시대 왕족 집안의 가족제도와 유산관리제도 그리고 이두문 연구에 귀중한 자료가 되는 것들이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 43) {
                    title="전동성당 사제관";
                    designated_number="전라북도 문화재자료 제178호";
                    designated_day="2002.04.06";
                    detail_address="전북 전주시 완산구 태조로 51";
                    location1=	35.8134083;
                    location2=127.149495;
                    detail_explain="2002년 4월 6일 전라북도문화재자료 제178호로 지정되었다. 전주교구천주교회유지재단에서 소유 관리한다. 전주 전동성당은 조선 후기의 천주교 순교자인 윤지충(尹持忠:1759∼1791)과 권상연(權尙然:1751∼1791)의 순교성지이기도 하다. 1889년 초대 주임신부인 프랑스 파리외방전교회 소속 선교사 보두네(한국명 尹沙物) 신부가 성당 부지를 매입하고 1908년 푸아넬(한국명 朴道行) 신부의 설계로 본당 건물이 완공되었다. 사제관은 본당을 세운 뒤 2대 주임신부였던 라크루(한국명 具馬瑟) 신부가 1926년에 건축하였다. 이 건물은 1937년 전주교구청사와 교구장 숙소로 사용되었으며 1960년 이후부터는 주임신부와 보좌신부의 생활공간으로 쓰였다. 3층 건물로 전동성당의 동쪽에 자리잡고 있으며 본당과 같이 북향하고 있다. 건물 중앙에는 2층 현관으로 연결되는 주 출입구가 있으며 1층의 출입구는 건물의 남쪽에 별도로 설치되어 있다. 건물은 전체적으로 좌우 대칭을 이루는데 1층 부분은 깬돌 허튼층쌓기를 하였고 창 주변은 벽돌로 둘러싸여 있다. 2 3층 창대에는 화강석을 설치하였고 창틀 외곽은 벽돌로 리아스식 쌓기를 하여 치장하였다. 지붕의 형태는 모임지붕으로 골함석잇기를 하였는데 지붕면 네 곳 중앙에 도머창을 설치하였다. 전동성당의 사제관은 르네상스 양식을 바탕으로 로마네스크 양식을 가미한 절충식 건물로 조형적으로도 아름다운 외관을 유지하고 있으며 당시의 건축기법을 살필 수 있는 중요한 건물이다. 1926년에 세워진 서양식 건축으로 전동성당의 본당과 더불어 역사적 가치가 큰 근대 건축물이다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 44) {
                    title="조선 태조어진";
                    designated_number="국보 제 317호";
                    designated_day="2012.06.29";
                    detail_address="전라북도 전주시 완산구 태조로 44-0";
                    location1=35.8143927;
                    location2=127.15101290000007;
                    detail_explain="경기전(慶基殿)에 봉안된 어용(御容)은 경주 집경전본을 모사한 것이었는데 세종 24년(1442) 7월에 집경전의 어용과 함께 개화하여 동년 10월에 봉안했다. 현재 경기전 어진(御眞)은 고종 9년(1872) 9월에 개화한 것이다. 임진왜란이 일어나자 재빨리 내장산에 피난하였다가 정읍 태인 익산 용안 임천 은산 정산 온양 아산을 거친 다음 강화도 안주를 경유하여 묘향산 별전(別殿)에 봉안되었다. 그후 어용은 여러번의 수난을 겪었는데 즉 인조 14년(1636)병자호란 때는 무주 적상산성에 피난했다가 돌아온 일이 있었으며 영조 43년(1767) 이른바 정해대재 때는 전주향교 명륜당에 긴급 피난한 일이 있으며 고종 31년(1894)에는 동학군의 전주입성으로 한때 위봉산성에 피난하기도 했다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 45) {
                    title="천고사 석불좌상";
                    designated_number="전라북도 문화재자료 제 145호";
                    designated_day="1999.07.19";
                    detail_address="전북 전주시 덕진구 만성용흥길 7";
                    location1=	35.8291018;
                    location2=127.07201009999994;
                    detail_explain="천고사 미륵전 안에 모시고 있는 이 석불좌상은 미륵불상으로 알려지고 있으나 손모습으로 보아 석가여래가 책상다리를 하고 앉아있는 모습으로 보인다. 광배 윗 부분은 잘려나갔으며 얼굴의 눈과 코 부위 등은 심하게 닳았고 채색의 흔적이 일부 남아있다. 이 불상은 몸체에 비해 얼굴부위가 크게 묘사되어 있으며 오른쪽 어깨를 완전히 드러낸 옷차림을 하고 있다. 큼직하게 표현된 두 손은 부처가 모든 악마를 굴복시켜 없앤다는 손 모양새를 취하고 있다. 천고사는 고려 초에 원광스님이 세웠다고 전해지는데 이 불상은 제작 기법 등으로 보아 고려말에 지방에서 만든 작품으로 보인다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 46) {
                    title="이형부인 동래정씨 의복";
                    designated_number="중요민속문화재 제 115호";
                    designated_day="1981.11.29";
                    detail_address="전라북도 전주시 완산구 쑥고개로 259";
                    location1=	35.8009943;
                    location2=127.09333049999998;
                    detail_explain="이형부인 동래정씨 유품은 1941년 음 11월 5일 일제 경성부윤 강제개장 명령에 따라 경기도 시흥군 금불암 옆에 있던 정경부인 동래정씨의 묘를 임실군 둔남면 대정리 종산에 이장할 때 관중 의류함에서 발견한 것이다. 선조 16년인 1584년 음 10월 12일에 돌아가신 정경부인의 의복이 무려 358년 9개월만에 발견된 것인데 전혀 상한 바 없다.";
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}
