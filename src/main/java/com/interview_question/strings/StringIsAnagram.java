package com.interview_question.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringIsAnagram {
	public static void main(String[] args) {
		String first = "SILENT";
//        string_demo second = "LISTEN";
		String second = "LISTEN";

//        Matcher matcher = Pattern.compile("["+first+"]+").matcher(second);
//        if((first.length()==second.length())&&matcher.matches())
//            System.out.println("true");
//        else
//            System.out.println("false");


		if (first.length() == second.length()) {
			first = Stream
					.of(first.toLowerCase().split(""))
					.sorted()
					.collect(Collectors.joining());
			second = Stream
					.of(second.split(""))
					.sorted()
					.collect(Collectors.joining());

			System.out.println(first.equals(second) ? "true" : "false");
		}
	}
}



/*

import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {

        // Convert the strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If the lengths of the strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray2);

        // Check if the sorted character arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

 */