package numbers;

import java.math.BigInteger;

import static java.lang.String.valueOf;

public class PalindromicNumbers {
    public static boolean CheckPalindrom(BigInteger number) {
        String str = valueOf(number);
        char[] arr = str.toCharArray();
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
