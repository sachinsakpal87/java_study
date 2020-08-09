package com.algorithm.code;

public class Temp{

	public static void main(String... args){
//		int [] arr = {5,6,9,3,2,8,1};
		int [] arr = {7,8,1,2,3,4,5,6};
//		sort(arr, arr.length);
		sort(arr, 0, arr.length-1);
		display(arr);
	}

	private static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]=temp;
	}
	private static void sort(int [] arr, int len){
		for(int i=0; i<len; i++){
			boolean flag =  false;
			for( int j=0; j<len-1-i; j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					flag = true;
					// 	int temp = arr[a];
					// 	arr[a] = arr[b];
					// 	arr[b]=temp;
				}
			}
			if(!flag){
				break;
			}
		}
		display(arr);
	}

	private static void sort(int [] arr, int start, int end ){
		int pivot = 0;
		if(start >= end)
			return;
		pivot = partitioned(arr, start, end);
		sort(arr,start,pivot-1);
		sort(arr,pivot+1,end);

	}

	private static int partitioned(int[] arr, int start, int end) {

		int index = start;
		int pivot = arr[end];
		for (int i = start; i< end; i++){
			if(arr[i]< pivot){
				swap(arr,i,index);
				index++;
			}
		}
		swap(arr,index,end);
		return index;
	}

	private static void display(int [] arr){
		for(int num : arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
