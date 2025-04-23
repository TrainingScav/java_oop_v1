package com.books;

import com.starcraft_v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5];

        // 반복문 사용하지 말고 질럿 3마리만 0, 1, 3 인덱스에 넣어주세요
        zealots[0] = new Zealot("질럿1");
        zealots[1] = new Zealot("질럿2");
        zealots[3] = new Zealot("질럿4");

        // 0 번째 인덱스에 주소값을 넣어둔 질럿의 기능 showInfo()를 호출 하시오
        System.out.println("인덱스 0 질럿 정보");
        zealots[0].showInfo();
        System.out.println("인덱스 0 질럿 정보 확인 끝");
        // 반복문을 활용해서 배열안에 있는 질럿들의 showInfo()를 호출 하시오
        for (int i=0; i < zealots.length; i++) {
            if(zealots[i] != null) {
                zealots[i].showInfo();
            }
        }
    }
}
