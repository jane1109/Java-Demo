package com.example.as.Java8.DefaultStatic;

/**
 * @author jiayingchen
 * @created 2020/05/05
 * @project course-april-2020
 */

public class MasterCard implements CreditCard{

    public MasterCard(){

    }
    @Override
    public boolean isCardAcceptable(String cardType) {
        System.out.println("Override method");
        return false;
    }

    public static void main(String[] args){
        MasterCard mc = new MasterCard();
        mc.isCardAcceptable("any");
        mc.payBill(100);
        CreditCard.refund(20);
    }
}
