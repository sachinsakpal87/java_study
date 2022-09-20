package com.collections.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoInterview {
    public static void main(String[] args) {
        String[] nameProvider = {"John", "Cena", "Raj", "Ravi", "Mark", "Craig", "Han", "Joseph", "Jeevan", "Jack",
                "John", "Raj", "John"};

        HashMap<String,Integer> map = new HashMap<>();
        for (String name : nameProvider){
            map.putIfAbsent(name,0);
            map.computeIfPresent(name, (key, value) -> value + 1);
        }
//        int maxVal=0;
//        String maxKey="";
//        for (Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey() + " "+ entry.getValue());
//            if(maxVal<(int)entry.getValue()){
//                maxVal =   (int)  entry.getValue();
//                maxKey  = entry.getKey().toString();
//            }
//        }
//        System.out.println("\n\n"+maxKey + " "+ maxVal);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String,Integer>> lst = new ArrayList<>(set);
        System.out.println(lst);
        Collections.sort(lst, ((o1, o2) -> -1* o1.getValue().compareTo(o2.getValue())));
        System.out.println(lst.get(0));
    }
}
