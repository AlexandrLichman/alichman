package ru.job4j.array;

/**
 * BubbleSort.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 23.04.2017
 */

public class BubbleSort {
	/**
	* bubble sort int array.
	* @param array - int array
	* @return sort int array
	*/
	public int[] sort(int[] array) {
		int boof;

		for (int i = 0; i < array.length; i++) {
			for (int f = 0; f < array.length - i - 1; f++) {
				if (array[f] > array[f + 1]) {
					boof = array[f + 1];
					array[f + 1] = array[f];
					array[f] = boof;
				}
			}
		}
		return array;
	}
}