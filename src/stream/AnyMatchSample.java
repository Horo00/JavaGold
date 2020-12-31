package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchSample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob","Jhon","AHO");
		
		Predicate<String> p = (s)->{
			System.out.println("testing...");
			return s.contains("Bob");
		};
		
		boolean b = list.stream()
					.allMatch(p);
			
	}
}
