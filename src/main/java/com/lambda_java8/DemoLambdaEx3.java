package com.lambda_java8;

interface ICalculate{
	Integer calc(Integer x, Integer y);
}
public class DemoLambdaEx3 {
	public static void main(String[] args) {
		ICalculate calculateMul = (x,y)->x*y;
		ICalculate calculateAdd = (x,y)->x+y;
		ICalculate calculateSub = (x,y)->x-y;

		System.out.println(calculateAdd.calc(10,20));
		System.out.println(calculateMul.calc(5,8));
		System.out.println(calculateSub.calc(51,1));
	}
}
