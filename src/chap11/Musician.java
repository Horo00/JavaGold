package chap11;

public class Musician {

	public enum Category{
		ROCK,JAZZ,CLASSICAL
	}

	private String name;
	private Category category;
	public Musician(String name, Category category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}
}
