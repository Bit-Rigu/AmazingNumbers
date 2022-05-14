package numbers;
import java.math.BigInteger;

import static numbers.ProcessingOutput.printNumbersProperties;

public class Main {


    public static void main(String[] args) {

        BigInteger number = BigInteger.valueOf(-1);
        BigInteger[] numbers;
        System.out.println("Welcome to Amazing Numbers!");
        Instructions.print();

        while (!number.equals(BigInteger.ZERO)) {
            System.out.println("Enter a request:");
            InputData data = ProcessingInput.input();
            if (data.getCodeOfError() == 0) {
                System.out.println(Errors.getMessageOfError(0));
            } else if (data.getCodeOfError() == 1) {
                System.out.println(Errors.getMessageOfError(1));
            } else if (data.getCodeOfError() == 2) {
                System.out.printf(Errors.getMessageOfError(2), data.getProperty(0));
            } else if (data.getCodeOfError() == 3) {
                System.out.printf(Errors.getMessageOfError(3), data.getProperty(0).toUpperCase(), data.getProperty(1).toUpperCase());
            } else if (data.getCodeOfError() == 4) {
                System.out.printf(Errors.getMessageOfError(4), data.getProperty(0).toUpperCase(), data.getProperty(1).toUpperCase());
            } else {
                numbers = data.getArr();
                if (data.getNumOfParam() == 0) {
                    Instructions.print();
                } else if (data.getNumOfParam() == 1) {
                    if (numbers[0].equals(BigInteger.ZERO)) {
                        System.out.println("Goodbye!");
                        break;
                    }
                    ProcessingOutput.printNumberProperties(numbers[0]);
                } else if (data.getNumOfParam() == 2) {
                    if (numbers[0].equals(BigInteger.ZERO)) {
                        System.out.println("Goodbye!");
                        break;
                    }
                    System.out.println();
                    for (BigInteger i = numbers[0]; i.compareTo(numbers[0].add(numbers[1])) < 0; i = i.add(BigInteger.ONE)) {
                        printNumbersProperties(i);
                    }
                    System.out.println();
                } else if (data.getNumOfParam() == 3) {
                    if (numbers[0].equals(BigInteger.ZERO)) {
                        System.out.println("Goodbye!");
                        break;
                    }
                    System.out.println();
                    printNumbersProperties(numbers, data.getProperty(0));
                    System.out.println();
                } else if (data.getNumOfParam() == 4) {
                    if (numbers[0].equals(BigInteger.ZERO)) {
                        System.out.println("Goodbye!");
                        break;
                    }
                    System.out.println();
                    printNumbersProperties(numbers, data.getProperty());
                }
            }
        }
    }
}

