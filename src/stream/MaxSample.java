package stream;

import java.util.Arrays;
import java.util.List;

public class MaxSample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,6,7,2,5);
		
		Integer max = list.stream()
							.mapToInt(x -> x)
							.max()
							.getAsInt();
							
	}
}
