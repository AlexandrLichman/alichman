package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TestTaskTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 07.05.2017
 */

public class TestTaskTest {

	/**
	* Test return boolean false or true.
	*/

	@Test
	public void convertsAStringToChar() {
		TestTask task = new TestTask();
		String origin = "hello world";
		String sub = "ello w";
		boolean result = task.contains(origin, sub);
		assertThat(result, is(true));
	}
}