package csejeonju2019.go.kr.insta;

import java.io.Serializable;

public class PerformanceShowItem2 implements Serializable {
    Boolean inIndexNum = false, inStartDay = false, inEndDay = false, inETime = false, inUrl = false, inSponSor = false;
    Boolean inMngCo = false, inPlace = false, inAdmfee = false, inSubject = false, inContent = false, inMngNm  = false;
    Boolean inOrgNm = false, inMngTel = false, inMngEmail = false, inRegDate = false, inAttidx = false, inFileCnt = false;
    Boolean inMainImg = false, inCategory = false, inAge = false, inPosx = false, inPosy = false, inAddress = false;
    Boolean inList = false;

    String indexNum = null, startDay = null, endDay = null, ETime = null, url = null, sponSor = null, mngCo = null;
    String place = null, admfee = null, subject = null, content= null, mngNm = null, orgNm = null, mngTel = null;
    String  mngEmail = null, regDate = null, attidx = null, fileCnt = null, mainImg = null, category = null, age = null;
    String posx = null, posy = null, address = null;

    void clear() {
        inIndexNum = inStartDay = inEndDay = inETime = inUrl = inSponSor = false;
        inMngCo = inOrgNm = inMngTel = inMngEmail = inRegDate = inAttidx = inFileCnt = false;
        inMainImg = inCategory = inAge = inPosx = inPosy = inAddress = false;
        inPlace = inAdmfee = inSubject = inContent = inMngNm = false;

        /*indexNum = startDay =  endDay = ETime = url = sponSor = mngCo = null;
        place = admfee = subject = content= mngNm = orgNm = mngTel = null;
        mngEmail = regDate = attidx = fileCnt = mainImg = category = age = null;
        posx = posy = address = null;*/
    }

    @Override
    public String toString() {
        return subject;
    }

    public String showDetail() {
        return "행사 제목 : " + subject +
                "\n데이터 번호 : " + indexNum +
                "\n행사 시작일 : " + startDay +
                "\n행사 종료일 : " + endDay +
                "\n세부시간 : " + ETime +
                "\n관련 사이트 : " + url +
                "\n주최 : " + sponSor +
                "\n주관 : " + mngCo +
                "\n장소 : " + place +
                "\n비용 : " + admfee +
                "\n행사내용 : " + content +
                "\n주관부서 : " + mngNm +
                "\n부서이름 : " + orgNm +
                "\n주관부서연락처 : " + mngTel + " / " + mngEmail +
                "\n등록일 : " + regDate +
                "\n첨부파일번호 : " + attidx +
                "\n첨부파일수 : " + fileCnt +
                "\n대표이미지 : " + mainImg +
                "\n분류 : " + category +
                "\n연령층" + age +
                "\n공연장소 경도 : " + posx +
                "\n공연장소 위도 : " + posy +
                "\n공연장소 지번주소 : " + address;
    }
}
