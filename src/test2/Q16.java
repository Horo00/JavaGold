package test2;

import java.util.function.Function;

public class Q16 {
	public static void main(String[] args) {
		Foo foo =func -> x -> "#" + func.apply(x.length());
				

		
		Function<String, String> function = foo.doIt((Integer x) -> x + "$");
		
		System.out.println(function.apply("abc"));
	}
}
