package com.FileHandling.WritingFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	private static final String FILE_PATH = "C:\\DemoFile.txt";

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter br;

		try {
			fw = new FileWriter(new File(FILE_PATH));
			/**
			 * below call is not efficient
			 */
			fw.write("Sachin Sakpal Just Checking how it works");
			/**
			 * Efficient way always use below.
			 */
			br = new BufferedWriter(fw);
			br.write("Hello All");
			br.write("My first File Handling program");
			br.newLine();
			br.close();
			System.out.println("File writing completed successfully");
		} catch (IOException e) {
			System.out.println("Error witing in file ::" + FILE_PATH + "\n" + e.toString());
		} finally {

		}
	}
}
