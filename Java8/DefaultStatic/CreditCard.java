package com.example.as.Java8.DefaultStatic;

/**
 * @author jiayingchen
 * @created 2020/05/05
 * @project course-april-2020
 */
public interface CreditCard {
    String holderName = null;
    String cardNumber = null;
    double accountBalance = 0.0;
    String cardType = null;

    public boolean isCardAcceptable(String cardType);

    //default have body in interface
    default void payBill(double bill){
        System.out.println("Interface default method  " + "bill: " + bill);
    }

    //not allow override by child class, follow the interface
    static void refund(double amount){
        System.out.println("Interface static method  " + "refund: " + amount);
    }
}
