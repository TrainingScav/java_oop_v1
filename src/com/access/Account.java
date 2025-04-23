package com.access;

public class Account {

    private String name;
    // int balance; 1단계
    private int balance; // 2단계


    // getter, setter 메서드 만들기 (메서드 일 뿐인데...)
    // 외부에서 balance 값을 리턴 받을 수 있는 메서드를 만들어 보자.
    // 변수앞에 get 단어를 붙인다. (매개변수는 선언할 필요가 없다)
    // 객채의 상태값 변경은 행위로써 처리해야 한다.
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // setter 메서드 만들기
    public void setBalance(int b) {
        if (b < 0) {
            System.out.println("0 이하 값을 넣을 수 없습니다.");
        } else {
            balance = b;
        }
    }

    public void setName(String n) {
        name = n;
    }

    // 입금하다
    public void deposit(int money) {
        balance += money;
    }

    // 출금하다
    public void withdraw(int money) {
        // TODO 방어적 코드를 작성
        balance -= money;
    }

    // 현재 잔액을 출력하는 메서드
    public void showInfo() {
        System.out.println("현재 계좌 잔액은 : " + balance + "원 입니다.");
    }
}
