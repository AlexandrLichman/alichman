package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TestTaskTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 17.05.2017
 */

public class TestTaskTwoTest {

	/**
	* Test return int x plus y.
	*/

	@Test
	public void arrayXplusArrayYSort() {
		TestTaskTwo task = new TestTaskTwo();
		int[] x = {0, 4, 8, 10, 15};
		int[] y = {0, 10, 15, 15, 22};
		int[] resultArrayXplusY = task.sort(x, y);
		int[] xPlusY = {0, 0, 4, 8, 10, 10, 15, 15, 15, 22};
		assertThat(resultArrayXplusY, is(xPlusY));
	}
}