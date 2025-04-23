package com._this;

public class UserInfoMainTest {

    public static void main(String[] args) {

        //UserInfo u1 = new UserInfo("u1");
        //UserInfo u2 = new UserInfo("u2","1234");
        //UserInfo u3 = new UserInfo("u3", "1234", "이기영");
        //UserInfo u4 = new UserInfo("u4", "1234", "이기철", "시골");
        UserInfo u5 = new UserInfo("u5", "1234", "이영철", "시골", "01012341234");

        System.out.println(u5.getUserId());
        System.out.println(u5.getUserPassword());
        System.out.println(u5.getUserName());
        System.out.println(u5.getUserAddress());
        System.out.println(u5.getPhoneNumber());

        System.out.println("========================================");




    }

}
