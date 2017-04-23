package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PaintTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 11.04.2017
 */


public class PaintTest {

	/**
	* Test Paint piramid h = 2.
	*/

	@Test
	public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
		Paint paint = new Paint();
		String result = paint.piramid(2);
		String expected = String.format(" ^%s^^^", System.getProperty("line.separator"));
		assertThat(result, is(expected));
	}

	/**
	* Test Paint piramid h = 3.
	*/

	@Test
	public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		Paint paint = new Paint();
		String result = paint.piramid(3);
		String expected = String.format("  ^%s ^^^%s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
		assertThat(result, is(expected));
    }
}