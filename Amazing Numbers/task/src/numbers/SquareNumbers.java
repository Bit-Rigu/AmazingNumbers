package numbers;

import java.math.BigInteger;

public class SquareNumbers {
    static boolean checkSquare(BigInteger number) {
            double sqrt = java.lang.Math.sqrt(number.doubleValue());
            return number.intValue() == (int) sqrt * sqrt;
    }
}
