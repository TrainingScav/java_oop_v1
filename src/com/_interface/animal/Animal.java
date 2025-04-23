package com._interface.animal;
//HOW-interface를 선언하며 된다.
//여기안에 선언된 메서드는  모두 추상메서드가 되어야한다.
//WHY
public interface Animal {

    //메서드 선언부만 있고 바디가 없다.
    public abstract void eat();
    //생략이 가능하다 . abstract키워드
    void move();

}