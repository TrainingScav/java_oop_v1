package com.inheritance.customer;

public class CustomerManageMent {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        VIPCustomer c2 = new VIPCustomer();
        GoldCustomer c3 = new GoldCustomer();

        // 일반 등급
        c1.setCustomerId(2025012101);
        c1.setCustomerName("홍길동");
        c1.setCustomerGrade("일반");
        // GOLD 등급
        c2.setCustomerId(2025012102);
        c2.setCustomerName("이기영");
        c2.setCustomerGrade("골드");
        // VIP 등급
        c3.setCustomerId(2025012103);
        c3.setCustomerName("이기철");
        c3.setCustomerGrade("VIP");
    }
}
