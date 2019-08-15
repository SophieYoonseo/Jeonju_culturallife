

# Jeonju_CulturalLife
  
## 김윤서 , 정종범, 장진성, 김준성 
:book: 
### 전주공공데이터 api를 파싱한
👦 👧 👩 👨 👶 👵 👴 👱
### 전주시민 남녀 노소 및 전주에 온 관광객들을 위한 앱  


## 2019년 8월 13일 화요일 회의록

1. 사용할 api
- 공연문화정보
- 문화체험정보서비스
- 지도(카카오)
- 회원가입(구글, 카카오, 네이버 ...)
- 미세먼지(아직 확정은 아님)


2. 진행방향
- 리스트(문화생활 정보들)를 보여주고 클릭한 후 관련 정보 및 지도를 보여주게끔 하고자 함.


3. 다음 회의까지 해야 할 일(~ 2019.8.21. 수)
- 지도(카카오) : 김준성
- api 파싱 : 김윤서
- 회원가입(+디비) : 장진성, 정종범


4. 앞으로 추가해야할 항목
- 앱 이름
- 게시판(서버) : ex) Jcloud
- 디자인(색감, 아이콘 등)
- 코드 합치기
- 미세먼지
- 가로 스크롤 : 카테고리별로 정보를 눈에 잘 보이게 구성하겠다.

### 패키지명 통일 kr.go.csejeonju2019



# 주의 해야할 사항들 :
- googlemap 사용시에도 gradle 최신버젼 쓰지말고 이버젼을써야 제컴퓨터에선 지도가 표출됨 예를들어 16.0.0으로 변경시 google logo만뜸. (써야하는 버젼 사진 첨부 ) 

![gogglemap](./map.jpg)



## 사용 api
- 문화 체험 정보 서비스 요청url:(http://openapi.jeonju.go.kr/rest/experience/getExperienceView?authApiKey=인증키&dataSid=56810) 포맷 json+xml(잘되는거 확인 완료)
- 전주시 공연문화정보 서비스 요청url:(http://openapi.jeonju.go.kr:8080/openapi/jeonju/jevent/list.do?serviceKey=인증키&요청변수=값) 포맷xml 이거 저희꺼 승인 안되어서 담당자꺼 api key 사용할거임 이거사용하면댐( api key= HwDkrxThsRamrAG0QdQwSVUHGmyXFPzp4ABuuy%2FFAIma6rfR%2FEKnMZFwdQSrP7PK0QUMWngHWtn6wCehryD1rQ%3D%3D)
예를들은 요청 url http://openapi.jeonju.go.kr/openapi_jeonju/jeonju/jevent/view.jeonju?ServiceKey=HwDkrxThsRamrAG0QdQwSVUHGmyXFPzp4ABuuy%2FFAIma6rfR%2FEKnMZFwdQSrP7PK0QUMWngHWtn6wCehryD1rQ%3D%3D&indexNum=2690&startDay=2012-10-10&endDay=2012-11-12&keyword=culture&isEncoding=true&restMode=xml   (이상하게 될때있고 안될때있음 불안정 )


- 문화공간 정보 서비스 요청url(http://openapi.jeonju.go.kr/rest/culture/getCultureList?authApiKey=인증키&dataValue=%EC%A0%95%EC%9D%8D%EA%B3%A0%ED%83%9D) 포맷 json+xml (잘되는거 확인 완료)
- 거리투어 여행지명 검색 서비스 요청url(http://openapi.jeonju.go.kr/rest/tourstreet/getTourstreetList?authApiKey=인증키&dataValue=%EB%8F%99%EB%AC%B8) 포맷 json+xml (승인 안해줌 사용 불가 )
- 야외 여행지명검색서비스 요청url(http://openapi.jeonju.go.kr/rest/greentour/getGreentourList?authApiKey=인증키&dataValue=%EC%95%84%EC%A4%91%EC%A0%80%EC%88%98%EC%A7%80) 포맷 json+xml (승인 안해줌 사용 불가)
- 전국 전기차 충전소 정보 서비스 요청url(http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList?addr=%EC%A0%84%EB%A0%A5%EB%A1%9C&pageNo=1&numOfRows=10&ServiceKey=서비스키) 포맷 xml 전기차 충전 apikey는 예외적으로 ro%2FXNFjTiuaWfUUOn939KiFkMvs0z915H%2BkR0Te9JF0NPfG4EjF9sAxR2%2B4%2FcqOzu9XlvQaZYyG0F4PniGNdsw%3D%3D  저희껀 승인안나서 긁어옴 
- 대기오염정보 조회 서비스 요청url(http://openapi.airkorea.or.kr/openapi/services/rest/MsrstnInfoInqireSvc/getNearbyMsrstnList?tmX=244148.546388&tmY=412423.75772&ServiceKey=서비스키) 포맷 xml  (개인적으로 이거쓰고싶은데 승인요청을 안받아줌.. 자동승인이라고 써있으면서 )
- 전즈 음식 정보 서비스 요청 url(http://openapi.jeonju.go.kr/rest/jeonjufood/getFoodImgList?authApiKey=인증키&foodUid=ff8080813703462a013711b5bd4104cf) 포맷 json+xml  (잘되는거 확인 완료)
- 농기계 수리업소 현황 요청 url( http://openapi.jeonju.go.kr/rest/nongsuriservice/getSuri?ServiceKey=인증키요청변수&numOfRows=10&pageNo=1 ) 
포맷 xml (잘되는거 확인 완료)
- 공원정보검색서비스, 자동심장충격기 현황정보서비스, 바이전주상품 정보서비스, 착한가격모범업소정보현황은 2019-08-12신청해서 대기중
- api key는 strigs.xml에담아서 gitignore처리해주세요  
