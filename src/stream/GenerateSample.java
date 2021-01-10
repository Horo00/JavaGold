package stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateSample {
	public static void main(String[] args) {
		List<Integer> list = Stream.generate(() -> 
		new Random().nextInt(43)+1)
			.distinct()
			.limit(6)
			.sorted()
			.collect(Collectors.toList());
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
//
//		List<String> list = new ArrayList<String>(Arrays.asList("b","a","c"));
//
//		list.stream()
//			.findFirst().ifPresent(System.out::println);
//
//		list.stream()
//			.forEach(System.out::println);

	}
}
