package com.interview;

public class ReverseInterview {
    public static void main(String[] args) {
        String str = "test90thisis12javaex189rh";
        char[] arr = str.toCharArray();
        String rev = "";
        StringBuilder tempRev = new StringBuilder();
        for (int i=0; i< arr.length; i++){
            if(Character.isDigit(arr[i])){
                rev += tempRev.reverse().toString()+arr[i];
                tempRev.setLength(0);
            }else {
                tempRev.append(arr[i]);
            }
        }
        if(tempRev.toString() != ""){
            rev += tempRev.reverse();
        }
        System.out.println(rev);
    }
}
