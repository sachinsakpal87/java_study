package com.interview_question;

import java.util.Arrays;
import java.util.Stack;

public class DemoReverseStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        reverse(stack);
    }

    public static void reverse(Stack stack){
        if(stack.isEmpty()){
           return;
        }
        int ele = (Integer)stack.pop();
        reverse(stack);
        insertBelow(stack,ele);
    }

    private static void insertBelow(Stack stack, int ele) {
        if(stack.isEmpty()){
            stack.push(ele);
        }else {
            int elem = (int) stack.pop();
            insertBelow(stack,ele);
            stack.push(elem);
        }

    }
}
