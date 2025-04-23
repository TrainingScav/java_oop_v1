package com.starcraft_v01;

public class Page {

    // 진행화면 유지를 위한 화면코드 변수
    // 0 : 메인, 1 : 질럿의 공격, 2 : 마린의 공격, 3 : 저글링의 공격, 4 : 상태창 화면
    int pageCode;

    public Page(int pageCode) {
        this.pageCode = pageCode;
    }

    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }
}
