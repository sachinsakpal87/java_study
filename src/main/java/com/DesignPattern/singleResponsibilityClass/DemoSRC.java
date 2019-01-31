package com.DesignPattern.singleResponsibilityClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal {
	static int counter = 0;
	List<String> entries = new ArrayList<>();

	public void addEntry(String entry) {
		entries.add("" + (++counter) + " : " + entry);
	}

	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
}

class persist {

	public void save(Journal j, String fileName) throws FileNotFoundException {
		if (new File(fileName).exists()) {
			try (PrintStream ps = new PrintStream(fileName)) {
				ps.println(j.toString());
			}
		}
	}
}

public class DemoSRC {
	public static void main(String[] args) throws Exception {
		Journal j = new Journal();
		j.addEntry("I am in the bus");
		j.addEntry("writing the code");
		System.out.println(j.toString());

		persist p = new persist();
		p.save(j, "SRC");
	}
}
