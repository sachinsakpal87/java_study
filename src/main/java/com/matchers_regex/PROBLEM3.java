package com.matchers_regex;

public class PROBLEM3 {
    public static double AbraKaDabraProduct(int n) {
        if (n <= 1)
            return 6;
        return AbraKaDabraProduct(n - 1) * AbraKaDabra(n);
    }

    private static double AbraKaDabra(int n) {
        if (n <= 1)
            return 6;
        return AbraKaDabra (n-1) - (n-1) + (n+2);
    }

    public static void main(String[] args) {
        for (int i=0; i<500; i++){
            System.out.println(PROBLEM3.AbraKaDabraProduct(i) + " "+i);
        }
//        System.out.println(88179840*88179840);

    }
}
