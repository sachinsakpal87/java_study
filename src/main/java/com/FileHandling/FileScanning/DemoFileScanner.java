package com.FileHandling.FileScanning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileScanner {

	public static void main(String args[]) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\DemoFile.txt");
			Scanner scanner = new Scanner(fr);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
