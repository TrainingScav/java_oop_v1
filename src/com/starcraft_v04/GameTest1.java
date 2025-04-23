package com.starcraft_v04;

import java.util.Scanner;

public class GameTest1 {

    public static void main(String[] args) {

        // 실행의 흐름을 스스로 만들어 보자
        // 배열, 객체, for... 다형성 확인

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 유닛 배럭 생성
        Unit[] zealotBarrack = new Unit[5];
        Unit[] marineBarrack = new Unit[5];
        Unit[] zerglingBarrack = new Unit[5];

        // 메인 선택값 비교를 위한 final 변수
        final String CREATE = "1";
        final String INQUIRY = "2";
        final String ATTACK = "3";
        final String EXIT = "0";

        // 생성,조회 선택 값
        final String ZEALOT = "1";
        final String MARINE = "2";
        final String ZERGLING = "3";

        // while문 작성
        while (true) {
            // 생성(총5명), 조회, 어택, 프로그램 종료
            System.out.println("=========================================");
            System.out.println("스타크래프트 관리 프로그램");
            System.out.println("1.유닛 생성, 2.유닛 조회, 3.공격, 0.종료");
            System.out.println("=========================================");
            System.out.printf("입력 : ");
            String selNum = sc.nextLine();

            if (selNum.equals(CREATE.trim())) { // 생성
                System.out.println("생성하실 유닛을 고르세요.");
                System.out.println("1.질럿, 2.마린, 3.저글링");
                System.out.println("입력 : ");
                String selBarrck = sc.nextLine();

                // 생성 유닛에 따른 처리 진행 (함수 사용)
                if (selBarrck.equals(ZEALOT.trim())) {
                    createUnit(sc, zealotBarrack,1);
                } else if (selBarrck.equals(MARINE.trim())) {
                    createUnit(sc, marineBarrack,2);
                } else if (selBarrck.equals(ZERGLING.trim())) {
                    createUnit(sc, zerglingBarrack,2);
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } else if (selNum.equals(INQUIRY.trim())) { // 조회
                System.out.println("조회하실 유닛을 고르세요.");
                System.out.println("1.질럿, 2.마린, 3.저글링");
                System.out.println("입력 : ");
                String selInquiry = sc.nextLine();

                // 조회 유닛에 따른 처리 진행 (함수 사용)
                if (selInquiry.equals(ZEALOT.trim())) {
                    inquiryUnit(sc, zealotBarrack);
                } else if (selInquiry.equals(MARINE.trim())) {
                    inquiryUnit(sc, marineBarrack);
                } else if (selInquiry.equals(ZERGLING.trim())) {
                    inquiryUnit(sc, zerglingBarrack);
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } else if (selNum.equals(ATTACK.trim())) { // 공격

                System.out.println("공격을 진행할 유닛을 고르세요.");
                System.out.println("1.질럿, 2.마린, 3.저글링");
                System.out.println("입력 : ");
                String attack = sc.nextLine();

                System.out.println("몇 번째 유닛으로 진행할지 고르세요.");
                System.out.println("입력 : ");
                int attackIndex = Integer.parseInt(sc.nextLine());

                System.out.println("공격을 받을 유닛을 고르세요");
                System.out.println("1.질럿, 2.마린, 3.저글링");
                System.out.println("입력 : ");
                String underAttack = sc.nextLine();

                System.out.println("몇 번째 유닛을 공격 받을지 고르세요");
                System.out.println("입력 : ");
                int underAttackIndex = Integer.parseInt(sc.nextLine());


                // 배열이기에 공격을 진행 및 공격 받을 유닛 인덱스 번호 지정 필요
                // 인덱스 위치를 지정 해주기 위한 번호값 String -> int 전환
                // 좀 더 좋은 방식으로 후에 변경 필요
                if(attack.equals(ZEALOT.trim())){ // 공격 진행 (질럿)
                    if(underAttack.equals(ZEALOT.trim())){
                        zealotBarrack[attackIndex].attack(zealotBarrack[underAttackIndex]);
                    } else if (underAttack.equals(MARINE.trim())) {
                        zealotBarrack[attackIndex].attack(marineBarrack[underAttackIndex]);
                    }else if (underAttack.equals(ZERGLING.trim())) {
                        zealotBarrack[attackIndex].attack(zerglingBarrack[underAttackIndex]);
                    }
                } else if (attack.equals(MARINE.trim())) { // 공격 진행 (마린)
                    if(underAttack.equals(ZEALOT.trim())){
                        marineBarrack[attackIndex].attack(zealotBarrack[underAttackIndex]);
                    } else if (underAttack.equals(MARINE.trim())) {
                        marineBarrack[attackIndex].attack(marineBarrack[underAttackIndex]);
                    }else if (underAttack.equals(ZERGLING.trim())) {
                        marineBarrack[attackIndex].attack(zerglingBarrack[underAttackIndex]);
                    }
                } else if (attack.equals(ZERGLING.trim())) { // 공격 진행 (저글링)
                    if(underAttack.equals(ZEALOT.trim())){
                        zerglingBarrack[attackIndex].attack(zealotBarrack[underAttackIndex]);
                    } else if (underAttack.equals(MARINE.trim())) {
                        zerglingBarrack[attackIndex].attack(marineBarrack[underAttackIndex]);
                    }else if (underAttack.equals(ZERGLING.trim())) {
                        zerglingBarrack[attackIndex].attack(zerglingBarrack[underAttackIndex]);
                    }
                }
            } else if (selNum.equals(EXIT.trim())) { // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 유닛 생성 함수 (1.질럿, 2.마린, 3.저글링)
    public static void createUnit(Scanner sc, Unit[] units, int selType) {

        // 이름, 파워, HP
        // power와 hp는 값이 하드코딩 되어 있으므로 주석 처리
        String setName;
        //String setPower;
        //String setHp;

        // 생성 처리 여부
        boolean isFinished = false;

        System.out.println("======================================");
        System.out.println("이름을 입력 해주세요.");
        System.out.printf("입력 : ");
        setName = sc.nextLine();

        for (int i = 0; i < units.length; i++) {
            if (units[i] == null) {
                if(selType == 1) {
                    units[i] = new Zealot(setName);
                } else if (selType == 2) {
                    units[i] = new Marine(setName);
                } else if (selType == 3) {
                    units[i] = new Zergling(setName);
                }
                isFinished = true;
                break;
            }
        }
        if (!isFinished) {
            System.out.println("유닛을 더 생성할 수 없습니다.");
        } else {
            System.out.println("유닛 생성이 완료 되었습니다.");
            System.out.println();
        }
        System.out.println("======================================");
    }

    // 유닛 배럭 조회 함수 (질럿, 마린, 저글링)
    public static void inquiryUnit(Scanner sc, Unit[] units) {
        for (int i = 0; i < units.length; i++) {
            if (units[i] != null) {
                units[i].showInfo();
            }
        }
    }

    // 공격자 존재여부 확인
    public static boolean isAttackerFind(Unit unit) {
        return true;
    }

}
