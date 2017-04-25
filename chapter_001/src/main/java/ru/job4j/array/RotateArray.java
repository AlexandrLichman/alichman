package ru.job4j.array;

/**
 * rotate array.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 25.04.2017
 */

public class RotateArray {

	/**
	* rotate int array.
	* @param array - int array
	* @return rotate int array
	*/

	public int[][] rotate(int[][] array) {
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = i; j < array.length - 1 - i; j++) {
				int boof = array[i][j];
				array[i][j] = array[array.length - j - 1][i];
				array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
				array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
				array[j][array.length - i - 1] = boof;
			}
		}
		return array;
	}
}