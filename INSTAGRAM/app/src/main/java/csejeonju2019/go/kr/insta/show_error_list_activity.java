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
                "[전주한벽문화관 특별기획공연] 'MIRACLE KOREA : 한국 음악의 위상과 격",
                "상설국악공연",
                "졸탄쇼 위대한 쇼맨 -전주공연",
                "연극 그남자그여자",
                "국립무형유산원 문화가있는날 공연-잠비나이",
                "전통연희극 히히낭락",
                "[전주공연]연말엔 무조건 신나는 공연-고상한 찬호씨의 연애상담쇼(SHOW)",
                "전주부채의 전승과 확산展-국가무형문화재 선자장 이수자 김대성 초대전",
                "[전주공예품전시관] 락희_공예로 빛내다展"
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
                    title="[전주한벽문화관 특별기획공연] 'MIRACLE KOREA : 한국 음악의 위상과 격";
                    start="2019-12-19 00:00:00.0";
                    end="2019-12-19 23:59:59.0";
                    time="19:30";
                    damname="전주시 전주문화재단";
                    age="전연령";
                    tel = "";
                    fee="30000원";
                    address="전주한벽문화관";
                    explain="전주한벽문화관 특별기획공연 '미라클 코리아-한국 음악의 위상과 격'이 다가오는 12월 19일에 찾아옵니다. 국내뿐만이 아니라 세계적으로 인정받는 우리나라 최고의 음악가들이 한자리에 모이는 이번 공연에는 피아노의 박종화, 첼로의 이정란, 소프라노 한경미, 국악그룹 바라지가 최고의 무대를 선보일 예정입니다. 많은 관심 바랍니다.일시: 2019.12.19.(목), 19:30 장소: 전주한벽문화관 한벽공연장관람료: 30,000원 (할인: 장애우 및 국가유공자·학생·20인 이상 단체 50%, 조기예매·예술인패스·전북도민·문화예술종사자 30%)만7세이상 관람 가능합니다.예매: http://ticket.interpark.com/Ticket/Goods/GoodsInfo.asp?GoodsCode=19016314";
                    homepage ="http://www.jt.or.kr";
                    youtube="전주한벽문화관 특별기획공연";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==1)
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
                else if(position==2)
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
                }else if(position==3)
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
                }else if(position==4)
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
                }else if(position==5)
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
                }else if(position==6)
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
                else if(position==7)
                {
                    title="전주부채의 전승과 확산展-국가무형문화재 선자장 이수자 김대성 초대전";
                    start="2019-11-07 00:00:00.0";
                    end="2019-11-19 23:59:59.0";
                    time="10:00~18:00";
                    damname="전주부채문화관";
                    age="전연령";
                    tel = "";
                    fee="무료";
                    address="전주부채문화관";
                    explain=" 2019 전주부채문화관 파일럿 프로그램 \u200B전시기간 : 2019년 11월 7일~11월 19일전시장소 : 전주부채문화관 지선실전시작품 : 국가무형문화재 선자장 김동식 이수자 김대성의 합죽선 작품 전시참여작가 : 김대성주최/주관 : 전주부채문화관";
                    homepage ="https://blog.naver.com/jeonjufan";
                    youtube="전주부채의 전승과 확산";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==8)
                {
                    title="[전주공예품전시관] 락희_공예로 빛내다展";
                    start="2019-11-05 00:00:00.0";
                    end="2019-11-10 23:59:59.0";
                    time="10:00~18:00";
                    damname="전주공예품전시관";
                    age="전연령";
                    tel = "010-6312-4250";
                    fee="무료";
                    address="전주시 완산구 태조로9";
                    explain="\uFEFF ▪ 전 시 명 : 전주공예품전시관 기획전 락희_공예로 빛내다展 *전시상품 최대 30%할인▪ 전시일정 : 2019년 11월 5일(화) ~ 11월 10일(일) ▪ 참여작가: 고운한지공예, 다채, 이상희, 한깃▪ 관람시간 : 평일 10시~18시 (월요일 휴관) ▪ 전시장소 : 전주공예품전시관 전시 2관 (전주시 완산구 태조로 9)";
                    homepage ="http://www.jeonjucraft.or.kr/2018/inner.php?sMenu=main";
                    youtube="락희_공예로 빛내다";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }



            }
        });
    }
}