package ru.job4j.array;

/**
 * test task two.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 17.05.2017
 */

public class TestTaskTwo {

	/**
	* Converts a string to char.
	* @param x - array x sort
	* @param y - array y sort
	* @return array x plus y
	*/

	public int[] sort(int[] x, int[] y) {
		int arrayLengthX = x.length;
		int arrayLengthY = y.length;
		int arrayLengthxXyY = arrayLengthX + arrayLengthY;
		int[] xXyY = new int[arrayLengthxXyY];
		int indexX = 0;
		int indexY = 0;

		for (int i = 0; i < arrayLengthxXyY; i++) {
			if (indexX < arrayLengthX && x[indexX] < y[indexY]) {
				xXyY[i] = x[indexX];
				indexX++;
			} else {
				xXyY[i] = y[indexY];
				indexY++;
			}
		}
		return xXyY;
	}
}