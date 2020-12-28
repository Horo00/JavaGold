package test2;

import java.util.Optional;
import java.util.stream.Stream;

public class Q39 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("A","B","C");
		Optional<String> string = stream.parallel()
				.reduce( (a,b)->a+"-"+b);
		System.out.println(string.get());
	}
}
