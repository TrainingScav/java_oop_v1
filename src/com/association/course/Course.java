package com.association.course;

public class Course {

    private String name;

    // getter
    public String getName() {
        return name;
    }

    // 생성자
    public Course(String name) {
        this.name = name;
    }

    // 메서드
    public void display() {
        System.out.println("강의 : " + name);
    }


}
