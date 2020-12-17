package chap2;

public class Product{

	private int id;
	private String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
public Product() {
	// TODO 自動生成されたコンストラクター・スタブ
}

public int getId() {
	return id;
}
	@Override
	public String toString() {
		return "Product [id=" + id + ": name=" + name + "]";
	}
//
//	@Override
//	public int compare(Product o1, Product o2) {
//		// TODO 自動生成されたメソッド・スタブ
//		return o1.id - o2.id;
//	}
}
