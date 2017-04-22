package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TurnTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 22.04.2017
 */

public class TurnTest {

	/**
	* Test Turn array.
	*/

	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        	Turn arrayTurn = new Turn();
		int[] startArray = {2, 6, 1, 4};
		int[] returnArray = {4, 1, 6, 2};
		arrayTurn.back(startArray);
		assertThat(startArray, is(returnArray));
	}

	/**
	* Test Turn array.
	*/

	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn arrayTurn = new Turn();
		int[] startArray = {1, 2, 3, 4, 5};
		int[] returnArray = {5, 4, 3, 2, 1};
		arrayTurn.back(startArray);
		assertThat(startArray, is(returnArray));
	}
}