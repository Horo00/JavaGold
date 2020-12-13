package chap11;

import java.util.concurrent.RecursiveAction;

public class AddAction extends RecursiveAction{

	private static final int THRESHOLD_SIZE = 3;
	private int start;
	private int end;
	private int[] numbers;
	private int forwardCount;



	public AddAction(int[] numbers, int start, int end) {
		super();
		this.start = start;
		this.end = end;
		this.numbers = numbers;
		this.forwardCount = start;
	}


	@Override
	protected void compute() {
		int total = 0;
		if(end - start <= THRESHOLD_SIZE) {
			for (int i = start; i < end; i++) {
				total += numbers[i];
			}
			System.out.println(total + "");
		}else {
			forwardCount += THRESHOLD_SIZE;
			new AddAction(numbers, forwardCount, end).fork();
			new AddAction(numbers, forwardCount - THRESHOLD_SIZE, Math.min(end, forwardCount)).compute();
		}
	}

}
