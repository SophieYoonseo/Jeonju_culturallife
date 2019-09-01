## ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `김준성 진행상황`
- main frame 은 width:398, height :629 로 설정해놓음 따라서 fragment설정시 이에따른 비례식을 세워서결정할것 (이점은 수정할사항 레이아웃 머리좋은사람이)
- 🌱insta를 메인프로젝트로 진행중 하단바및 fragment완성
- viewpager를 fragment에 달기성공(인터넷등에는 같이 연동만있지 fragment안에 viewpager넣는건없었음 뇌피셜로 adpater를 같은 클래스안에넣어서 이를 imageview만나타낼것이니 리턴값을두자 했더니 해결 ! )
- home fragment가 다시호출되어 oncreateview를 호출할때 viewpager가 가끔사라지는문제를 child process같은 개념으로 해결 
- 현재까지 구현한 모든기능및디자인 (공유하기 기능 url은 구글마켓등록하면 그거로할예정)
- 사진fragment이동간 indicator가 현재 위치를 표시하게끔 구현
-  
![view](./ing.gif)


- DB_INSTA 라는 폴더명에 회원가입및 FIREBASE연동 그리고 DB활성화 

![FIEEBASE](./firebase.JPG)




#### 전주 공공데이터 데이터셋 (문화체험 정보 서비스 목록)
- http://openapi.jeonju.go.kr/user/apimng/dataset/view.jeonju?searchCondition=REG_TITLE&postSearch=&searchRegGroup=&apiRegSid=69&regType=SHEET&menuCd=DOM_000000701001000000&pageIndex=4






###  😰어려운점..
   ## 1. 구상에있어서 문제점 어떻게 주고받을지 mainacvity에서는 다섯개의 fragment를 만들고 외부 액티비티에서 fragment를 더만들지 
   ![1착상](./trouble.JPG)




### 어려운점이 해결되고 진행해야할 방향
   - 이 위에 어려운점이 해결될경우 이제 list click에서 정보를받아 표시하는 layout만들고 그에따른 함수와클래스 구현하여 맵뷰등 전화번호 연동을할것임
   


