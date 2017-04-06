package ru.job4j.max;

/**
 * Max.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 29.03.2017
 */

public class Max {

	/**
	* method compares two numbers and return max.
	* @param first first number
	* @param second second number
	* @return maximum
	*/

	public int max(int first, int second) {
		return first > second ? first : second;
	}

	/**
	* method compares three numbers and return max.
	* @param first first number
	* @param second second number
	* @param third third number
	* @return maximum
	*/

	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}