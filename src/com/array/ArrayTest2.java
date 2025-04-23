package com.array;

public class ArrayTest2 {

    public static void main(String[] args) {

        char[] alphabet = new char[26];


        // char 타입은 원래 정수 값이다.
        // 컴퓨터는 0,1 이진수로 데이터를 표현한다.
        // 문자, 문자열을 아주 많이 다루고 있다.
        // 컴퓨터에서 문자를 표현하기 위해서 문자표라는 것을 사용한다.
        // 아스키코드, EUC-KR
        // 유니코드 문자표는 전세계 공통으로 사용하기 위해 만들었음
        // 아스키코드는 1바이트 안에 하나의 문자를 다 표현할 수 있다.
        // [][][][][][][][] -> 1byte = 8bit (정수 0 ~ 127)
        //System.out.println();
        alphabet[0] = 'A';
        //System.out.println((int)alphabet[0]);
        alphabet[1] = 'B';
        //System.out.println((int)alphabet[1]);

        // 인코딩
        // 문자를 컴퓨터가 이해할 수 있는 숫자(코드값)로 바꾸는 과정
        int code1 = (int) 'A';
        // 디코딩
        // 숫자(코드값)을 사람이 읽을 수 있는 문자로 바꾸는 과정
        char code = (char) 66;

        // 반복문을 통해서 알파벳 A ~ Z 까지 출력하시오
        //int alphabetNum = 65; // 대문자 A부터 시작
        System.out.println(alphabet.length);
        for (int i = 0; i < alphabet.length; i++) {
            //alphabet[i] = (char) alphabetNum;
            //alphabetNum++;
            alphabet[i] = (char) ('a' + i);
            System.out.println(alphabet[i]);
        }
        //

    }
}
