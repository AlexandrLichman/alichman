package ru.job4j.loop;

/**
 * Factorial.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 11.04.2017
 */

public class Factorial {
	/**
	* Factorial.
	* @param n - n calc factorial
	* @return factorial of n
	*/
	public int calc(int n) {
		int result = 1;
		if (n == 0) {
			result = 1;
		}
		for (int i = 1; i <= n; i++) {
			result *= i;
		} //end for
		return result;
	} //end method
} //end class