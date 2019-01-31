/**
 * In BufferedRreader reading is character based / Faster
 * In BufferedInputStream reading is byte based
 */
package com.FileHandling.ReadingFileInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileInputStream {

	public static void main(String args[]) {

		BufferedInputStream bis;
		try {
			bis = new BufferedInputStream(new FileInputStream(new File("C:\\DemoFile.txt")));
//			FileInputStream fis = new FileInputStream("C:\\DemoInputStream.txt");
//			fis.read();
			int data = bis.read();
			while (data != -1) {
				System.out.print(Character.toChars(data));
				data = bis.read();
			}
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
