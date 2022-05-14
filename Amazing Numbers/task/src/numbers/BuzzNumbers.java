package numbers;

import java.math.BigInteger;

public class BuzzNumbers {


    private static final int[] multiplicationTable = {-7, 0, 7, 14, 21, 28, 35, 42, 49};


    private static BigInteger iter(BigInteger number) {
        BigInteger remainder = number.remainder(BigInteger.TEN);
        BigInteger notRemainder = number.divide(BigInteger.TEN);
        BigInteger newNumber = notRemainder.subtract(remainder.multiply(BigInteger.valueOf(2)));
        if (newNumber.compareTo(BigInteger.valueOf(50)) > 0) {
            return iter(newNumber);
        } else {
            return newNumber;
        }
    }

    private static boolean isNumberDividend(BigInteger number) {
        if (number.compareTo(BigInteger.valueOf(50)) > 0) {
            number = iter(number);
        }
        boolean flag = false;
        int num = number.intValue();
            for (int temp : multiplicationTable) {
                if (num == temp) {
                    flag = true;
                    break;
                }
            }
            return flag;
    }

    private static boolean isNumberEndSeven(BigInteger number) {
        BigInteger end = number.remainder(BigInteger.TEN);
        return end.equals(BigInteger.valueOf(7));
    }


    public static boolean CheckBuzz(BigInteger number) {

        boolean flag_1 = isNumberEndSeven(number);
        boolean flag_2 = isNumberDividend(number);
        return flag_1 || flag_2;

    }

}
