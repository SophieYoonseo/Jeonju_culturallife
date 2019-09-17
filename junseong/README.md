## ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `프로젝트 진행상황` (2019.09.09 sophieyoonseo합류  세부디자인시작    --->>> 메인프로젝트인 INSTAGRAM폴더위치 JUNSEONG 에서 공통으로 옮김)
 - main frame 은 width:398, height :629 로 설정해놓음 따라서 fragment설정시 이에따른 비례식을 세워서결정할것 (이점은 수정할사항 레이아웃 머리좋은사람이)
- 🌱INSTAGRAM를 메인프로젝트로 진행중 하단바및 fragment완성
- viewpager를 fragment에 달기성공(인터넷등에는 같이 연동만있지 fragment안에 viewpager넣는건없었음 뇌피셜로 adpater를 같은 클래스안에넣어서 이를 imageview만나타낼것이니 리턴값을두자 했더니 해결 ! )
- home fragment가 다시호출되어 oncreateview를 호출할때 viewpager가 가끔사라지는문제를 child process같은 개념으로 해결 
- 현재까지 구현한 모든기능및디자인 (공유하기 기능 url은 구글마켓등록하면 그거로할예정)
- 사진fragment이동간 indicator가 현재 위치를 표시하게끔 구현
 - 문화공간 리스트 space_list_activity호출 , 문화체험은 experience_list_activity  공연show_list 지정문화재 jijung_cultural 향토는 hyangji 전주지역축제는 festival_list_activity
 - 파싱간 progressbar thread 추가 (09-13)
 - Terminal        gradlew assembleDebug --info
 - 각 카드뷰 클릭시 리스트 그 리스트 클릭시 activity 그 액티비티의 버튼(vector asset)클릭시 event들 구현 09-15(but 공연중 2019독서대전과 나루컬쳐 이두개만 홈페이지접속 클릭시 튕기는현상)
 - 각 리스트정보나나오는 list activity 의 progressbar (기존: 0부터 100까지 100millis ->20millis) 시간단축 (09-17)
 - xmlpullparser 를이용한 파싱리스트인 공연문화정보와 문화체험정보 각 리스트클릭시에 event재구현 및 세부디자인 구현(09-17)
 - 공연문화정보는 위도 경도가없어 show_title이라는 static String 변수에 parsing 정보를 이벤트마다 담아서 이를 youtube관련하여 링크를 뜨게만들음 더정확한 search를위해 int index=show_title.indexOf("-");String show_subtitle=show_title.substring(0,index); 를이용하여 앞의타이틀만 검색되게하려하였으나 이렇게할경우 일부이벤트에서 튕기는현상이발생하여 그냥 show_Title로 진행 (09-17)

![view](./ing.gif)


- DB_INSTA 라는 폴더명에 회원가입및 FIREBASE연동 그리고 DB활성화 

![FIEEBASE](./firebase.JPG)


## code merge and design detail
- 9월9일 ~ sophieyoonseo 합류 instagram 앱에 문화체험, 공연정보 xmlpullparser 합침.
- cardview 축제정보 +및 레이아웃 배치조정 

## 사용한 공공데이터 목록 ( for 제출 서류 ) 
- 지정문화재 검색 서비스 목록
- 문화공간 정보 서비스 목록
- 문화체험 정보 서비스 목록
- 전주시 공연행사 신규 서비스
- 향토문화유산 검색서비스 목록

### Android Asset Studio
- https://romannurik.github.io/AndroidAssetStudio/index.html

## 기능들 구현및 fragment<->activty 구상이 안잡혀서 그린 매핑 . 
   ![1착상](./trouble.JPG)

## 앞으로해야할일  
- 디자인세부세부세부것들 꾸미기  및 기능아직 구현안한리스트들 기능구현하기 공유,페이지,전화 등등 






