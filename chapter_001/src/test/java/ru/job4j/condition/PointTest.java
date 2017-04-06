package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PointTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 30.03.2017
 */

public class PointTest {

/**
* Test Point Test.
*/

	@Test
	public void whenPointBelongsToFunctionThenReturnTrue() {
		Point point = new Point(5, 20);
		boolean expected = true;
		boolean result = point.is(2, 10);
		assertThat(result, is(expected));
	}

}