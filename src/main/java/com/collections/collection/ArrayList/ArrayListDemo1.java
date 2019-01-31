package com.collections.collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
				ArrayList arrLst = new ArrayList(Integer.MAX_VALUE/4);
		try {
			for(double d = 0.0; d< Double.MAX_VALUE; d++){
				arrLst.add(1);
//				System.out.println(arrLst.size());
			}
		}catch (Exception e){
			System.out.println(arrLst.size());
		}catch (Error e){
			System.out.println(arrLst.size());
		}
	}
}

//Op
//		2147483647
//		1.7976931348623157E308
// 		354836040

//if we provide Integer.max we get below exception
//		Exception in thread "main" java.lang.OutOfMemoryErro
