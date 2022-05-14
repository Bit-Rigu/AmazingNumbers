package numbers;
import java.math.BigInteger;

public class ParityNumbers {
    static boolean CheckParity(BigInteger number) {
        BigInteger rem = number.remainder(BigInteger.TEN);
        int remainder = rem.intValue();
        return  remainder == 0 ||
                remainder == 2 ||
                remainder == 4 ||
                remainder == 6 ||
                remainder == 8;
    }
}
