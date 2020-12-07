package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("January","February","March","April","May","June","July",
				"August","September","October","November","December");

		list = list.stream().
			filter(s -> s.length() <= 6).
			sorted().
			map(s -> "[" + s +"]").
			collect(Collectors.toList());
//			forEach(s -> System.out.println(s));
//
//		list = stream.collect(Collectors.toList());
//
//		list.forEach(s -> System.out.println(s));
	}

}
