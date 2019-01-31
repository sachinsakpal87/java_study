package com.Matchers;

public class DemoRegExGroup {
//	public static void main(String[] args) {
//		String string = "This is Java Example, Java is Very Simple. Hello Java !!!!";
//		Pattern pattern = Pattern.compile("(Java)");
//		Matcher matcher = pattern.matcher(string);
//		if (matcher.find()){
//			System.out.println(matcher.group());
//			System.out.println(matcher.groupCount());
//		}
//	}

	public static void main(String[] args) {

		for (int i = 3; i < 40; i = i + 2) {
			if (prime(i) && prime(i + 2)) {
				System.out.println(i + "," + (i + 2));
			}
		}
	}

	private static boolean checkPrimeNumber(int var) {
		int div = var / 2;
		for (int i = 2; i <= div; i++) {
			int mod = var % i;
			if (mod == 0) {
				return false;
			}
		}
		return true;
	}

//    private static boolean checkPrimeNumber1(int var) {
//        if(((var-1)%3==0)&&((var+1)%4==0))
//            return true;
//        return false;
//    }

	public static boolean prime(int n) {
		System.out.println(new String(new char[n]));
		return !new String(new char[n]).matches(".?|(..+?)\\1+");
	}
}
