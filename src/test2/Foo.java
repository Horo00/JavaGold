package test2;

import java.util.function.Function;

@FunctionalInterface
public interface Foo{
	public Function<String, String> doIt(Function<Integer, String> func);
}
