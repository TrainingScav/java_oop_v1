package com.starcraft_v02;

import java.util.Scanner;

public class GameTest1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 실행의 흐름 만들어 보기
        Zealot zealot1 = new Zealot("질럿1");
        Marine marine1 = new Marine("마린1");
        Zergling zergling1 = new Zergling("저글링1");

        while (true) {
            System.out.println("===================================================");
            System.out.println("1.질럿 2.마린 3.저글링 을 선택해주세요. (0.종료)");
            System.out.printf("입력 : ");
            int selected = scanner.nextInt();
            if (selected == 1) {
                System.out.println("누구를 공격할래? 1. 마린 2. 저글링");
                int target = scanner.nextInt();
                if (target == 1) {
                    zealot1.attack(marine1);
                } else if (target == 2) {
                    zealot1.attack(zergling1);
                }
            } else if (selected == 2) {
                System.out.println("누구를 공격할래? 1. 질럿 2. 저글링");
                int target = scanner.nextInt();
                if (target == 1) {
                    marine1.attack(zealot1);
                } else if (target == 2) {
                    marine1.attack(zergling1);
                }
            } else if (selected == 3) {
                System.out.println("누구를 공격할래? 1. 질럿 2. 마린");
                int target = scanner.nextInt();
                if (target == 1) {
                    zergling1.attack(zealot1);
                } else if (target == 2) {
                    zergling1.attack(marine1);
                }
            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

}
