package ru.job4j.condition;

import org.junit.Test;
//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TriangleTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 30.03.2017
 */
public class TriangleTest {

/**
* Test Triangle Test.
*/

	@Test
	public void whenAreaThenOne() {
		Point aPoint = new Point(2, 2);
		Point bPoint = new Point(1, 1);
		Point cPoint = new Point(3, 1);
		Triangle triangle = new Triangle(aPoint, bPoint, cPoint);
		double result = triangle.area();
		double expected = 1D;
		assertThat(result, closeTo(expected, 0.01));
	}
}








