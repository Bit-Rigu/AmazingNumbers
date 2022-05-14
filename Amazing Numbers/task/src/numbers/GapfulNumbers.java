package numbers;

import java.math.BigInteger;

import static java.lang.String.valueOf;

public class GapfulNumbers {
    static boolean checkGapfulNumbers(BigInteger number) {
        String num = number.toString();
        if (num.length() < 3) {
            return false;
        } else {
            char first = num.charAt(0);
            char last = num.charAt(num.length() - 1);
            String divider = valueOf(first) + valueOf(last);
            BigInteger div = new BigInteger(divider);
            return BigInteger.ZERO.equals(number.remainder(div));
        }
    }
}
