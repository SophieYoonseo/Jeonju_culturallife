package csejeonju2019.go.kr.insta;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class show_error_list_activity extends AppCompatActivity { //공연 파싱에러뜨는사람들위한 클래스
    public static String title; //공연정보명
    public static String time; // 세부시간
    public static String damname;//담당부서이름
    public static String tel;//주관부서연락처
    public static String start; // 행사시작일
    public static String end; //행사 종료일
    public static String address;//장소
    public static String age;//연령층
    public static String fee;//비용

    public static String homepage; //홈페이지
    public static String explain; //설명 맨
    public static String youtube;//유튜브
    ProgressDialog progressDlg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_show_list);
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
                        Thread.sleep(9);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                progressDlg.dismiss();
            }
        }.start();
        String[] errorshowname = {
                "상설국악공연",
                "졸탄쇼 위대한 쇼맨 -전주공연",
                "연극 그남자그여자",
                "국립무형유산원 문화가있는날 공연-잠비나이",
                "전통연희극 히히낭락",
                "[전주공연]연말엔 무조건 신나는 공연-고상한 찬호씨의 연애상담쇼(SHOW)",
                "창작극회 164회 정기공연 '꿈'",
                "고품격 국악콘서트"
        };
        ListView listView = (ListView) findViewById(R.id.mainmenu_error_show);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_expandable_list_item_1, errorshowname);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    title="상설국악공연";
                    start="2019-11-30 00:00:00.0";
                    end="2019-11-30 23:59:59.0";
                    time="17시";
                    damname="전주 소리 문화관";
                    age="전연령";
                    tel = "";
                    fee="10000원";
                    address="소리문화관";
                    explain="없음";
                    homepage ="http://sori.jjcf.or.kr/";
                    youtube="상설국악공연";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    title="졸탄쇼 위대한 쇼맨 -전주공연";
                    start="2019-11-29 00:00:00.0";
                    end="2019-12-29 23:59:59.0";
                    time="수,목 오후20시 / 토,일요일 오후 15시,18시 /"+"\n 12월 24일 오후 17시,20시 / 12월25일 오후14시,17시,20시/ 월,화,수 휴관";
                    damname="졸탄ent,이수엔터테인먼트";
                    age="전연령";
                    tel = "1644-4356";
                    fee="졸탄 오픈이벤트 가격 R석 20,000원 / S석 18,000원";
                    address="기타";
                    explain="없음";
                    homepage ="https://booking.naver.com/booking/12/bizes/264460/items/3172980";
                    youtube="졸탄쇼 위대한 쇼맨";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==2)
                {
                    title="연극 그남자그여자";
                    start="2019-11-29 00:00:00.0";
                    end="2019-12-29 23:59:59.0";
                    time="평일 오후 20시/ 토요일 오후 15시,18시 / 일요일 오후 14시30분,17시/ 월요일휴관";
                    damname="한해랑아트홀";
                    age="전연령";
                    tel = "1644-4356";
                    fee="평일 17,000원/ 주말 18,000원";
                    address="기타";
                    explain="없음";
                    homepage ="https://booking.naver.com/booking/12/bizes/243785/items/3091261?preview=1";
                    youtube="그남자 그여자";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==3)
                {
                    title="국립무형유산원 문화가있는날 공연-잠비나이";
                    start="2019-11-27 00:00:00.0";
                    end="2019-11-27 23:59:59.0";
                    time="19시30분";
                    damname="국립무형유산원";
                    age="아동";
                    tel = "";
                    fee="무료";
                    address="국립무형유산원";
                    explain="인터넷 예약 및 전화예약은공연하루전(화요일 오후4시) 마감됩니다.* 단체(20명 이상) 예약은 공연 7일 전까지 전화로 문의 주시기 바랍니다.* 예약이 마감되어도 공연 당일 18시부터 대기번호를 드리며,취소 및 미수령 티켓으로19시10분부터 선착순으로배부해드립니다.* 대기번호표는 1인 1장으로 제한하며, 대기번호표 1장으로 티켓 2장까지 교환가능합니다. ※ 19:10까지 공연장에서 예약티켓을 수령하지 않을 경우 현장티켓으로 전환\u200B됩니다. \u200B\u200B※ \u200B전화 예약도 가능하니 문의바랍니다.063) 280-1500, 1501※홈페이지 예약은11월17일(일) 부터 시작합니다.※전화 예약는 11월 19일(화)부터 시작합니다.\u200B";
                    homepage ="https://www.nihc.go.kr/nihchome/main/Index.do?mn=KO_01";
                    youtube="잠비나이 공연";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==4)
                {
                    title="전통연희극 히히낭락";
                    start="2019-11-23 00:00:00.0";
                    end="2019-11-23 23:59:59.0";
                    time="17시";
                    damname="전주 소리 문화관";
                    age="전연령";
                    tel = "";
                    fee="10000원";
                    address="소리문화관";
                    explain="없음";
                    homepage ="https://www.naver.com/";
                    youtube="히히낭락";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==5)
                {
                    title="[전주공연]연말엔 무조건 신나는 공연-고상한 찬호씨의 연애상담쇼(SHOW)";
                    start="2019-11-15 00:00:00.0";
                    end="2019-12-15 23:59:59.0";
                    time="평일19시30분/토요일15시,19시 (일,월휴관)";
                    damname="한옥마을아트홀";
                    age="전연령";
                    tel = "063-282-1033";
                    fee="20,000원";
                    address="한옥마을아트홀";
                    explain="'슬기로운 연애생활 지침서'고상한 찬호씨의 연애상담쇼2019년 연말을 위해 벌써부터 11월이면 설레이게 되있죠?거기에 내 옆에 사랑하는 사람이 있다면 특별한날을 위해 무언가 하고싶단 생각이더욱 간절하게 느끼는건 당연합니다.\u200B그래서 준비했습니다!!!누구보다 행복해야 할 12월!!한옥마을아트홀에서 작!정!하!고!만든'연애상담쇼!!!!!'고상한(고민상담하는)찬호씨의 프로그램쇼!행복한 연인들 부부들의 사연으로 이뤄지는 생방송 신개념 토크쇼벌써 매해 새로운 에피로 12월달 매진으로 후끈 달아오르게 하는데요올해만큼은 더 작정하고 만들었습니다.\u200B'슬기로운 연애생활 지침서'라는 슬로건인 만큼 매해 다른 에피로관객분들과 소통하다보니 더 리얼하게 얻어진 연애고민 해결 꿀팁(!)으로2019년 완벽한 한해를 마무리 해드리겠습니다!!\u200B연말에 열에 아홉은 연인들 부부들을 위해그리고 앞으로 연인으로 발전을 위한(!) 발전해 보고 싶은(!)솔로들 그리고 무조건적인 사랑의 가족들 모두!! 함께 볼수 있는연극 '고상한 찬호씨의 연애상담쇼' 기대해 주세요!!!!\u200B12월 22일(일),24일(화),25일(수) -2회공연문의▶카톡(플러스친구) ID: 한옥마을아트홀▶전화:063-282-1033";
                    homepage ="https://blog.naver.com/woodmge/221624788137";
                    youtube="찬호씨의 연애상담쇼";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    title="창작극회 164회 정기공연 '꿈'";
                    start="2019-11-05 00:00:00.0";
                    end="2019-12-01 23:59:59.0";
                    time="평일19시30분 주말15시";
                    damname="창작극회,창작소극장";
                    age="청소년";
                    tel = "010-5033-7292";
                    fee="15,000원";
                    address="창작소극장";
                    explain="✨기묘연극✨꿈 (nightmare)▪️날짜 : 11월5일-12월8일▪️시간 : 평일7:30, 주말3:00[월요일,11/14,27 공연없음]▪️장소 : 창작소극장“그에게 말하고싶다,깨어있는 것이 좋다고”?공연소개기묘한 이야기들이 시와 산문, 연극의 조합으로 독특하게 펼쳐지는 무대 ‼️관객들을 잡아끄는 웃음과 충격, 공포와 사색의 세계‼️?작품소개독일 현대문학에서 빼놓을 수 없는 ’방송극’의 장르로 탄생한 은 총 5개의 악몽으로 구성되어있다. “이 세계의 쾌적한 꿈은 아마 악한들이나 꿀 수 있을 것”이라고 말하면서 , 악몽의 형식을 빌어 현실을 적나라하게 고발한 이 작품은 당시 독일청취자들로부터 수천통에 달하는 항의편지와 전화를 하게끔한 문제작이었다.❤️작품줄거리첫번째 꿈은 암흑속의 이야기다. 어디로인지 끝없이 달려가는 기차의 화물칸에 아주 늙은 내외와 손자, 손자며느리, 아이가 갇혀있다. 외부와 차단된 이 공간은 희미하게 명암만 바뀔뿐 시계도 달력도 없다. 그들은 도대체 언제부터 어떤이유로 여기에 갇혀있으며 언제까지 이 기차가 달려갈 것인지 아무도 알지 못한다.두번째 꿈은 중국의 어느 도시, 여섯살 난 아이를 데리고 한 부부가 나타난다. 이 부부는 해마다 애를 낳는데 이 아이를 병든이들을 위하여 ‘인류에게 축복을 준 위대한 인간의 업적’이라 칭하며 치료재로 쓰도록 팔아넘긴다.세번째 꿈은 두 탐험가가 흑인들을 데리고 아프리카 탐험여행을 하고 있다. 식사를 할때마다 울려대는 북소리와 기분나쁜 웃음기를 띤채 곁을 맴도는 아프리카 요리사는 그들을 불안하게 만들고 무슨 이유에선가 이들은 자신의 이름과 탐험의 목적까지도 잊어버린채 아프리카 숲속 한 가운데 남게 된다.네번째 꿈은 딸의 신혼집에 찾아온 어머니가 끊임없이 들려오는 이상한 소리의 정체를 찾으려 하고 이 이상한 소리는 전세계의 파멸을 예고한다.▪️창작극회 164회 정기공연▪️▪️제작:박규현▪️작:귄터 아이히▪️연출:홍석찬 박규현 류가연▪️출연:이부열 국영숙 원숙 이종화 박종원 성민호 정광익 ▪️예술감독:조민철▪️무대디자인:류경호▪️기획:서진하 ▪️홍보:김정표 박광천 박동민▪️음향:송지희 ▪️조명:한상희▪️ 카카오톡 검색창에 \"창작극회\"를 검색하세요 !";
                    homepage ="www.facebook.com/changjak01";
                    youtube="정기공연 '꿈'";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==7)
                {
                    title="고품격 국악콘서트";
                    start="2019-11-03 00:00:00.0";
                    end="2019-11-03 23:59:59.0";
                    time="13시";
                    damname="전주 소리 문화관";
                    age="전연령";
                    tel = "";
                    fee="무료";
                    address="소리 문화관";
                    explain="없음";
                    homepage ="http://www.naver.com";
                    youtube="고품격 국악콘서트";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }



            }
        });
    }
}