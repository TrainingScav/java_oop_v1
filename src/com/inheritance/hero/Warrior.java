package com.inheritance.hero;

public class Warrior extends Hero{

    public Warrior(String name, int hp) {
        super(name, hp);

    }

    // 부모의 메서드르 재정의 한다면 ---> 메서드 오버라이드

    // 어노테이션 (주석+힌트)
    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다.");
        super.attack();
    }

    void comboAttack() {
        System.out.println("전사가 콤보 어택을 시전합니다.");
    }
}
