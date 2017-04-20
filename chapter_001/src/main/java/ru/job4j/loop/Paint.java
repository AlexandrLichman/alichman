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
        char height = '^';          //Pyramid symbol
        String space = "\u0020";    //space
        String enter = "\n";        //enter
        int plus = 1;               //plus + 2symbol

        if (h == 0) {
            piramidAll.append("height piramid is zero");
        } else {
            for (int i = 1; i <= h; i++) {
                for (int f = h - 1; f >= i; f--) {
                    piramidAll.append(space);
                } //end for
                for (int j = 0; j < plus; j++) {
                    piramidAll.append(height);
                } //end for
                plus += 2;
                if (i != h) {
                    piramidAll.append(enter);
                } //end if
            } //end for
        } //end else
        return piramidAll.toString();
    } //end method
} //end class