package ru.job4j.array;

/**
 * test task.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 07.05.2017
 */

public class TestTask {

	/**
	* Converts a string to char.
	* @param sub - string sub converts a string to char
	* @param origin - string origin converts a string to char
	* @return boolean false or true
	*/

	public boolean contains(String origin, String sub) {

		boolean returnResult = false;
		char[] textOrigin = origin.toCharArray();
		char[] textSub = sub.toCharArray();
		int arrayLengthOrigin = textOrigin.length;
		int arrayLengthSub = textSub.length;

		for (int indexArrayOrigin = 0; indexArrayOrigin < arrayLengthOrigin; indexArrayOrigin++) {
			if (textSub[0] == textOrigin[indexArrayOrigin]) {
				int copyIndexArrayOrigin = indexArrayOrigin;
				if (indexArrayOrigin + arrayLengthSub - 1 <= arrayLengthOrigin - 1) {
					returnResult = true;
					for (int indexArraySub = 0; indexArraySub < arrayLengthSub; indexArraySub++) {
						if (textSub[indexArraySub] == textOrigin[copyIndexArrayOrigin] && returnResult) {
							returnResult = true;
						} else {
							returnResult = false;
						}
						copyIndexArrayOrigin++;
					}
					if (returnResult) {
						return returnResult;
					}
				} else {
					return returnResult;
				}
			}
		}
		return returnResult;
	}
}