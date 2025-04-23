package com.starcraft_v02;

/**
 * ver02
 * 메서드 오버로딩 기법을 적용해서 코드를 설계해 보자.
 */
public class Marine {

    private String name;
    private int power;
    private int hp;

    // 생성자
    public Marine(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 70;
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

    public void attack(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + " 이 " + zealot.getName() + "을 공격합니다 ");
    }

    public void attack(Zergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + " 이 " + zergling.getName() + "을 공격합니다 ");
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
        System.out.println("마린 : " + name);
        System.out.println("마린 : " + power);
        System.out.println("마린 : " + hp);
    }
}
