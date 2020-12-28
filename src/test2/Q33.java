package test2;

import java.util.stream.Stream;

public class Q33 {
	public static void main(String[] args) {
		Stream<String> words = Stream.of("one","two","three");
		int len = words.map(String::length)
				.reduce(0, (x,y) -> x + y);
		System.out.println(len);
	}
}
