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
                "졸탄쇼 위대한 쇼맨 -전주공연",
                "연극 그남자그여자",
                "[전주공연] 연말엔 무조건 신나는 공연-고상한 찬호씨의 연애상담쇼(SHOW)",
                "문화가 있는날 / 다가사후(多佳射帿) 이야기 꽃",
                "신체연극 이것은 ㅁ이 아니다",
                "제35회 전국서화백일대상전(휘호대회)",
                "아카펠라 그룹 보이쳐의",
                "제3회 1593 전주별시",
                "뮤지컬 프리즌 시즌2"
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
                    youtube="졸탄쇼 위다핸 쇼맨";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==1)
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
                }else if(position==2)
                {
                    title="[전주공연] 연말엔 무조건 신나는 공연-고상한 찬호씨의 연애상담쇼(SHOW)";
                    start="2019-11-15 00:00:00.0";
                    end="2019-12-15 23:59:59.0";
                    time="평일 19시30분/ 토요일 15시,19시 (일,월 휴관)";
                    damname="한옥마을아트홀";
                    age="전연령";
                    tel = "";
                    fee="20,000원";
                    address="한옥마을아트홀";
                    explain="'슬기로운 연애생활 지침서'고상한 찬호씨의 연애상담쇼2019년 연말을 위해 벌써부터 11월이면 설레이게 되있죠?거기에 내 옆에 사랑하는 사람이 있다면 특별한날을 위해 무언가 하고싶단 생각이더욱 간절하게 느끼는건 당연합니다.\u200B그래서 준비했습니다!!!누구보다 행복해야 할 12월!!한옥마을아트홀에서 작!정!하!고!만든'연애상담쇼!!!!!'고상한(고민상담하는)찬호씨의 프로그램쇼!행복한 연인들 부부들의 사연으로 이뤄지는 생방송 신개념 토크쇼벌써 매해 새로운 에피로 12월달 매진으로 후끈 달아오르게 하는데요올해만큼은 더 작정하고 만들었습니다.\u200B'슬기로운 연애생활 지침서'라는 슬로건인 만큼 매해 다른 에피로관객분들과 소통하다보니 더 리얼하게 얻어진 연애고민 해결 꿀팁(!)으로2019년 완벽한 한해를 마무리 해드리겠습니다!!\u200B연말에 열에 아홉은 연인들 부부들을 위해그리고 앞으로 연인으로 발전을 위한(!) 발전해 보고 싶은(!)솔로들 그리고 무조건적인 사랑의 가족들 모두!! 함께 볼수 있는연극 '고상한 찬호씨의 연애상담쇼' 기대해 주세요!!!!\u200B12월 22일(일),24일(화),25일(수) -2회공연문의▶카톡(플러스친구) ID: 한옥마을아트홀▶전화:063-282-1033";

                    homepage ="https://blog.naver.com/woodmge/221624788137";
                    youtube="찬호씨의 연애상담쇼";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==3)
                {
                    title="문화가 있는날 / 다가사후(多佳射帿) 이야기 꽃";
                    start="2019-10-30 00:00:00.0";
                    end="2019-10-30 23:59:59.0";
                    time="10:00~15:00";
                    damname="지역문화진흥원";
                    age="전연령";
                    tel = "063-281-2648";
                    fee="무료";
                    address="기타";
                    explain="없음";
                    homepage ="https://www.naver.com/";
                    youtube="다가사후(多佳射帿) 이야기 꽃";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==4)
                {
                    title="신체연극 이것은 ㅁ이 아니다";
                    start="2019-10-29 00:00:00.0";
                    end="2019-10-29 23:59:59.0";
                    time="19시30분";
                    damname="전주시";
                    age="전연령";
                    tel = "063-281-6652";
                    fee="무료";
                    address="덕진예술회관";
                    explain="없음";
                    homepage ="http://www.naruculture.com/";
                    youtube="신체연극 이것은 ㅁ이 아니다";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==5)
                {
                    title="제35회 전국서화백일대상전(휘호대회)";
                    start="2019-10-19 00:00:00.0";
                    end="2019-10-19 23:59:59.0";
                    time="10:30";
                    damname="창암전국서화백일대상전(휘호대회)운영위원회";
                    age="전연령";
                    tel = "";
                    fee="";
                    address="전주종합경기장";
                    explain="없음";
                    homepage ="https://www.naver.com/";
                    youtube="전국서화백일대상전(휘호대회)";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    title="아카펠라 그룹 보이쳐의";
                    start="2019-10-14 00:00:00.0";
                    end="2019-10-14 23:59:59.0";
                    time="19시";
                    damname="전주시";
                    age="전연령";
                    tel = "063-281-6652";
                    fee="무료";
                    address="덕진예술회관";
                    explain="없음";
                    homepage ="http://www.naruculture.com";
                    youtube="아카펠라 보이쳐의";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }
                else if(position==7)
                {
                    title="제3회 1593 전주별시";
                    start="2019-10-12 00:00:00.0";
                    end="2019-10-12 23:59:59.0";
                    time="08시~20시";
                    damname="전주시,전주전통문화연수원";
                    age="전연령";
                    tel = "063-281-5274";
                    fee="0";
                    address="전통문화연수원";
                    explain="전주전통문화연수원에서 10월 12일에 ‘제3회 1593 전주별시(別試)’를 진행합니다. 많은 관심과 참여 바랍니다.일시 : 2019.10.12.(토) 08:00~20:00장소 : 전주전통문화연수원 및 한옥마을 일대대상 : 전국민접수 : 사전접수(우편 또는 방문 / 9월16일~10월4일 도착분 까지)홈페이지 : www.dongheon.or.kr전 화 : 063-281-5271~4주최·주관: 전주시 전주전통문화연수원주요프로그램:과거시험(국궁대회/성독대회/한시백일장)공연방방례(급제자발표) 및 시상식급제자 유가행렬 및 사은숙배주민 대동 한마당한옥마을 별별체험 체험부스";
                    homepage ="http://www.naruculture.comwww.dongheon.or.kr/";
                    youtube="1593 전주별시";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }else if(position==8)
                {
                    title="뮤지컬 프리즌 시즌2";
                    start="2019-10-11 00:00:00.0";
                    end="2019-11-10 23:59:59.0";
                    time="평일 오후20시/토요일 오후 15시,18시 / 일요일 오후14시30분, 17시 /월,화요일 휴관";
                    damname="한해랑아트홀";
                    age="전연령";
                    tel = "1644-4356";
                    fee="평일 18,000원 / 주말 19,000원";
                    address="한해랑아트홀";
                    explain="없음";
                        homepage ="https://booking.naver.com/booking/12/bizes/243550/items/3090459?preview=1";
                        youtube="뮤지컬 프리즌 시즌2";
                    Intent intent =new Intent(getApplicationContext(), after_show.class);
                    startActivity(intent);
                }


            }
        });
    }
}