package com.myTest;

import java.util.Locale;
import java.util.Scanner;

/**
 * - ** 저장 **: 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다.
 * - ** 조회 **: 전체 연락처 목록을 조회하거나, 특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
 * // 둘 중 하나를 선택
 * // 만약 특정 이름으로 검색 시 나오지 않으면 전체 조회 검색여부
 * // 전체 검색, 혹은 하지 않을 시 메인 화면으로 이동
 * - ** 수정 **: 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
 * - ** 삭제 **: 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
 * - ** 선택 조회 ** : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
 * - ** 프로그램 종료 - 사용자가 프로그램 종료할 때 까지 계속 실행되어야 합니다.**
 * - ** Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리**
 * - ** 전화번호 저장은 100까지 한정.**
 */

public class TelProgram {

    // 전화번호 관리의 배열 인덱스 변수 (등록 시 +1)
    static int currentIndex = 0;

    public static void main(String[] args) {

        // 객체를 담는 배열타입 선언
        TelManagement[] telPhoneInfo = new TelManagement[100];

        // while 제어를 위한 변수 선언
        boolean flag = true;

        // 사용자의 입력한 값에 따라 화면 처리를 위한 변수 선언
        final String REGIST = "1";
        final String INQUIRY = "2";
        final String MODIFY = "3";
        final String DELETE = "4";
        final String SEL_USER_INQUIRY = "5";
        final String EXIT = "0";

        // 샘플 데이터 자료 (테스트 시 에만 사용)
        //telPhoneInfo[0] = new TelManagement("홍길동", "010-2735-1557");
        //telPhoneInfo[1] = new TelManagement("이기영", "010-5815-3160");
        //telPhoneInfo[2] = new TelManagement("이기철", "010-7700-1011");

        // 사용자의 입력을 받기 위한 스캐너
        Scanner sc = new Scanner(System.in);

        // 프로그램이 계속 실행이 되기 위한 while 문 작성
        // flag를 이용하여 제어 (true, false)
        while (flag) {

            // 메인 안내문구 출력
            System.out.println("==========================================================================");
            System.out.println("이용하고 싶은 기능을 선택해 주세요");
            System.out.println("1.등록, 2.조회, 3.수정, 4.삭제, 5.검색 조회(사용자명), 0.프로그램 종료");
            System.out.println("==========================================================================");
            System.out.printf("입력 : ");

            // 사용자 입력값 저장
            String selNum = sc.nextLine();

            // 입력값에 따른 처리 구현
            if (selNum.equals(REGIST.trim())) {
                System.out.println(" >> 등록 화면을 선택 하셨습니다. << ");
                // 등록 진행 함수
                registTel(sc, telPhoneInfo);
            } else if (selNum.equals(INQUIRY.trim())) {
                System.out.println(" >> 조회 화면을 선택 하셨습니다. << ");
                // 조회 진행 함수
                inquiryTel(sc, telPhoneInfo);
            } else if (selNum.equals(MODIFY.trim())) {
                System.out.println(" >> 수정 화면을 선택 하셨습니다. << ");
                // 수정 진행 함수
                modifyInfo(sc, telPhoneInfo);
            } else if (selNum.equals(DELETE.trim())) {
                System.out.println(" >> 삭제 화면을 선택 하셨습니다. << ");
                // 삭제 진행 함수
                deleteTelInfo(sc, telPhoneInfo);
            } else if (selNum.equals(SEL_USER_INQUIRY.trim())) {
                System.out.println(" >> 선택 조회 화면을 선택 하셨습니다. << ");
                // 선택 조회 진행 함수
                userInquiry(sc,telPhoneInfo);
            } else if (selNum.equals(EXIT.trim())) {
                System.out.println(" >> 프로그램을 종료 합니다. << ");
                flag = false;
            } else {
                System.out.println("올바른 입력값을 넣어 주세요.");
            }
        }
    }

    // 사용자 정보 등록 처리 함수
    public static void registTel(Scanner sc, TelManagement[] tel) {

        // 사용자명, 전화번호 정보 입력
        System.out.println("사용자 이름을 입력 해 주세요. ");
        System.out.printf("입력 : ");
        String userNm = sc.nextLine();
        System.out.println("사용자 전화번호를 입력 해 주세요. ");
        System.out.printf("입력 : ");
        String userTel = sc.nextLine();

        // 사용자명, 전화번호 정보를 배열에 저장 (인덱스 번호는 currentIndex로 판단)
        tel[currentIndex] = new TelManagement(userNm, userTel);
        currentIndex++;
    } // *** 사용자 정보 등록 함수 끝 ***


    // 조회 처리 함수
    public static void inquiryTel(Scanner sc, TelManagement[] tel) {

        // 선택 변수 값
        final String SEARCH_ALL = "1";
        final String SEARCH_BY_NM = "2";

        // 전체 조회를 할지 특정 이름을 입력하여 해당 전화번호를 찾을 지 선택
        System.out.println("원하시는 조회 조건을 선택 해주세요");
        System.out.println("1. 전체 조회, 2. 선택 조회");
        System.out.print("입력 : ");
        String selNum = sc.nextLine();

        // 입력한 값에 따라 조회조건 처리
        if (selNum.equals(SEARCH_ALL.trim())) { // 전체 조회일 경우
            // 조회된 총 건수 및 사용자 정보(이름, 전화번호) 표시
            countTelInfo(tel); // 카운트 함수
            for (int i = 0; i < tel.length; i++) {
                if (tel[i] != null) {
                    System.out.println("사용자 명 : " + tel[i].getUserNm() + ", 사용자 전화번호 : " + tel[i].getTelNum());
                }
            }
        } else if (selNum.equals(SEARCH_BY_NM.trim())) {
            // 사용자 명을 입력받아 조회할 경우
            // 나중에 함수로 호출하여 처리하는 방식 고민필요
            System.out.println("사용자 명을 입력 해 주세요");
            System.out.print("입력 : ");
            String target = sc.nextLine();

            for (int i = 0; i < tel.length; i++) {
                if (tel[i] != null) { // 사용자 명이 검색 됐을 때
                    if (tel[i].getUserNm().equals(target)) {
                        System.out.println("사용자 명 : " + tel[i].getUserNm() + ", 사용자 전화번호 : " + tel[i].getTelNum());
                        break;
                    }
                } else { // 특정 사용자 명이 검색 안됐을 때

                    // 전체조회 여부 확인
                    System.out.println("해당 사용자로 등록된 정보가 없습니다.");
                    System.out.println("전체 조회를 진행 하시겠습니까? (Y,N 입력)");
                    System.out.printf("입력 : ");
                    String selectYn = sc.nextLine();

                    // 전체 조회
                    if ("Y".equals(selectYn.trim().toUpperCase())) {
                        // 조회된 총 건수 및 사용자 정보(이름, 전화번호) 표시
                        countTelInfo(tel); // 카운트 함수
                        for (int j = 0; j < tel.length; j++) {
                            if (tel[j] != null) {
                                System.out.println("사용자 명 : " + tel[j].getUserNm() + ", 사용자 전화번호 : " + tel[j].getTelNum());
                            }
                        }
                        break;
                    } else if ("N".equals(selectYn.trim().toUpperCase())) { // 메인화면 이동
                        System.out.println("메인 화면으로 이동 합니다.");
                        break;
                    }
                }
            } // *** 사용자 검색 처리 끝 ***
        } // *** 사용자 검색 입력 조건일 시 if문 끝 ***
    } // *** 전체/특정 사용자 조건 검색 함수 끝 ***

    // 수정 처리 함수
    public static void modifyInfo(Scanner sc, TelManagement[] tel ) {
        System.out.println("전화번호를 수정 할 사용자 명을 입력 해 주세요");
        System.out.printf("입력 : ");
        String target = sc.nextLine();

        for (int i=0; i < tel.length; i++) {
            if(tel[i] != null) {
                if(tel[i].getUserNm().equals(target.trim())) {
                    System.out.println("변경할 전화번호를 입력 해 주세요");
                    System.out.printf("입력 : ");

                    String modifyTelInfo =  sc.nextLine();
                    tel[i].setTelNum(modifyTelInfo.trim());
                    break;
                }
            } else {
                System.out.println("해당 회원의 정보를 발견하지 못했습니다.");
                break;
            }
        }
    }

    // 삭제 처리 함수
    public static void deleteTelInfo(Scanner sc, TelManagement[] tel) {
        System.out.println("삭제 할 전화번호의 사용자 명을 입력 해 주세요");
        System.out.printf("입력 : ");
        String target = sc.nextLine();

        for (int i = 0; i < tel.length; i++) {
            if (tel[i] != null) {
                if(tel[i].getUserNm().equals(target.trim())){
                    tel[i] = null;
                    System.out.println("삭제 되었습니다.");
                    break;
                }
            } else { // 메인화면 이동
                System.out.println("해당 사용자가 존재하지 않습니다.");
                break;
            }
        }

    }

    // 선택 조회 함수
    public static void userInquiry(Scanner sc, TelManagement[] tel) {
        System.out.println("조회 할 사용자 명을 입력 해 주세요");
        System.out.print("입력 : ");
        String target = sc.nextLine();

        for (int i = 0; i < tel.length; i++) {
            if (tel[i] != null) { // 사용자 명이 검색 됐을 때
                if (tel[i].getUserNm().equals(target)) {
                    System.out.println("사용자 명 : " + tel[i].getUserNm() + ", 사용자 전화번호 : " + tel[i].getTelNum());
                    break;
                }
            } else { // 특정 사용자 명이 검색 안됐을 때
                System.out.println("해당 사용자 명으로 된 정보가 존재하지 않습니다.");
                break;
            }
        } // *** 사용자 검색 처리 끝 ***
    }

    // 전화번호 전체조회 사용자 정보 카운트 함수
    public static void countTelInfo(TelManagement[] tel) {
        // 조회된 총 개수를 넣기위한 변수
        int inquiryCount = 0;

        // for문을 사용하여 값이 들어가 있는 정보 총 개수 체크
        // 배운내용을 기반으로 작성예정 (배우지 않은 기능들은 최대한 자제)
        // 좋은 코드라고는 볼 수 없을듯....
        for (int count = 0; count < tel.length; count++) {
            if (tel[count] != null) {
                inquiryCount++;
            }
        }
        System.out.println("총 " + inquiryCount + " 명이 검색 되었습니다.");
    }
}
