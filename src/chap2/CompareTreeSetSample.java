package chap2;

import java.util.Set;
import java.util.TreeSet;

public class CompareTreeSetSample {
	public static void main(String[] args) {
		Set<Product> set = new TreeSet<Product>();

		set.add(new Product(3, "B"));
		set.add(new Product(1, "C"));
		set.add(new Product(2, "A"));
		System.out.println(set);
	}
}
