package lambda;

public class Point {
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void printInfo() {
		System.out.println("("  + this.x + "," + this.y + ")");
	}
}