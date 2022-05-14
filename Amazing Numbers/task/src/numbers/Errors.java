package numbers;

import java.math.BigInteger;

public class Errors {
    private static String[] messageOfError = {
            "The first parameter should be a natural number or zero.",
            "The second parameter should be a natural number.",
            "The property %s is wrong.\nAvailable properties: [EVEN, ODD," +
                    " BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]\n",
            "The properties %s are wrong.\nAvailable properties: [EVEN, " +
                    "ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]\n",
            "The request contains mutually exclusive properties: [%s, %s]\nThere are no numbers with these properties.\n"
    };

    public static String getMessageOfError(int num) {
        return messageOfError[num];
    }

    static boolean isNumeric(String str) {

        try {
            BigInteger num = new BigInteger(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int validateNumbers(String[] arr) {

        if (arr[2] == null) {
            if (isNumeric(arr[0])) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (isNumeric(arr[0])) {
                if (isNumeric(arr[1])) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        }
    }

    static boolean isPositive(BigInteger number) {
        return number.compareTo(BigInteger.ZERO) >= 0;
    }

    public static int validatePositive(BigInteger[] arr) {
        if (arr[1] == null) {
            if (isPositive(arr[0])) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (isPositive(arr[0])) {
                if (isPositive(arr[1])) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        }
    }

}
