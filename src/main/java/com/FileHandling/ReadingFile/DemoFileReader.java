/**
 * In BufferedRreader reading is character based / Faster
 * In BufferedInputStream reading is byte based
 */
package com.FileHandling.ReadingFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	private static final String FILE_PATH = "C:\\DemoFile.txt";

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br;
		String line = "";
		//CharBuffer target = CharBuffer.allocate(10000) ;
		try {
//            fr = new FileReader(FILE_PATH);

//			target.allocate(10000);
//			fr.read(target);
//			target.flip();
//			
//			System.out.println(target.toString());
//			
//			

//				int i = 0;
//				while((i = fr.read())!= -1){
//				System.out.print((char)i);
//				}
			br = new BufferedReader(new FileReader(FILE_PATH));
			line = br.readLine();
			String finalstr = "";
			while (line != null) {
				finalstr += line;
				line = br.readLine();
			}
			System.out.println(finalstr);
			br.close();
//            fr.close();
			//System.out.println("File writing completed successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
