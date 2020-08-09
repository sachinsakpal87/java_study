package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(3, 4);
		SerializeObject(rect, "RectObject");
	}

	private static void SerializeObject(Rectangle rect, String rectObject) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rectObject))) {
				oos.writeObject(rect);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
