package com.interview_question;



public class IfWithError {

public static void fun1() throws Exception{
    throw new Exception();
}

    public static boolean fun() throws Exception{
        fun1();
        return true;
    }

    public static void main(String[] args) throws Exception{

        if(fun()){
            System.out.println("IF Successful");
        }else {
            System.out.println("If Failed");
        }
    }


}
