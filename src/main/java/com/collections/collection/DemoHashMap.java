package com.collections.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;

/**
 * Map is key value pair hence duplicate keys are not allowed
 * Hash hence its unordered.
 * null is allowed as a key as well as value
 * duplicate key will be overriden.
 * duplicate values are allowed.
 */
public class DemoHashMap {

    public static void main(String[] args) {

        Map<String ,String> iMap = ImmutableMap.of("key1","val1","key2","val2");
        for(Map.Entry entry : iMap.entrySet()){
            entry.getValue();
            entry.getKey();
        }
        HashMap<String, String>hashMap_1 = new HashMap();


        hashMap_1.put("Added_Key", "Added_Value");
        String obj = hashMap_1.remove("Added_Key");   //Remove will return the value for the given key
        System.out.println("Remove will return value for removed key "+obj);


        obj = hashMap_1.put("PQR", "STU");  //Put in hashmap will return null if key is not present and return value if key is already exist
        System.out.println("Put function in map will return `null` :: "+obj+" if key is not exist in map");    //This will Print null
        obj = hashMap_1.put("PQR", "STU");
        System.out.println("Put function in map will return value :: "+obj+" if key is exist in map");


        HashMap<String, String> objCollection = new HashMap<String, String>();
        System.out.println(objCollection.put("1", "Sachin"));
        System.out.println(objCollection.put("1", "rrrrrr"));
        objCollection.put("2", "Sakpal");
        objCollection.put("1", "Vishwas");
        objCollection.put("3", "Mahipat");
//        objCollection.put("4", null);           //Map can accept null as value
//        objCollection.put("5", null);
        objCollection.put("6", "Mahipat");
        objCollection.put(null, "Vishwas");     //Map can accept null as key
        objCollection.put(null, "Mahipat");
        objCollection.put(null, "temp");

        System.out.println(objCollection);

        System.out.println(objCollection.get(null));

        System.out.println("Get value for Key 6 :: " + objCollection.get(6));

        System.out.println(" Check if key is available :: " + objCollection.containsKey("9"));
        System.out.println(" Check if key is available :: " + objCollection.containsKey("5"));
        System.out.println(" Check if key is available :: " + objCollection.containsKey(null));

        System.out.println(" Check if value is available :: " + objCollection.containsValue("9"));
        System.out.println(" Check if value is available :: " + objCollection.containsValue("Vishwas"));
        System.out.println(" Check if value is available :: " + objCollection.containsValue(null));

//        Collection<string_demo> values = objCollection.values();
//        values.iterator();

//::::::::::::::::::::::::::::::::::Iterate map using keyset :::::::::::::::::::::::::::::::::::::::://

//Get the keyset
        Set<String> keySet = objCollection.keySet();
//Second get iterator using keySet
        Iterator<String> itr = keySet.iterator();

        while (itr.hasNext()) {
            //string_demo key = itr.next();
            System.out.println("Value for is : " + objCollection.get(itr.next()));
        }

//::::::::::::::::::::::::  Using Map Entry which will provide both key and value :::::::::::::::::::::::::::::::::::::::://
        //Remember entry set returns Set not List

        for (Map.Entry<String, String> entry : objCollection.entrySet()) {
            System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
        }

        List<Map.Entry<String, String>> listr = new LinkedList<>(objCollection.entrySet());
//        Collections.sort(listr,(o1, o2) -> {
//            return o1.getValue().compareTo(o2.getValue());
//        });

        Collections.sort(listr, Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<String, String> entry : listr) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//::::::::::::::::::::::::  Heterogeneous map :::::::::::::::::::::::::::::::::::::::://
        HashMap last = new HashMap();
        last.put("le", "kyu");
        last.put(1, 6);
        last.put(null, "asc");
        last.put(Integer.valueOf(10), null);

        System.out.println("Heterogenious" + last);


        function(Arrays.asList(3, 1, 2, 1, 5), 5);

    }

    public static void function(List<Integer> list, int num) {
        int[] arr = new int[num + 1];
        for (int n : list) {
            arr[n] = arr[n] + 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Missing number is " + i);
            }
            if (arr[i] > 1) {
                System.out.println("Reapeating number is " + i);
            }
        }
    }
}
