package com.example.as.Java8.DefaultStatic;

/**
 * @author jiayingchen
 * @created 2020/05/05
 * @project course-april-2020
 */

public class VisaCard implements CreditCard{

    public VisaCard() {
        super();
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        System.out.println("Override method");
        if ("visa".equalsIgnoreCase(cardType)){
            payBill(10);//default can be called directly
            CreditCard.refund(1200);
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args){
        VisaCard vc = new VisaCard();
        vc.isCardAcceptable("any");
        vc.payBill(10);
        CreditCard.refund(20);
    }
}
