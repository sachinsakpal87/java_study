package com.exception;

/**
 * Unchecked exception List
 * ArrayIndexOutOfBoundsException
 * ClassCastException
 * IllegalArgumentException
 * IllegalStateException
 * NullPointerException
 * NumberFormatException
 * AssertionError
 * ExceptionInInitializerError
 * StackOverflowError
 * NoClassDefFoundError
 *
 * Checked exception List
 * exception
 * IOException
 * FileNotFoundException
 * ParseException
 * ClassNotFoundException
 * CloneNotSupportedException
 * InstantiationException
 * InterruptedException
 * NoSuchMethodException
 * NoSuchFieldException
 */
public class CatchBlockExecution {
	/**
	 * Parent Catch block should be always declared in the end.
	 */
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds exception occurred");
		} catch (Exception e) {
			System.out.println("exception occurred");
		}

		//Below code will throw compile time exception saying exception is already being caught
        /*
        try {
            int a[]=new int[5];
            a[5]=30/0;
        } catch (exception e){
            System.out.println("exception occurred");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        }
         */
	}
}
