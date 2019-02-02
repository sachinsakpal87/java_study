package com.intanceOfEx;

interface Printable {

}

class Xerox implements Printable {
	public void Print() {
		System.out.println("Xerox Printing");
	}
}

class Scan implements Printable {
	public void Print() {
		System.out.println("Scanner Printing");
	}
}

class CallPrint {
	void ClickPrint(Printable printable) {
		if (printable instanceof Xerox) {
			Xerox xerox = (Xerox) printable;
			xerox.Print();
		}
		if (printable instanceof Scan) {
			Scan scan = (Scan) printable;
			scan.Print();
		}
	}
}

public class DemoInstanceOf {
	public static void main(String[] args) {
		Scan scan = new Scan();
		Xerox xerox = new Xerox();
		CallPrint callPrint = new CallPrint();
		callPrint.ClickPrint(scan);
		callPrint.ClickPrint(xerox);
	}
}
