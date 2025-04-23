package com.inheritance.hero;

public class Hero {
    String name;
    int hp;

    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println("기본 공격을 합니다.");
    }

}
