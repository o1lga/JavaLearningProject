package com.olgacosneanuqa.accessmodifiers.peopleevidence;

public class Person {
    /* O proprietate STATIC indica o variabila care apartine clasei, nu unei instante a acelei clase
    Person.isHuman = false; nu e posibil olga.isHuman
     */
    public static boolean isHuman = true;

    public String firstname;
    /* Proprietatea PROTECTED pot fi apelate si folosite in clasele din cadrul pachetului, in care se
    afla clasa si clasele mostenitoare
     */
    protected String lastname;
    /* O proprietate FINAL reprezinta o constanta, asta inseamna ca ea nu se va schimba in timp,
    prin urmare trebuie ca fiecare obiect initializat sa aiba un ID, acesta fiind inclus in Constructor
     */
    public final int ID;
    /* Proprietatile PRIVATE pot fi apelate si folosite doar in interiorul clasei,
    daca vom avea Person olgaPerson, atunci olgaPerson.age nu va putea fi accesat din exteriorul clasei
     */
    private int age;
    /* Informatia despre pensie nu este atit de importanta, daca consideram ca avem un obiect Person numit olgaPerson
    atunci olgaPerson.isRetired ar fi o expresie acceptata in orice clasa a proiectului.
    Asta deoarece PUBLIC ofera acces din oricare punct al proiectului
     */
    public boolean isRetired;

    /* Constructorul de mai jos va permite crearea obiectelor Person care dispun de firstname, lastname si id
    celelalte proprietati vor fi nulle initial, astfel ar trebui sa folosim numeObiect.numeProprietate = valoare,
    pentru a le popula ulterior
     */
    public Person(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = id;
    }

    /* Constructorul de mai jos accepta o serie de variabile locale si le foloseste pentru a popula
    toate proprietatile unui nou obiect
     */
    public Person(String firstname, String lastname, int id, int age, boolean isRetired) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = id;
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("The entered age is not valid, the property age is still empty");

        }
        this.isRetired = isRetired;
    }

   /* public void setAge(int enteredAge) {
        if (enteredAge > 0 && enteredAge < 100) {
            this.age = enteredAge;
        } else {
            System.out.println("The entered age is not valid, the property age is still empty");
        }
    }
    */

    public int getAge() {
        return this.age;
    }

    // Proprietatea is.Retired este de tipul boolean si serveste drept conditie pentru instructiunea IF
    public void printRetirementStatus() {
        if (isRetired) {
            // codul executat conditie adevarata
            System.out.println(firstname + " este la pensie");
        } else {
            // codul executat conditie falsa
            System.out.println(firstname + " nu este la pensie");
        }
    }
}
