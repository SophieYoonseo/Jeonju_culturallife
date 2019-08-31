package kr.go.listapi;

public class PerformanceShowItem {
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

        indexNum = startDay =  endDay = ETime = url = sponSor = mngCo = null;
        place = admfee = subject = content= mngNm = orgNm = mngTel = null;
        mngEmail = regDate = attidx = fileCnt = mainImg = category = age = null;
        posx = posy = address = null;
    }

    @Override
    public String toString() {
        return subject;
    }
}
