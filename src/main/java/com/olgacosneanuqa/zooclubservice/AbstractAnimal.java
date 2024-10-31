package com.olgacosneanuqa.zooclubservice;

//Clasa Animal este dedicata procesului de mostenire
//Constructorul Animal nu trebuie folosit pentru initializarea obiectelor
public abstract class AbstractAnimal implements AnimalInterface{

    //Variabile de instanta vor fi accesate doar in clasa Animal deoarece sunt private
    //Pentru a putea fi folosite in alte clase, utilizam constructorul sau setteri pentru setare si getteri pentru citire
    private String name;
    private int age;

    //Constructorul cu parametri va permite setarea name si age absolut pentru toate animalele create in cadrul pachetului
    public AbstractAnimal(String name, int age){
        // Valoarea name si age colectate din apelul constructorului,
        // vor fi atribuite variabilelor de instanta cu aceleasi nume, care se definesc cu ajutorul this.
        this.name = name;
        this.age = age;

    }

    //Metoda getName este de tip public si returneaza valoarea numelui pe care il poseda animalul
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    //Metoda abstracta eat() nu are implementare, aceasta va fi facuta in clasele copil
    public abstract void eat();

}
