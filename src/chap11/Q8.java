package chap11;

import java.util.concurrent.ForkJoinPool;

public class Q8 {

	public static void main(String[] args) {
		int data[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		ForkJoinPool service = new ForkJoinPool();
		service.invoke(new AddAction(data, 0, data.length));
	}
}
