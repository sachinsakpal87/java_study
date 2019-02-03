package com.memory_java;
class MemoryAllocate{
	static int count;
	String var;

	public MemoryAllocate(String var) {
		this.var = var;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	protected void finalize() throws Throwable {
		System.out.println("finalized called"+(++count));
	}
}

public class DemoFinalizeEx1 {
	public static void main(String[] args) throws InterruptedException {
//		System.gc();
//		Thread.sleep(Long.valueOf(1000));
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.freeMemory()/1024);

		for (int i=0; i< 100; i++){
			MemoryAllocate ob = new MemoryAllocate("memory");
			ob=null;
		}
		System.out.println(runtime.freeMemory()/1024);
//		Thread.sleep(Long.valueOf(10000));
		System.gc();
		System.out.println(runtime.freeMemory()/1024);

	}
}
