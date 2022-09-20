package com.intervierw.questions;

public class IntegerIsPalindrome {
    public static void main(String[] args) {
        int num = 1231;
        String str = String.valueOf(num);
        boolean flag = true;
        for (int i=0, j=str.length()-1; i<str.length()/2; i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
