package lambda;

import java.util.ArrayList;

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();

		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));

//		pointList.forEach(p -> {
//			p.x *= 2;
//			p.y *= 2;
//		});

		pointList.sort((p0,p1) -> (p0.x + p0.y) - (p1.x + p1.y));

		pointList.forEach(p -> p.printInfo());

//		for (Point point : pointList) {
//			point.x *= 2;
//			point.y *= 2;
//		}
//
//		for (Point point : pointList) {
//			point.printInfo();
//		}
	}
}
