package com.composition;

class Animal {
    // 자식클래스에서 접근 가능하다.
    protected String name;

    void eat() {
        System.out.println(name + " 이(가) 밥을 먹습니다.");
    }
    void bark() {
        System.out.println(name + " 이(가) 짖습니다.");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        // 강아지의 먹는 모습을 구현...
        //super.eat(); 필요하다면 사용함
    }
}

class Cat extends Animal{
    @Override
    void eat() {
        // 고양이의 먹는 모습 구현
        // super.eat();
    }
}

// xxx.java 단 하나의 자바 파일에는 public 가진 클래스는 오직 하나만 존재할 수 있다.
public class Main1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑이";

        dog.eat();
        dog.bark();

    }
}
