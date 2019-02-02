package com.memory_java;

public class DemoMemoryDay1 {
	public static void main(String[] args) {
		DemoMemoryDay1 main = new DemoMemoryDay1();
		main.start();
	}

	public void start() {
		String last = "B";
		Container container = new Container();
		container.setIntial("C");
		another(container,last);
		System.out.print(container.getIntial());
	}

	private void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setIntial("B");
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.print(initialHolder.getIntial());
		System.out.print(newInitial);
	}
}
class Container {
	String intial = new String("A");

	public String getIntial() {
		return intial;
	}

	public void setIntial(String intial) {
		this.intial = intial;
	}
}
