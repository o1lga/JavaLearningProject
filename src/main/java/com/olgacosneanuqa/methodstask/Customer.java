package com.olgacosneanuqa.methodstask;

public class Customer {
 // Definește 3 proprietăți private ale clasei Customer, pentru a folosi setteri si getteri
    private String name;
    private int age;
    private String email;

// Definește un constructor care o să primească parametrii necesari pentru a popula toate proprietățile noilor obiecte
// (create cu ajutorul la constructor).
    public Customer(String name, int age, String email){
        this.name = name;
        this.email = email;

        // proprietatile pentru virsta, dupa ce facem conditia de adevar
        if (age > 100  || age <= 18){
            System.out.println("The entered age is not valid");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Customer(){

    }

// Definește metode de instanță, de tipul Setteri și Getteri
// care vor permite manipularea proprietăților din afară clasei Customer.

    public void setName(String enteredName) {
        name = enteredName;
    }

    public void setAge(int age) {
        if (age > 100  || age <= 18){
            // (age >= 18 && age <100), in acest caz invesam ordinea de executie a codului
            this.age = 0; // linia asta e de control, age din start este 0
            System.out.println("The entered age is not valid");
        } else {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return email;
    }


//Metoda de instanta publica
    public String getTheObjectInformation(){
        return "The name of the customer is [" + this.name + "] with email [" + email +
                "] and age [" + age + "]";
    }

    //@Override
    //public String toString(){
        //return "Customer{" +
               // "name=' " + name + '\'' +
                //", age= " + age +
               // ", email=' " + email + '\'' +
               // '}';
    //}
}
