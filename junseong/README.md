## 김준성 진행상황
- main frame 은 width:398, height :629 로 설정해놓음 따라서 fragment설정시 이에따른 비례식을 세워서결정할것 (이점은 수정할사항 레이아웃 머리좋은사람이)
- 🌱insta를 메인프로젝트로 진행중 하단바및 fragment완성
- viewpager를 fragment에 달기성공(인터넷등에는 같이 연동만있지 fragment안에 viewpager넣는건없었음 뇌피셜로 adpater를 같은 클래스안에넣어서 이를 imageview만나타낼것이니 리턴값을두자 했더니 해결 ! )
- home fragment가 다시호출되어 oncreateview를 호출할때 viewpager가 가끔사라지는문제를 child process같은 개념으로 해결 
- 구상에있어서 어려운상황 어떤식으로 주고받아야하는지;;;;

![view](./1.gif)




#### 전주 공공데이터 데이터셋 (문화체험 정보 서비스 목록)
- http://openapi.jeonju.go.kr/user/apimng/dataset/view.jeonju?searchCondition=REG_TITLE&postSearch=&searchRegGroup=&apiRegSid=69&regType=SHEET&menuCd=DOM_000000701001000000&pageIndex=4






###  😰어려운점..
   ## 1. dataset에있는것을 mainitem과 subitem으로 노가다로 추가할경우 이를 버튼으로 어떻게 해야할지
   ## 2. listview in fragment를 기본 testapp에서는 클릭리스너도 달아서 성공하였으나 기존앱과 합치는데에있어서 문제.
   ## 3. 구상에있어서 문제점 어떻게 주고받을지 mainacvity에서는 다섯개의 fragment를 만들고 외부 액티비티에서 fragment를 더만들지 
   ![1착상](./trouble.JPG)




### 어려운점이 해결되고 진행해야할 방향
   - 이 위에 어려운점이 해결될경우 이제 list click에서 정보를받아 표시하는 layout만들고 그에따른 함수와클래스 구현하여 맵뷰등 전화번호 연동을할것임
   


