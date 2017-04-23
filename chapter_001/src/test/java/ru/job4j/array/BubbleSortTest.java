package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BubbleSortTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 23.04.2017
 */

public class BubbleSortTest {

	/**
	* Test bubble sort array.
	*/

	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bubble = new BubbleSort();
		int[] startArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] sortArray =  {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		bubble.sort(startArray);
		assertThat(startArray, is(sortArray));
	}
}