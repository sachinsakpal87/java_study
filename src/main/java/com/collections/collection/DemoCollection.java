package com.collections.collection;

import java.lang.reflect.*;
import java.util.*;

public class DemoCollection {

    public static void main(String args[]) {

        Collection<Integer> objCollection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7, 7, 2, 3, 4, 7, 5));

        if (objCollection.contains(5)) {
            System.out.println(" " + objCollection.toString());
        }

        Iterator<Integer> itr = objCollection.iterator();
        while (itr.hasNext()) {
            int temp = itr.next();
            if (temp == 7) {
                itr.remove();
            } else {
                System.out.println("->" + temp);
            }
        }
        System.out.println(" " + objCollection.toString());
        System.out.println(" " + objCollection.size());
        Object[] arr = new Object[objCollection.size()];
        arr = objCollection.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }

        Collection<Integer> obj = new ArrayList<Integer>();

        //add will add the object
        obj.add(5);


        //add all
        obj.addAll(objCollection);

        //remove the object
        obj.remove(5);

        //clear
        obj.clear();

        //retain (remove all except those present in objCollection)
        obj.add(5);
        obj.add(77);
        obj.addAll(objCollection);
        obj.retainAll(objCollection);

        //contains
        obj.contains(5);
        obj.containsAll(objCollection);

        //convert to array
        Object[] tmpArr = obj.toArray();

//        LinkedList<Integer> linkedList = fun();

        Method[] methods = obj.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i] + ", ");
        }

    }

//    private static ArrayList<Integer> fun() {
//        return new ArrayList<Integer>();
//    }

}
