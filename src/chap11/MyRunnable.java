package chap11;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable implements Runnable{

	private static AtomicInteger value = new AtomicInteger(0);
//	private static int value = 0;

	@Override
	public void run() {
		System.out.println(value.incrementAndGet());
//		System.out.println(++value);
	}

}
