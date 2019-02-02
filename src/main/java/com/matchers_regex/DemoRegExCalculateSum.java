package com.matchers_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegExCalculateSum {
	public static void main(String[] args) {
		String str = "Hello10Myname is 20 Sa67chin H05w are y19ou";
		Pattern pattern = Pattern.compile("[\\d]+");
		Matcher matcher = pattern.matcher(str);
		Integer sum = 0;
		while (matcher.find()) {
			sum = sum + Integer.parseInt(matcher.group());
		}
		System.out.println("Sum is " + sum);
		sum = 0;
		Matcher matcher1 = Pattern.compile("[\\d]+").matcher(str);
		while (matcher1.find()) {
			sum = sum + Integer.parseInt(matcher1.group());
		}
		System.out.println("Sum is " + sum);
	}
}
