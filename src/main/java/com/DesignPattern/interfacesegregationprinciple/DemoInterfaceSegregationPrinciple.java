package com.designpattern.interfacesegregationprinciple;

class Document{

}
//interface IPrinter{
//	void print();
//	void scan();
//	void fax();
//}
//
//class Machine implements IPrinter{
//	public void print() {
//		//
//	}
//
//	public void scan() {
//		//
//	}
//
//	public void fax() {
//		//
//	}
//}
//
//class OldPrinter implements IPrinter{
//	public void print() {
//		// Only implement printer and no other functionality
//	}
//
//	public void scan() {
//		//no implementation or exception
//	}
//
//	public void fax() {
//		// If checked exception is provided then we ahve to modify interface as well
//		// Hence use unchecked exception but this is also not a good practice.
//		//Correct way is to segregate the interface methods.
////		throw new exception()
//	}
//}

interface IPrinter{
	void print(Document document);
}

interface IScan{
	void scan(Document document);
}

interface IFax{
	void fax(Document document);
}

class NewMachine implements IPrinter, IFax {

	IPrinter printer;
	IFax fax;

	public NewMachine(IPrinter printer, IFax fax) {
		this.printer = printer;
		this.fax = fax;
	}

	public void print(Document document) {
	printer.print(document);
	}

	public void fax(Document document) {
		fax.fax(document);
	}
}

public class DemoInterfaceSegregationPrinciple {
}
