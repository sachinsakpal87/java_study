// //package com.interview_question.bst;
// ////Initial Template for Java
// //
// //import java.util.Scanner;
// //
// //class Node {
// //	int data;
// //	Node left, right;
// //
// //	Node(int item) {
// //		data = item;
// //		left = right = null;
// //	}
// //}
// //
// //class BinaryTree {
// //	public static void main(String[] args) {
// //		Scanner sc = new Scanner(System.in);
// //		int t = sc.nextInt();
// //
// //		while (t-- > 0) {
// //			int n = sc.nextInt();
// //			if (n == 0) {
// //				System.out.println(0);
// //				continue;
// //			}
// //			Node root = null;
// //			for (int i = 0; i < n; i++) {
// //				int a = sc.nextInt();
// //				int a1 = sc.nextInt();
// //				char lr = sc.next().charAt(0);
// //				if (i == 0) {
// //					root = new Node(a);
// //					switch (lr) {
// //						case 'L':
// //							root.left = new Node(a1);
// //							break;
// //						case 'R':
// //							root.right = new Node(a1);
// //							break;
// //					}
// //				} else {
// //					insert(root, a, a1, lr);
// //				}
// //			}
// //
// //			GfG g = new GfG();
// //			System.out.println(g.maxDiff(root));
// //		}
// //	}
// //
// //	public static void insert(Node root, int a, int a1, char lr) {
// //		if (root == null) {
// //			return;
// //		}
// //		if (root.data == a) {
// //			switch (lr) {
// //				case 'L':
// //					root.left = new Node(a1);
// //					break;
// //				case 'R':
// //					root.right = new Node(a1);
// //					break;
// //			}
// //			return;
// //		}
// //		insert(root.left, a, a1, lr);
// //		insert(root.right, a, a1, lr);
// //	}
// //}
// //
// ///*Please note that it's Function problem i.e.
// //you need to write your solution in the form of Function(s) only.
// //Driver Code to call/invoke your function is mentioned above.*/
// //
// ////Users function Template for Java
// ////Back-end complete function Template for Java
// //class GfG {
// //
// //	static int finalv = 0;
// //
// //	int maxDiff(Node root) {
// //		int max_left = 0, max_right = 0;
// //		if (root.left != null) {
// //			max_left = root.data - root.left.data;
// //		}
// //		if (root.right != null) {
// //			max_right = root.data - root.right.data;
// //		}
// //
// //		finalv = max_left > max_right ? max_left : max_right;
// //
// //		return finalv;
// //	}
// //}


// class GFG {

// // Macros for East, North, South and West

// 	// This function returns true if
// // the given path is circular,
// // else false
// 	static boolean isCircular(char path[])
// 	{
// 		// Initialize starting
// 		// point for robot as
// 		// (0, 0) and starting
// 		// direction as N North
// 		int x = 0, y = 0;
// 		int dir = 0;

// 		// Traverse the path given for robot
// 		for (int i=0; i < path.length; i++)
// 		{
// 			// Find current move
// 			char move = path[i];

// 			// If move is left or
// 			// right, then change direction
// 			if (move == 'R')
// 				dir = (dir + 1)%4;
// 			else if (move == 'L')
// 				dir = (4 + dir - 1) % 4;

// 				// If move is Go, then
// 				// change  x or y according to
// 				// current direction
// 			else // if (move == 'G')
// 			{
// 				if (dir == 0)
// 					y++;
// 				else if (dir == 1)
// 					x++;
// 				else if (dir == 2)
// 					y--;
// 				else // dir == 3
// 					x--;
// 			}
// 		}

// 		// If robot comes back to
// 		// (0, 0), then path is cyclic
// 		return (x == 0 && y == 0);
// 	}

// 	// Driver program
// 	public static void main(String[] args)
// 	{
// 		String path_ = "GGGGR";
// 		char path[] = path_.toCharArray();

// 		if (isCircular(path))
// 			System.out.println("Given sequence" +
// 					" of moves is circular");
// 		else
// 			System.out.println("Given sequence" +
// 					" of moves is NOT circular");
// 	}
// }
