package com.regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sachin on 4/3/17.
 */
public class DemoRegEx1 {

	public static void main(String args[]) {

        String reg = "[\\d]+\\sof\\s[\\d]+\\sfailed\\s\\([\\d]+%\\)[\\s]+[\\d]{2}:[\\d]{2}\\s+([\\d]+)\\s+([\\d]+)" +
                "\\s+([\\d]+)";
        Pattern p = Pattern.compile(reg);
        String source = "Tests  Passing  Failing  Pending  Skipped  \n" +
                "[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "┌────────────────────────────────────────────────────────────────────────────────────────────────┐\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✖  " +
                "endCustomerPersona/endCustomerPurch      19:14       14       11        3        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    ase.spec.js                     " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "resellerPersona/resellerCreatesComp      01:51        4        4        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    any.spec.js                     " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  platform/signup.spec.js         " +
                "         01:22        3        3        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "platform/customerSupportImpersonati      01:16        2        2        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    on.spec.js                      " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  merchantPersona/rmManageReseller" +
                ".sp      01:02        3        3        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    ec.js                           " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  merchantPersona/mmManageLeads" +
                ".spec.      00:40        2        2        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    js                              " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  platform/changeEmail.spec.js    " +
                "         00:15        1        1        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "merchantPersona/mmManageDiscounts.s      00:07        1        1        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    pec.js                          " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "endCustomerPersona/endCustomerSubsc      00:07        1        1        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    riptionChange.spec.js           " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "└────────────────────────────────────────────────────────────────────────────────────────────────┘\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m     ✖  1 of 9 failed (11%)             " +
                "         25:59       31       28        3        -        -  \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m\n" +
                "Tests  Passing  Failing  Pending  Skipped  \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "┌────────────────────────────────────────────────────────────────────────────────────────────────┐\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✖  " +
                "endCustomerPersona/endCustomerPurch      19:14       14       11        3        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    ase.spec.js                     " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "resellerPersona/resellerCreatesComp      01:51        4        4        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    any.spec.js                     " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  platform/signup.spec.js         " +
                "         01:22        3        3        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "platform/customerSupportImpersonati      01:16        2        2        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    on.spec.js                      " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  merchantPersona/rmManageReseller" +
                ".sp      01:02        3        3        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    ec.js                           " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  merchantPersona/mmManageLeads" +
                ".spec.      00:40        2        2        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    js                              " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  platform/changeEmail.spec.js    " +
                "         00:15        1        1        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "merchantPersona/mmManageDiscounts.s      00:07        1        1        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    pec.js                          " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "├────────────────────────────────────────────────────────────────────────────────────────────────┤\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │ ✔  " +
                "endCustomerPersona/endCustomerSubsc      00:07        1        1        -        -        - │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   │    riptionChange.spec.js           " +
                "                                                            │\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m   " +
                "└────────────────────────────────────────────────────────────────────────────────────────────────┘\n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m     ✖  1 of 9 failed (11%)             " +
                "         25:59       22       22        0        -        -  \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m \n" +
                "\u001B[33msit-appsmart-marketplace-development_2  |\u001B[0m ";

        int passed = 0;
        int failed= 0;
        int total= 0;
        Matcher m = p.matcher(source);
        while (m.find()){
            String val = m.group();
            total += Integer.parseInt(m.group(1));
            passed += Integer.parseInt(m.group(2));
            failed += Integer.parseInt(m.group(3));
        }
        System.out.println("Passed "+passed+"\n Failed "+failed+"\nTotal "+total);

//		String reg = "\\b(\\d{3})\\d{7}\\b";
//		Pattern p = Pattern.compile(reg);
//		String source = "3342449027, 2339829, and 61525734";
//
//		Matcher m = p.matcher(source);
//		while (m.find()){
//			String val = m.group();
//			String val2 = m.group(1);
//			System.out.println(val+ "    "+val2);
//		}
//		Pattern p = Pattern.compile("[a-z]+");
//		Matcher m = p.matcher("sachin");
//		if (m.matches()) {
//			System.out.println("value is :: " + m.matches());
//		}

//		int i = 0;
//		String str = "Tauseef01 Husain29Sachin4013";
//		Pattern p1 = Pattern.compile("[\\d]{2}");
//		Matcher m1 = p1.matcher(str);
//		while (m1.find()) {
//			i = i + Integer.parseInt(m1.group());
//		}
//		System.out.println("Output is " + i);
//
//
//		String java = "javaaaaaaa";
//		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
//		Matcher matcher = pattern.matcher(java);
//		int vowel = 0;
//		while (matcher.find()){
//			vowel++;
//		}
//		System.out.println(vowel);
//		System.out.println(java.length() - vowel);

	}
}
