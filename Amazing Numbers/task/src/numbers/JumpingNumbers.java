package numbers;

import java.math.BigInteger;

public class JumpingNumbers {

    static boolean checkJumping(BigInteger number) {
        char[] arr = number.toString().toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = Math.abs(arr[i] - arr[i + 1]) != 1;
            if (flag) {
                break;
            }
        }
        return !flag;
    }

}
