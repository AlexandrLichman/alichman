package ru.job4j.array;

import java.util.Arrays;

/**
 * rotate array.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 04.05.2017
 */

public class ArrayDuplicate {

	/**
	* remove string array.
	* @param array - string array
	* @return delete duplicate string array
	*/

	public String[] remove(String[] array) {
		int arrayLength = array.length;
		String boof;
		for (int i = 0; i < arrayLength; i++) {
			for (int f = i; f < arrayLength; f++) {
				if (array[i].equals(array[f]) && i != f) {
					while ((array[f].equals(array[arrayLength - 1]) & f != arrayLength - 1)) {
						arrayLength -= 1;
					}
					boof = array[f];
					array[f] = array[arrayLength - 1];
					array[arrayLength - 1] = boof;
					arrayLength -= 1;
				}
			}
		}
		return Arrays.copyOf(array, arrayLength);
	}
}