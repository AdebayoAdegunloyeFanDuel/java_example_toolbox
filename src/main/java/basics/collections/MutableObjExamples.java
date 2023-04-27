package basics.collections;

import java.awt.Point;

public class MutableObjExamples {

	static Point blank = new Point(3, 4);
	static int sum = blank.x * blank.x + blank.y * blank.y;

	public static void printPoint(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

	public static void main( String[] args ) {
		System.out.println(blank.x + ", " + blank.y);
		System.out.println(sum);
	}
}
