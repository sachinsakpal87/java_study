package com.labtest.day1.mainprg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * public can be access from any where inside of this actual java file
 * static means we are not interacting with objects
 * void as it is not returning anything
 * main is Entry function of java program
 *
 */
public class TestClass {
	//private static final String FILE_PATH = "C:\\DemoFile.txt";

	public static String fun1() {

		FileWriter fw = null;
		BufferedWriter br;

		try {
			File fr = new File("C:\\Users\\Sachin Sakpal\\abc.txt");
			fr.createNewFile();
			//File fr = new File("C:\\abc.txt");
			fw = new FileWriter(new File("C:\\Users\\Sachin Sakpal\\abc.txt"));
			/**
			 * below call is not efficient
			 */
			fw.write("Sachin Sakpal Just Checking how it works");
			/**
			 * Efficient way always use blow
			 */
			br = new BufferedWriter(fw);
			br.write("Hello All");
			br.write("My first File Handling program");
			br.newLine();
			br.close();
			System.out.println("File writing completed successfully");
		} catch (IOException e) {
			System.out.println("Error witing in file ::\n" + e.toString());
		} finally {

		}
		return "";
	}

	public static void main(String args[]) {

		System.out.println("Hello World!!!");
		fun1();
		//System.out.println(str);

	}
}
