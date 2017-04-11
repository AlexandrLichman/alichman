package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FactorialTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 11.04.2017
 */

public class FactorialTest {

	/**
	* Test Factorial Test.
	*/
	 @Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial factorialOfFive = new Factorial();
		int expected = 120;
		int result = factorialOfFive.calc(5);
		assertThat(result, is(expected));
	} //end method

	/**
	* Test Factorial Test.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorialFromZero = new Factorial();
		int expected = 1;
		int result = factorialFromZero.calc(0);
		assertThat(result, is(expected));
	} //end method
} //end class
