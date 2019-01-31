package com.gladiator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sachin on 4/3/17.
 */
public class GladiatorEx1 {

	public static int GetJumpCount(int input1, int input2, int[] input3) {
		if (input1 >= 1 && input1 <= 1000000000 && input2 >= 1 && input2 <= 100000 && input2 < input1) {
			int len = input3.length;
			int totalNoOfJumps = 0;
			while (len > 0) {
				int height = input3[--len];
				if (height > input1) {
					int minnoOfJumps = (height - input1) / (input1 - input2);
					int distanceremaining = height - (minnoOfJumps * (input1 - input2));
					if (distanceremaining != 0) {
						totalNoOfJumps = calcNoOfJump(input1, input2, distanceremaining, totalNoOfJumps);
					}
					if ((Integer.MAX_VALUE - totalNoOfJumps) <= totalNoOfJumps) {
						return Integer.MAX_VALUE;
					}
					totalNoOfJumps += minnoOfJumps;
				} else if (height != 0) {
					totalNoOfJumps++;
				}
				if (totalNoOfJumps == Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			}
			return totalNoOfJumps;
		}
		return -1;
	}

	public static int calcNoOfJump(int x, int y, int height, int noOfJumps) {
		if (height <= x && height > 0) {
			return noOfJumps + 1;
		} else if (height <= 0) {
			return noOfJumps;
		} else {
			if ((x - y) > 0) {
				height = height - (x - y);
				return calcNoOfJump(x, y, height, noOfJumps + 1);
			} else {
				return Integer.MAX_VALUE;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1 = Integer.parseInt(in.nextLine().trim());
		int ip2 = Integer.parseInt(in.nextLine().trim());
		int ip3_size = 0;
		ip3_size = Integer.parseInt(in.nextLine().trim());
		int[] ip3 = new int[ip3_size];
		int ip3_item;
		for (int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
			ip3_item = Integer.parseInt(in.nextLine().trim());
			ip3[ip3_i] = ip3_item;
		}
		output = GetJumpCount(ip1, ip2, ip3);
		System.out.println(String.valueOf(output));
	}
}
