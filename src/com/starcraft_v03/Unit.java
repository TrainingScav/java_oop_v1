package com.starcraft_v03;

public class Unit {

    protected String name;
    protected int power;
    protected int hp;

    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }
    public int getHp() {
        return hp;
    }

    public void attack(Unit unit) {
        unit.beAttacked(this.power);
        System.out.println(name + " 이 " + unit.getName() + "을 공격합니다 ");
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
        System.out.println("이름   : " + name);
        System.out.println("공격력 : " + power);
        System.out.println("체력   : " + hp);
    }
}
