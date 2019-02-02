package com.InterviewQuestion.Strings;

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
					.of(first.split(""))
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
