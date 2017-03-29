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
	* метод сравнивает 2 числа и возвращает большое.
	* @param first first number
	* @param second second number
	* @return maximum
	*/

	public int max(int first, int second) {
		return first > second ? first : second;
	}

	/**
	* метод сравнивает 3 числа и возвращает большое.
	* @param first first number
	* @param second second number
	* @param third third number
	* @return maximum
	*/

	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}