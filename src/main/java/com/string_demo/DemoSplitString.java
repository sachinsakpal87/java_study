package com.string_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoSplitString {
	public static void main(String[] args) {
		String str = "||Hi||My|Name|is|Sachin|";
		String delim = "|";
		String[] arr = splitStr(str,delim);
//		String[] arr = splitStrRex(str,delim);
//		for (int i=0; i<arr.length; i++)
		System.out.println(Arrays.toString(arr));

		String[] orig_arr = str.split("[|]");
		System.out.println(Arrays.toString(orig_arr));
	}

	private static String[] splitStrRex(String str, String delim){
		ArrayList<String> arrayList = new ArrayList<>();
		Pattern pattern = Pattern.compile("[^"+delim+"]+");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()){
			arrayList.add(matcher.group());
		}
		String [] arr = new String[arrayList.size()];
		return arrayList.toArray(arr);
	}

	private static String[] splitStr(String str, String delim) {
		ArrayList<String> arrayList = new ArrayList<>();
		int first = 0;
		for(int i=0; i<str.length();i++){
			if(String.valueOf(str.charAt(i)).equals(delim)) {
				arrayList.add(str.substring(first,i));
				first=i+1;
			}if((i==str.length()-1)) {
				arrayList.add(str.substring(first));
			}
		}
		String [] arr = new String[arrayList.size()];
	return arrayList.toArray(arr);
	}


}
