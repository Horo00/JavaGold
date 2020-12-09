package stream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MatchStreamSample {
	public static void main(String[] args) {
		IntPredicate p = n -> n==1;

		System.out.println(IntStream.of(1,1,1).allMatch(p));
		System.out.println(IntStream.of(2,3,4).allMatch(n -> n ==5));

		System.out.println(IntStream.of(1,2,3).allMatch(p));
		System.out.println(IntStream.of(1,2,3).anyMatch(p));
		System.out.println(IntStream.of(1,2,3).noneMatch(p));
	}

}
