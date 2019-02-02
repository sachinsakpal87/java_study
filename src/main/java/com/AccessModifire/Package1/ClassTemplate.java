/**
 * Java provides a number of access modifiers to set access to levels
 * for classes, variables, methods and constructors.
 * The four access modifiers are : Default, Public, Private and Protected
 */
package com.accessmodifire.Package1;

/**
 * In class only public or default but public is most common
 * public visible to world
 * default visible to package
 * private can be used inside class
 * <p>
 * In below class if we remove the public keyword the class would not be
 * accessible outside this package
 */
public class ClassTemplate {

	public int public_int = 2;
	protected int protected_int = 3;
	int default_int = 1; //visible to package. the default. No modifiers are needed.
	private int private_int = 4;

	/**
	 * In below method if we remove the public keyword the method would not
	 * be accessible out side this package.
	 * but will be accessible inside the same class
	 */
	public int print() {
		return default_int + public_int + protected_int + private_int;
	}
}
