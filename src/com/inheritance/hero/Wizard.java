package com.inheritance.hero;

public class Wizard extends Hero{

    public Wizard(String name, int hp) {
        super(name,hp);
    }

    public void freezing() {
        System.out.println("마법사가 얼리기를 시전합니다");
    }
}
