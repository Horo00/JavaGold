package chap2;

public class Product implements Comparable<Product>{

	private int id;
	private String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ": name=" + name + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.id - o.id;
	}
}