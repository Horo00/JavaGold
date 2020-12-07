package lambda;

public class LambdaExample{
	static void printout(SimpleInterfase i) {
		System.out.println(i.doSomething(2));
	}

	public static void main(String[] args) {
		printout(n -> {
			return	n + 5;
			});
	}
}
