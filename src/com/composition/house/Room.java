package com.composition.house;

public class Room {

    // 방 개수
    private String type;

    public Room(String type) {
        this.type = type;
    }

    public void describe() {
        System.out.println(type + " 방입니다");
    }
}
