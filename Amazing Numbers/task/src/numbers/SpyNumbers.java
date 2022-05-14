package numbers;

import java.math.BigInteger;

public class SpyNumbers {
    static boolean checkSpy(BigInteger number){
        String num = number.toString();
        int prod = 1;
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            prod *= Character.getNumericValue(num.charAt(i));
            sum += Character.getNumericValue(num.charAt(i));
        }
        return prod == sum;
    }

}
