package com.method;

/**
 * 메서드 연습
 * 메서드란? 객체에 소속된 함수로, 클래스의 상태(데이터)를 활용하거나 객체와 관련된
 * 작업을 처리할 때 사용한다
 */
public class CoffeeMachineMain {

    public static void main(String[] args) {
        // 커피머신 객체 생성 -> 인스턴스화 -> 인스턴스 (객체)
        CoffeeMachine machine1 = new CoffeeMachine(200, 30);

        // 재료 채우기 동작을 시켜 보자 (물, 원두)
        //machine1.refilWater(200);
        //machine1.refilCoffee(30);
        //System.out.println("-------------------------");

        // 커피 만들기 테스트
        System.out.println("커피 주문");
        String result = machine1.makeCoffee();
        System.out.println(result);
        // 또 커피 주문
        System.out.println("또 커피 주문");
        System.out.println(machine1.makeCoffee());
        // 또 커피 주문 (재료 부족 테스트)
        System.out.println("마지막 커피 주문");
        System.out.println(machine1.makeCoffee());
    }




}
