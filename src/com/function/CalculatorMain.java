package com.function;

/**
 * 함수란? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록이야.
 * static을 사용하면 객체 없이 바로 호출 가능 해.
 */
public class CalculatorMain {

    public static void main(String[] args) {
        // 테스트 용 숫자
        int num1 = 10;
        int num2 = 5;
        int testNumber = 7;

        // 더하기 함수 호출
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // 빼기 함수 호출
        int minus = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + minus);

        // 곱하기 함수 호출
        int mul = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + mul);

        // 나누기 함수 호출
        double div = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + div);

        // 짝수 판별 함수 호출
        boolean isEvenYn = isEven(num1);
        System.out.println(num1 + " 의 값 짝수 여부 판단 결과 : " + isEvenYn);

        // 홀수 판별 함수 호출
        boolean isOddYn = isOdd(num1);
        System.out.println(num1 + " 의 값 홀수 여부 판단 결과 : " + isOddYn);
    }

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b; // 입력받은 a와 b를 더하고 반환
    }

    // 두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a - b;
    }

    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b;
    }

    // 두 숫자를 나누는 함수
    static double divide(int a, int b) {
        // 방어적 코드를 잘 작성해야 한다.
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    // 짝수인지 판별하는 함수 - 매개변수
    static boolean isEven(int number) {
        return (number % 2) == 0; // 나머지가 0이면 짝수 -> true, 아니라면 false
    }

    // 홀수인지 판별하는 함수 - 매개변수 1
    static boolean isOdd(int number) {
        return (number % 2) != 0;
    }


}
