package com.ContinueBreakEx;

public class DemoBreak {
	public static void main(String args[]) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.out.print("\n Magic Happened !!! Loop breaks here\n");
				break;
			}
			System.out.print(i + " ");
		}
	}
}
