package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Frag5 extends Fragment{
    public static double location1;
    public static double location2;
    public static String telephone;
    public static String title;
    public static String Facility_classification;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.frag5,container,false);

        String[] menuItems={"전주역사박물관",
                "공예공방촌1단지(꽃숙이)",
                "인후문화의집",
                "전주자연생태관",
                "목우헌",
                "전라북도 교육문화회관",
                "우아 문화의집",
                "전주대학교어린이영어도서관",
                "전주완산시립도서관",
                "바이전주관",
                "한옥생활체험관",
                "전통술박물관",
                "전주시청소년상담복지센터(YWCA)",
                "전주삼천도서관",
                "덕진 청소년 수련방,놀이마당",
                "동학혁명기념관",
                "국립무형유산원",
                "한지관",
                "전주 목판서화 체험관",
                "전북예술회관",
                "창작극회.창작소극장",
                "전주부채문화관",
                "완판본 문화관",
                "전주 덕진예술회관",
                "청소년문화광장",
                "한국소리문화의전당",
                "한방문화센터",
                "전주한지박물관",
                "전주서신도서관",
                "전주인후도서관",
                "전주금암도서관",
                "승광재",
                "삼천 문화의 집",
                "한옥마을 아트홀",
                "전주시 청소년 문화의 집",
                "장현식고택",
                "완산 청소년 문화의 집",
                "전주공예품전시관",
                "고전번역교육원",
                "정읍고택",
                "태조어진 박물관",
                "한지산업지원센터",
                "천년전주명품ONN",
                "전주책마루어린이도서관",
                "전북대학교 삼성문화회관",
                "전주자수민속박물관",
                "전주한벽문화관",
                "국립전주박물관",
                "여명 카메라 박물관",
                "전주소리문화관",
                "전주전통한지원",
                "전주전통문화연수원",
                "전주동헌",
                "진북문화의 집",
                "솔내청소년수련관",
                "임실 진참봉 고택",
                "혼불문학공원",
                "전주송천도서관",
                "강암서예관",
                "덕진동 청소년문화의 집",
                "교동미술관",
                "효자문화의집",
                "최명희문학관",
                "강암서예관",
                "전주시청소년자유센터",
                "리빙콘텐츠DIT센터",
                "김치문화관",
                "전주시민놀이터",
                "한옥마을역사관",
                "팔복예술공장",
                "전주미술관",
                "우진문화공간",
                "전주효자도서관",
                "한옥마을선비문화관",
                "전주건지도서관",
                "전주쪽구름도서관",
                "전주아중도서관",
                "한국전통문화전당",
                "전주평화도서관"
                //79개
        };

        ListView listView=(ListView)view.findViewById(R.id.mainmenu);

        ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_expandable_list_item_1,menuItems
        );
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    title="전주 역사박물관";
                    telephone="063-228-6485";
                    location2=127.14828209999996;
                    location1=35.8206769;
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==1){
                    telephone="063-282-7074";
                    location1=35.8173553;
                    location2=127.1531146;
                    title="공예공방촌1단지(꽃숙이)";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==2){
                    telephone="063-247-8800";
                    location1=35.8374606;
                    location2=	127.15665899999999;
                    title="인후문화의집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==3){
                    telephone="063-281-2831";
                    location1=35.8116361;
                    location2=127.16254879999997;
                    title="전주자연생태관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }
                else if(i==4){
                    telephone="063-286-9285";
                    location1=35.8170714;
                    location2=127.15501659999995;
                    title="목우헌";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==5){
                    telephone="063-286-9285";
                    location1=35.8291331;
                    location2=127.1378158;
                    title="전라북도 교육문화회관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==6){
                    telephone="063-245-8455";
                    location1=35.8498173;
                    location2=127.15958469999998;
                    title="우아 문화의집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==7){
                    telephone="063-220-3106";
                    location1=35.8135772;
                    location2=127.08746670000005;
                    title="전주대학교어린이영어도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==8){
                    telephone="063-287-6417";
                    location1=35.8090217;
                    location2=127.14785000000006;
                    title="전주완산시립도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==9){
                    telephone="063-285-0002";
                    location1=35.814394;
                    location2=127.15308;
                    title="바이전주관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==10){
                    telephone="063-287-6300";
                    location1=35.8175162;
                    location2=127.15302229999998;
                    title="한옥생활체험관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==11){
                    telephone="063-287-6305";
                    location1=35.8169256;
                    location2=127.15351209999994;
                    title="전통술박물관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==12){
                    telephone="063-227-1005";
                    location1=35.8058825;
                    location2=127.1209427;
                    title="전주시청소년상담복지센터";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==13){
                    telephone="063-281-6464";
                    location1=35.7989146;
                    location2=127.12169760000006;
                    title="전주삼천도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==14){
                    telephone="063-277-6437";
                    location1=35.8359636;
                    location2=127.12304829999994;
                    title="덕진 청소년 수련방.놀이마당";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==15){
                    telephone="063-231-3219";
                    location1=35.816861;
                    location2=127.15201890000003;
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),"동학혁명기념관",Toast.LENGTH_SHORT).show();
                }else if(i==16){
                    telephone="063-280-1400";
                    location1=35.8101967;
                    location2=127.16060979999997;
                    title="국립무형유산원";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==17){
                    telephone="063-285-0002";
                    location1=35.814394;
                    location2=127.15308;
                    title="한지관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==18){
                    telephone="063-231-5694";
                    location1=35.8114477;
                    location2=127.15558629999998;
                    title="전주 목판서화 체험관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==19){
                    telephone="063-284-4445";
                    location1=35.8167967;
                    location2=127.14712510000004;
                    title="전북예술회관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==20){
                    telephone="063-282-1810";
                    location1=35.8181057;
                    location2=127.14857289999998;
                    title="창작극회·창작소극장";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==21){
                    telephone="063-231-1774";
                    location1=35.8154438;
                    location2=127.15195979999999;
                    title="전주부채문화관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==22){
                    telephone="063-231-2212";
                    location1=35.8119161;
                    location2=127.15798919999997;
                    title="완판본 문화관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==23){
                    telephone="063-281-6650";
                    location1=35.8476388;
                    location2=127.11980459999995;
                    title="전주 덕진예술회관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==24){
                    telephone="063-281-2254";
                    location1=35.8382206;
                    location2=127.12516200000005;
                    title="청소년문화광장";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==25){
                    telephone="063-270-7800";
                    location1=35.8554306;
                    location2=127.1387158;
                    title="한국소리문화의전당";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==26){
                    telephone="063-232-2500";
                    location1=35.8151328;
                    location2=127.15272000000004;
                    title="한방문화센터";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==27){
                    telephone="063-281-1530";
                    location1=35.8483399;
                    location2=127.09851079999999;
                    title="전주한지박물관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==28){
                    telephone="063-281-6550";
                    location1=35.8309877;
                    location2=127.1153256;
                    title="전주서신도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==29){
                    telephone="063-281-6409";
                    location1=35.8395351;
                    location2=127.16344890000005;
                    title="전주인후도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==30){
                    telephone="063-281-6448";
                    location1=35.836314;
                    location2=127.14009570000007;
                    title="전주금암도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==31){
                    telephone="063-284-2323";
                    location1=35.8165756;
                    location2=127.15346160000001;
                    title="승광재";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==32){
                    telephone="063-224-3088";
                    location1=35.7963173;
                    location2=127.1223579;
                    title="삼천 문화의 집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==33){
                    telephone="063-282-1033";
                    location1=35.8175663;
                    location2=127.15029060000006;
                    title="한옥마을 아트홀";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==34){
                    telephone="063-273-5501";
                    location1=35.8221083;
                    location2=127.13629370000001;
                    title="전주시 청소년 문화의 집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==35){
                    telephone="";
                    location1=35.812608;
                    location2=127.156374;
                    title="장현식고택";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==36){
                    telephone="063-226-5193";
                    location1=35.814618;
                    location2=127.12725560000001;
                    title="완산 청소년 문화의집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==37){
                    telephone="063-285-0002";
                    location1=35.8143906;
                    location2=127.15318049999996;
                    title="전주공예품전시관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==38){
                    telephone="063-283-5251";
                    location1=35.814052;
                    location2=127.15142130000004;
                    title="고전번역교육원";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==39){
                    telephone="";
                    location1=35.812584395211985;
                    location2=127.15665221214294;
                    title="정읍고택";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==40){
                    telephone="063-231-0090";
                    location1=35.8153146;
                    location2=127.14975690000006;
                    title="태조어진 박물관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==41){
                    telephone="063-281-1530";
                    location1=35.8206769;
                    location2=127.14828209999996;
                    title="한지산업지원센터";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==42){
                    telephone="063-285-0002";
                    location1=35.814394;
                    location2=127.15308;
                    title="천년전주명품ONN";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==43){
                    telephone="";
                    location1=35.8544454;
                    location2=127.12115199999994;
                    title="전주책마루어린이도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==44){
                    telephone="063-270-2089";
                    location1=35.84322660000001;
                    location2=127.13002630000005;
                    title="전북대학교 삼성문화회관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==45){
                    telephone="063-288-6138";
                    location1=35.8162836;
                    location2=127.1535897;
                    title="전주자수민속박물관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==46){
                    telephone="063-280-7051";
                    location1=35.8119872;
                    location2=127.15849300000002;
                    title="전주한벽문화관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==47){
                    telephone="063-223-5651";
                    location1=35.8010305;
                    location2=127.09013709999999;
                    title="국립전주박물관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==48){
                    telephone="063-232-5250";
                    location1=35.8161489;
                    location2=127.15366310000002;
                    title="여명 카메라 박물관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==49){
                    telephone="063-231-0771";
                    location1=35.8176573;
                    location2=127.15334830000006;
                    title="전주소리문화관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==50){
                    telephone="063-212-9069";
                    location1=35.8159226;
                    location2=127.15352389999998;
                    title="전주전통한지원";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==51){
                    telephone="063-288-9242";
                    location1=35.8124684;
                    location2=127.15655479999998;
                    title="전주전통문화연수원";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==52){
                    telephone="";
                    location1=35.812419;
                    location2=127.156298;
                    title="전주동헌";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==53){
                    telephone="063-275-0186";
                    location1=35.8311932;
                    location2=127.13953449999997;
                    title="진북문화의 집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==54){
                    telephone="063-278-4288";
                    location1=35.8692002;
                    location2=127.12901720000002;
                    title="솔내청소년수련관";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==55){
                    telephone="";
                    location1=35.812584395211985;
                    location2=127.15665221214294;
                    title="임실 진참봉 고택";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==56){
                    telephone="";
                    location1=35.8524237;
                    location2=127.1304375;
                    title="혼불문학공원";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==57){
                    telephone="063-281-6510";
                    location1=35.8693297;
                    location2=127.12810999999999;
                    title="전주송천도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==58){
                    telephone="";
                    location1=35.81126192460023;
                    location2=127.1524840593338;
                    title="강암서예관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==59){
                    telephone="063-273-7997";
                    location1=35.8451631;
                    location2=127.12017919999994;
                    title="덕진동 청소년문화의 집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==60){
                    telephone="063-287-1245";
                    location1=35.8154615;
                    location2=127.15115289999994;
                    title="교동미술관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==61){
                   telephone="063-228-9076";
                    location1=35.8065598;
                    location2=127.11034089999998;
                    title="효자문화의집";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==62){
                    telephone="063-284-0570";
                    location1=35.8156135;
                    location2=127.15136600000005;
                    title="최명희문학관";
                    Facility_classification="전통시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==63){
                    telephone="063-285-7442";
                    location1=35.8112456;
                    location2=127.15249130000007;
                    title="강암서예관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==64){
                    telephone="063-211-7401";
                    location1=35.8513807;
                    location2=127.08702820000008;
                    title="전주시청소년자유센터";
                    Facility_classification="문화센터";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==65){
                    telephone="063-281-1559";
                    location1=35.820579;
                    location2=127.1482;
                    title="리빙콘텐츠DIT센터";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==66){
                    telephone="063-287-6300";
                    location1=35.8175162;
                    location2=127.15302229999998;
                    title="김치문화관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==67){
                    telephone="063-287-2012";
                    location1=35.8210166;
                    location2=127.14979349999999;
                    title="전주시민놀이터";
                    Facility_classification="관람시설";

                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==68){
                    telephone="063-286-5125";
                    location1=35.8159139;
                    location2=127.15305809999995;
                    title="한옥마을역사관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==69){
                    telephone="063-283-9221";
                    location1=35.8607124;
                    location2=127.1010834;
                    title="팔복예술공장";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==70){
                    telephone="063-283-8887";
                    location1=35.8148687;
                    location2=127.14457849999997;
                    title="전주미술관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==71){
                    telephone="063-272-7223";
                    location1=35.8274854;
                    location2=127.13041509999994;
                    title="우진문화공간";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==72){
                    telephone="063-281-6490";
                    location1=35.8132624;
                    location2=127.1011393;
                    title="전주효자도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==73){
                    telephone="063-288-5124";
                    location1=35.8157896;
                    location2=127.15384059999997;
                    title="한옥마을선비문화관";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==74){
                    telephone="063-281-6606";
                    location1=35.856862;
                    location2=127.15127870000003;
                    title="전주건지도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==75){
                    telephone="063-281-6527";
                    location1=35.869991;
                    location2=127.07415809999998;
                    title="전주쪽구름도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==76){
                    telephone="063-281-6484";
                    location1=35.8263936;
                    location2=127.16194270000005;
                    title="전주아중도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==77){
                    telephone="063-281-1500";
                    location1=35.8206769;
                    location2=127.14828209999996;
                    title="한국전통문화전당";
                    Facility_classification="관람시설";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }else if(i==78){
                    telephone="063-281-6420";
                    location1=35.7914469;
                    location2=127.13395400000002;
                    title="전주평화도서관";
                    Facility_classification="도서관";
                    Intent intent=new Intent(getActivity(),after_space.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),title,Toast.LENGTH_SHORT).show();
                }




            }
        });
        return view;
    }
}
