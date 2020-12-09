package stream;

import java.util.Set;
import java.util.TreeSet;

public class SampleMain {
	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<Employee>((e1,e2) -> e1.getId() - e2.getId());
		
		set.add(new Employee(3, "john"));
		set.add(new Employee(1, "Bill"));
		set.add(new Employee(2, "Eric"));
		System.out.println(set);
	}
}
