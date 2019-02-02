package com.designpattern.singleton.demo7;

class MonostateSibngleton{
	private static String name;
	private static int id;

//	public MonostateSibngleton(string_demo name, int id) {
//		MonostateSibngleton.name = name;
//		MonostateSibngleton.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		MonostateSibngleton.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		MonostateSibngleton.id = id;
	}

	@Override public String toString() {
		return "MonostateSibngleton{Name="+getName()+", Id="+getId()+"}";
	}
}

public class DemoMonostateSingleton {
	public static void main(String[] args) {
		MonostateSibngleton ob = new MonostateSibngleton();
		ob.setName("Adam");
		ob.setId(5);
		MonostateSibngleton ob2 = new MonostateSibngleton();
		System.out.println(ob2);
	}
}
