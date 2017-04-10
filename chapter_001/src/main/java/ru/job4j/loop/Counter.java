package ru.job4j.loop;

/**
 * Counter.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 8.04.2017
 */

public class Counter {
	/**
	* Sum of even numbers.
	* @param start - first number
	* @param finish - second number
	* @return sum of even numbers
	*/
	public int add(int start, int finish) {
		int finishCalc = finish;
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (finishCalc % 2 == 0) {
				result += finishCalc;
			} //end if
		finishCalc--;
		} //end for
		return result;
	} //end method
} //end class