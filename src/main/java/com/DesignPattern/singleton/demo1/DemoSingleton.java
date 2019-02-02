package com.designpattern.singleton.demo1;

import java.lang.reflect.InvocationTargetException;

public class DemoSingleton {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        TSingleton obj = TSingleton.getInstance();
        TSingleton obj2 = TSingleton.getInstance();
        obj.setIname("sachin Sakpal");
        obj2.Display();

        Class cls = Class.forName("com.designpattern.singleton.demo1.TSingleton");
        Object obj3 = cls.getDeclaredConstructor().newInstance();
        ((TSingleton) obj3).Display();


    }

}
