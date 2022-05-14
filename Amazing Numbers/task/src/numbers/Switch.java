package numbers;

import java.math.BigInteger;

public class Switch {

    static boolean switchNames(String name, BigInteger number) {
        switch (name) {

            case "buzz":        return BuzzNumbers.CheckBuzz(number);

            case "even" :       return ParityNumbers.CheckParity(number);

            case "odd":         return !ParityNumbers.CheckParity(number);

            case "duck":        return DuckNumbers.CheckDuck(number);

            case "palindromic": return PalindromicNumbers.CheckPalindrom(number);

            case "gapful":      return GapfulNumbers.checkGapfulNumbers(number);

            case "spy":         return SpyNumbers.checkSpy(number);

            case "sunny":       return SunnyNumbers.checkSunny(number);

            case "square":      return SquareNumbers.checkSquare(number);

            case "jumping":     return JumpingNumbers.checkJumping(number);

            default:            return false;

        }

    }

}
