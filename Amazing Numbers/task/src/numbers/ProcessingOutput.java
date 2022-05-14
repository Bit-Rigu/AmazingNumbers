package numbers;

import java.math.BigInteger;

public class ProcessingOutput {
    static void printNumberProperties(BigInteger number) {
        System.out.println();
        System.out.printf("Properties of %d\n", number);
        System.out.printf("even: %b\n", ParityNumbers.CheckParity(number));
        System.out.printf("odd: %b\n", !ParityNumbers.CheckParity(number));
        System.out.printf("buzz: %b\n", BuzzNumbers.CheckBuzz(number));
        System.out.printf("duck: %b\n", DuckNumbers.CheckDuck(number));
        System.out.printf("palindromic: %b\n", PalindromicNumbers.CheckPalindrom(number));
        System.out.printf("gapful: %b\n", GapfulNumbers.checkGapfulNumbers(number));
        System.out.printf("spy: %b\n", SpyNumbers.checkSpy(number));
        System.out.printf("sunny: %b\n", SunnyNumbers.checkSunny(number));
        System.out.printf("square: %b\n", SquareNumbers.checkSquare(number));
        System.out.printf("jumping: %b\n", JumpingNumbers.checkJumping(number));
        System.out.println();
    }
    static void printNumbersProperties(BigInteger number) {

        System.out.printf("%d is ", number);
        if (ParityNumbers.CheckParity(number)) {
            System.out.printf("even");
        } else {
            System.out.printf("odd");
        }
        if (BuzzNumbers.CheckBuzz(number)) {
            System.out.printf(", buzz");
        }
        if (DuckNumbers.CheckDuck(number)) {
            System.out.printf(", duck");
        }
        if (PalindromicNumbers.CheckPalindrom(number)) {
            System.out.printf(", palindromic");
        }
        if (GapfulNumbers.checkGapfulNumbers(number)) {
            System.out.printf(", gapful");
        }
        if (SpyNumbers.checkSpy(number)) {
            System.out.printf(", spy");
        }
        if (SunnyNumbers.checkSunny(number)) {
            System.out.printf(", sunny");
        }
        if (SquareNumbers.checkSquare(number)) {
            System.out.printf(", square");
        }
        if (JumpingNumbers.checkJumping(number)) {
            System.out.printf(", jumping");
        }
        System.out.println();
    }
    static void printNumbersProperties(BigInteger[] numbers, String property) {
        BigInteger count = BigInteger.ZERO;
        while (count.compareTo(numbers[1]) < 0) {
            if(Switch.switchNames(property, numbers[0])) {
                printNumbersProperties(numbers[0]);
                count = count.add(BigInteger.ONE);
            }
            numbers[0] = numbers[0].add(BigInteger.ONE);
        }
    }
    static void printNumbersProperties(BigInteger[] numbers, String[] property) {
        BigInteger count = BigInteger.ZERO;
        while (count.compareTo(numbers[1]) < 0) {
            if(Switch.switchNames(property[0], numbers[0]) && Switch.switchNames(property[1], numbers[0])) {
                printNumbersProperties(numbers[0]);
                count = count.add(BigInteger.ONE);
            }
            numbers[0] = numbers[0].add(BigInteger.ONE);
        }
    }
}
