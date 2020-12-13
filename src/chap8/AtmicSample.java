package chap8;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtmicSample {
	public static void main(String[] args) {
		AtomicBoolean flag = new AtomicBoolean();
		System.out.println(flag);
		
		System.out.println(flag.compareAndExchange(true, false));
		
		
	}

}
