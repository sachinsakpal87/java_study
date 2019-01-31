package com.FileHandling.WritingFileOutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("C:\\DemoInputStream.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String str = "Hi, !!!! My name is Sachin \n This is my First BufferedInputStream code";
			bos.write(str.getBytes());
			bos.close();
			System.out.println("Written in the file successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
