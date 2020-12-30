package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapSample {
	public static void main(String[] args) {
		Stream<List<Integer>> stream = Stream.of(
				Arrays.asList(1,2),
				Arrays.asList(3,4));
		
		stream.flatMap(s -> s.stream())
			.mapToInt(s -> s)
			.forEach(System.out::print);
	}
}
