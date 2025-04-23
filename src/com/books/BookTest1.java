package com.books;

/**
 * 배열 테스트 코드 작성
 */
public class BookTest1 {

    public static void main(String[] args) {

        // 배열안의 요소는 - 기본데이터 타입
        //                 - 참조 자료형 타입

        Book[] books = new Book[10];
        books[0] = new Book("플로터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었읍니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[9] = new Book("홍길동전", "허균");

        // 조회
        String title9 = books[9].getTitle();
        String author9 = books[9].getAuthor();

        System.out.println("title9  : " + title9);
        System.out.println("author9 : " + author9);

        // 배열은 반복문과 함께 많이 쓰여 진다.
        // 주의 - 배열의 길이와 요소(elements)는 꼭 가득 차 있는 것은 아니다.
        for (int i = 0; i < books.length; i++) {
            // 만약 배열안에 요소가 null 이 아니라면 출력 - 방어적 코드
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            }

        }

    } // end of main
} // end of class

