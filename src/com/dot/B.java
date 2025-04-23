package com.dot;

public class B {

    C c;

    // 생성자
    public B() {
        // 무언가 코드를 작성 해야 해
        System.out.println("B 생성자 호출");
        c = new C(); //인스터스화 시켜서 c에 주소값을 담아줌
    }

}
