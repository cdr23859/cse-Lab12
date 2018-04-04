package unl.cse.recursion;

import java.math.BigInteger;
import java.util.HashMap;

public class PellNumbers {
	private static final BigInteger TWO = new BigInteger("2");
	public static HashMap<Integer, BigInteger> map = new HashMap<Integer, BigInteger>();

	public static BigInteger PellNumber(Integer n) {
		if(n == 0) {
			return BigInteger.ZERO;
		} else if(n == 1) {
			return BigInteger.ONE;
		} else {
			BigInteger a = PellNumber(n-1);
			BigInteger b = PellNumber(n-2);

			// Calculates result for n
			BigInteger result = a.multiply(TWO).add(b);

			return result;
		}
	}
	
	public static void main(String args[]) {
		int n = 9;
		BigInteger p_n = PellNumber(n);
		System.out.println("p(" + n + ") = " + p_n.toString());
	}
}
