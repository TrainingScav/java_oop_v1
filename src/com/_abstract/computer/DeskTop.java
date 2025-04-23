package com._abstract.computer;

public class DeskTop extends Computer{


    @Override
    public void display() {
        System.out.println("화면을 켭니다.");
    }

    @Override
    public void typing() {
        System.out.println("키보드를 칩니다.");
    }
}
