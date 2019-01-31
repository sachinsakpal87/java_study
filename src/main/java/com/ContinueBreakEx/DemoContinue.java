package com.ContinueBreakEx;

public class DemoContinue {
	public static void main(String args[]) {

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.out.print("\n Rest of the loop is not executed and loop continued !!! Value is not Printed\n");
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
