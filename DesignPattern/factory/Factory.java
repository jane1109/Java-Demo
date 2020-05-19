package com.example.as.DesignPattern.factory;

public class Factory {

    public interface Currency{
        Currency exchange();
    }

    public static class USDollar implements Currency{
        @Override
        public Currency exchange() {
            return new USDollar();
        }
    }

    public static class JapaneseYen implements Currency{
        @Override
        public Currency exchange() {
            return new JapaneseYen();
        }
    }

    public static class CurrencyFactory{
        public Currency getLocalCurrency(String country){
            if ("US".equalsIgnoreCase(country)){
                System.out.println("us");
                return new USDollar();
            }else if ("Japan".equalsIgnoreCase(country)){
                return new JapaneseYen();
            }
            return null;
        }
    }

    public static void main(String[] args){
        CurrencyFactory currencyFactory = new CurrencyFactory();
        currencyFactory.getLocalCurrency("US");
    }
}
