package com.starcraft_v01;

public class Zergling {
    private String name;
    private int power;
    private int hp;

    // 생성자
    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void attackZealot(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + " 이 " + zealot.getName() + "을 공격합니다 ");
    }

    public void attackMarine(Marine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + " 이 " + marine.getName() + "을 공격합니다 ");
    }

    public void beAttacked(int power) {
        // 방어적 코드
        if (this.hp <= 0) {
            System.out.println(name + " 이(가) 이미 사망하였습니다 ");
            // 실행의 제어권을 반납하고 싶으면 return 키워드 사용
            // 아래의 -power는 실행하지 않음
            return;
        }
        this.hp -= power;
        System.out.println(name + " 이(가) 공격 당합니다.");
    }

    public void showInfo() {
        System.out.println("----------⭐상태창⭐--------- ");
        System.out.println("저글링 : " + name);
        System.out.println("저글링 : " + power);
        System.out.println("저글링 : " + hp);
    }
}
