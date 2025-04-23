package com.dot;

public class MainTest {

    public static void main(String[] args) {
        System.out.println(" . 연산자의 여행 ");



        //System.out.println(a1.b); // 출력 결과 값? null

        //순서
        // 1. a1 참조객체를 인스터스화 시킴 (주소값 생성)
        //      - A 클래스 이동
        // 2. A 클래스의 생성자 출력문 확인
        // 3. b 참조객체를 인스터스화 시킴 (주소값 생성)
        //      - b 클래스 접근 가능
        //      - b 클래스 이동
        // 4. B 클래스의 생성자 출력문 확인
        // 5. c 참조객체를 인스터스화 시킴 (주소값 생성)
        //      - c 클래스 접근 가능
        //      - c 클래스 이동
        // 6. c의 callFinal() 출력 확인
        A a1 = new A();
        a1.b.c.callFinal();
    }
}
