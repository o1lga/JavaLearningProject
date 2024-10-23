package com.olgacosneanuqa.operationsandciclicfunctions;

public class ArithmeticOperationExample {

    public static void main(String[] args) {
        int a = 5;
        int c = 12;

        //Sum
        int sum = a + c;
        System.out.println("The sum is: " + (a + c));
        System.out.println("The sum is: " + sum);

        //Substraction
        int dif = a - c;
        System.out.println("The dif is: " + (a - c));
        System.out.println("The dif is: " + dif);

        //Division
        int div = a / c;
        System.out.println("The div is: " + div);

        double div1 = a / c; // din cauza ca a si c sunt int, rezultatul este int apoi se transforma in double
        System.out.println("The div1 is: " + div1);

        double a1 = a;
        double b1 = c;
        double div2 = (double) a / c; //castare
        System.out.println("The div2 is:" + div2);

        //Multiplication
        System.out.println("The multiplication is: " + (a1 * b1));

        //The result of remainder for division
        System.out.println("The remainder is: " + (a % c));

        // Write a program that will change the value of the variables, as an output a = 12, c = 5

    }
}
