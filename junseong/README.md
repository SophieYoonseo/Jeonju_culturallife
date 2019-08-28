## 김준성 진행상황
- indicator_again이란 프로젝트명으로 viewpager indicator완성 (손가락 swipe로 화면이전환댐)
- main frame 은 width:398, height :629 로 설정해놓음 따라서 fragment설정시 이에따른 비례식을 세워서결정할것
- 🌱insta를 메인프로젝트로 진행중 하단바및 fragment완성
- 메인프로젝트인 insta의 두번째 fragment에 공유하기 버튼과 그에따른 공유하기 기능 추가

- 현재 매우 어려운 상황 사진첨부 (xml디자인 처참 처참 )

![frag2ing](./disaster.JPG)

## 일단 안드로이드 실력이 매우 부족하여 fragment안의 viewpager + indicator 넣는건 너무어려움.... 그래서 버튼으로 대체함 (이문제는 상속안의 상속안의 상속)
![melo](./g.gif)


#### 전주 공공데이터 데이터셋 
- http://openapi.jeonju.go.kr/user/apimng/dataset/view.jeonju?searchCondition=REG_TITLE&postSearch=&searchRegGroup=&apiRegSid=69&regType=SHEET&menuCd=DOM_000000701001000000&pageIndex=4

###  😰어려운점..
- 단순히 합치는것이 액티비티안의 액티비티라고 생각햇지만 안드로이드가 까다로워서 그렇게는 안된다고함 고로 fragment 안의 fragment안의 fragment해야하는데 자바문법에서 어려움..
