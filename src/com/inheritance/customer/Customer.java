package com.inheritance.customer;

public class Customer {

    private int customerId;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;

    //getter
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    //setter
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    // 메서드
    public int calcPrice(int n1) {
        return n1;
    }
    public String showCustomerInfo() {
        String info = "고객정보";
        return info;
    }
}
