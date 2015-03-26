package project.core;

public class MultiPurposeCalculator {
/**
 * This method calculates the GCD of two integers using Euclid's algorithm.
 * @param a an integer
 * @param b another integer
 * @return the GCD of a and b
 */
	public int gcd(int a, int b) {
		
		if (a % b == 0)
			return b;
		else if (b % a == 0)
			return a;
		else {
			if (a > b) {
				int c = a / b;
				return gcd(b, a - b * c);
			} else {
				int c = b / a;
				return gcd(a, b - a * c);
			}
		}
	}
}