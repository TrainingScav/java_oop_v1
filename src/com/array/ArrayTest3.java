package com.array;

import java.util.Random;

public class ArrayTest3 {

    public static void main(String[] args) {
        // 난수 발생 기능 - 랜덤한 숫자를 하나 만들어 주는 도구
        // 자바 개발자들이 미리 만들어 준 기능
        Random random = new Random();
        // 문서 <-- 구글링 <-- AI
        random.nextInt();
        // 0 ~ 44 까지 랜덤한 숫자를 하나 발생해 준다.
        // 1 ~45


        // 배열과 for문을 활용해서 코드를 수정 해주세요.
        int ranInt1 = random.nextInt(45) + 1;
        int ranInt2 = random.nextInt(45) + 1;
        int ranInt3 = random.nextInt(45) + 1;
        int ranInt4 = random.nextInt(45) + 1;
        int ranInt5 = random.nextInt(45) + 1;
        int ranInt6 = random.nextInt(45) + 1;

        int[] ranInt = new int[6];
        for (int i = 0; i < ranInt.length; i++) {
            ranInt[i] = random.nextInt(45) + 1;
            System.out.println(ranInt[i]);
        }
    }

}
