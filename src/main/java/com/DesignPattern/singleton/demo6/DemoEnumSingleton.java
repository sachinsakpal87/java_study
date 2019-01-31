package com.DesignPattern.singleton.demo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

enum EnumSingleton{
	INSTANCE;

	EnumSingleton(){
		var = 55;
	}

	int var;

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
}

public class DemoEnumSingleton {

	public static final String ENUM_SINGLETON_TXT = "enumSingleton.txt";

	public  static  void save(EnumSingleton singleton, String filename) throws Exception {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
			oos.writeObject(singleton);
		}
	}

	public static EnumSingleton readFile(String filename) throws Exception {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))){
			return  (EnumSingleton)ois.readObject();
		}
	}

	public static void main(String[] args) throws Exception {
//		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
//		enumSingleton.setVar(100);
//		save(enumSingleton, ENUM_SINGLETON_TXT);
		EnumSingleton newEnumSingleton = readFile(ENUM_SINGLETON_TXT);
		System.out.println(newEnumSingleton.getVar());
	}
}
