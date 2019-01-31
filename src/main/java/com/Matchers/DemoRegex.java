package com.Matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
	public static void main(String[] args) {
		String string = "Hello !!! This is Regular Expression Demo and it is very good";
		Pattern pattern = Pattern.compile("is"); // Can use any regular Expression
		Matcher matcher = pattern.matcher(string);

//        Pattern.compile("is").matcher(string)
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		String str = "My Date of Birth is 12/05/1987 that is 30 years now";
//        Pattern pat = Pattern.compile("[0-9/]+");
		Pattern pat = Pattern.compile("[0-9]{2}");
		Matcher match = pat.matcher(str);
		while (match.find()) {
			System.out.println(match.group());
		}
		System.out.println(match.matches());

		String test = "Hello World !!!!";
		System.out.println(Pattern.compile("[a-zA-Z !]+").matcher(test).matches());
		System.out.println(Pattern.compile("Hello World !!!!").matcher(test).matches()); //

		System.out.println("\nSimple ....");

		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
		System.out.println(Pattern.matches("[amn]", "m"));//true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "amn"));//false (either a or m or n)

		System.out.println();

		System.out.println("\n? quantifier ....");
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

		System.out.println("\n+ quantifier ....");
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

		System.out.println("\n* quantifier ....");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)

		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

		System.out.println("\nmetacharacters D....");//D means non-digit

		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

		System.out.println("\nmetacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)

		System.out.println();
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
	}
}
