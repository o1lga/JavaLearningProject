package com.olgacosneanuqa.zooclubservice;

public class ZooService {
    public static void main(String[] args) {

        //exemplu de polimorfism, pentru a declara un obiect de tip Animal, insa creat cu cosntructorul calsei copil Cat
        AbstractAnimal cat001 = new Cat("Jesica", 5);
        Dog dog1 = new Dog("Rex", 12);
        Lion lion001 = new Lion("Simba", 25);

        //Metoda makeSound() ce apartine obiectului Cat nu putea fi apelata deoarece Cat era de timp Animal iar makeSound()
        //era declarata in interfata, pentru a fixa acest lucru trebuie ca interfata sa fie implementata de clasa abstracta Animal
        //public abstract class AbstractAnimal implements AnimalInterface
        System.out.println(lion001.getAge());
        lion001.makeSound();
        cat001.makeSound();
        dog1.makeSound();
        dog1.eat();
        System.out.println(dog1.getName() + " is " + dog1.getAge() + " years old ");

    }
}
