package com.regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sachin on 4/3/17.
 */
public class DemoRegEx1 {

	public static void main(String args[]) {
		Pattern p = Pattern.compile("[a-z]+");
		Matcher m = p.matcher("sachin");
		if (m.matches()) {
			System.out.println("value is :: " + m.matches());
		}

		int i = 0;
		String str = "Tauseef01 Husain29Sachin4013";
		Pattern p1 = Pattern.compile("[\\d]{2}");
		Matcher m1 = p1.matcher(str);
		while (m1.find()) {
			i = i + Integer.parseInt(m1.group());
		}
		System.out.println("Output is " + i);


		String java = "javaaaaaaa";
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(java);
		int vowel = 0;
		while (matcher.find()){
			vowel++;
		}
		System.out.println(vowel);
		System.out.println(java.length() - vowel);

	}
}
