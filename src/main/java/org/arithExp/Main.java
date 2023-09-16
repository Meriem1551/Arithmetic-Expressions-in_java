package org.arithExp;

public class Main {
    public static void main(String[] args) {
        //ArithmeticException: +, -, *, /, %:

        int result1 = 10 / 3; // the result is 3
        double result2 = (double)10 / (double)3;//the result is 3.333333..5;
        int x = 1;
        int y = x++; // assign y to the origin al value of x and then increase x
        // y = 1 & x = 2;
        int z = ++x; // increase x and then assign it to z
        // z = 2 & x = 2
        x = x + 2;
        //same as:
        x += 2;// same for * - / %

        /*
          ORDER OF OPERATIONS:
              ()
             * /
             + -
         */

    }
}