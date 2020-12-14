package chap11;

public class Employee {

	private String name;
	private String dept;
	private String city;
	public Employee(String name, String dept, String city) {
		this.name = name;
		this.dept = dept;
		this.city = city;
	}

	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return name + ":" + dept + ":" + city;
	}
}
