package com.olgacosneanuqa.zooclubservice;

public class Dog extends AbstractAnimal {

    //Definim un constructor pentru a crea obiecte de tipul Dog cu parametri formali de tip String name si int age
    public Dog(String name, int age){

        //Cuvintul cheie super este folosit pentru apelul constructorului clasei parinte, care primeste aceste proprietati
        super(name, age);
    }

    //eat() este o metoda declarata in clasa abstracta Animal respectiv trebuie implementata(rescrisa)
    @Override
    public void eat() {
        System.out.println(getName() + " is eating bones with meat");
        System.out.println("Bones with Meat - neam neam");
    }

    //makeSound() este o metoda declarata in interfata respectiv trebuie implementata
    @Override
    public void makeSound() {
        System.out.println("The dog named " + getName() + " says: Ham-ham!");
    }
}
