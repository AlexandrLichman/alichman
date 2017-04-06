package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MaxTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 29.03.2017
 */

public class MaxTest {

/**
*Return max, first and second.
*/

	@Test
	public void whenMaxFromTwo() {
		Max max = new Max();
		int result = max.max(1, 8);
		assertThat(result, is(8));
	}

/**
*Return max, first, second and third.
*/

	@Test
	public void whenMaxFromThree() {
		Max max = new Max();
		int result = max.max(1, 8, 10);
		assertThat(result, is(10));
	}
}