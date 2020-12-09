package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("January","February","March","April","May","June","July",
				"August","September","October","November","December");

		Stream<String> stream = list.stream().
			filter(s -> s.length() <= 6).
			sorted().
			map(s -> "[" + s +"]").
			peek(e -> System.out.println(e + "peek")).
			peek(e -> System.out.println(e + "peek2"));
//			collect(Collectors.toList());
//			forEach(s -> System.out.println(s));
//
		stream.count();
//		list = stream.collect(Collectors.toList());
//
//		list.forEach(s -> System.out.println(s));
//		stream.forEach(System.out::println);
//		stream.forEach(System.out::print);
//		list.forEach(System.out::println);

//		IntStream.rangeClosed(1, 9).forEach(System.out::print);
//
//		IntStream stream2 = IntStream.of(1,2,3,4,5);
//		stream2.forEach(System.out::print);
	}

}
