package basics.collections;

public class RecursiveExamples {

	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countdown(n - 1);
		}
	}

	public static void forever(String s) {
		System.out.println(s);
//		forever(s);
	}

	public static void displayBinary(int value) {
		if (value > 0) {
			displayBinary(value / 2);
			System.out.print(value % 2);
		}
	}

	public static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
		}
	}


	public static void main( String[] args ) {
		System.out.println( prod( 1, 4 ) );
	}
}
