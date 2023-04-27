package basics.collections;

import java.math.BigInteger;

public class ImmutableObjExamples {

	public static void xAndy() {

		Integer x = Integer.valueOf(123);
		Integer y = Integer.valueOf(123);

		if (x == y) {                     // false
			System.out.println("x and y are the same object");
		}
		if (x.equals(y)) {                // true
			System.out.println("x and y have the same value");
		}
		else {
			System.out.println("WTF");
		}

	}

	// BigInteger Arithmetic
	//BigInteger is a Java class that can represent arbitrarily large integers. There is no upper bound except the limitations of memory size and processing speed.

	long x = 17;
	BigInteger big = BigInteger.valueOf(x);



	public static void main( String[] args ) {
		xAndy();
	}
}
