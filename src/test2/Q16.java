package test2;

import java.util.function.Function;

public class Q16 {
	public static void main(String[] args) {
		Foo foo =func -> x -> "#" + func.apply(x.length());
				

		
		Function<String, String> function = foo.doIt((Integer y) -> y + "$");
		
		System.out.println(function.apply("abc"));
		
//		Foo foo = new Foo() {
//			
//			@Override
//			public Function<String, String> doIt(Function<Integer, String> func) {
//				return x -> "#" + func.apply(x.length());
//			}
//		};
//		
//		System.out.println(foo.doIt(x -> x + "$").apply("ABC"));
	}
}
