package com.olgacosneanuqa.accessmodifiers;

import com.olgacosneanuqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {

        Person ion001 = new Person("Ion", "Busuioc", 546245);
        System.out.println(ion001.firstname);
        System.out.println(ion001.getAge());
        System.out.println(ion001.isRetired); // valoarea predefinita pentru isRetired este false

        Person olgagrozavu = new Person("Olga", "Grozavu", 5646546, 18, false);
        System.out.println(olgagrozavu.firstname);
        System.out.println(olgagrozavu.getAge());

        Person person = new Person("Valoare", "Valoare", 5456465, 524, true);
        // din cauza ca age are setate valori min si max, dupa verificare se afiseaza mesajul de eroare
        System.out.println(person.getAge());
        // se afiseaza 0 din cauza ca valoarea atribuita pentru age nu este valida, si age ramine empty

        Person person1 = new Person("Person1", "person1", 256448658, -20, true);
        System.out.println(person1.getAge());

        Person cristina001 = new Person("Cristina", "Sterebet", 548794649);
        System.out.println(cristina001.firstname);
        System.out.println("ID=" + cristina001.ID);

                     // Proprietatea is.Retired este de tipul boolean si serveste drept conditie pentru instructiunea IF
        //   if (ion001.isRetired) {
                    // codul executat conditie adevarata
        //       System.out.println("este pensionat");
        //   } else {
                    // codul executat conditie falsa
        //       System.out.println("nu este pensionat");
        //   }
        ion001.printRetirementStatus();

        olgagrozavu.printRetirementStatus();

        person.printRetirementStatus();

        person1.printRetirementStatus();

        cristina001.printRetirementStatus();

        Person.isHuman = false;
    }
}
