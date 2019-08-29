## 김준성 진행상황
- main frame 은 width:398, height :629 로 설정해놓음 따라서 fragment설정시 이에따른 비례식을 세워서결정할것 (이점은 수정할사항 레이아웃 머리좋은사람이)
- 🌱insta를 메인프로젝트로 진행중 하단바및 fragment완성
- viewpager를 fragment에 달기성공(인터넷등에는 같이 연동만있지 fragment안에 viewpager넣는건없었음)

![view](./1.GIF)




#### 전주 공공데이터 데이터셋 (문화체험 정보 서비스 목록)
- http://openapi.jeonju.go.kr/user/apimng/dataset/view.jeonju?searchCondition=REG_TITLE&postSearch=&searchRegGroup=&apiRegSid=69&regType=SHEET&menuCd=DOM_000000701001000000&pageIndex=4


###  😰어려운점..
    - fragment가 다시그려질때마다 oncreateview가 호출 but 재 호출할때 viewpager가 다시그려지진않는다 그래서 set등에 다시 생성자를넣어봐도 이건 문제가있는상황.(잘하면 mainframe 크기때문일수도 일거라는 뇌피셜 )

- 어려운점은 직접 상황을 녹화(이장면보면됨)
![trouble](./trouble.gif)

