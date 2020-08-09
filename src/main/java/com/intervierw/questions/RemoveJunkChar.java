package com.intervierw.questions;

public class RemoveJunkChar {
    public static void main(String[] args) {
        String string = "@^&#T&^$ Hel#$%^&lo There (*$&($";
        System.out.println(string.replaceAll("[^a-zA-Z\\s]",""));

//        Matcher matcher = Pattern.compile("[w\\s]+").matcher(string);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
    }
}
