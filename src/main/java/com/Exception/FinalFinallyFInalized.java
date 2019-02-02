package com.exception;

public class FinalFinallyFInalized {
	final int i = 200;

	public static void main(String[] args) {
		FinalFinallyFInalized f1 = new FinalFinallyFInalized();
		FinalFinallyFInalized f2 = new FinalFinallyFInalized();
		f1 = null;
		f2 = null;
		System.gc();

		try {
			System.out.println("final is constant " + new FinalFinallyFInalized().i);
		} finally {
			System.out.println("Finally Executed");
		}
	}

	@Override
	public void finalize(){
		System.out.println("finalize called");
	}
}
