package com.matchers_regex;

public class PROBLEM2 {
    public static boolean isJustAnswerString(String str) {
        String sub = "justanswer";
        if (sub.length() <= str.length()) {
            for (int i = 0; i < sub.length(); i++) {
                if (str.indexOf(sub.charAt(i)) == -1) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "sachin and swara got engaged just now";
        String str2 = "this is my code";
        System.out.println(isJustAnswerString(str1));
        System.out.println(isJustAnswerString(str2));
    }
}
