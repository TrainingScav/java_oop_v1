package com._abstract.animal;

public class MainTest1 {

    public static void main(String[] args) {
        // 객체 지향 개념으로 Animal 이라는 클래스를 인스턴스화 시키면 이상함
        Animal animal; // 타입으로 선언이 가능하다.
        // animal = new Animal(); <-- 오류 발생
        // Animal 클래스는 abstract 키워드를 붙여서 추상 클래스로 설계했다
        // 추상 클래스는 new 란 키워드 생성자를 활용해서
        // 독립적으로 메모리에 올릴 수 없다.


        // 개발자가 객체를 생성 시킬 때 다른 사용자가 마음대로 객체를
        // 생성 시키지 못하게 하는 강제성을 지닐 수 있다.
        //Human human = new Human();


    }
}
