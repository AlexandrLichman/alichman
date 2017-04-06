package ru.job4j.condition;

/**
 * Point.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 30.03.2017
 */

public class Point {

	/**
	* Private field x.
	*/
	private int x;

	/**
	* Private field y.
	*/
	private int y;

	/**
	* Class constructor.
	* @param x initializes field x
	* @param y initializes field y
	*/
	public  Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	* method returns x.
	* @return x
	*/
	public int getX() {
		return this.x;
	}

	/**
	* method returns y.
	* @return y
	*/
	public int getY() {
		return this.y;
	}

	/**
	* method returns true or false.
	* @param a - first operand
	* @param b - second operand
	* @return true if point belongs to function and false otherwise
	*/
	public boolean is(int a, int b) {
		return y == a * x + b;
	}
}