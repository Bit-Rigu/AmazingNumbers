package numbers;

import java.math.BigInteger;

public class DuckNumbers {
    static boolean CheckDuck(BigInteger number) {
        BigInteger rem = number;
        while (!number.equals(BigInteger.ZERO)) {
            rem = number.remainder(BigInteger.TEN);
            if (!number.divide(BigInteger.TEN).equals(BigInteger.ZERO) && rem.equals(BigInteger.ZERO)) {
                return true;
            }
            number =number.divide(BigInteger.TEN);
        }
        return false;
    }
}
