package com.olgacosneanuqa.operationsandciclicfunctions;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        int a = 5;
        //Incrementare
        int b = a++;
        System.out.println("Valoarea dupa incrementare: " + a);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Incrementare pre-fixata
        int c = ++a;
        System.out.println("Valoarea dupa incrementare pre-fixata: " + a);

        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("Afiseaza b = " + b + " a = " + a + " c = " + c);

        //Decrementare
        int d = a--;
        System.out.println("a = " + a);
        System.out.println("c = " + d);

        //Decrementare pre-fixata
        int e = --a;
        System.out.println("a = " + a);
        System.out.println("c = " + e);

    }
}
