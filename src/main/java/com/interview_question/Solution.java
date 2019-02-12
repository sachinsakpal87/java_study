/**
 * Mr. Octopus has recently shut down his factory and want to sell off his metal rods to a local businessman.
 * In order to maximize profit, he should sell the metal of same size and shape. If he sells $N$ metal rods of
 * length $L$, he receives N x L x metal_price. The remaining smaller metal rods will be thrown away. To
 * cut the metal rods, he needs to pay cost_per_cut for every cut.
 * What is the maximum amount of money Mr. Octopus can make?
 * Input Format
 * First line of input contains cost_per_cut
 * Second line of input contains metal_price
 * Third line contains L, the number of rods Mr. Octopus has, followed by L integers in each line representing
 * length of each rod.
 * Output Format
 * Print the result corresponding to the testcase.
 * Constraints
 * 1 <= metal_price, cost_per_cut <= 1000
 * 1 <= L <= 50
 * Each element of lenghts will lie in range [1, 10000].
 * <p>
 * Sample I/P
 * 1
 * 10
 * 3
 * 26
 * 103
 * 59
 * <p>
 * Sample O/P 1770
 */
package com.interview_question;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	private static int calcMaxVal(int cost_per_cut, int metal_price, int[] arr) {
		Arrays.sort(arr);
		int max_profit = 0;
		int final_profit = 0;
		int lenght_arr = arr.length;
		int L = 1;
		while (L <= arr[arr.length - 1]) {
			max_profit = 0;
			int cnt = 0;
			while (cnt < lenght_arr) {
				max_profit = max_profit + (((arr[cnt] / L) * L * metal_price) - ((arr[cnt] / L) * cost_per_cut));
				cnt++;
			}
			if (final_profit < max_profit) {
				final_profit = max_profit;
				if (final_profit == 1230) {
					System.out.println(L);
				}
			}
			L++;
		}

		return final_profit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the cost per cut :: ");
		int cost_per_cut = scanner.nextInt();
		System.out.println("Enter the unit price of metal :: ");
		int metal_price = scanner.nextInt();
		System.out.println("Enter the number of Rods :: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int cnt = 0;
		while (n > 0) {
			System.out.println("Enter the lenght of " + (cnt + 1) + " rod ::");
			arr[cnt] = scanner.nextInt();
			cnt++;
			n--;
		}
		int max_val = calcMaxVal(cost_per_cut, metal_price, arr);

		System.out.println(max_val);
	}
}
