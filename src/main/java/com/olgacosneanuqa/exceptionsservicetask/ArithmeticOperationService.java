package com.olgacosneanuqa.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideDataWithoutTryAndCatch(int a, int b){
        return a / b;
    }

    public static int divideDataWithTryAndCatch(int a, int b){
        try {
            return a / b;
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            return 0;
        }
    }
}
