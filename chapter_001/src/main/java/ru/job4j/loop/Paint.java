package ru.job4j.loop;

/**
 * Paint.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 11.04.2017
 */

public class Paint {
	/**
	* Paint piramid.
	* @param h - height of the pyramid
	* @return the pyramid from the symbol
	*/
	public String piramid(int h) {
        StringBuilder piramidAll = new StringBuilder();
        char height = '^';
        String space = "\u0020";
        String enter = System.getProperty("line.separator");
        int plus = 1;

        if (h == 0) {
            piramidAll.append("height piramid is zero");
        } else {
            for (int i = 1; i <= h; i++) {
                for (int f = h - 1; f >= i; f--) {
                    piramidAll.append(space);
                }
                for (int j = 0; j < plus; j++) {
                    piramidAll.append(height);
                }
                plus += 2;
                if (i != h) {
                    piramidAll.append(enter);
                }
            }
        }
        return piramidAll.toString();
    }
}