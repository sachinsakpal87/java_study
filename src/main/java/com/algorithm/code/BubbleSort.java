package com.algorithm.code;

import com.reference.classes.DisplayArray;
import com.reference.classes.SwapTwoNumbers;

class
BubbleSort {

	//Object to display array

	public static void main(String... args) {
		//Object of Binary Search

		//Object of Bubble Sort
		BubbleSort bubble_sort = new BubbleSort();
		//Object of Linear Search
		int arr[] = { 5, 2, 4, 3, 6, 9, 8, 11, 20, 33, 1 };
		int best[] = { 1, 2, 3, 4, 5, 6, 7 };
//		int worst[] = { 7, 6, 5, 4, 3, 2, 1};
		int worst[] = { 7, 6, 1, 2, 3, 4, 5};
		bubble_sort.Sort(arr, arr.length);
		bubble_sort.Display(arr);

		bubble_sort.Sort(best, best.length);
		bubble_sort.Display(best);

		bubble_sort.Sort(worst, worst.length);
		bubble_sort.Display(worst);
	}

    public void Sort(int arr[], int length) {

        //Outer for loop start from i=0 to length of array -1
        for (int i = 0; i < length; i++) {
            //Inner for loop start from j=0 to length of array -1 -i
            //Inner loop is dynamic in order to improve performance
            //Bubble sort has worst-case and average complexity both О(n2)
			boolean flag = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SwapTwoNumbers.swap(arr, j, j + 1);
                    flag =true;
                }
            }
            if(!flag){
            	break;
			}

        }
    }

	public void Display(int arr[]) {
		DisplayArray.Dispaly(arr);
	}

//	public void Sort(int arr[], int length) {
//
//		//Outer for loop start from i=0 to length of array -1
//		for (int i = length - 1; i >= ((length - 1) - 3); i--) {
//			//Inner for loop start from j=0 to length of array -1 -i
//			//Inner loop is dynamic in order to improve performance
//			//Bubble sort has worst-case and average complexity both О(n2)
//			for (int j = length - 1; j > (length - 1 - i); j--) {
//				if (arr[j] > arr[j - 1]) {
//					SwapTwoNumbers.swap(arr, j, j - 1);
//				}
//			}
//			System.out.println();
//		}
//	}
}




/**

 Worst case :- 12,8,7,5,2

 comparision	|	swap
 1				|	3			12->8
 1				|	3			12->7
 1				|	3			12->5
 1				|	3			12->2
 = 16

 comparision	|	swap
 1				|	3			8->7
 1				|	3			8->5
 1				|	3			8->2
 =12

 comparision	|	swap
 1				|	3			7->5
 1				|	3			7->2
 =8

 comparision	|	swap
 1				|	3			5->2
=4

 = (16+12+8+4)
 = 4(4+3+2+1)
 = (n-1)((n-1)+(n-2)+(n-3)...+3+2+1)
 = c*(n-1)(n-1)
 = cn^2 -2cn+1
 =O(n^2)



 Best case :- 1,2,3,4,5

 comparision	|	swap
 1				|	0			1->2
 1				|	0			2->3
 1				|	0			3->4
 1				|	0			4->5
 = 4

 (n-1)
 O(n)

 */
