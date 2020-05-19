package com.example.as.DesignPattern.singleton;

import java.io.Serializable;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

public class AppleDesignerFactory implements Serializable,Cloneable {
    private static AppleDesignerFactory singletonInstance;
    private AppleDesignerFactory(){}

    //synchronized keyword to prevent multiple thread to to access this method
    public static synchronized AppleDesignerFactory getInstance(){
        if(singletonInstance == null){
            singletonInstance = new AppleDesignerFactory();
        }
        return singletonInstance;
    }

    //override clone() method to prevent clone
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    //override readResolve() method to prevent Serializable/DeSerializeable
    protected Object readResolve(){
        return singletonInstance;
    }
}
