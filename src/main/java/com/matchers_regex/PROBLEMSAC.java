package com.matchers_regex;

import static java.lang.Math.multiplyExact;

public class PROBLEMSAC {
    // Function to calculate sum of series.
    static int AbraKaDabra(int n)
    {
        int prod = 1;
        if(n<=1)
            return 6;
        for (int i = 1; i <= n; i++)
            prod = multiplyExact(prod, multiplyExact(3,(i+1)));

        return prod;
    }

    public static void main(String[] args) {
        for (int i=0; i<9; i++){
            System.out.println(PROBLEMSAC.AbraKaDabra(i) + " "+i);
        }
//        System.out.println(88179840*88179840);

    }
}
