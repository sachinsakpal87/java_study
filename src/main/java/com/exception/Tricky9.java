package com.exception;

public class Tricky9 {
    public static void main(String[] args) {
        try {
//            System.exit(0);
            badMethod();
        }catch (RuntimeException ex){
            System.out.println("B");
        }finally {
            System.out.println("Hello");
        }
    }

    private static void badMethod() {
        throw new RuntimeException();
    }
}
