package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerialization {
	public static void main(String[] args) {
		Rectangle rect = (Rectangle) DeSerializeObject("RectObject");
		System.out.println(rect.area());
	}

	private static Object DeSerializeObject(String rectObject) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(rectObject)))) {
			try {
				return ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
