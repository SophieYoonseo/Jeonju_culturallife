## ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `김준성 진행상황`
- main frame 은 width:398, height :629 로 설정해놓음 따라서 fragment설정시 이에따른 비례식을 세워서결정할것 (이점은 수정할사항 레이아웃 머리좋은사람이)
- 🌱INSTAGRAM를 메인프로젝트로 진행중 하단바및 fragment완성
- viewpager를 fragment에 달기성공(인터넷등에는 같이 연동만있지 fragment안에 viewpager넣는건없었음 뇌피셜로 adpater를 같은 클래스안에넣어서 이를 imageview만나타낼것이니 리턴값을두자 했더니 해결 ! )
- home fragment가 다시호출되어 oncreateview를 호출할때 viewpager가 가끔사라지는문제를 child process같은 개념으로 해결 
- 현재까지 구현한 모든기능및디자인 (공유하기 기능 url은 구글마켓등록하면 그거로할예정)
- 사진fragment이동간 indicator가 현재 위치를 표시하게끔 구현
 - 문화공간 리스트 space_list_activity호출 , 문화체험은 experience_list_activity  공연show_list 지정문화재 jijung_cultural 향토는 hyangji 전주지역축제는 festival_list_activity
 
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


   ![1착상](./trouble.JPG)

## 앞으로해야할일  
- 이동경로와 fragment로부터 액티비티 이동 등 기능구현 해놓음. 이제 이 이미지버튼을 카드뷰로 꾸미기하고 list클릭시 넘어가는 activity꾸며야하고
- dataset중 전화번호있는건 public static String 으로 받아넘긴후 전화버튼따로눌러서 parsing하기  
- 디자인세부세부세부것들 꾸미기  






