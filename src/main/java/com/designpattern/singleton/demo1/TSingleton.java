package com.designpattern.singleton.demo1;

public class TSingleton {

//	static{
//		
//		try{
//			instance = (TSingleton) Class.forName("TSingleton").newInstance();
//		}catch(ClassNotFoundException cnfe){
//			instance = null;
//	        System.out.println("Can't find class TSingleton " + cnfe);
//	    }catch (NoClassDefFoundError ncdfe){
//	        instance = null;
//	        System.out.println("Can't find class TSingleton " + ncdfe);
//	    }catch(exception e){
//			instance = null;
//	        System.out.println("Can't find class TSingleton " +e);
//		}
//	}

    private static TSingleton instance;
    private int value = 0;
    private String iname = null;

    private TSingleton() {
        this.value = 5;
        this.iname = "No Name";
        System.out.println("Call to constructor");
    }

    public static TSingleton getInstance() {
        if (instance == null) {
            instance = new TSingleton();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public void Display() {
        System.out.println("Value is " + getValue() + " Name is " + getIname());
    }
}
