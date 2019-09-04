package com.example.testapi_18;

import java.io.Serializable;

public class PerformanceShowItem implements Serializable {
    Boolean inAddr = false, inAddrDtl = false, inDataContent = false, inDataSid = false, inDataTitle = false;
    Boolean inFileCnt = false, inPosx = false, inPosy = false, inTel = false, inUserHomepage = false, inZipCode = false;
    Boolean inList = false;

    String addr = null, addrDtl = null, dataContent = null, dataSid = null, dataTitle = null;
    String fileCnt = null, posx = null, posy = null, tel = null, userHomepage = null, zipCode = null;

    void clear() {
        inAddr = inAddrDtl = inDataContent = inDataSid = inDataTitle = false;
        inFileCnt = inPosx = inPosy = inTel = inUserHomepage = inZipCode = false;
    }

    @Override
    public String toString() {
        return dataTitle;
    }

    public String showDetail() {
        return "시설명 : " + dataTitle +
                "\n데이터 번호 : " + dataSid +
                "\n기타 내용 : " + dataContent +
                "\n시설 기본주소 : " + addr +
                "\n시설 상세주소 : " + addrDtl +
                "\n전화번호 : " + tel +
                "\n홈페이지 : " + userHomepage +
                "\n첨부파일수 : " + fileCnt +
                "\n공연장소 경도 : " + posx +
                "\n공연장소 위도 : " + posy +
                "\n공연장소 지번주소 : " + zipCode;
    }
}