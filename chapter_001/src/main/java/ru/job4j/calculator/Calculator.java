package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 25.02.2017
 */

public class Calculator {

/**
* The result of calculation.
*/

	private double result;

/**
* Summation of numbers, write in field result.
*@param first the first number.
*@param second the second number
*/

	public void add(double first, double second) {
		this.result = first + second;
	}

/**
* Subtraction  of numbers, write in field result.
*@param first the first number.
*@param second the second number
*/

	public void substruct(double first, double second) {
		this.result = first - second;
	}

/**
* Division of numbers, write in field result.
*@param first the first number.
*@param second the second number.
*/

	public void div(double first, double second) {
		this.result = first / second;
	}

/**
* Multiplication of numbers, write in field result.
*@param first the first number.
*@param second the second number
*/

	public void multiple(double first, double second) {
		this.result = first * second;
	}

/**
* Get field result.
*@return field result
*/

	public double getResult() {
		return this.result;
	}
}
