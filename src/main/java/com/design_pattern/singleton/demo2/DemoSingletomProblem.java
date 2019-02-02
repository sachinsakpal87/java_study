package com.design_pattern.singleton.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BasicSingletom implements Serializable {
	public static final BasicSingletom INSTANCE = new BasicSingletom();
	int var;

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	private BasicSingletom() {
	}

	public static BasicSingletom getInstance(){
		return INSTANCE;
	}

	public String toString() {
		return "BasicSingletom{" +
				"var=" + var +
				'}';
	}

	/**
	 * Below method will resolve the Singleton instance creation issue
	 * Present in serialization.
	 * @return
	 */
	protected Object readResolve(){
		return INSTANCE;
	}
}

public class DemoSingletomProblem {
	public static void save(String filename, BasicSingletom basicSingletom) throws Exception {
		try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
			outStream.writeObject(basicSingletom);
		}
	}
	public static BasicSingletom read(String filename) throws Exception {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))){
			Object obj = ois.readObject();
			return (BasicSingletom)obj;
		}
	}

	public static void main(String[] args) throws Exception {
		BasicSingletom obj = BasicSingletom.getInstance();
		obj.setVar(12);
		BasicSingletom obj2 = BasicSingletom.getInstance();
		obj2.setVar(24);

		System.out.println(obj.toString());
		System.out.println(obj2.toString());

		save("singletonObject",obj);
		obj.setVar(100);
		BasicSingletom obj3 = read("singletonObject");
		System.out.println(obj.toString());
		System.out.println(obj3.toString());
	}

}
