package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class jijung_cultural_property_list_activity extends AppCompatActivity {
    public static String title;
    public static String designated_number;
    public static String designated_day;
    public static String detail_address;

    public static double location1;
    public static double location2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_jijung_culture);
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
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                }else if (i == 3) {
                    title="황강서원";
                    designated_number="전라북도 문화재자료 제 12호";
                    designated_day="1984.04.01";
                    location1=	35.829055;
                    location2=	127.10323459999995;
                    detail_address="전북 전주시 완산구 황강서원5길 8-7 ";
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
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 7) {
                    title="승암사 소장 불서";
                    designated_number="전라북도 유형문화재 제209호";
                    designated_day="2006.06.16";
                    location1=	35.8009943;
                    location2=	127.09333049999998;
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
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 12) {
                    title="\t전주 경기전 정전";
                    designated_number="보물 제 1578호";
                    designated_day="2008.12.01";
                    detail_address="전북 전주시 완산구 풍남동3가 102번지";
                    location1=	35.815133;
                    location2=	127.15019259999997;
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
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 19) {
                    title="\t조경단";
                    designated_number="전라북도 기념물 제 3호";
                    designated_day="1973.06.23";
                    detail_address="전북 전주시 덕진구 덕진동1가 산28번지";
                    location1=	35.8515074;
                    location2=127.136347;
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
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 33) {
                    title="천양정";
                    designated_number="전라북도 문화재자료 제 6호";
                    designated_day="1984.04.01";
                    detail_address="전북 전주시 완산구 중화산동1가 196번지";
                    location1=		35.8154323;
                    location2=		127.1379263;
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 34) {
                    title="학인당";
                    designated_number="전라북도 민속자료 제 8호";
                    designated_day="1976.04.02";
                    detail_address="전라북도 전주시 완산구 향교길 45";
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
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }else if (i == 42) {
                    title="전주이씨고림군파 종중문서";
                    designated_number="보물 제 718호";
                    designated_day="1981.03.18";
                    detail_address="전북 전주시 완산구 쑥고개로 249, 국립전주박물관";
                    location1=	35.8010305;
                    location2=127.09013709999999	;
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
                    Intent intent=new Intent(getApplicationContext(),after_jijung_clutural.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}
