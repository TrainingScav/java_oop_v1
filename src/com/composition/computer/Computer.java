package com.composition.computer;

import java.util.Scanner;

public class Computer {
    private String computerID;
    CPU[] cpus;

    public Computer(String computerID) {
        this.computerID = computerID;
        cpus = new CPU[3];
    }

    public boolean insertCpu(String setCpuName) {

        boolean isFinished = false;
        for (int i = 0; i < cpus.length; i++) {
            if (cpus[i] == null) {
                cpus[i] = new CPU(setCpuName);
                cpus[i].setCpu(setCpuName);
                isFinished = true;
                break;
            }
        }
        return isFinished;
    }

    public void showComputerInfo() {
        System.out.println("해당 컴퓨터 정보는 아래와 같습니다.");
        System.out.println("컴퓨터 ID : " + computerID);
        for (int i = 0; i < cpus.length; i++) {
            if (cpus[i] != null) {
                System.out.println((i + 1) + " 번째 cpu는 " + cpus[i].getType() + " 입니다.");
            } else {
                System.out.println((i + 1) + " 번째는 현재 비어 있습니다.");
            }
        }
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("인텔2025042101");
        Scanner sc = new Scanner(System.in);

        while (true) {

            final String SAVE = "1"; // 등록
            final String INQUIRY = "2"; // 조회
            final String EXIT = "0"; // 종료

            System.out.println("=================================");
            System.out.println("컴퓨터 CPU 정보 등록/조회");
            System.out.println("1.등록, 2번.조회, 0번.종료");
            System.out.println("=================================");
            System.out.printf("입력 : ");
            String selNum = sc.nextLine();

            if (selNum.equals(SAVE.trim())) {
                System.out.println("등록 할 cpu 이름을 입력 해주세요.");
                System.out.printf("입력 : ");
                String targetCpu = sc.nextLine();

                // 장착 성공여부 체크
                boolean isFinished = computer1.insertCpu(targetCpu);

                if (!isFinished) {
                    System.out.println("현재 비어있는 cpu 공간이 없습니다.");
                } else {
                    System.out.println("cpu 장착이 완료 되었습니다.");
                }
            } else if (selNum.equals(INQUIRY.trim())) {
                computer1.showComputerInfo();
            } else if (selNum.equals(EXIT.trim())) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택 해주세요.");
            }
        }


    }
}
