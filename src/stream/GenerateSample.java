package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class GenerateSample {
	public static void main(String[] args) {
		Stream.generate(() -> new Random().nextInt(43)+1)
			.distinct()
			.limit(6)
			.sorted()
			.forEach(System.out::println);
		
		List<String> list = new ArrayList<String>(Arrays.asList("b","a","c"));
		
		list.stream()
			.findFirst().ifPresent(System.out::println);
		
		list.stream()
			.forEach(System.out::println);
		
	}
}
