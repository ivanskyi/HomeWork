package com.ivanskyi;

public class Calculator {
    public static void main(String[] args) {
        MachineForProcessNumbers machineForProcessNumbers = new MachineForProcessNumbers();
        byte myByte = 23;
        short myShort = 100;
        long myLong = 1000;
        double myDouble = 3.14;
        float myFloat = 4.8f;

        Object[] data = new Object[5];
        data[0] = myByte;
        data[1] = myShort;
        data[2] = myLong;
        data[3] = myDouble;
        data[4] = myFloat;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                machineForProcessNumbers.setValues(data[i], data[j]);
                machineForProcessNumbers.getAllOperationsResult();
            }
        }
    }
}

class MachineForProcessNumbers {
    double firstValue;
    double secondValue;
    String firstValueType;
    String secondValueType;

    public void setValues(Object firstValue, Object secondValue) {
        this.firstValue = (double) new Double(firstValue.toString());
        this.secondValue = (double) new Double(secondValue.toString());
        this.firstValueType = firstValue.getClass().getSimpleName();
        this.secondValueType = secondValue.getClass().getSimpleName();
    }

    public double getSum() {
        return firstValue + secondValue;
    }

    public double getMultiplication() {
        return firstValue * secondValue;
    }

    public double getDivision() {
        return firstValue / secondValue;
    }

    public double getSubtraction() {
        return firstValue - secondValue;
    }

    public void getAllOperationsResult() {
        System.out.println(firstValueType + " " + firstValue + " + " + secondValueType + " " + secondValue
                + " = " + this.getSum());
        System.out.println(firstValueType + " " + firstValue + " * " + secondValueType + " " + secondValue
                + " = " + this.getMultiplication());
        System.out.println(firstValueType + " " + firstValue + " / " + secondValueType + " " + secondValue
                + " = " + this.getDivision());
        System.out.println(firstValueType + " " + firstValue + " - " + secondValueType + " " + secondValue
                + " = " + this.getSubtraction());
    }
}