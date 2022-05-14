package numbers;

import java.math.BigInteger;

public class SunnyNumbers {
    static boolean checkSunny(BigInteger number) {
        number = number.add(BigInteger.ONE);
        double sqrt = java.lang.Math.sqrt(number.doubleValue());
        return number.intValue() == (int) sqrt * sqrt;
    }


}
