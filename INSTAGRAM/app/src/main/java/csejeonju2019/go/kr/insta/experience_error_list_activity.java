package csejeonju2019.go.kr.insta;



import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class experience_error_list_activity extends AppCompatActivity { //향토문화유산 클래스
    public static String title; //문화재명
    public static String content; //내용
    public static String address; //주소
    public static double location1; //위도
    public static double location2; //경도
    public static String tel;
    public static String homepage;
    public static String explain; //설명 맨
    ProgressDialog progressDlg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_experience_list);
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
        String[] experiencename = {
                "한지산업지원센터",
                "전주예다원",
                "이지원",
                "항교길도자기갤러리",
                "목우헌",
                "김명옥김치전통음식연구소",
                "원동정보화마을",
                "학전정보화마을",
                "청을전통문화원(예절교육원)"
        };
        ListView listView = (ListView) findViewById(R.id.mainmenu_error_experience);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_expandable_list_item_1, experiencename);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    title="한지산업지원센터";

                    address="전라북도 전주시 완산구 경원동3가 현무1길 20 한지산업지원센터 1층";
                    location1=35.8206769;
                    location2=127.148282099999;

                    homepage ="http://www.hisc.re.kr";
                    tel = "063-281-1530";

                    explain="■ 한지뜨기 : 모든연령 / 30분 / 500~2000원 ■ 한지공예 : 모든연령 / 60분 / 5000원 - 연필꽂이 악세사리함 휴대폰고리 칼라믹스악세사리 아로마테라피함 명함케이스(10000원) ■ 한지창의 : 모든연령 / 60분 / 5000원 - 민화퍼포먼스 줌치를 이용한 생활소품 한지를 이용한 만화경 만들기 ■ 상시체험 : 어린이청소년 / 30분 / 2000원 ■ 무료체험 : 한지퍼즐 맞추기 한지과학탐험 투호놀이";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }else if(position==1)
                {
                    title="전주예다원";

                    address="전북 전주시 완산구 향교길";
                    location1=		35.8117988;
                    location2=	127.1554122;

                    homepage ="https://m.naver.com/";
                    tel = "";
                    explain="◆ 저희 예다원은 2010년 6월에 전주한옥마을 향교길에 둥지를 틀었습니다. ○ 천연염색체험 전통 차 체험과 함께 전주한옥마을에서 잊지 못할 추억을 만들어 드립니다. ○ 바쁘고 복잡한 일상을 잠시 내려놓고 저희 예다원에서 친구와 애인 그리고 가족들과 함께 바쁜 일상에서 못다한 이야기들을 나눠보세요. ○ 항상 행복이 가득하시길 바라겠습니다. ※ 네이버 검색창에 '전주 예다원' ◆ 체험정보 1) 소요시간 - 40~60분 2) 인원/비용 - 4인 이상 / 20명 이상 단체 30%할인(사전에 문의해주세요) 3) 기타 - 천연염색 자연에서 채취한 나무껍질·풀·꽃·열매·흙 등의 자연 염료로 옷감에 물을 들이는 체험입니다. 체험 시에는 주로 손수건이나 티셔츠 등을 사용하여 진행합니다. 비용 : 1인당 10000원 20인 이상 단체할인(사전문의) - 다례체험 전통 차를 직접 우려내고 대접해 봄으로써 우리 전통예절을 배울 수 있는 체험입니다. 비용 : 1인당 10000원 20인 이상 단체할인(사전문의)";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }else if(position==2)
                {
                    title="이지원";

                    address="전북 전주시 완산구 한지길";
                    location1=	35.8156374;
                    location2=	127.15373380000005;

                    homepage ="www.naver.com";
                    tel = "063-232-3207";
                    explain="한지로 만나는 놀라운 세상 이지원 전통한지공예가 김혜미자 선생의 자택이자 작업실인 이지원은 다양한 한지공예를 만날 수 있는 곳으로 거의 모든 가재도구가 한지 작품으로 꾸며져 있으며 한지공예 체험도 가능하다.";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }else if(position==3)
                {
                    title="항교길도자기갤러리";

                    address="전북 전주시 완산구 향교길";
                    location1=		35.8121489;
                    location2=127.155528;

                    homepage ="https://m.naver.com/";
                    tel = "";

                    explain="◆ 체험정보 ○ 코일링과 도자기페인팅을 이용한 나만의 생활도자기만들기 ○ 생활도자기 만들기 ○ 도자기 시계 만들기 ○ 내방문패 만들기 ○ 체험문의:홈페이지 참고";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }else if(position==4)
                {
                    title= "목우헌";

                    address="전라북도 전주시 완산구 풍남동3가";
                    location1=	123;
                    location2=	123;

                    homepage ="https://m.naver.com/";
                    tel = "";

                    explain="서각 전통기러기 문패만들기 등의 체험을 즐기실 수 있습니다.";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }
                else if(position==5)
                {
                    title= "김명옥김치전통음식연구소";

                    address="전주시 완산구 간납로 14-15";
                    location1=	35.816412;
                    location2=	127.156207	;

                    homepage ="http://www.kimmyongok.co.kr/";
                    tel = "010-3652-4662";

                    explain="전주시 제1호 3대 김치 명가의 집 단체체험 숙박 전통 음식도 배우는 김명옥 김치 전통요리체험관입니다. 전주음식에 정을 담아 숙박도 하고 외갓집처럼 집 밥 요리 배우서 먹고 반찬 꾸러미도 싸가지고 갈수 있습니다.　(간장 된장 젓갈 김장도 체험하고 숙성하면 가져 갈 수 있습니다) 체험소개 김명옥김치전통음식연구소 체험안내 체험명 내용 가격 인원수 김치담그기 김치체험 후 1kg 포장 15000원~ (식사포함시 5000~8000원 추가) 10인이상 (소수인원 가격조정) 화합의비빔밥 전통방식의 비빔밥 만들기 체험 10000~15000원 ※5인1조와 1인 놋그릇 가격 다름) 10인이상 (소수인원 가격조정) 인절미 떡 매치기 전통식 인절미 매치고 포장해가기 8000~10000원 (인원수에 따름) 10인이상 전통 유과 만들기 한과체험 전통유과 만들기 10000원~ 10인이상 전통한복체험 한복입고 한옥마을 투어 10000~15000원 1인이상 (단체시 가격조정가능) 한지로 소품 만들기 한지 이용해서 부채 상자 등 7000원~ 5인이상 초코파이 만들기 전주 초코파이 만들기 10000~15000원 (4~6개 포장) 5인이상 다도 체험 전통차 마시기 예절 7000~10000원 5인이상 ※ 잡채체험 10000~15000원 (10인이상) ※ 숙박 시 조식 집밥가격은 기본 5000원l 생신이나 행사 시 추가 가능(10000원 내) ※ 김치체험 후 막걸리 김치전 추가 예약 가능(비용별도) 체험 시간 1시간 내외 ※ 수학여행 석식 조식 신청가능하며 단체 체험시 가격조정 가능하며 체험은 사전예약시 가능합니다.";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    title="원동정보화마을";

                    address="전북 전주시 덕진구 원동마을길 48";
                    location1=	35.8582085;
                    location2=	127.03462079999997;

                    homepage ="http://wondong.invil.org";
                    tel = "063-211-0118";

                    explain="전주시 서쪽에 위치한 원동은 인근에 전주수목원이 자리하고 있어 도시 속에 위치한 마을이라고 믿어지지 않는 전통 과수원마을로 봄에는 배꽃과 복숭아꽃이 만발하는 아름다운 마을이다. 마을특산물 - 한과 두부 청국장 조청 등 체험정보 체험종류 운영기간 소요시간 가능인원(1회) 체험가격 비 고 최소 최대 배꽃인공수분 4월 배꽃필시기 1시간 10명 100명 3000원 감자캐기 6월 하지 1시간 10명 100명 6000원 감자 1㎏ 증정 배따기 10월 1시간 10명 100명 10000원 배 3개 증정 단감따기 10월 1시간 10명 100명 6000원 단감 15개 증정 곶감깍기 11월 1시간 10명 50명 5000원 곶감 4개 증정 배추따기 11월 1시간 10명 100명 2000원 배추 1개 증정";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }
                else if(position==7)
                {
                    title="학전정보화마을";

                    address="전라북도 전주시 완산구 학전길 43 학전경로당";
                    location1=	35.7645156;
                    location2=	127.10634379999999;

                    homepage ="http://hj.invil.org";
                    tel = "063-221-4161";
                    explain="모악산 자락에 위치하여 공기가 좋고 마을 인심이 풍성하며 도심에서 가까워 체험을 하기에는 더욱 좋고 근교에 완산체련공원과 인접해 문화적 해택을 접할 수 있는 마을이다. 마을특산물 - 두부 한과 조청 청국장 등 체험정보 체험종류 운영기간 소요시간 가능인원(1회) 체험가격 비 고 최소 최대 두부만들기 1~27~8월 제외 1시간 20명 70명 7000원 두부 1모 증정 ※준비물:두부통 다육심기 상시 1시간 20명 60명 6000원 다육화분 증정 딸기따기 4월 중순~5월 1시간 20명 유치부 8000원 초등생 10000원 딸기 1㎏ 증정 감자캐기 6월 하지 40분 10명 7000원 감자 2㎏ 증정 ※준비물:장갑 수영장 7~8월 10:00~18:00 300명 8000원 평상무료 대여 상담요함 고구마캐기 10월 1시간 10명 7000원 고구마 2㎏ 증정 ※준비물:장갑 김장담기 11월 1시간 20명 70명 13000원 김장 1㎏ 증정 ※준비물:앞치마 토시 트렉터타기 상시 30분 40명 2000원 우렁 양식장 견학 주말농장 운영 기 간 : 2017. 4. 1 ~ 12. 31(8개월) 내 용 - 접수기간 : 매년 2월 중순 ~ 3월 말 - 접수방법 : 전화 및 홈페이지 - 분양현황 : 120구좌(2777㎡) - 분양가격 : 50000원(1구좌/23㎡ 기준/7평) - 재배작물 : 쑥갓 상추 토마토 고추 가지 시금치 오이 무 배추 파 부추 등";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }else if(position==8)
                {
                    title="청을전통문화원(예절교육원)";

                    address="전주시 완산구 은행로 22-6";
                    location1=	35.8180232	;
                    location2=	127.15155830000003	;

                    homepage ="http://www.etiedu.co.kr";
                    tel = "063-232-6679";

                    explain="청을전통문화원은 전통문화 교육과 체험학습에 전문성을 갖춘 곳으로 전통예절 전통문화를 체험할 수 있는 많은 체험프로그램 갖추고 있습니다. 교육프로그램 청소년 예절교육 대상 : 초등학생 중학생 고등학생 비용 : 1인 10000원 가능인원 : 15~50명 - 초등학생 (인증번호 07474) 청을전통문화원 체험안내 일정 소요시간 단위프로그램명 내용 09:00 ~ 09:20 20분 오리엔테이션 및 안전교육   09:20 ~ 10:10 50분 어린이 예절교육1 예절이란 무엇인가?(이론) 10:10 ~ 11:00 50분 어린이 예절교육2 행동예절(인사예절 절 배우기) 11:00 ~ 11:50 50분 어린이 예절교육3 복장예절 (옷을 입는 목적 한복입어보기) 11:50 ~ 12:00 10분 평가 및 마무리 설문조사 및 소감발표 - 중학생 (인증번호 07473) 청을전통문화원 체험안내 일정 소요시간 단위프로그램명 내용 09:00 ~ 09:20 20분 오리엔테이션 및 안전교육   09:20 ~ 10:10 50분 청소년 예절교육1 예절이란 무엇인가?(이론) 10:10 ~ 11:00 50분 청소년 예절교육2 예절의 방위 바른 인사법 전통배례 11:00 ~ 11:50 50분 청소년 예절교육3 복장예절 의미 한복 바르게 입는 법과 한복입어보기 11:50 ~ 12:00 10분 평가 및 마무리 설문조사 및 소감발표 - 고등학생 (인증번호 07472) 청을전통문화원 체험안내 일정 소요시간 단위프로그램명 내용 09:00 ~ 09:20 20분 오리엔테이션 및 안전교육   09:20 ~ 10:10 50분 청소년 예절교육1 예절이란 무엇인가?(禮論) 10:10 ~ 11:00 50분 청소년 예절교육2 행동예절(行動禮節) 11:00 ~ 11:50 50분 청소년 예절교육3 복장예절(服裝禮節) 11:50 ~ 12:00 10분 평가 및 마무리 설문조사 및 소감발표 기타교육 다례체험 대학생/일반인/직장인예절교육 체험프로그램 1일 전통문화생활체험 - 일일 생활체험 프로그램 A형 청을전통문화원 체험안내 시간 문화체험명 문화체험내용 기타 10:00~11:30 생활예절 인사법 전통배례 행동예절 〇15인 이상 〇참가비용:27500 11:30~13:00 전통음식 비빔밥체험 13:00~14:30 다례체험 잎차우리기 차 마시는 법 14:30~15:30 천연비누 MP비누만들기 - 일일 생활체험 프로그램 B형 청을전통문화원 체험안내 시간 문화체험명 문화체험내용 기타 10:00~11:30 생활예절 인사예정(공수배전통배례) 복장예절(복장예절의미) 음식예절(식사예절) ※한복입고예절배우기 〇15인 이상 〇참가비용:33000 11:30~13:00 비빔밥체험 전주비빔밥 유래 비빔밥 만들기 비빔밥 시식 13:00~13:30 다례체험 차의 종류 차우리기 차 마시는 법 13:30~15:00 소리체험 판소리배우기 15:00~16:00 천연비누 MP비누만들기 (한방가루를 첨가하여 녹여붓기) 한복체험 대상 : 중학생 (최대50명) / 체험비 : 1인 10000원 시간 : 09:00~12:00 * 한복예절(1시간) 예절교육(1시간) 소리체험 대상 : 중학생 (최대50명) / 체험비 : 1인 10000원 시간 : 09:00~12:00 * 소리체험(2시간)";
                    Intent intent =new Intent(getApplicationContext(), after_experience.class);
                    startActivity(intent);
                }


            }
        });
    }
}
