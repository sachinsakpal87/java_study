package com.collections.collection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * In List duplicates are allowed and Insertion order is maintained
 * Arraylist are not synchronized and hence not thread safe
 * can be synchronized by using collections.synchronized
 * Searching is faster in ArrayList
 * Insertion and deletion is slower as shifting is required.
 * Underline data structure is Resizable or growable array
 * it implements random access
 * Faster than Vector
 * increments 50% of current size
 * Allow duplicate and unsorted but ordered
 * Heterogenious objects are allowed
 * Null is allowed
 * default size is 10
 */

public class DemoArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(5, 6, 1, 2, 9, 3, 4));
        a1.retainAll(a2);                //op 1,2,3


        ArrayList<Integer> objCollection = new ArrayList<>(Arrays.asList(1,2,3,4,null,5,6,7,7,2));

        Method[] methods = objCollection.getClass().getMethods();
        for (Method method : methods) {
            System.out.println(method + ", ");
        }

        System.out.println("_________________________________________");
        System.out.println(" " + objCollection.toString());
        System.out.println("_________________________________________");

        System.out.println("Element at index 5 is " + objCollection);

        System.out.println("Element at index 5 is " + objCollection.get(5));
        System.out.println("First Index of 7 is " + objCollection.indexOf(7));
        System.out.println("Last Index of 7 is " + objCollection.lastIndexOf(7));
        System.out.println("Set 15 at index 9 " + objCollection.set(9, 15));
        System.out.println("Sub list from index 5 - 9 " + objCollection.subList(0, 12));

        if (objCollection.contains(5)) {
            System.out.println(" " + objCollection.toString());
        }

//		Iterator<Integer> itr  = objCollection.iterator();
//		while(itr.hasNext()){
//			int temp = itr.next();
//			if(temp==7){
//				itr.remove();
//			}else{
//				System.out.print("->"+temp);
//			}
//		}


        Collections.synchronizedCollection(objCollection);
//        Collections.sort(objCollection);
        System.out.println(" " + objCollection.toString());
        ArrayList<Integer> obj = new ArrayList<Integer>();


//		obj.add(null);
//		obj.add(null);
//		obj.add(null);
//		obj.add(null);
//		obj.add(null);
//		obj.add(10);
//		obj.add(10);
//		obj.add(11);
//		obj.add(12);
//		obj.remove(1);

        System.out.println(" -> " + obj.toString());
        Iterator<Integer> itr123 = obj.iterator();
        while (itr123.hasNext()) {
            System.out.println(itr123.next().toString());
        }

        List<Integer> lst = new ArrayList<Integer>(10);

        lst.add(0, null);
        lst.add(1, null);
        lst.add(2, 5);
        lst.add(2, 6);
        lst.get(0);
        lst.remove(1);
        lst.get(1);

        lst.forEach(ele -> System.out.println("Element is " + ele));


        List<String> stringList = Arrays.asList("sachin", "sakpal");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Why Iterator is used below example
//        ArrayList<Integer> lst = new ArrayList();
//        lst.add(10);
//        lst.add(20);
//        lst.add(20);
//        lst.add(20);
//        lst.add(20);
//        lst.add(20);
//        lst.add(20);
//        lst.add(20);

//        for (int i=0; i< 100; i++){
//            lst.add(i);
//            System.out.println(lst);
//            if(i==10){
//                break;
//            }
////            lst.remove(i);
//        }
//        for (Integer i : lst){
//            lst.add(i);
//            System.out.println(lst);
//            lst.remove(5);
//        }

//        Iterator itr = lst.iterator();
//        while (itr.hasNext()){
//            lst.add(4);
//            System.out.println(lst);
//            lst.remove(4);
//        }
    }
}
