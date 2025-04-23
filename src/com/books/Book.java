package com.books;

/**
 * 도서를 저장하고 관리할 수 있는 간단한 프로그램 만들어 보기
 * C R U D
 */
public class Book {

    private String title;
    private String author;
    private int totalPage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title,author);
        this.totalPage = totalPage;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getTotalPage() {
        return totalPage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
        System.out.println("-----------상태창------------");
        System.out.println("책 이름 : " + title);
        System.out.println("책 저자 : " + author);
        System.out.println("책 총페이지 : " + totalPage);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("홍길동","홍길동 어머니",150);

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getTotalPage());

        b1.showInfo();
    }


}
