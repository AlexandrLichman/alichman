package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 25.02.2017
 */

public class CalculatorTest {

/**
*Test add.
*/

	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}

/**
*Test substruct.
*/

	@Test
	public void whenAddTwoSubstructOneThenOne() {
		Calculator calc = new Calculator();
		calc.substruct(2D, 1D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

/**
*Test div.
*/
	@Test
	public void whenAddNineDivideThreeThenThree() {
		Calculator calc = new Calculator();
		calc.div(9D, 3D);
		double result = calc.getResult();
		double expected = 3D;
		assertThat(result, is(expected));
	}

/**
*Test multiple.
*/

	@Test
	public void whenAddTwoMultipleTwoThenFour() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResult();
		double expected = 4D;
		assertThat(result, is(expected));
	}
}