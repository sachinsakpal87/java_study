package com.static_demo;

class Aa {

	static void fun2() {
		System.out.println("Parent static function");
	}

	void fun() {

	}
}

class Bb extends Aa {

//	below is not allowed
//    static void fun(){
//
//    }

    static void fun2(){
		System.out.println("Child static function");
    }
}

public class TestClassInt {
	public static void main(String[] args) {
		Aa ojb = new Bb();
		ojb.fun2(); //This will call parent function becuase static function is called based on
					// reference not on object. this is similar as Aa.fun2();
	}
}
