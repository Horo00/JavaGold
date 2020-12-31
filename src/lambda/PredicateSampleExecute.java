package lambda;

import java.util.function.Predicate;

public class PredicateSampleExecute {
	public static void main(String[] args) {
		PredicateSample<String> p = (b) -> b.contains("b");

		Predicate<String> pre = new PredicateSample<String>() {
			public boolean test(String str) {
				return str.contains("c");
			}
		};

		System.out.println(p.test("a"));

		System.out.println(pre.test("c"));

	}
}
