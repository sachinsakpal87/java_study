package com.Threading.ThreadChapA13.Callable;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String args[]) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> returnval;
		returnval = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				if (duration > 2000) {
					throw new IOException("IOException occured");
				}

				System.out.println("Starting....!!!");
				try {
					Thread.sleep(random.nextInt(duration));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ending....!!!");
				return duration;
			}
		});
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);

		try {
			System.out.println("Return value is " + returnval.get());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			System.out.println("" + e.getMessage());
		}
	}
}
