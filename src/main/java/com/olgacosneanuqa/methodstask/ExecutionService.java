package com.olgacosneanuqa.methodstask;

import javax.xml.transform.Source;

public class ExecutionService {

    public static void main(String[] args){

        // Crearea obiectelor de tip: int, double,boolean, email si String folosind getteri
        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail("@gmail.com"));
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail("olga", "@gmail.com"));

        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(256));
        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(257));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));

        // Creare obiect cu ajutorul constructorului fara parametri, folosind setteri
        Customer customer001 = new Customer();
        customer001.setName("Gabriel");
        customer001.setEmail("gabrielboss@gmail,com");
        customer001.setAge(DataGeneratorUtil.getRandomInt(18, 100));
        System.out.println(customer001.getTheObjectInformation());

        // Afisare obiect customer001 folosind getteri
        System.out.println("Name obiect customer001: " + customer001.getName());
        System.out.println("Age obiect customer001: " + customer001.getAge());
        System.out.println("Email obiect customer001: " + customer001.getEmail());

        // Creare obiect cu ajutorul constructorului cu parametri
        Customer customer002 = new Customer("Vasile", DataGeneratorUtil.getRandomInt(18, 100), "vasile@gmail.com");
        System.out.println(customer002.getTheObjectInformation());

        // Crearea obiect folosind getteri generati random
        System.out.println(DataGeneratorUtil.getRandomInt(18));
        System.out.println(DataGeneratorUtil.getRandomEmail("@gmail.com"));
        System.out.println((DataGeneratorUtil.getRandomEmail("andrei+", "@gmail.com")));

        // Creare obiect cu ajutorul constructorului cu parametri generati random
        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail("@gamil.com"));
        System.out.println(randomDataCustomer.getTheObjectInformation());


        // Crearea obiect folosind setteri generati random
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 99));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail("olga", "@yahoo.com"));
        System.out.println(randomDataCustomer.getTheObjectInformation());

    }
}
