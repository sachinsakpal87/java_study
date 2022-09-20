package com.intervierw.questions;

public class pigLatin {
    public static void main(String[] args) {
//        As a user I can enter a phrase "Hello World" and see it translated to Pig Latin "Ellohay Orldway"
        String str = "Hello!";
        System.out.println(convertPigLatin(str));
    }

    private static String convertPigLatin(String str) {
        String[] split = str.split(" ");
        StringBuilder finalStr = new StringBuilder();
        String space = "";
        for (String s : split) {
            String firstChar = s.substring(0, 1);
            if (isVowel(firstChar)) {
                finalStr.append(space).append(s).append("ay");
            } else {
                String secondChar = s.substring(1, 2);
                String remainingPart = s.substring(2);
                String lastChar = "";
                if (isSpecialChar(s.charAt(s.length() - 1))) {
                    lastChar = s.substring(s.length() - 1);
                    remainingPart = s.substring(2, s.length() - 1);
                }
                if (isCaseChange(firstChar.charAt(0))) {
                    secondChar = secondChar.toUpperCase();
                    firstChar = firstChar.toLowerCase();
                }
                finalStr.append(space).append(secondChar).append(remainingPart).append(firstChar).append("ay").append(lastChar);
            }
            space = " ";
        }
        return finalStr.toString();
    }

    private static boolean isVowel(String firstChar) {
        return firstChar.equalsIgnoreCase("a")
                || firstChar.equalsIgnoreCase("e")
                || firstChar.equalsIgnoreCase("i")
                || firstChar.equalsIgnoreCase("o")
                || firstChar.equalsIgnoreCase("u");
    }

    private static boolean isSpecialChar(char charAt) {
        return !Character.isLetterOrDigit(charAt);
    }

    private static boolean isCaseChange(Character ch) {
        return Character.isUpperCase(ch);
    }
}
