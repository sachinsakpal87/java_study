package com.intervierw.questions;


public class DemoPigLatin {

    private static boolean isVowel(String s){
        return (s.toLowerCase().equals("a")||s.toLowerCase().equals("e")||s.toLowerCase().equals("i")||s.toLowerCase().equals("o")||s.toLowerCase().equals("u"));
    }

    private static String pigLatin(String input){
        String firstChar = input.substring(0,1);
        String seconChar = input.substring(0,1);
        if(isVowel(firstChar)){
            return input + "ay";
        }else {

            return seconChar.toUpperCase() +input.substring(2,input.length()) + firstChar.toLowerCase() +"ay";
        }
    }

    private static void doPigLatin(String input){
        String [] arr = input.split(" ");
        for (int i=0; i< arr.length; i++){
            System.out.print(pigLatin(arr[i])+" ");
        }
    }

    public static void main(String[] args) {
        String input = "Hello World";
        doPigLatin(input);
    }
}
