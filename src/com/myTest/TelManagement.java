package com.myTest;

// TelTest 사용자명, 전화번호 정보를 담는 클래스
public class TelManagement {
    private String userNm;
    private String telNum;

    // 생성자
    public TelManagement(String userNm, String telNum) {
        this.userNm = userNm;
        this.telNum = telNum;
    }

    // getter setter
    public String getUserNm() {
        return userNm;
    }

    public String getTelNum() {
        return telNum;
    }

    // 사용자 이름은 현재 변경할 필요가 없음
//    public void setUserNm(String userNm) {
//        this.userNm = userNm;
//    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }



}
