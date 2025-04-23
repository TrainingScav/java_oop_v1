package com.starcraft_v01;

import java.util.Scanner;

/**
 * @author 황희곤
 */
public class GameTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 실행의 흐름 만들어 보기
        Zealot zealot1 = new Zealot("질럿1");
        Zergling zergling1 = new Zergling("저글링1");
        Marine marine1 = new Marine("마린1");
        Page p = new Page(0);

        while (true) {

            // 이전 화면의 코드번호를 저장
            // p의 default 값은 0
            int selected = p.getPageCode();

            System.out.println("1.질럿 2.마린 3.저글링 4.상태창 을 선택해주세요. (0.종료)");
            System.out.print("입력 : ");

            if(selected == 0) {
                selected = scanner.nextInt();
            }

            if (selected == 1) {
                System.out.println("누구를 공격할래? 1. 마린 2. 저글링 (0. 뒤로가기)");
                int target = scanner.nextInt();
                if (target == 1) {
                    zealot1.attackMarine(marine1);
                    p.setPageCode(1);
                } else if (target == 2) {
                    zealot1.attackZergling(zergling1);
                    p.setPageCode(1);
                } else if (target == 0) {
                    p.setPageCode(0);
                }
            } else if (selected == 2) {
                System.out.println("누구를 공격할래? 1. 질럿 2. 저글링 (0. 뒤로가기)");
                int target = scanner.nextInt();
                if (target == 1) {
                    marine1.attackZealot(zealot1);
                    p.setPageCode(2);
                } else if (target == 2) {
                    marine1.attackZergling(zergling1);
                    p.setPageCode(2);
                } else if (target == 0) {
                    p.setPageCode(0);
                }
            } else if (selected == 3) {
                System.out.println("누구를 공격할래? 1. 질럿 2. 마린 (0. 뒤로가기)");
                int target = scanner.nextInt();
                if (target == 1) {
                    zergling1.attackZealot(zealot1);
                    p.setPageCode(3);
                } else if (target == 2) {
                    zergling1.attackMarine(marine1);
                    p.setPageCode(3);
                } else if (target == 0) {
                    p.setPageCode(0);
                }
            } else if (selected == 4) {
                System.out.println("누구의 상태를 확인 하시겠습니까? (1.질럿, 2.저글링, 3.마린 (0. 뒤로가기))");
                int selNum = scanner.nextInt();
                if (selNum == 1) {
                    zealot1.showInfo();
                    p.setPageCode(4);
                } else if (selNum == 2) {
                    zergling1.showInfo();
                    p.setPageCode(4);
                } else if (selNum == 3) {
                    marine1.showInfo();
                    p.setPageCode(4);
                } else if (selNum == 0) {
                    p.setPageCode(0);
                }
            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        // zealot1.attackZergling(marine1)
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        zealot1.attackMarine(marine1);
//        marine1.showInfo();

    }

}
