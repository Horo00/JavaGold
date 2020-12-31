package lambda;

import java.util.function.Predicate;

public interface PredicateSample<T> extends Predicate<T>{

//	public boolean test(T t) ;

	public default boolean test(String str) {
		return str.contains("a");
	}
}
