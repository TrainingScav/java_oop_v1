package com.dot;

public class A {

    // 속성
    B b;

    // 생성자 ( 인스턴스화 될 때 제일 먼저 수행하는 코드다)
    public A() {
        System.out.println("A 생성자 호출");
        b = new B(); //인스터스화 시켜서 b에 주소값을 담아줌
    }


}
