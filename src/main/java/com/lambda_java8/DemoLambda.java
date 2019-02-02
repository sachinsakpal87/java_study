package com.lambda_java8;

import java.util.function.BiConsumer;

/**
 * Created by sachin on 8/30/17.
 */
public class DemoLambda {

	public static void main(String args[]) {

		Integer[] array = { 1, 2, 3, 4, 5 };
		Integer key = 1;

		//Try catch here for exception handling not a good way
		//	process(array,key,(a,k) -> System.out.println(a/k));
		process(array, key, wrapper((a, k) -> System.out.println(a / k)));
	}

	public static void process(Integer[] array, Integer key, BiConsumer<Integer, Integer> biConsumer) {
		//Try catch here for exception handling not a good way
		for (Integer integer : array) {
			biConsumer.accept(integer, key);
		}
	}

	public static <V, I> BiConsumer<V, I> wrapper(BiConsumer<V, I> biConsumer) {
		return (v, i) -> {
			try {
				System.out.println("from wrapper");
				biConsumer.accept(v, i);
			} catch (ArithmeticException ae) {
				System.out.println("Arithmatic exception");
			} catch (NullPointerException ae) {
				System.out.println("Arithmatic exception");
			}
		};
	}
}
