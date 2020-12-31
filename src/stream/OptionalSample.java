package stream;

import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) {
//		System.out.println(OptionalInt.empty().getAsInt());
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt.isPresent()?"a":"b");
	}

}
