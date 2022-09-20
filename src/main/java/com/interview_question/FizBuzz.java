package com.interview_question;

import java.util.Arrays;
import java.util.List;

public class FizBuzz {
    public static List<String> fizzBuzz(int n) {
        String[] arr = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(4).toString());
        System.out.println(fizzBuzz(5).toString());
        System.out.println(fizzBuzz(15).toString());
    }
}

