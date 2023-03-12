package com.collections.collection;

import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(1,2,5,6,9,3,4,10));
        lst.add(3);

//        for(int i : lst){
//            System.out.print(i+" ");
//            lst.add(((i+i)*i)/i);
//            lst.remove(lst.size()-2);
//        }

        for (Iterator<Integer> itr = lst.iterator(); itr.hasNext();){
            int i = itr.next();
            itr.remove(); // here we are using iterator remove and not list methods remove
            System.out.print(i+ " ");
        }
        System.out.println();

        lst = new LinkedList<>(Arrays.asList(1,2,5,6,9,3,4,10));

        for (ListIterator<Integer> itr = lst.listIterator(); itr.hasNext();){
            int i = itr.next();
            int j = itr.previous();
            System.out.print(i+ " "+j);
            itr.next();
        }
        System.out.println();

        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()){
            int i = itr.next();
            System.out.print(i+" ");
//            lst.add(((i+i)*i)/i);
            itr.remove();

        }

        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("pqr"));
        System.out.println("bc".compareTo("a"));





    }

}
