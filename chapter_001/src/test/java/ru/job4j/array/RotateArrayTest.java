package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * RotateArrayTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 23.04.2017
 */

public class RotateArrayTest {

	/**
	* Test rotate array.
	*/

	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray rotate = new RotateArray();
		int[][] startArray = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
		int[][] sortArray = {{4, 3, 2, 1}, {8, 7, 6, 5}, {12, 11, 10, 9}, {16, 15, 14, 13}};
		rotate.rotate(startArray);
		assertThat(startArray, is(sortArray));
	}
}