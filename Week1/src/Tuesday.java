/* In-class exercise Tuesday

Write a method called charRightShift() which takes a character and an integer n as inputs, and
returns a character. If the character received as input is a lower case letter of the English alphabet,
the method returns the letter of the alphabet which is n positions to the right on the alphabet. If
the character received as input is not a lower case letter of the English alphabet, then the method
returns the character itself with no modifications.
For example:
• charRightShift('g', 2 ) returns 'i'
• charRightShift('#', 2 ) returns '#'
• charRightShift('z', 27 ) returns 'a'
• charRightShift('a', -1 ) returns 'z' */

import static java.lang.Math.abs;

public class Tuesday {
    public static void main (String[] args){
        System.out.println(charRightShift('a', -1));
    }

    public static char charRightShift(char c, int n) {
        int pos = c - 'a';
        if ((0 <= pos) && (pos <= 25)) {
            int newPos = pos + n;
            if (newPos <= 25 && newPos >= 0) {
                return (char) (newPos + 'a');
            } else if (newPos > 25) {
               newPos = newPos % 26;
               return (char) (newPos + 'a');
            } else if (newPos < 0) {
                newPos = abs(newPos) % 26;
                newPos = 26 - newPos;
                return (char) (newPos + 'a');
            }
        }
        return c;
    }
}
