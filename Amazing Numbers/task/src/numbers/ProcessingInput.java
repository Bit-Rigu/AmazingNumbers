package numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessingInput {




    static InputData input() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        BigInteger[] arrOfNumbers = new BigInteger[2];
        ArrayList<String> properties = new ArrayList<>();
        int codeOfError = -1;
        int numOfParam = 0;
        if (str.length() == 0) {
            return new InputData(arrOfNumbers, properties, codeOfError, numOfParam);
        } else {
            String[] arr = str.split(" ");
            if (arr.length == 1) {
                numOfParam = 1;
                String[] num = {arr[0], null};
                codeOfError = Errors.validateNumbers(num);
                if (codeOfError == -1) {
                    arrOfNumbers[0] = new BigInteger(num[0]);
                    codeOfError = Errors.validatePositive(arrOfNumbers);
                    return new InputData(arrOfNumbers, properties, codeOfError, numOfParam);
                }
                return new InputData(arrOfNumbers, properties, codeOfError, numOfParam);
            } else if (arr.length == 2) {
                numOfParam = 2;
                String[] num = {arr[0], arr[1]};
                codeOfError = Errors.validateNumbers(num);
                if (codeOfError == -1) {
                    arrOfNumbers[0] = new BigInteger(num[0]);
                    arrOfNumbers[1] = new BigInteger(num[1]);
                    codeOfError = Errors.validatePositive(arrOfNumbers);
                    return new InputData(arrOfNumbers, properties, codeOfError, numOfParam);
                }
                return new InputData(arrOfNumbers, properties, codeOfError, numOfParam);
            } else if (arr.length >= 3) {
                numOfParam = 3;
                if (!isNumeric(arr[0])) {
                    codeOfError = 0;
                } else {
                    if (!isNumeric(arr[1])) {
                        codeOfError = 1;
                    } else {
                        arrOfNumbers[0] = new BigInteger(arr[0]);
                        arrOfNumbers[1] = new BigInteger(arr[1]);
                        boolean flag = false;
                        for (int i = 0; i < NamesOfNumbers.names.length; i++) {
                            flag = arr[2].equalsIgnoreCase(NamesOfNumbers.names[i]);
                            if (flag) {
                                break;
                            }
                        }
                        if (!flag) {
                            codeOfError = 2;
                        }
                        property[0] = arr[2].toLowerCase();
                    }
                }
                return new InputData(arrOfNumbers, property, codeOfError, numOfParam);
            } else if (arr.length == 4) {
                numOfParam = 4;
                if (!isNumeric(arr[0])) {
                    codeOfError = 0;
                } else {
                    if (!isNumeric(arr[1])) {
                        codeOfError = 1;
                    } else {
                        arrOfNumbers[0] = new BigInteger(arr[0]);
                        arrOfNumbers[1] = new BigInteger(arr[1]);
                        boolean flag1 = false;
                        for (int i = 0; i < NamesOfNumbers.names.length; i++) {
                            flag1 = arr[2].equalsIgnoreCase(NamesOfNumbers.names[i]);
                            if (flag1) {
                                break;
                            }
                        }
                        boolean flag2 = false;
                        for (int i = 0; i < NamesOfNumbers.names.length; i++) {
                            flag2 = arr[3].equalsIgnoreCase(NamesOfNumbers.names[i]);
                            if (flag2) {
                                break;
                            }
                        }
                        if (!flag1 && flag2) {
                            codeOfError = 2;
                            property[0] = arr[2].toLowerCase();
                        } else if(flag1 && !flag2) {
                            codeOfError = 2;
                            property[0] = arr[3].toLowerCase();
                        } else if (!flag1 && !flag2) {
                            codeOfError = 3;
                            property[0] = arr[2].toLowerCase();
                            property[1] = arr[3].toLowerCase();
                        } else {
                            property[0] = arr[2].toLowerCase();
                            property[1] = arr[3].toLowerCase();
                            if (property[0].equals("odd") && property[1].equals("even")
                                ||  property[0].equals("even") && property[1].equals("odd")
                                ||  property[0].equals("duck") && property[1].equals("spy")
                                ||  property[0].equals("spy") && property[1].equals("duck")
                                ||  property[0].equals("sunny") && property[1].equals("square")
                                ||  property[0].equals("square") && property[1].equals("sunny")) {
                                    codeOfError = 4;
                                }
                            }
                        }
                    }
                    return new InputData(arrOfNumbers, property, codeOfError, numOfParam);
                }
            }
        return null;
    }
}



