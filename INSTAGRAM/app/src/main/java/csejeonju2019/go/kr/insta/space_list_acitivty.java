package csejeonju2019.go.kr.insta;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class space_list_acitivty extends AppCompatActivity {
        public static double location1;
        public static double location2;
        public static String telephone;
        public static String title;
        public static String explain;
        public static String Facility_classification;
        private ListView lv_shifts;
        ProgressDialog progressDlg;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_culture_space);
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
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                progressDlg.dismiss();
            }
        }.start();

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



            ListView listView=(ListView)findViewById(R.id.mainmenu_space);

            ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(
                    getApplicationContext(),android.R.layout.simple_expandable_list_item_1,menuItems

            );


            listView.setAdapter(listViewAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if(i==0){
                        title="전주 역사박물관";
                        explain="전주와 전주 사람들에 대한 이야기를 하는 지역사 박물관이다. ○ 박물관 연혁     - 2002. 5.24 전주역사박물관 개관(동학농민혁명기념사업회)     - 2005. 4.20 제2기 전주역사박물관 출범(전주문화사랑회)     - 2006. 12. 5 전주시 민간위탁 문화시설 운영평가 ‘우수시설선정’ 수상 ○ 단체관람안내     단체관람은 예약에 관계없이 박물관 앞에 먼저 정열한 순서에 따릅니다.     오전 10~12시 사이 단체관람객이 많으므로 상당시간을 기다려야 합니다.     입장하기 전 현관에서 단체관람 일지를 꼭 기재해 주시기 바랍니다.     학생들의 단체관람시 인솔교사가 반드시 동행해야 합니다. ○ 시설안내     - 5층 조선시대 전주의 역사를 한눈에 볼 수 있는 깐깐한 전주이야기     - 4층 동학농민혁명 관련 전시공간     - 3층 전주의 역사 문화와 관련된 주제별 기획전시 공간     - 2층 故김철순씨 기증민화를 볼 수 있는 공간     - 1층 구석기시대에서 고려시대 전주의 역사를 한눈에 볼 수 있는 깐깐한 전주이야기     - b1층 녹두관은 초청 강연 및 역사문화 강좌 청소년 문화공연 영상매체 상영 공간입니다.     - b2층 수장고는 유물의 분류ㆍ정리ㆍ보존처리ㆍ관리 공간입니다.";
                        telephone="063-228-6485";
                        location2=127.14828209999996;
                        location1=35.8206769;
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==1){
                        telephone="063-282-7074";
                        location1=35.8173553;
                        location2=127.1531146;
                        explain="한옥과 한지가 조화를 이루는 아름다운 공간에서 국내외국인이 체험(단체개인)과 교육을 하는 공간이며 韓art space에서는 프랑스에서 145년만에 귀환한 외규장각 의궤(영조 정순왕후 가례도감)가 한지조형(닥종이인형)으로 재현되어 상설전시 하고있다.박물관 파노라마 주문 작업과 한지문화 관광상품 개발을 진행중이다.";
                        title="공예공방촌1단지(꽃숙이)";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==2){
                        telephone="063-247-8800";
                        location1=35.8374606;
                        location2=	127.15665899999999;
                        explain="인후문화의집에서는 삶이 곧 문화가 되고 그 삶을 사는 사람들이 바로 삶의 교과서가 된다는 말을 공감하며 각자의 사연들로 누구나 공감하는 지점의 삶의 문화지도를 그려가고 있습니다. 인후문화의집에서는 실생활에 유용한 상설프로그램 뿐 아니라 각 기관별 연계사업 체험프로그램 예술캠프 각종 무료강좌 등으로 여러분을 기다리고 있습니다. 2012년 9월부터는 문화공간과 더불어 생활가까이에 있는 소중한 독서공간인 작은 도서관도 함께 운영하고 있으니 많은 이용바랍니다. 이용안내전주 시민이면 누구나 이용 가능합니다. 방문하시는 분들은 안내데스크에서 이용자 기록부 작성 후 이용하시기 바랍니다. 문화의집 상설 프로그램 접수기간 / 매월 25일~30일 문화의집 도서 대여기간 / 1인 2권당 10일 문의전화 : 063-247-8800 이용시간 평일토요일휴관10:00~18:0010:00~17:00일요일 공휴일";
                        title="인후문화의집";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==3){
                        telephone="063-281-2831";
                        location1=35.8116361;
                        location2=127.16254879999997;
                        explain="전주의 주산인 승암산의 절경을 배경에 두고 전주천 청정물결이 앞으로 흐르는 아름다운 자연환경 속에 자리한 “전주자연생태박물관”이 2008년 5월22일 개관하여 한옥마을과 더불어 새로운 관광명소로 부상되고 있습니다. 부지면적이 1만8766㎡에 지하1층 지상3층 연면적 2074㎡의 규모로 1급수 청정한 수질에서 서식하는 쉬리를 형상화한 건축물을 신축하여 냉방과 난방을 지열시스템으로 가동하여 운영되고 있는 실천적인 친환경 건축물로도 주목을 받고 있으며 1층은 자연생태체험관으로 전주의 자연생태 환경을 종합적으로 안내하고 있고 지표생물로서 가장 깨끗한 물에서 서식하는 쉬리수족관과 전주천에서 발견된 수달을 소개하는 등 자연의 소중함을 깨달을 수 있는 체험 학습공간입니다. 또한 2층은 친환경에너지체험관으로 에너지 이용과 변천 신재생에너지 미래에너지에 대하여 전반적으로 이해할 수 있는 12종의 에너지 관련 체험시설과 에너지영상실이 마련되어 있으며 이러한 시설들은 전국 에너지전시관중 가장 다양한 종류의 체험시설을 갖춘 규모로 평가받고 있습니다. 이와 더불어 전주천 둔치에 마련한 수변생태공원에는 어류은신처 수생식물과 물억새 수크렁 갯버들 등 야생화 120505본을 새롭게 식재하여 습지정화 및 수생식물에 대한 체험학습과 휴식공간이 되고 있습니다. 단체 20인 이상과 개인으로 구분하여 300원 ~ 2000원의 관람요금을 받고 있으며 오전 9시부터 오후 6시까지 관람이 가능하고 하절기인 5월 ~ 9월 까지는 1시간이 연장되어 오후 7시까지 관람이 가능하며 매주 월요일과 1월1일 설날과 추석날 당일은 휴관되고 단체로 관람을 하고자 하는 경우에는 사전에 예약신청을 하면 자원봉사해설사의 해설 안내를 받을 수 있고 매주 토요일에는 다양한 행사가 운영되고 있습니다. 또한 살아있는 곤충을 직접 만져볼 수 있는 체험장을 마련하여 관람객에 대한 새롭고 다양한 볼거리를 제공하고 있습니다. 천년의 역사와 수려한 자연 경관이 보존되어 온 전주의 새로운 관광 트랜드인‘전주자연생태박물관’에서 바람결과 물길이 소살대는 자연의 이야기에 귀 기울이다 보면 어느새 “사람이 자연임을 깨닫는 체험”까지 덤으로 챙길 수 있는 특별한 생태관광 여행이 될 것입니다.";
                        title="전주자연생태관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }
                    else if(i==4){
                        telephone="063-286-9285";
                        location1=35.8170714;
                        location2=127.15501659999995;
                        title="목우헌";
                        explain="목공예에 녹아있는 장인의 숨결 목우헌 목우헌은 기능전승자(2005-2호) 김종연 선생의 전시관이자 작업실로전통과 현대 공예작품을 관람할 수 있는 곳이다. 전시된 작품은 전통목침 다식 약과틀 서각 조형 작품 등 생활용품과 장식품들이다.";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==5){
                        telephone="063-286-9285";
                        location1=35.8291331;
                        location2=127.1378158;
                        title="전라북도 교육문화회관";
                        explain="○ 설치자/운영자 : 전라북도교육청/전라북도교육청 ○ 규모 : 연면적  5943㎡(1801) 지상 3층 지하 1층 ○ 개관연도 : 1983 ○ 기능별 면적 및 객석수     - 공연장 : 1503석     - 전시장 : 1594㎡(483평) ○ 주요시설 : 무대(조명) 음향 전시실 ○ 주요사업 : 일반전시 음악발표 연극공연 각종발표회 영화상영 등 ○ 교통편 : 전주역(서중로타리 방면 버스 승차 흥국생명앞 하차 도보 4분거리)";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==6){
                        telephone="063-245-8455";
                        location1=35.8498173;
                        location2=127.15958469999998;
                        title="우아 문화의집";
                        explain="우아문화의집은 2002년 3월에 개관하여 다양한 문화정보와 각종 건전한 문화 활동을 체험할수 있도록 쾌적하고 질 높은 문화공간과 시설을 마련해 놓은 소규모 복합문화공간입니다. 덕진구 우아1동 주민센터 2층에 위치한 우아문화의집은 문화적으로 소외받은 이웃들에게 문화․복지 서비스를 제공함으로써 이들의 삶의 질을 향상 시키는데 촉매제 역할을 하고 있습니다. 이용안내전주시민이면 누구나 무료로 이용 할 수 있습니다. 방문하시는 분들은 안내데스크에 있는 방문록을 등록하시고 이용하시기 바랍니다. 도서는 1인 3권당 10일 대출 가능 문의전화 : 063-245-8455 시설현황동호회 활동공간 동아리실(방음시설) 주민자율공간 이용안내 모임방 및 개인연습 동아리 이용을 위하여 수업이 없는 시간 문화의집 개방시간에 맞춰서 자유롭게 이용하실 수 있습니다. 이용시간 평일토요일휴관09:00~19:0010:00~17:00국경일 공휴일 일요일";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==7){
                        telephone="063-220-3106";
                        location1=35.8135772;
                        location2=127.08746670000005;
                        explain="영어권 현지 시스템 도입 / 선진국형 도서센터 \"수준별 영어책 읽기\" ★ 전세계 학부모가 인정한 수준별 명품도서 2만권 ★ 미국 현지 프로그램 도입을 통한 과학적이고 체계적인 영어읽기능력 및 도서이해력 평가 ★ 원어민 토론수업 Story Telling 1:1 Coaching 시스템 등의 다양한 연계학습 프로그램 1.SRI SRC 미국현지 평가프로그램 영어읽기능력평가 프로그램(SRI) 독서 전 평가 독서이해력평가 프로그램(src) 독서 후 평가 2.LEXILE 레벨기반 도서추천 시스템 Lexile 지수란? 세계 유일 영어 독서역량 지수로 미국 내 100만권 이상의 도서에 활용되고 있으며 학생 개인별 자신에 맞는 읽기 역량으로 독서를 통해 영어 능력을 빠른 시일 안에 극대화 시킬 수 있도록 체계화 해놓은 척도임 3. 독서 히스토리 및 성적관리 시스템";
                        title="전주대학교어린이영어도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==8){
                        telephone="063-287-6417";
                        location1=35.8090217;
                        location2=127.14785000000006;
                        explain="1989년 개관한 완산동 전주시립도서관은 전주시내 11개 도서관 중 본관으로 가장 많은 도서를 보유하고 있습니다.규모 : A동(지하1~지상3층) B동(지상3층) 별관(지상2층) / 부지(7424㎡) 건물(6617㎡)운영시간 및 휴관일구분자료실(일반 어린이자료실)열람실3월~10월11월~2월운영시간09:00~22:00 (화~금요일)07:00~23:00(화~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일요일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(일반자료실 전자정보코너 노트북코너) 간행물실 어린이자료실 다문화자료실]열람실(제134열람실 556석) 연구실(제123연구실 30석)부대시설(강당-80석 강의실 식당(매점) 휴게실)장애인화장실(B동 12층 A동 1층 남녀화장실 공동사용) / 수유실 : 없음";
                        title="전주완산시립도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==9){
                        telephone="063-285-0002";
                        location1=35.814394;
                        location2=127.15308;
                        explain="영업시간 오전10시~오후7시까지 영업(하절기) 영업시간 오전10시~오후6시까지 영업(동절기)";
                        title="바이전주관";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==10){
                        telephone="063-287-6300";
                        location1=35.8175162;
                        location2=127.15302229999998;
                        title="한옥생활체험관";
                        explain="한옥생활체험관은 조선시대 양반집을 연상케 하는 곳이다. 옛 한옥에서 전통문화를 체험하며 하룻밤 묵어보는 귀한 체험관이다. '세화문(世化門)'을 열고 내부로 들어서면 ㄴ자 모양의 사랑채와 안채가 정겹게 손님을 맞는다. 문풍지를 발라 놓은 곁문들과 툇마루 햇볕이 잘 드는 마당에 놓여져 있는 항아리들 하나하나에 옛 가옥의 푸근함과 따뜻함이 묻어난다. 뜨끈한 구들장에 단잠을 자고 맞는 아침에는 놋그릇에 나오는 정갈한 5첩 반상도 받아 볼 수 있다. 무료로 대여되는 자전거를 타고 한옥마을 일대를 누비는 재미도 만끽해보자. 한옥생활체험 숙박 전주 한옥생활체험관은 조선시대 양반집을 연상케 하는 곳으로 안채와 사랑채 그리고 행랑채와 안마당 사랑마당이 갖추어진 전통한옥이다. 한국의 전통생활양식을 직접 체험하며구들방에서 전통숙박을 체험을 할 수 있다. 개별적인 숙박도 가능하지만 각종 모임 세미나 학회 등 단체숙박을 위한 전체대관도 가능하다. 전체대관은 사랑채 안채 및 대청마루 모두를 대여하는 것으로 30명 ~ 40명의 단체에 적합하고 프로젝트가 설치되어 있어 대청마루에서의 각종 회의나 세미나가 가능하다. 숙박을 하지 않는 경우에도 대청마루만 별도 대여가 가능하다. 생생한 체험과 흥미로운 전통과의 교감으로 가슴 깊은 추억을 만들어 보자!!! 예약은 인터넷이나 전화로 가능합니다. - 인터넷예약 : www.jjhanok.com - 전화문의 : 063) 287-6300 팩스 : 063) 287-6303 - 예약시 객실료의 30%의 예약금을 입금하셔야 합니다.(통장입금이나 현금 지불) (전북은행/예금주:한옥생활체험관/525-13-0315767) - 예약취소시 숙박 2일전까지 연락주시면 전액 환불해 드립니다. - 일요일 숙박손님에게는 월요일 아침식사가 제공되지 않습니다. 단 1인 5000원씩 객실 이용료를 할인해 드립니다. * 투숙객 제공 서비스 - 아침식사 (단 월요일 아침식사는 제공되지 않음) - 한옥마을 이야기 지도 제공 - 자전거 무료대여 - 전주리베라호텔 남여 사우나 50% 할인쿠폰 제공 - 유명 음식점 할인쿠폰";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==11){
                        telephone="063-287-6305";
                        location1=35.8169256;
                        location2=127.15351209999994;
                        explain="전통술박물관은 전래주의 맥을 찾아 집집마다 술을 빚던 가양주의 전통이 오롯이 살아있는 공간이다. 우리 전통술들을 전시ㆍ판매하며 우리 고유의 주조방식을 배우고 직접 빚어보기도 하는 체험형 박물관이다. 양화당(釀和堂)에서 술 빚는 과정을 알아보고 술 익는 소리와 향에 취했다면 계영원(誡盈院)에서는 ‘계영배’를 통해 적절한 주도(酒道)와 전국의 전통주를 구경해 보자.";
                        title="전통술박물관";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==12){
                        explain="내가 힘들고 마음이 괴로울 때 마음을 터놓고 이야기 할 수 있는 곳이 여기 있습니다. 전주시청소년상담복지센터는 청소년복지지원법 제29조를 근거로 전주시로부터 '전주YWCA'가 위탁받아 운영하는 청소년상담복지전문기관으로 전주시 청소년의 건강한 성장을 위한 다양한 상담복지 사업을 수행하고 있습니다. 최근 변화하는 청소년 문제에 효과적으로 대응하기 위해 청소년유관기관 간 연계를 통해 위기청소년을 돕는 ‘전주시청소년통합지원체계(CYS-Net)’를 구축운영하고 있으며 중고위기 청소년을 직접 찾아가서 상담하는 ‘청소년동반자’사업 ‘전주시학교밖청소년지원센터(청소년지원센터 꿈드림)‘운영을 통해 학업중단 청소년들의 학업복귀과 사회진출을 적극 지원하고 있습니다. 이용안내 이용대상만 9세~24세 청소년 부모 및 교사상담내용학교부적응학교폭력대인관계학업진로성격비행 등이용시간월~금 9:00~20:00 (방학 중 18시까지)토요일 9:00~18:00점심시간 12:00~13:00이용문의Tel) 063-236-1388 | Fax) 063-236-1389주소 : 전주시 완산구 용머리로 94 좋은빌딩 3층 (효자동1가 545-3번지) 이용방법 전화상담상담전화(063-236-1388 또는 국번없이 1388) > 상담 > 상담 및 심리검사 연결 / 도움기관 연계내방상담전화신청 > 상담예약(담당자와 통화) > 신청자 내방 > 개인상담 진행심리검사전화신청 > 검사예약(담당자와 통화) > 검시실시(신청자 내방) > 검사해석 및 상담";
                        telephone="063-227-1005";
                        location1=35.8058825;
                        location2=127.1209427;
                        title="전주시청소년상담복지센터";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==13){
                        telephone="063-281-6464";
                        location1=35.7989146;
                        location2=127.12169760000006;
                        explain="전주시 완산도서관 삼천분관은 2001년 2월에 개관하여 시민들에게 다양한 문화그램을 제공하여 독서 문화 환경을 조성하고 있습니다.규모 : 지상2층 지하1층 / 부지(3169㎡) 건물(2712.18㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(일반자료실 전자정보코너) 간행물실 어린이자료실)열람실(제123열람실 120석) 연구실(16석)부대시설(강의실(교양교실 52석) 식당(매점) 휴게실)장애인화장실(1층 남녀화장실 공동사용) / 수유실(1층 어린이자료실 내)";
                        title="전주삼천도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==14){
                        telephone="063-277-6437";
                        location1=35.8359636;
                        location2=127.12304829999994;
                        explain="○ 손 재주 교실 (한지·칠보공예) ○ 예절교실·풍물교실 ○ 컴퓨터 (기초반·인터넷반) ○ 동아리활동 (종이인형·재즈댄스·구연동화 등)";
                        title="덕진 청소년 수련방.놀이마당";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==15){
                        telephone="063-231-3219";
                        location1=35.816861;
                        location2=127.15201890000003;
                        Facility_classification="관람시설";
                        title="동학혁명기념관";
                        explain="동학혁명 100주년 기념사업으로 숭고한 혁명정신을 기리기 위해 세워진 기념관으로 상설전시장과 기념관으로 구성돼 있다. [교통정보] 동부시장에서 남쪽방향으로(교대쪽) 약 350m 거리 전주시청에서 동부시장으로 도보로 20분(한옥마을 내)";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"동학혁명기념관",Toast.LENGTH_SHORT).show();
                    }else if(i==16){
                        telephone="063-280-1400";
                        location1=35.8101967;
                        location2=127.16060979999997;
                        title="국립무형유산원";
                        explain="공간소개 - 국립무형유산원은 우리 전통문화의 근간이 되는 무형유산을 체계적으로 보존·계승하기 위해 설립된 문화재청 소속기관으로 무형유산 공연 전시 교육 전승지원 조사·연구 등을 담당하는 국가기관입니다. - 무형유산 전시와 공연 체험교육 프로그램 등을 운영하고 있으며 전승자 지원 국내·외 교류협력 아카이브 기록화사업 등을 통해 무형문화유산을 체계적으로 보호·전승합니다. - 국립무형유산원은 국민 누구나 무형유산을 가까이에서 보고 느끼고 즐길 수 있는 ‘무형유산 복합문화 공간’입니다.";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==17){
                        telephone="063-285-0002";
                        location1=35.814394;
                        location2=127.15308;
                        explain="영업시간 오전10시~오후7시까지 영업(하절기) 영업시간 오전10시~오후6시까지 영업(동절기)";
                        title="한지관";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==18){
                        telephone="063-231-5694";
                        location1=35.8114477;
                        location2=127.15558629999998;
                        explain="세계 기록 문화 유산인 조선 왕조 실록 출판 인쇄 문화를 직접 제험하고 고 인쇄 문화를 감상하고 당양한 체험을 할 수 있는 공간입니다.";
                        title="전주 목판서화 체험관";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==19){
                        telephone="063-284-4445";
                        location1=35.8167967;
                        location2=127.14712510000004;
                        explain="도내문화예술활동의 전당으로 각종 전시와 공연을 할 수 있는 공간을 제공하고 있다.";
                        title="전북예술회관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==20){
                        telephone="063-282-1810";
                        location1=35.8181057;
                        location2=127.14857289999998;
                        title="창작극회·창작소극장";
                        explain="창작극회는 이 지역을 대표하는 가장 오래된 연극 단체입니다. 1961년 아직 전쟁의 남은 한숨이 채 가시지 않았던 시절에 그 비극적인 전쟁 이야기를 다룬 희곡 [나의 독백은 끝나지 않았다] (박동화작 연출)를 무대에 올리면서 창작극회는 그 긴 발걸음을 시작했 습니다. 그로부터 지금에 이르기까지 무려 114편의 작품을 공연해 온 연보가 말해주듯 오랜 전통과 일관된 작품경향은 전국에서 몇 손가락 안에 드는 연극단체로서의 이름을 부끄럽지 않게 합니다. 창작극회는 어느 한사람 소유의 극단이 아닙니다. 임기제 대표와 운영단원들의 협의로 운영되는 협의체극단입니다. 이는 창작극회가 목적하는 '연극은 공공의 일이며 사회에 이바지해야한다'라는 테제를 시스템으로 분명히 하고 있습니다. 연극과 뮤지컬 마당극 아동극 인형극을 통한 따뜻한 세상 만들기는 창작극회가 지향하는 분명한 푯대입니다.";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==21){
                        telephone="063-231-1774";
                        location1=35.8154438;
                        location2=127.15195979999999;
                        explain="";
                        title="전주부채문화관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==22){
                        telephone="063-231-2212";
                        location1=35.8119161;
                        location2=127.15798919999997;
                        title="완판본 문화관";
                        explain="";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==23){
                        telephone="063-281-6650";
                        location1=35.8476388;
                        location2=127.11980459999995;
                        explain="대관안내 덕진예술회관은 문화예술 공연을 우선적으로 대관하고 있으며 오전 오후 야간등 1일 3회 대관을 하고 있으며 사용신청은 신청서 접수 전화 팩스 등의 방법에 의한 선순위에 의해 허가합니다. ※ 상반기 대관은 전년도 12월 하반기 6월부터 신청을 접수합니다. 사용요금 (시설기본 사용료/공연/평일 1회) 기준 : 오전(08:00~12:00)/ 오후(13:00~17:00)/ 야간(18:00~22:00) ※ 평일 공연기준 조명 음향 냉난방 포함 (오전 270000원 오후 290000원 오후310000원) 휴일야간 20% 가산. ※ 신청서는 사용개시 15일 이전에 제출하며 사용료는 5일전 까지 시금고(전북은행)에 납부하여야 합니다. 교통안내 전주 I.C(전주나들목)에서 ⇒ 시청 방향으로 6km 정도 전주 I.C(전주나들목) ⇒ 원광대한방병원 사거리(좌회전) ⇒ 국악원사거리(우회전) 전주역에서 ⇒ 종합경기장 방향으로 4km 정도 (전주역 ⇒ 종합경기장 사거리(우회전) ⇒ 전북대학교(지하보도) ⇒ 덕진공원 입구(우회전) ⇒ 덕진공원앞(좌회전) 고속＆직행 버스터미널에서 전주 I.C(전주나들목)방향으로 2km 정도 버스터미널 ⇒ 종합경기장 사거리 ⇒ 전북대학교(지하보도) ⇒ 덕진공원 입구(우회전) ⇒ 덕진공원앞(좌회전) 시설개요 공연장 관람석 : 486석(1층 396석 2층 90석) 공연장 면적 : 750㎡(227평) 무대 규모 : 163㎡(49평) / 폭10.5mx길이15.5mx높이12.5m 분장실(남·여) : 65㎡(20평) 주차시설 : 200대 정도 공연장 장비현황 무대시설 : 음향반사판 및 무대기계 29종 음향시설 : 음향콘솔 32채널 무선마이크 등 조명시설 : 디머유니트 151회로 조명콘솔 1024dim 영상시설 : 빔 프로젝트 6500ansi ※덕진예술회관 사용허가 신청서 다운받기 ※덕진예술회관 개인정보이용에 대한 동의서 파일 다운받기 ※덕진예술회관 사용허가 취소 및 사용자 준수사항(개정) 다운받기 ※덕진예술회관 사용(변경추가취소) 신청서 다운받기 ※덕진예술회관 사용료 파일 다운받기 ※덕진예술회관 관리 및 사용료징수조례 파일 다운받기 ※덕진예술회관 현황 파일 다운받기 ※덕진예술회관 무대평면도 다운받기 ※덕진예술회관 무대기계/조명기기 다운받기 ※덕진예술회관 공연장 좌석배치도 다운받기";
                        title="전주 덕진예술회관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==24){
                        telephone="063-281-2254";
                        location1=35.8382206;
                        location2=127.12516200000005;
                        title="청소년문화광장";
                        explain="[시설안내] ㅇ 규모 : 야외특설무대 139㎡ ·관람석 43㎡· 이동식농구대 2조ㅇ 관리부서 : 전주시 여성봉사과 ※ 시설을 이용하고자 하는 개인이나 단체에서는 전주시 여성정책과(청소년복지팀)에 사전 예약후 사용가능(년중)";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==25){
                        telephone="063-270-7800";
                        location1=35.8554306;
                        location2=127.1387158;
                        title="한국소리문화의전당";
                        explain="전주세계소리축제 등 국내 · 외 문화예술 및 공연이 열리는 2000여석 규모의 대극장과 국제회의장 전시장이 들어서 있으며 7000석 규모의 야외 공연장과 놀이마당을 갖추고 있다. - 국제적인 각종 회의와 이벤트행사 공간 - 만남의 장소와 휴식공간 - 보고느끼고 함께 참여할 수 있는 문화공간 - 세계적인 문화예술 활동공간";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==26){
                        telephone="063-232-2500";
                        location1=35.8151328;
                        location2=127.15272000000004;
                        title="한방문화센터";
                        explain="한방약족탕에 지친 발도 쉬어가는 곳 한방문화센터 한방문화센터는 한의학과 한약학을 전통 생활문화와 연결하여 전시 교육 체험하는 국내 유일의 한의학 박물관이다. 이 곳에서 사상체질 감별· 진단 한방 건강나이 측정 한의학 치료원리 한방바이오 상품체험 등을 통해 한의학의 원리를 배 울 수 있다. 물에 한약을 섞어 발맛사지를 받고 체질에 맞는 한방차 한잔을 더한다면 삶의 지친 몸과 마음이 한결 편해질 것이다.";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==27){
                        telephone="063-281-1530";
                        location1=35.8483399;
                        location2=127.09851079999999;
                        title="전주한지박물관";
                        explain="한국 최초의 종이 관련 박물관으로 종이의 역사적 변천과정과 종이 관련 유물 및 자료 1200여 점을 전시하고 있다. 특히 한지를 직접 제작 체험해 볼 수 있는 체험형 테마박물관이다. 정보와 문화의 시대인 21세기 ... 종이와 출판문화의 본고장인 전주에 위치한 팬아시아 종이박물관은 재미있는 종이나라로 여행을 떠나볼 수 있는 테마형 박물관이다. 종이와 종이문화의 모든 것을 선보이기 위해 국내 최초로 1997년 10월 21일에 건립된 팬아시아 종이박물관은 인류의 종이문명 발달사와 더불어 관련 유물 등을 체계적으로 소개 전시하고 있을 뿐만 아니라 관람객들이 직접 우리의 전통한지를 만들어 볼 수 있으며 컴퓨터 검색시스템을 통해 종이공예품 유물들을 만져보고 자세한 정보도 알아보고 종이접기를 통해 상상의 나래를 펼 수 있는 기회를 제공하는 등 참여형 박물관을 표방하고 있다. [교통정보] 시내버스 : 정비공단 한화정공 하나로마트 방향 버스(70-1 73-1 77 78-4 84 165번) 이용 팬아시아페이퍼코리아(또는 남양아파트 입구) 앞에서 하차 택 시 : 터미널·전주역에서 약 30분 정도 소요 승 용 차 : 호남고속도로 전주ic→월드컵 경기장 방향→정비공단→팬아시아 종이박물관 [주변 정보] 음식점 : 갑기회관 고궁 기 타 : 덕진공원 동물원 한국 소리문화의 전당";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==28){
                        telephone="063-281-6550";
                        location1=35.8309877;
                        location2=127.1153256;
                        explain="서신동 주민센터와 함께 위치한 서신도서관은 대단위 아파트 밀집 지역에 있는 시립도서관으로 문화센터와 평생교육의 기능을 다양하게 수행하고 있습니다.규모 : 도서관(3~5층) / 연면적(2594.3㎡) 부지(2016㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[일반자료실(일반자료실 전자정보코너) 종합열람실(노트북코너 간행물코너) 어린이자료실열람실 3실(3층 4층 5층 468석)부대시설(강당 강의실-25석 식당(매점) 휴게실)장애인화장실(1층 2층 3층) / 수유실(3층 유아실 내)";
                        title="전주서신도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==29){
                        telephone="063-281-6409";
                        location1=35.8395351;
                        location2=127.16344890000005;
                        explain="1996년 12월 19일에 개관한 인후도서관은 아파트 밀집지역 내에 위치하여 지역민의 독서문화환경 조성에 이바지 하였으며 또한 조망이 뛰어나고 학습 분위기가 좋아 수험생이나 취업준비생들이 선호하는 도서관으로 알려져 있습니다.규모 : 지상3층 지하1층 / 부지(5596㎡) 건물(2519.21㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[일반자료실 전자정보실 간행물코너 어린이자료실]열람실(2층 3개실 296석) 연구실(2층 2개실 40석)부대시설(강의실(교양교실)-3층 40석 식당(매점) 휴게실)장애인화장실(12층 남녀화장실 공동 사용) / 수유실(1층 어린이자료실 내)";
                        title="전주인후도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==30){
                        telephone="063-281-6448";
                        location1=35.836314;
                        explain="1980년 4월 15일에 개관한 금암도서관은 전주 시민의 추억이 깃든 가장 오래된 도서관으로 2015년 7월에 시민들의 이용편의를 돕고자 자료실 열람실을 리모델링하여 쾌적한 도서관으로 새롭게 태어났습니다.규모 : 지상3층 지하1층 / 부지 20580㎡ 건물 2664.98㎡운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(일반자료실 전자정보코너) 노트북실 간행물실 어린이자료실 열람실(제12열람실 / 312석) 연구실(48석)부대시설(강의실 휴게실)장애인화장실(1층 남자화장실 3층 여자화장실) / 수유실(1층 아동실 내)";
                        location2=127.14009570000007;
                        title="전주금암도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==31){
                        telephone="063-284-2323";
                        location1=35.8165756;
                        location2=127.15346160000001;
                        explain="대한제국 황손의 집 승광재입니다.";
                        title="승광재";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==32){
                        telephone="063-224-3088";
                        location1=35.7963173;
                        location2=127.1223579;
                        explain="2014년부터 (사)전통예술원 모악이 삼천문화의집을 맡아 운영하게 되었습니다. 삼천문화의집은 문화와 예술을 통해서 지역과 사람이 만나는 공간. 지역민이 주체가 되어 삼천지역의 문화예술을 만들어 가고 향유하는 문화 놀이터입니다. 또한 문화예술을 통해 서로간의 소통과 생활의 즐거움과 활력이 되고자 하는 분들에게 항상 열려있는 곳입니다. 이용안내전주시민이면 누구나 무료로 이용 할 수 있습니다. 비디오도서 등은 문화의집에서 항시 이용 하실 수 있습니다. (사용하실때는 이용자 기록부 서명 후 이용하시기 바랍니다.) 문의전화 : 063-224-3088 / 팩스 : 063-224-3089 시설현황소 재 지 : 전주시 완산구 거마중앙로 49 삼천2동 주민센터2층 (560-807) 대 표 자 : 관장 최기춘 시 설 규 모 : 131평 이용시설 : 일꾼방(안내데스크) 뒹굴뒹굴 왁자지껄 두근두근 쿵짝쿵짝 상상카페 도란도란 이용시간 평일토요일휴관09:30~18:3010:00~17:00일요일공휴일임시공휴일";
                        title="삼천 문화의 집";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==33){
                        telephone="063-282-1033";
                        location1=35.8175663;
                        location2=127.15029060000006;
                        explain="전주한옥마을과 동문예술거리를 잇는 거리에 위치한 한옥마을 아트홀은 (前우듬지소극장) 2008년 7월 5일 개관하여 매년 창작초연작을 발표하고 전북최초 2년 연속 150일간의 장기공연과 년250일 정도의 공연을 진행하였습니다. 또한 자체 창작극 위주의 공연으로 오직 전주한옥마을 아트홀에서만 관극하실 수 있는 연극작업을 하는 곳입니다. [한옥마을 문예열전-마이크없는 소리]와 [동문예술거리 젊은연극제]등을 개최하며 새로운 기획을 시도하고 있으며 2013년 10월 우듬지소극장에서 한옥마을 아트홀로 명칭을 바꾸고 재개관한 후 2014년 5월~2017년 5월까지 [Play 30 project-3년동안 30편의 연극공연]을 진행하고 있는 전천후 연극전용공간입니다.";
                        title="한옥마을 아트홀";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==34){
                        telephone="063-273-5501";
                        location1=35.8221083;
                        location2=127.13629370000001;
                        explain="☞ 연간행사   - 학기중 문화교육 프로그램 : 3~6월(봄학기) 9~10월(가을학기)   - 방학특강 문화교육 프로그램 : 1월(겨울) 8월(여름)   - 공공청소년 수련시설 프로그램 운영     . 5월 : 가족과 함께하는 전래 인형극 공연     . 6월 : 청소년 문화의집 한돌잔치     . 7월 : 우리문화 체험캠프     . 8월 : 청소년 창작 그룹댄스 페스티벌     . 9월 : 청소년 이웃사랑 자선 콘 서트     . 11월 : 학생의 날 기념 인터넷 정보사냥대회     . 12월 : 청소년 송년잔치 ☞ 이용시간   - 무휴관 원칙 운영     . 월~토 : am 09:00~pm 08:00     . 일요일 : am 11:00~pm 06:00     . 방학중 : am 10:00~pm 08:00 ☞ 이용비용   - 인터넷 사용 : 시간당 500원   - 문화관람실 : 1일 대관료 40000원 ☞ 동아리 현황   - 댄스동아리 : 10팀 u.n.c(고교생 20명) e.y.c(중.고생 8명) n.t.a(중생 8명) r.o.d(고교생 18명)     terg-m(고교생 8명) u.d.c(중.고생 6명) do-out(고교생 11명) 제스처(고교생 4명) 용들림(고교생 8명)     하이라이트(중.고생 5명)   - 연극동아리 : 느낌(고교생 9명)   - 만화동아리 : 만화방(중.고생 10명)   - 과학동아리 : jy(고교생 28명) ☞ 약도 및 교통편   - 교통편 : 시내버스 덕진구 방향에서 중앙성당 앞에서 하차. 완산구 방향에서 코아백화점 앞에서 하차.";
                        title="전주시 청소년 문화의 집";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==35){
                        telephone="";
                        location1=35.812608;
                        location2=127.156374;
                        explain="";
                        title="장현식고택";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==36){
                        telephone="063-226-5193";
                        location1=35.814618;
                        location2=127.12725560000001;
                        explain="[시설내용]  ㅇ 문화체험의 공간    - 인터넷부스 : 인터넷을 자유롭게 이용하여 필요한 정보를 검색할 수 있는 공간    - 비디오부스 : 재미있고 유익한 영화를 선택하여 관람할 수 있는 공간    - 컴퓨터교육실 : 컴퓨터를 활용할 수 있도록 배우는 공간    - 열린독서실 : 조용히 책을 읽으면서 공부도 할 수 있는 공간    - 자료실 : 다양한 문화를 접할 수 있도록 정보를 제공하는 공간  ㅇ 문화창작의 공간    - 창작공방 : 다양한 문화창작 활동 및 동호인의 모임 공간    - 공연연습실 : 락 풍물 무용 음악등을 연습할 수 있는 공간    - 댄스연습실 : 댄스를 연습하는 공간  ㅇ 문화생활의 공간    - 야외쉼터 : 지역주민과 청소년들의 다양한 만남이 이루어지는 공간    - 다목적실 : 소규모 공연 영화감상 작품전시회 등을 체험할 수 있는 공간    - 체력단련실 : 운동을 통하여 체력을 기르고 친목을 도모하는 공간  ㅇ 안내/만남의 공간    - 안내데스크 : 문화의 집 이용을 안내하는 공간    - 휴게라운지 : 휴식과 만남의 장으로 간단한 담소를 나눌 수 있는 공간  ㅇ 주요프로그램    >상시프로그램(연중 연속프로그램)    - 열린학습프로그램 어린이 논술교실 어린이 독서교실 어린이 글짓기교실 방과 후 숙제지도    - 정보학습프로그램 컴퓨터기초교실 워드자격증교실 인터넷정보교실    - 놀이학습프로그램 어린이 풍물교실 어린이 난타교실 어린이 드럼교실    - 창의성개설 프로그램 어린이 생활공예 어린이 종이접기 아동미술지도   >특별프로그램    - 전래놀이 한마당(연 1회)    - 여름방학 체험학교(연 2회)    - 테트리스 및 정보검색대회(연 1회)    - 전통문화 축제(연 1회)    - 코스프레 및 만화축제(연 1회)    - 청소년문화의 광장 축제(연 4회)    - 청소년 동아리 축제(연 2회)    - 청소년 풍물· 사물 경연대회(연 1회)    - 중· 고생 자치교실 및 어울마당(14개학교)    - 청소년 문화유산기행(연 1회)    > 동아리활동 (현재 12개 분과 45개 동아리 활동 중)    - 풍물동아리(12개팀) - 컴퓨터동아리(4개팀)    - 그룹사운드동아리(4개팀)    - 코스프레동아리(3개팀)    - 연극동아리(1개팀)    - 수화동아리(1개팀)    - 댄스동아리(4개팀)    - 자원봉사동아리(5개팀)    - 문학동아리(3개팀)    - 기타동아리(2개팀)    - rcy 동아리(4개팀)    - 신문편집동아리(2개팀)   > 주변학교 위탁 ca     - 풍물 자원봉사 다도 기타. 컴퓨터 등등  > 어머니 교실    - 상반기 9개 강좌 - 하반기 9개 강좌 컴퓨터 교실 인터넷기초교실 워드자격증교실 장구교실      풍물교실 노래교실 종이접기교실 한지공예 요가교실 아동미술지도기초";
                        title="완산 청소년 문화의집";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==37){
                        telephone="063-285-0002";
                        location1=35.8143906;
                        location2=127.15318049999996;
                        title="전주공예품전시관";
                        explain="전통상품관 섬유관 한지관 명품관 BUY전주관으로 구성되어 있어 공예품을 전시판매하는 공간";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==38){
                        explain="3년간의 야간교육이 주 4일째로 있습니다.";
                        telephone="063-283-5251";
                        location1=35.814052;
                        location2=127.15142130000004;
                        title="고전번역교육원";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==39){
                        explain="";
                        telephone="";
                        location1=35.812584395211985;
                        location2=127.15665221214294;
                        title="정읍고택";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==40){
                        explain="2010년 11월 6일에 개관한 어진박물관은 전주의 새로운 관광자원으로서 경기전과 태조어진을 중심으로 다양하고 격조 높은 전시를 통해 찬란한 조선왕실 문화유산의 보존·관리 및 선양의 중심지이다. 어진실 -태조어진(보물 제931호)과 새로 모사한 6분의 어진(세종 영조 정조 철종 고종 순종) 전시 -경기전 정전의 침실과 똑같은 모형을 만들어 장엄하게 연출 역사실 -전주에 태조어진을 봉안한 이래 현재까지의 경기전과 태조어진의 역사 이야기를 담았음 -전란을 피해 태조어진을 지켜온 내용과 경기전의 운영과 관리조직 각종 제례 경기전 건축 등을 유물을 통해 살펴 봄 가마실 -1872년 태조어진을 봉안할 대의 행렬과 당시 사용했던 각종 가마에 대한 내용을 담았음 -어진의 이안이나 봉안에 사용했던 가마인 신연을 비롯해 채여 가교 등 전시 기획전시실 -세계문화유산으로 지정된 조선왕릉 특별전 개최 중 -조선왕릉 특별전은 517년 27대에 걸친 조선왕조의 흥망성쇠를 한눈에 볼 수 있는 전시임 반차도 -1872년의 태조어진 봉안행렬을 각종 문헌자료와 고증을 통해 닥종이 인형으로 제작ㆍ전시";
                        telephone="063-231-0090";
                        location1=35.8153146;
                        location2=127.14975690000006;
                        title="태조어진 박물관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==41){
                        explain="한지산업지원센터는 한지의 문화와 산업을 종합적 체계적으로 연구 개발 교육하는 전국 최초의 한지관련 R&D 연구기관이자 전시 체험 홍보 교육 공간을 동시에 보유 활용하고 있는 신(新) 융복합 형태의 우리나라 유일무이한 한지관련 전문기관입니다. 2010년 지하 1층 지상 4층 규모로 건립됐으며 전시 및 한지체험 공간으로 1층 상품전시실 한지문화체험실 한지제조체험실 2층 홍보관 및 기획전시실 등을 갖추고 있으며 3~4층은 연구개발·교육 공간으로 활용되고 있습니다. 특히 1층 상품전시실에선 생활용품에서 인테리어용품 의류까지 다양한 한지 제품과 응용 문화상품들을 전시하면서 일반인의 수요를 유도 한지관련 업체에 바로 수익이 창출되도록 연계시키고 있으며 한지제조실은 동시에 40여명이 한지를 직접 만들어 볼 수 있으며 한지문화체험실에선 다양한 한지문화체험을 창의적으로 디자인해 볼 수 있습니다. 2층 홍보관은 영상 등 멀티미디어 매체를 통해 한지의 역사와 제조 과정 신소재로서의 다양한 기능까지 볼 수 있는 공간이며 기획전시실에선 연중 다양한 기획전시를 계획 운영하고 있습니다. 한지산업지원센터에 오시면 한지의 모든 것을 보고 느끼고 체험할 수 있습니다. [주변정보] 경원동 옛 전북도청 2청사에 위치해 있으며 전주 한옥마을 전주 시내권 및 전주 시청에 인접해 있다.";
                        telephone="063-281-1530";
                        location1=35.8206769;
                        location2=127.14828209999996;
                        title="한지산업지원센터";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==42){
                        telephone="063-285-0002";
                        location1=35.814394;
                        location2=127.15308;
                        explain="영업시간 오전10시~오후7시까지 영업(하절기) 영업시간 오전10시~오후6시까지 영업(동절기)";
                        title="천년전주명품ONN";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==43){
                        explain="지역 최초의 어린이 전문도서관으로 2009년 7월 롯데마트가 무상기증하여 도서관 사랑모임 단체가 위탁운영중이다. 전주 책마루 어린이도서관은 2만2천여권의 장서가 구비되어 있으며날마다 책읽어주기 원화전시회 음악회 주말영화상영 등 다양한 프로그램을 제공하고 있다. 자료실 약 270 평 (열람실 포함) 부대시설 약 30 평 (솔내마루 교양교실) 블로그주소 http://blog.daum.net/bookfloor";
                        telephone="";
                        location1=35.8544454;
                        location2=127.12115199999994;
                        title="전주책마루어린이도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==44){
                        explain="종합문화예술 활동의 전당으로 최신 무대시설을 갖추어 순수문화예술과 대중예술 공연 전시를 만날 수 있는 공간이다. 2600평 규모의 전북 최고시설을 갖춘 문화행사공연장으로써 내부 소렌토레스토랑 밖으로는 ''들꽃''이란 화원이 갖춰져 있어 전주시민의 휴식공간 으로 각광을 받고 있다. 공연장과 전시장으로 이루어진 학생회관은 연면적 5943평방미터의 지상3층 지하1층의 규모로 전라북도교육청에서 운영하는 학생들의 문화터전으로 유치원아동들의 학예회에서부터 어른에 이르기까지 다양한 문화행사가 펼쳐지는 곳이다.";
                        telephone="063-270-2089";
                        location1=35.84322660000001;
                        location2=127.13002630000005;
                        title="전북대학교 삼성문화회관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==45){
                        telephone="063-288-6138";
                        location1=35.8162836;
                        location2=127.1535897;
                        explain="영업시간 따로 없음 월요일 휴관 화~일요일 개관 외국 관광객들의 큰 호응을 얻음";
                        title="전주자수민속박물관";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==46){
                        telephone="063-280-7051";
                        location1=35.8119872;
                        location2=127.15849300000002;
                        title="전주한벽문화관";
                        explain="전통과 현대가 조화롭게 어우러지는 곳 전주한벽문화관은 도심 속에서 전통의 멋스러움을 느낄 수 있는 곳입니다. 국악전용 한벽극장 전통음식관 한벽루 조리체험실 교육체험관 경업당 전통혼례식장 화명원 전통찻집 다향 놀이마당 등의 시설이 갖추어진 전주한벽문화관은 복합적인 문화공간으로써 우리나라의 전통생활문화를 느껴볼 수 있는 공간입니다. ￭ 한벽극장 - 한벽극장은 판소리·기악·한국무용·타악 등 전통예술관련 공연을 담아내고 있는 공연장으로 30평 정도의 무대와 총 250석의 규모로 이루어져 있습니다. ￭ 교육체험관 경업당 - 교육체험관 경업당은 36평 정도 되는 한옥 건물로 전통의례 의상 공연 음식 등 우리 전통문화를 체험할 수 있는 곳으로 전통의 숨결을 느낄 수 있습니다. ￭ 조리체험실 - 30여 평 규모의 최신식 조리실과 조리대 영상 강의시설 등을 갖춰 놓은 조리체험실은 전주 전통음식인 비빔밥 떡 다과 등을 직접 만들어 볼 수 있는 곳입니다. ￭ 전통음식관 한벽루 - 전통음식관은 98평(총 164석)의 너른 공간에 VIP실 온돌식 마루 일반 테이블로 구성되어 있으며 품격있는 전주 음식의 맛과 멋을 느낄 수 있는 곳입니다. ￭ 전통찻집 다향 - 40평 규모의 전통찻집 다향은 아름다운 주변 경관과 더불어 따뜻한 차 한잔의 여유를 즐길 수 있는 곳이며 은은한 차향의 깊이를 느낄 수 있는 곳입니다. ￭ 전통혼례식장 화명원 - 전통의 멋이 살아있는 34평의 전통혼례식장 200평의 넓은 공간으로 잔칫날 분위기를 되살리기에 충분한 초례청(혼례마당)은 뜻깊은 날을 더욱 의미있게 만들어 줍니다. ￭ 놀이마당 - 전통문화센터의 중앙에 자리잡고 있는 75평 규모의 놀이마당은 다양한 전통공연을 관람할 수 있을 뿐만 아니라 각종 민속놀이를 할 수 있는 곳입니다.";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==47){
                        telephone="063-223-5651";
                        location1=35.8010305;
                        location2=127.09013709999999;
                        explain="국립전주박물관은 1990년에 개관한 이래 전라북도의 문화유산을 수집·보존하고 연구·전시·교육을 담당하고 있다. 다양한 주제의 전시를 기획하여 특별전과 학술 활동을 추진함으로써 전라북도의 역사와 문화를 심도있게 소개하고 있다. 특히 조선의 선비문화로 특성화된 전시 등 학술활동을 중점 추진하고 있으며 부안 죽막동 제사유적 연구 후백제 역사복원 부안 유천리 청자 보존 등 전북의 중요한 연구 과제를 추진하여 지역 연구 발전에도 매진하고 있다. 또한 지역민들을 대상으로 박물관 활동에 참여할 수 있는 다양한 프로그램을 개발·운영하고 있다. 전라북도 지역문화를 선도하는 중심 문화기관이다.";
                        title="국립전주박물관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==48){
                        telephone="063-232-5250";
                        location1=35.8161489;
                        location2=127.15366310000002;
                        explain="";
                        title="여명 카메라 박물관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==49){
                        telephone="063-231-0771";
                        location1=35.8176573;
                        location2=127.15334830000006;
                        title="전주소리문화관";
                        explain="판소리를 중심으로 전통문화 공연예술 인프라를 구축하고 보존과 창작 활동을 지원하는 전주소리문화관은 판소리 역사를 알 수 있는 기획전시실 및 국창 오정숙 기념관을 운영하고 있으며 이 밖에도 다양한 체험 및 교육 국악 공연 프로그램을 진행하고 있다.";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==50){
                        telephone="063-212-9069";
                        location1=35.8159226;
                        location2=127.15352389999998;
                        title="전주전통한지원";
                        explain="전통 한지제조 기법이 오롯이 재현되는 전주전통한지원 전주전통한지원은 천년 정신이 담긴 순수 우리한지만을 생산하는 곳이다. 이곳에서 생산되는 한지의 80% 이상이 일본에 수출되고 나머지는 국내에서 소비되고 있다. 한지는 다른 종이들과는 달리 조상들의 장인정신이 배어 있는 소중한 유산으로 한지 자체가 하나의 예술품이다. 이곳에서는 한지뜨기 무늬넣기 말리기 등의 한지 제작 과정을 배워볼 수 있다.";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==51){
                        telephone="063-288-9242";
                        location1=35.8124684;
                        location2=127.15655479999998;
                        title="전주전통문화연수원";
                        explain="전주동헌 장현식고택(안채중간채) 임실진참봉고택(사랑채) 정읍고택(별채)로 구성되성 있음";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==52){
                        telephone="";
                        explain="";
                        location1=35.812419;
                        location2=127.156298;
                        title="전주동헌";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==53){
                        telephone="063-275-0186";
                        location1=35.8311932;
                        location2=127.13953449999997;
                        explain="진북문화의집이 위치한 진북동은 전주시 중심부에 자리하며 구도심과 신도심의 중간지대 전통과 현대가 상존하는 ‘부도심(副都心)’적 특성을 갖고 있는 지역입니다. 전주시 장기발전계획에 따르면 문화예술권으로 분류되어 있기도 합니다. “생활 속의 문화예술공간”을 지향하는 진북문화의집은 문턱 없는 문화공간으로 마을공동체 주인공인 시민들이 배우고 소통하며 참여하는 문화예술 활동의 기초이자 토대가 되고자 합니다. 이용안내전주시민이면 누구나 무료로 이용 할 수 있습니다. 방문하시는 분들은 안내데스크에 있는 이용자 기록부 작성 후 이용하시기 바랍니다. CD 음반 도서 비디오 등은 문화의 집에서 항상 이용하실 수 있습니다. 문의전화 063-275-0186 / 팩스 : 063-271-0187 이용시간 평일토요일휴관10:00~19:0010:00~17:00일요일 공휴일";
                        title="진북문화의 집";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==54){
                        telephone="063-278-4288";
                        location1=35.8692002;
                        location2=127.12901720000002;
                        explain="청소년들이 일상생활권 내에서 여가시간을 활용하여 다양한 문화체험과 정보화능력을 함양할 수 있는 전주시립 솔내청소년수련관이 송천동에 첨단정보·문화시설을 갖추고 2002.3월에 지역사회 청소년과 지역주민들을 대상으로 개관하였다.  [주요프로그램] ＊상시프로그램＊       - 가요댄스 월화수 - 종이접기 화목 - 풍물교실 월수금        - 에어로빅 월~토     - 댄스스포츠 수금     - 풍물교실 월수목     - 요가 화목금  ＊특별프로그램＊     - 청소년 문화광장 : 청소년들에게 건전한 문화와 여가활용을 위한 문화행사     - 청소년 동아리축제 : 청소년 동아리들의 기량을 마음껏 발휘할 수 있는 공연행사     - 방학프로그램 : 초등학생들의 방학숙제 고민을 풀어주고 다함께 즐기는 현장체험행사     - 솔내 예술제 : 수련관 전체회원들이 하나로 어우러지는 솔내축제";
                        title="솔내청소년수련관";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==55){
                        telephone="";
                        location1=35.812584395211985;
                        location2=127.15665221214294;
                        title="임실 진참봉 고택";
                        explain="";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==56){
                        telephone="";
                        location1=35.8524237;
                        location2=127.1304375;
                        title="혼불문학공원";
                        explain="";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==57){
                        telephone="063-281-6510";
                        location1=35.8693297;
                        location2=127.12810999999999;
                        title="전주송천도서관";
                        explain="2005년 12월 26일에 개관한 송천도서관은 북부권 시민들을 위해 다양한 독서문화프로그램을 제공하여 평생교육센터로서 역할을 수행하고 있습니다.규모 : 지상3층 지하1층 / 부지(5277㎡ 건물(3367㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(일반자료실 전자정보코너) 간행물코너 어린이자료실]열람실(제12열람실-23층 280석) / 노트북실(1층 37석)부대시설(강당 강의실(세미나실 48석) 식당(매점) 휴게실)장애인화장실(남자화장실 1층3층 여자화장실(2층) / 수유실(1층 유아자료실 내)";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==58){
                        telephone="";
                        location1=35.81126192460023;
                        location2=127.1524840593338;
                        title="강암서예관";
                        explain="";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==59){
                        telephone="063-273-7997";
                        location1=35.8451631;
                        location2=127.12017919999994;
                        title="덕진동 청소년문화의 집";
                        explain="우리사회의 미래인 청소년들에게 자신의 적성과 소질을 개발 할 수 있는 공간을 제공하고 있으며 건전한 문화창작활동을 할 수 있는 시설과 프로그램을 운용하고 있습니다. 청소년이 행복한 자아를 찾는 공간으로 활용되었으면 합니다.   >> 시설현황    ㅇ 정보의 공간 : 지식화 정보화시대의 미래를 준비하는 공간으로 활용  ＊ 인터넷 부스 ＊    ㅇ 시설현황 : 인터넷 11대 영상편집기 2대    ㅇ 시설이용 : 인터넷 정보검색 컴퓨터 활용 교육 문서작성  ＊ 열린독서실 ＊    ㅇ 시설현황 : 도서 900여권 영상과 청소년 권장 잡지 중앙 및 지역신문    ㅇ 시설이용 : 도서 열람 독서토론 소모임 학습 자율학습  ＊ 문화의 공간 ＊    ㅇ 다양한 문화를 체험하고 직접 건전한 창작활동을 통해 자신의 소질과 적성을 개발할 수 있는 공간       으로 활용 ☞ a / v    ㅇ 시설현황 : 42인치 프로젝션 tv(비디오 dvd 겸용) 관람석(24석)    ㅇ 시설이용 : 가족단위 영화감상 테마영화상영 비디오자키 활동 소규모 행사 ☞ 비디오 감상실    ㅇ 시설현황 : 29인치 tv 모니터 비디오(dvd겸용) 2대 무선 헤드폰    ㅇ 시설이용 : 영화감상 영상토론 영상제작 교육 ☞ 다목적실    ㅇ 시설현황 : 다목적 음향시설 좌석 72석 전면거울    ㅇ 시설이용 : 각종 행사/ 공연/ 전시/ 회의 댄스/ 기타 / 노래연습 공간 ☞ 만남의 공간 : 청소년의 다양한 모임과 동아리 활동을 할 수 있는 공간 ☞ 동아리방    ㅇ 시설현황 : 비디오 tv 사물함    ㅇ 시설이용 : 청소년 동아리 모임 및 활동 소규모 회의 ☞ 놀이의 공간 : 건전한 여가활동을 즐기는 공간으로 활용 ☞ 포켓볼    ㅇ 시설현황 : 포켓볼 당구대    ㅇ 시설이용 : 청소년 ca 활동 포켓볼 동호회 >> 주요 프로그램    ㅇ 청소년 문화활동 분야 - 음악교실 재즈댄스 교실 어린이 힙합교실 어린이 축구교실 중학교 ca 활동 지도    ㅇ 청소년 미디어 분야 - 영상제작교실 비디오자키 교실    ㅇ 지역 사회봉사 활동 분야 - 무료한방진료 독거노인 돌보기 우리동네 체험학교    ㅇ 청소년 인성교육 분야 - 청소년 환경생태체험 창의력 기르기 리더쉽 기르기 방과후 교실    ㅇ 청소년 상담 분야  - 청소년 상담 성격검사 적성검사    ㅇ 주민교양강좌 분야  - 주부 노래교실 주부 공예교실 다도교실 요가교실    ㅇ 기획행사 - 청소년 문화학교 동아리 창작 발표회";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==60){
                        telephone="063-287-1245";
                        location1=35.8154615;
                        location2=127.15115289999994;
                        title="교동미술관";
                        explain="영업시간 오전 10시~오후11시까지 영업 월요일은 휴관이며 화요일~일요일 6일간 오픈되어 있습니다";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==61){
                        telephone="063-228-9076";
                        location1=35.8065598;
                        location2=127.11034089999998;
                        title="효자문화의집";
                        explain="우리생활에 향기를 갖는 것은 창조적인 문화 활동을 통해 이루어집니다. 우리사회의 향기가 가득하면 그것이 곧 문화도시로서의 모습을 갖춰나가는 것입니다. 삶의 꽃은 문화 활동입니다. 삶의 꽃을 가꾸는 것은 남의 것이 아닙니다. 자기 삶을 바라보고 꾸미는 것은 사람이 꽃처럼 아름다울 수 있는 길입니다. 효자문화의집은 나눔의 공간에서 삶을 가꾸고 사회를 행복하게 하는 창조공간을 꿈꾸며 여러분과 함께 만들어 가고자 합니다. 이용안내전주시민이면 누구나 무료로 이용 할 수 있습니다. 방문하시는 분들은 안내데스크에 있는 이용자 기록부 작성 후 이용 하시기 바랍니다. CD 음반 도서 비디오 등은 문화의 집에서 항상 이용하실 수 있습니다. 문의전화 063-228-9074~6 / 팩스 : 063-228-9075 이용시간 평일토요일휴관10:00~19:0010:00~17:00일요일 공휴일";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==62){
                        telephone="063-284-0570";
                        location1=35.8156135;
                        location2=127.15136600000005;
                        explain="‘혼불’의 작가 최명희. 그의 문학적 성과를 기리기 위한 최명희문학은 전주 유일의 문학관이다. 작가로서의 최명희와 그의 작품을 발굴하고 재조명하는 사업을 중심에 두면서도 전주시민 들이 문학과 창작에 관심을 가질 수 있는 다양한 문학행사도 열고있다. 또한 지역의 문화예술인들이 소통하는 공간이자 한옥마을 내 명물로 자리 잡았다.";

                        title="최명희문학관";
                        Facility_classification="전통시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==63){
                        telephone="063-285-7442";
                        location1=35.8112456;
                        location2=127.15249130000007;
                        title="강암서예관";
                        explain="붓끝에 서린 전주의 숨결 국내 유일의 서예전문전시관으로 이 고장출신의 서예가 강암 송성용의 뜻으로 세워졌다. 추사 김정희 창암 이삼만 단원 김홍도 다산 정약용 등 송성용선생이 평생에 걸쳐 수집한 국내 유명서예가의 작품 1천여 작품을 전시하고 있다. '예향' 서예의 도시 전주의 분위기에 흠뻑 취할 수 있다. 전주의 관문이라 할 수 있는 호남제일문과 호남제일성의 현판도 강암 송성용 선생의 휘호이다";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==64){
                        telephone="063-211-7401";
                        location1=35.8513807;
                        location2=127.08702820000008;
                        explain="주요 프로그램 내용 1. 디딤학교   1) 교육 기간 및 구성    (1) 1주일제 2주일제 3주일제 4주일제의 단기형으로 운영    (2) 월-금 주 5일 6교시 과정 운영(토요일은 기획 프로그램 운영)   2) 교육 대상 : 전주시에 거주하는 중학교 과정의 위탁 교육생(학교 학부모 추천)   3) 교육내용    (1) 메인 프로그램 : 컴퓨터반 영상제작반 사진반 애니메이션만화반 창작댄스반 심성 수련반 우리문화반    (2) 통합 프로그램 : 사귐의 시간(레크레이션) 자아 찾기 자원봉사 및 노작 활동 명화감상 공동체 놀이                               마음공부 현장체험 학습 다함께 요리    (3) 특별 프로그램 : 요가 고운 우리말(국어) 수학과 친해지기(수학) 영어와 놀기(영어) 피아노 연주                               국악 및 풍물 연주 이ㆍ미용 메이크업 밴드 및 악기 연주 주간신문 만들기 심리 검사                               및 특기ㆍ적성 검사 2. 청소년 대상 프로그램   1) 청소년열린교육 캠프 : 여름방학 겨울방학을 이용한 문화 강좌 및 전문 강좌 등 교육 수련 프로그램 실시   2) 리더십 교실 : 중학교에 재학중인 간부 학생들에게 다양한 프로그램 및 사회ㆍ문화적 체험 활동을 제공                          하여 리더로서의 역할 수행 능력 향상 훈련 활동 3. 기타 프로그램   1) 지역 주민 화합 프로그램 : 풍물 영화감상 인터넷 등 시설과 프로그램 활용   2) 늘푸른마을(임대아파트) : 어울마당 영화감상 상담 다양한 문화 공동체 활동을 통한 건전하고 쾌적한                                          생활 공간 확보 및 공동체 의식 함양 ☞ 센터 이용 시간 : 오전 08:00 ~ 18:00 ☞ 사용료 : 무료(교육 및 인터넷) 특별 프로그램 및 장소 대여 (실비) ☞ 약도 및 교통편    1) 팔복동 - 하나로 마트행 버스 탑승 후 한화베어링 앞에서 하차 - 맞은 편 건물    2) 버스노선 : 31-7 165 73-1 80 84 74 70-1 78-4 77 46-1 87-1 6 229 59-7";
                        title="전주시청소년자유센터";
                        Facility_classification="문화센터";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==65){
                        telephone="063-281-1559";
                        location1=35.820579;
                        location2=127.1482;
                        explain="리빙콘텐츠DIT센터는 언제든 누구나 무엇이든 만들 수 있는 메이커스페이스*로 생활 속 아이디어로 실용적인 생활용품을 함께 만들며 메이커 문화를 실천할 수 있는 일반인 누구나 함께 참여할 수 있는 참여형 콘텐츠 생산공간입니다. *메이커스페이스란 만들기에 필요한 도구를 갖춰놓은 장소로 반짝이는 내 아이디어를 시제품으로 만들어 볼 수 있고 관련 체험 프로그램을 통해 만드는 방법도 배울 수 있는 일반인 누구나 참여할 수 있는 장비와 도구가 갖춰진 공간입니다. □ 이용가능시간 : 월-금 10:00-2:00 토 10:00-17:00 / 매주 일요일 휴관 □ 시설안내 o 교육실 : 교육 및 워크샵 공간 o 창의공작실 : 자유제작 실습공간 o 목업실 : 목업 장비 사용 공간 o 커뮤니티실 : 메이커들의 자유로운 교류 공간 o 전시실 : 멀티스페이스 o 라이프리빙실 : 메이커 멘토링 회의공간 □ 이용요금 o 공간이용 : 5000원 - 창의공작실 커뮤니티실 기본손공구 이용 커피 무료 - 1회 1일 3시간 이내 ※장비 이용시 2000원 o 장비이용 - 3D 프린터 : 3000원 - 레이저가공기 : 18000원 - 재봉틀 : 3000원";
                        title="리빙콘텐츠DIT센터";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==66){
                        telephone="063-287-6300";
                        location1=35.8175162;
                        location2=127.15302229999998;
                        explain="사무국 : 명품김치산업화 사업 추진 운영 교육 접수 등 다경루(한식교육관) : 김치 및 향토음식 전문강좌 주말 어린이 김치강좌 세미나 대관 등 안채(김치체험관) : 계절김치아카데미 향토음식 체험 강좌 등 김치전시관 : 김치관련 자료 교육컨텐츠 영상 상영 스토리텔링 등 BUY전주상품 전시홍보관 : BUY전주 우수식품 상설 전시 홍보관 김치 시식관 등 마당 : 김장축제 단체체험프로그램 버스킹 공연 등";
                        title="김치문화관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==67){
                        telephone="063-287-2012";
                        location1=35.8210166;
                        location2=127.14979349999999;
                        title="전주시민놀이터";
                        Facility_classification="관람시설";
                        explain="시설 소개 전국 최초 24시간 개방하는 연습공간입니다. 지역의 전주시민 다양한 동호회 등 전주시민 누구나 연중 사용 가능합니다. 참여형 회원제를 통한 운영으로 시민들의 재능기부 자원봉사 등 자율로 운영합니다. 연습과 발표 교육 및 휴식 등 다목적 공간입니다. 시민 생활 예술 발표 및 교류를 지원합니다. 1층 떠듬 공간에서는 누구나 편하게 이야기를 나누는 공간을 운영합니다. 다양한 작은 모임 회의 작은 발표회 공간으로 열린문화공간으로 운영합니다. 전주시의 다양한 생활 예술 정보 네트워크 센터로 관계망형성을 지원합니다. 준전문가이상 시민 문화예술 활성화로 지역문화의 생동감을 가져옵니다. 준전문가수준 이상의 시민 생활 예술가과 지역예술가와의 연결을 지원합니다. 예술가 연계 지원 및 기획 프로그램을 운영합니다. 시민 생활예술 역량강화 및 네트워크 지원을 통한 지역문화생태계 건강성 확보를 지향합니다. 공간구성 및 활용계획 구분기능개요시설구성1층 이야기놀이터운영 사무실다목적 사무 공간- 사무실떠듬공간모임 까페 등 다용도 공간- 모임 중심형 까페 작은 발표 공간 조성- 셀프 무인 까페 운영회의공간세미나공간- 회의 및 세미나공간배려공간(장애인 연습장)장애인 우선지원 공간- 장애인 편의시설 연습실 작은 갤러리2층 소리놀이터두드림 공간(음악중심 방음 연습장)공연예술장르인활동공간개인연습장- 소리중심의 공연동호회연습실- 방음공간으로 음악동호회위주 연습 공간3층 창작놀이터모듬공간(다목적 연습장)모둠공간(창작공간)다목적연습장 개인연습장단체창작공간- 연습실 간이탈의실 개인사물함 등- 무용 등 연습 공간 및 미술 사진 등 시각예술동호회 위주의 창작 공간";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==68){
                        telephone="063-286-5125";
                        location1=35.8159139;
                        location2=127.15305809999995;
                        title="한옥마을역사관";
                        explain="시설개요 규모대지(476.1㎡) 건물(98.64㎡) / 한옥 2동 주요시설기획전시실 상설전시실·사무실 놀이마당 상설전시실 - 전주 한옥마을의 형성과 변천과정 소개기획전시실 - 한옥마을 옛 사진 특별전관람시간매주 화요일~일요일 10:00~18:00 (월요일 휴관) 한옥마을역사관 해설프로그램 운영 ① 정기해설 운영시간매주 토․일요일 14:00 / 15:00집결장소역사관 상설전시실 앞 마당(예정)해설인원2명운영내용관광객이 집중되는 토․일요일 운영(1일 2회씩)상설전시실 및 기획전시실 순회해설(약 30분 내외)집결인원(20명 기준)에 따라 각 전시실 해설인원 배치 ※ 성수기 및 공휴일 정기해설 탄력적 운영 ② 수시해설 운영시간매주 화~금요일 10:00~18:00해설인원1명운영내용평일(월요일 제외) 비정기적 운영(수시)일반해설은 관람객들의 요청에 따라 탄력적으로 운영단체해설은 사전 예약한 단체(20명 이상) 우선순위로 진행 ※ 수학여행 소풍 관광시즌에 단체관광객 집중 * 정기해설은 5분전까지 집결장소로 모여주세요. ** 단체해설은 정기해설시간에는 진행이 불가합니다. *** 해설예약은 역사관 업무시간(10:00~18:00)에만 가능합니다.";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==69){
                        telephone="063-283-9221";
                        location1=35.8607124;
                        location2=127.1010834;
                        title="팔복예술공장";
                        explain="팔복예술공장은 전주시가 카세트테이프 제작공장으로 운영하다 25년간 멈춰서 있던 산업단지 속 노후산업시설을 예술인 창작공간이자 시민 문화예술놀이터로서의 복합문화공간입니다. (재)전주문화재단이 운영하는 팔복예술공장은 예술가의 재도약과 창작 활동을 지원함으로써 예술창작교류의 거점 역할을 하며 주민과 팔복동 기업을 위한 문화플랫폼을 구축하고 시민이 향유할 수 있는 복합문화시설로 자리매김하고자 합니다. 공간구성 ○ 1단지(‘18.3.23 개관) : 예술창작․전시공간 카페 아트샵 예술놀이터 - 1층 : 창작스튜디오&셀 작업실 카페&아트샵 예술창작공간에는 공모를 통해 선발된 국내외 13팀의 예술가가 입주하여 활동 - 2층 : 전시공간 예술교육 창작스튜디오 - 옥상(3층) : 예술놀이터 ○ 컨테이너 브릿지 : 1단지와 2단지를 이어주는 통로이자 백인의 서재 아카이브 포토존으로 구성 ○ 2단지(‘18.12월 개관예정) : 문화예술교육공간 예술놀이터 등 팔복예술공장은 - 창작-실험-인큐베이팅을 통해서 실험적인 예술창작생태계를 조성하고 장르간 융합시스템 기반을 구축하여 동시대예술의 구현 - ‘예술의 힘’을 통해 예술공장-예술공원-공단예술마을-예술공단을 만드는 팔복산업단지재생의 플랫폼구축 - 아시아문화심장터 전주문화특별시를 실현하기 위한 예술창작교류의 거점조성 - 예술가와 기업 주민의 협업으로 생산과 소비가 일어나는 지역공동체 형성";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==70){
                        telephone="063-283-8887";
                        location1=35.8148687;
                        location2=127.14457849999997;
                        explain="전주미술관은 전북을 대표하는 제1종 사립미술관(경력인증기관)으로 조선시대 전라도 중심이었던 전라감영과 풍남문 인근에 위치하며 기획전시관과 상설전시관 교육실 야외전시장 등을 갖추고 있습니다. 해마다 기획전과 특별전을 통해 관람객과 소통하고 교육 강연 체험프로그램을 진행하는 복합문화공간입니다. 운영시간 : 오전 10시 ~ 오후 6시 휴관 : 매주 월요일 1월 1일 설 연휴 추석연휴";
                        title="전주미술관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==71){
                        telephone="063-272-7223";
                        location1=35.8274854;
                        location2=127.13041509999994;
                        title="우진문화공간";
                        explain="천변의 담쟁이 집 우진문화공간 전주천변길을 따라 걷다보면 만나는 우진문화공간. 거친 노출콘크리트 외벽을 타고 올라가는 담쟁이의 푸르름이 한낮의 뙤약볕을 삼켜버리는 인상적인 이 건물은 전문 예술인의 창작활동을 돕는 공간입니다. 90년대 이후 도내에는 시민의 문화향유를 위한 문화시설은 크게 증가했으나 예술품 생산자들은 문화예술인의 창작활동을 돕는 시설은 답보상태였습니다. 우진문화재단은 문화예술에 대한 시민의 왕성한 욕구와 이에 부응하려는 문화예술인의 창작활동을 지원하기위한새 공간의 필요를 절감하였습니다. 13년간의 서노송동 시대를 마감하고 2004년 전주시 덕진구 진북동에 새 둥지를 튼 우진문화공간은 우진문화재단 문화사업 근거지이자 오랫동안 기다려온 전문 예술인들의 창작의 요람입니다. 문화예술인은 누구나 간단한 신청절차를 거쳐 시설을 편리하게 이용할 수 있습니다. - 시설규모 : 대지 1875.4M2 (568평) 연건평 3481.54M2 (1055평) - 개방시간 : 오전 10시 ~ 밤 10시 매주 월요일 휴관";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==72){
                        telephone="063-281-6490";
                        location1=35.8132624;
                        location2=127.1011393;
                        title="전주효자도서관";
                        explain="2016년 8월 16일에 개관한 효자도서관은 전주 서부권 지역 시민에게 지식정보 제공과 힐링 문화공간으로서의 역할을 수행하고 있습니다.규모 : 지상4층 / 부지(2500㎡) 건물(3220㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(일반자료실 전자정보코너 간행물코너) 어린이자료실]열람실(3층 2개실 223석) / 노트북실(제3열람실 40석)부대시설(강당 강의실(세미나실))장애인화장실(각층 남녀화장실) / 수유실(1층 아동자료실 내 유아실)버스일반190 (비전대학교-평화동종점) 190 (평화동종점-비전대학교) 61 (전주대학교-비전대학교) 104 (농수산시장-평화동종점) 61 (비전대학교-서곡주공) 61 (비전대학교-전주대학교)";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==73){
                        telephone="063-288-5124";
                        location1=35.8157896;
                        location2=127.15384059999997;
                        title="한옥마을선비문화관";
                        Facility_classification="관람시설";
                        explain="100년 전 전주를 거닐다 전통 문화의 도시 전주의 이름을 드높인 선비들의 삶과 사상 그리고 예술세계를 감상할 수 있는 공간이다. 특히 일제강점기 한옥마을로 모여들었던 선비들의 모습을 통해 지금과는 달랐던 100여 년 전 한옥마을을 느낄 수 있다. 단순히 보는 전시에서 벗어나 선비들의 생활과 생각을 체득할 수 있는 체험 시설과 프로그램들이 준비되어 있으며 전시관 입구에 마련된 한옥마을 지도는 전주 선비들의 발자취를 담고 있어 색다른 한옥마을 여행길을 제공한다.";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==74){
                        telephone="063-281-6606";
                        location1=35.856862;
                        location2=127.15127870000003;
                        title="전주건지도서관";
                        explain="2015년 4월 14일에 개관한 건지도서관은 동부권 시민들의 지식 정보 및 문화활동 중심 공간으로서 역할을 수행하고 있습니다.규모 : 지상2층 / 부지(5359㎡) 건물(1472.84㎡)운영시간 및 휴관일 구분자료실열람실일반자료실어린이자료실3월~10월11월~2월 운영시간09:00~19:00 (화~금요일)09:00~18:00 (화~금요일)07:00~23:00 (월~금요일)08:00~22:0009:00~17:00 (토·일요일)07:00~22:00 (토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(전자정보코너) 어린이자료실 간행물실·휴게실)열람실(1·2실 103석) 노트북코너(12석)부대시설(강의실 56석)장애인화장실(12층 남녀화장실 공동 사용) / 수유실(2층 유아실 내)";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==75){
                        telephone="063-281-6527";
                        location1=35.869991;
                        location2=127.07415809999998;
                        explain="2014년 5월 16일에 개관한 쪽구름도서관은 북부권 지역의 지식·정보·문화의 요람으로 지역 특색을 갖춘 문화정보를 생산 유통 소비할 수 있는 지식정보기반 공간구성으로 건립되었습니다.규모 : 도서관(3~4층) / 부지(1878㎡) 건물(4432.56㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(전자정보코너 간행물코너) 어린이자료실]열람실(3층4층 노트북코너)부대시설(강의실 휴게실)장애인화장실(3층 4층) / 수유실(3층 유아실 내)";
                        title="전주쪽구름도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==76){
                        telephone="063-281-6484";
                        location1=35.8263936;
                        location2=127.16194270000005;
                        title="전주아중도서관";
                        explain="2013년 3월 20일에 개관한 아중도서관은 꿈과 상상력을 키우는 어린이 창의도서관으로 일반 도서관과 차별화된 어린이 특화 도서관으로 구성되고 있습니다.규모 : 지상3층 지하1층 / 부지(1430㎡) 건물(2793㎡)운영시간 및 휴관일구분자료실일반자료실어린이자료실유아자료실운영시간09:00~22:00 (화~금요일)09:00~18:00(화~금요일)09:00~18:00(화~금요일)09:00~17:00(토·일요일)자료실 휴무일매주 월요일 법정공휴일도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[일반자료실(전자정보코너 간행물코너) 어린이자료실 유아자료실 어르신열람실)]부대시설(유아창의교육관 동화창의체험관 강당 강의실(교양교실) 휴게실)장애인화장실(2층(여자) 3층) 수유실(1층 유아자료실 내)";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==77){
                        telephone="063-281-1500";
                        location1=35.8206769;
                        location2=127.14828209999996;
                        title="한국전통문화전당";
                        explain="한국전통문화전당은 한국적 정체성을 대표하는 글로벌 브랜드로 도약하기 위해 전통문화의 대중화 · 산업화 · 세계화를 추진하고 있습니다. 전통문화의 가치를 체계화하여 차별화 콘텐츠 개발의 기반을 마련하고 창의적 아이디어의 적극적인 지원으로 전통문화를 확대와 활성화에 기여하고자 합니다.품격의 도시이자 사람의 도시인 전주의 한국전통문화전당은 여러분들이 즐기고 관광하며 체험하는 열린 공간입니다. 이곳은 국내외에서 주목받는 한지(한지산업지원센터) 한식(한식창의센터 유네스코 음식창의도시) 한옥(한옥마을 국제슬로시티) 공예(천년전주명품 ‘온Onn’ 브랜드)를 갖고 있습니다. 한지 및 17개소 공방 음식조리 체험 등을 경험 할 수 있는 ‘한(韓)문화 융합 거점’으로 전 세계에 한문화를 널리 알리고자 합니다.한국 전통문화를 읽어내고 과거와 현재 미래가 소통하는 곳으로 차세대 교육과 문화 산업을 결합하고 재해석해 한문화를 창조적으로 발전시키고 인재육성이 힘쓰고자 합니다.- 시설교육실 세미나실 소회의실 기획전시실1·2 공연장 음식조리체험실(시루방) 홍보관(전주·한 문화관) 지하주차장- 공방(17개소) 도자 손바느질 한지공예 목공예 캐릭터 염색 한지인형 한글 유기 가죽 발효음식 칠보 한지사 리본공예 우리밀 침선-센터한지산업지원센터 전통문화창조센터 한식창의센터 한국전통문화 홍보관 개요1) 시설목적 가. 한지 한식 한옥 한글 한소리 등 한(韓)문화 중심 전통문화 홍보의 장(場) 마련나. 전통문화를 간접적으로 체험해 봄으로써 한국의 우수 전통문화에 대한 이해 제고2) 시설현황가. 장 소 : 전주시 완산구 현무1길 20(열림동 1 2층)나. 면 적 : 전주문화관(1층) 739.77㎡ 한문화관(2층) 618.93㎡다. 주요내용 : 전주와 한문화 스토리텔링 자료 구축·홍보1F 전주문화관 전주 문화의 감성 전달(매체를 통한 지식과 정보 체험)- 구성 : 환영의 공간/전주이야기/전주 시티뷰(한국관광의 별)/전주마당/전주 옛이야기/천년의 어울림 전주/전주의 길- 지향가치 : 전주 느끼기- 전시내용 : 전주의 감성 감각 이미지 느낌 - 전시방법 : 영상 사운드 키오스크 패널 빛- 스토리텔링(Story Telling) :·가장 한국적인 도시 전주의 느낌 전달/·전주 도시를 대표하는 메시지 시각화/ ·휴식과 명상 속의 디지털 이미지/·하프서클 영상으로 임팩트- 정보유형 : ·추상화된 메타포를 통한 이미지/·촉각 청각 시각 신호 전달/·아날로그 감성의 정보 지식- 경험 :·공감각적 기억/·명상과 휴식 속의 반성적 경험2F 한문화관 전주 문화의 실제 전달(실물 및 이미지 체험)- 구성 : 도입부/자연과 사람을 품은 한옥/결이 고운 한지/흥 넘치는 한국음악/우리 얼을 담은 한글/음식창의도시 전주- 지향가치 :한문화 바로 이해하기- 전시내용 : 한옥 한지 한소리 한글 한식- 전시방법 : 실물 패널 키오스크 영상- 스토리텔링(Story Telling) : ·전주 대표 한국전통문화 실체 만나기/·한국전통문화와 전주와의 교점/·한옥-한지-한소리-한글-한식의 순차적 체험- 정보유형 :·실물 보고 만지기/·제조 과정 명인 등 지식 전달/·전주 내 한문화 관련 정보검색/·구체적 실제적 효용의 정보-경험 :·한문화 지식의 이해/·필요 정보의 검색 출력/·한문화 종류 파악 : 비교운영계획가. 운영시간 1) 휴 관 : 매년 1월 1일 설 및 추석 당일은 13:00 ~ 18:00 운영2) 운영시간 : 09:00 ~ 18:00나. 운영인원 및 근무방식- 운영인원 : 총 3명(도슨트 1인 문화해설사 2인) 근무다. 관람방식1) 개인 : 운영시간 내 별도 제한 없이 관람 가능2) 단체 : 10명이상(전시품 보호 및 관람질서 유지 위한 사전예약)3) 예약신청• 전화를 이용해 5일 전까지 예약 신청 가능• 예약 없이 방문 시에도 내부 혼잡 없다면 관람가능• 예약문의 : 한국전통문화 홍보관 063)281-15924) 예약관람 • 예약시간 10분 전까지 도착(방문시간 경과 시 자동 예약취소 처리)• 전시설명 필요하면 예약 시 사전요청 및 예약 없을시 상시 해설 운영5) 취소 : 예약취소는 3일 전까지 가능라. 관람 예상소요시간전주문화관 자유관람/전시설명 : 개인(15분/20분) 단체(20분/40분)한문화관 자유관람/전시설명 : 개인(15분/20분) 단체(20분/40분)";
                        Facility_classification="관람시설";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }else if(i==78){
                        telephone="063-281-6420";
                        location1=35.7914469;
                        location2=127.13395400000002;
                        explain="평화동 신성공원 내에 위치한 평화도서관은 인구밀집지역인 평화동 지역주민들 삶의 질 향상을 위한 평생학습중심센터 역할을 하고 있습니다.규모 : 지상3층 지하1층 / 부지(15152㎡) 연면적(2964㎡)운영시간 및 휴관일구분자료실열람실일반자료실어린이자료실3월~10월11월~2월운영시간09:00~19:00(화~금요일)09:00~18:00(화~금요일)07:00~23:00(월~금요일)08:00~22:0009:00~17:00(토·일요일)07:00~22:00(토·일·공휴일)자료실 휴무일매주 월요일 법정공휴일-도서관 휴관일명절(1.1 설날 추석) 당일자료실 및 편의시설자료실[종합자료실(일반자료실 전자정보코너 간행물코너) 노트북실 어린이자료실]열람실(제12열람실 248석)부대시설(강당 강의실(세미나실) 식당(매점) 휴게실)장애인화장실(1층 2층 3층) / 수유실(1층 동화방 내)";
                        title="전주평화도서관";
                        Facility_classification="도서관";
                        Intent intent=new Intent(getApplicationContext(),after_space.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
                    }




                }
            });
        }
    }
