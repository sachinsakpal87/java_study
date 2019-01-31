package com.Exception;

/**
 * Unchecked Exception List
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
 * Checked Exception List
 * Exception
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
			System.out.println("Arithmetic Exception occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception occurred");
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}

		//Below code will throw compile time exception saying exception is already being caught
        /*
        try {
            int a[]=new int[5];
            a[5]=30/0;
        } catch (Exception e){
            System.out.println("Exception occurred");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
         */
	}
}
