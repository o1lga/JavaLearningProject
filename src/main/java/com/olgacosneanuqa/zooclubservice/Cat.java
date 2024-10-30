package com.olgacosneanuqa.zooclubservice;

public class Cat extends AbstractAnimal {

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fish food - neam neam");

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow");

    }
}
