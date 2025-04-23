package com._static;

import java.text.SimpleDateFormat;
import java.util.Date;

// 신용카드
public class Card {

    private static int cardSerialId = 1;

    private String userNm;
    private int userCardId;

    //생성자
    public Card(String userNm) {
        this.userNm = userNm;
        //this.userCardId = cardSerialId;
        //cardSerialId++;
    }

    //메서드
    public void getCard() {
        //Date d1 = new Date();
        //SimpleDateFormat s1 = new SimpleDateFormat("yyyyMMdd");
        //int today = s1.format(d1);
        //System.out.println(today);
        this.userCardId = Card.cardSerialId;
        cardSerialId++;
        System.out.println("카드가 생성이 완료 되었습니다.");
        System.out.println(userNm + " 의 카드 아이디는 " + userCardId + " 입니다.");
    }

    public static void main(String[] args) {
        Card c1 = new Card("티모");
        Card c2 = new Card("샤코");
        Card c3 = new Card("베인");

        c1.getCard();
        c2.getCard();
        c3.getCard();

    }

}
