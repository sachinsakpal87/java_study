package com.intervierw.questions;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        int n = 6;
        List<Integer> prev_row = new ArrayList<>();
        prev_row.add(1);
        System.out.print(prev_row.get(0)+"\n");
        for (int i=1; i< n; i++){
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            System.out.print(1+" ");
            for (int j=1 ; j < i; j++ ){
                curr_row.add(prev_row.get(j-1)+prev_row.get(j));
                System.out.print(prev_row.get(j-1)+prev_row.get(j)+" ");
            }
            System.out.print(1+"\n");
            curr_row.add(1);
            prev_row = curr_row;
        }
    }
}
