package com.intervierw.questions;

import java.util.HashSet;

public class findDuplicateElementInArray {
    public static void main(String[] args) {
        String [] arr = {"Java","abc","pqr","Java","pqr"};

        HashSet<String> set = new HashSet<>();
        for (String str : arr){
            if(!set.add(str)){
                System.out.println("Duplicate Element "+str);
            }
        }
    }
}
