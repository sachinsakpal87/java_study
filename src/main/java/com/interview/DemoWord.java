package com.interview;

import java.util.HashMap;
import java.util.Map;

public class DemoWord {
    public static void main(String[] args) {
        String str = "hello world this is my sentence which has multiple words such as world hello world";
        String [] arr = str.split(" ");
        HashMap<String,Integer> map = new HashMap();
        for (String word : arr){
            if(map.containsKey(word)){

            }else {
                map.put(word,0);
            }

        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println("Words "+entry.getKey()+" value "+entry.getValue());
        }

    }


}
