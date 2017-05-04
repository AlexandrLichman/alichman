package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicateTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 04.05.2017
 */

public class ArrayDuplicateTest {

	/**
	* Test delete duplicate array.
	*/

	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] startArray = {"Hello", "World", "Hello", "Super", "World"};
		String[] sortArray = {"Hello", "World", "Super"};
		String[] result = duplicate.remove(startArray);
		assertThat(result, is(sortArray));
	}
}