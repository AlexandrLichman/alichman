package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CounterTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 8.04.2017
 */

public class CounterTest {

	/**
	* Test Counter Test.
	*/

	@Test
	public void sumOfEvenNumbers() {
		Counter counterSum = new Counter();
		int expected = 30;
		int result = counterSum.add(1, 10);
		assertThat(result, is(expected));
	} //end method
} //end class