package chap11;

import java.util.Arrays;
import java.util.stream.Stream;

public class Q64 {

	public static void main(String[] args) {
		Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
				.flatMap(list -> list.stream())
				.forEach(System.out::print);
	}
}
