package numbers;

import java.math.BigInteger;
import java.util.ArrayList;


public class InputData {

    private  BigInteger[] arr;
    private ArrayList<String> properties;
    private int codeOfError;
    private int numOfParam;



    InputData(BigInteger[] arr, ArrayList<String> properties, int codeOfError, int numOfParam) {
        this.arr = arr;
        this.properties = properties;
        this.codeOfError = codeOfError;
        this.numOfParam = numOfParam;

    }

    public BigInteger[] getArr() {
        return arr;
    }

    public String getProperty(int i) {

        return properties.get(i);

    }
    public ArrayList<String> getProperty() {

        return this.properties;

    }

    public void setArr(BigInteger[] arr) {
        this.arr = arr;
    }


    public void setCodeOfError(int codeOfError) {
        this.codeOfError = codeOfError;
    }

    public int getCodeOfError() {
        return codeOfError;
    }

    public void setNumOfParam(int numOfParam) {
        this.numOfParam = numOfParam;
    }

    public int getNumOfParam() {
        return numOfParam;
    }
}
