package com.example.as.ExceptionHandling;

import javax.smartcardio.Card;

/**
 * @author jiayingchen
 * @created 2020/05/04
 * @project course-april-2020
 */

class CardTypeException extends Exception{

    CardTypeException(String msg){
        super(msg);
    }
}

class AddressException extends Exception{

    AddressException(String msg){
        super(msg);
    }
}

public class ExceptionHandler {

    public static void handleException(String type, String address){

        try{
            if("AMEX".equalsIgnoreCase(type)){
                throw new CardTypeException("CardType not accept");
            }
            else if(address!= null || !address.toLowerCase().contains("us")){
                throw new AddressException("Address is not valid");
            }else{
                throw new Exception("Generic exception");
            }
        }catch (Exception e) {
            if(e instanceof CardTypeException){
                System.out.println("CardTypeException: " + e.getMessage());
            }else if(e instanceof AddressException){
                System.out.println("AddressTypeException: " + e.getMessage());
            }else{
                System.out.println("Generic Exception: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args){

        handleException("CHASE","US");
    }
}
