package com.DesignPattern.singleresponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal{
	List<String> entries = new ArrayList<>();
	public static int count = 0;

	public void addEntry(String entry){
		entries.add(""+(++count)+" : "+entry);
	}

	public void removeEntry(int index){
		entries.remove(index);
	}

	public String toString() {
		return String.join(System.lineSeparator(),entries);
	}
}

class SaveJournal {
	public void save(Journal j, String fileName) throws FileNotFoundException {
		if(new File(fileName).exists()) {
			try (PrintStream out = new PrintStream(fileName)) {
				out.println(j.toString());
			}
		}
	}
}

public class DemoSingleResponsibility {
	public static void main(String[] args) throws FileNotFoundException {
		Journal j = new Journal();
		j.addEntry("I code daily");
		j.addEntry("I lied");
		System.out.println(j);

		SaveJournal s = new SaveJournal();
		s.save(j,"journal");
	}
}
