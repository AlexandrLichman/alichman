package ru.job4j.array;

/**
 * Turn.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 22.04.2017
 */

public class Turn {
	/**
	* turn int array.
	* @param array - int array
	* @return turn int array
	*/
	public int[] back(int[] array) {
		int start;
		int finish;
		int boof = array.length;
		for (int i = 0; i < array.length / 2; i++) {
			start = array[i];
			finish = array[boof - 1];
			array[boof - 1] = start;
			array[i] = finish;
			boof--;
		}
		return array;
	}
}