package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Maciej", "Swiderski", "maciejswiderski@wp.pl", "508775460");
        Person person2 = new Person("Jan", "Kowalski", "jankowalski@wp.pl", "555666777");
        Person person3 = new Person("John", "Smith", "johnSmith@wp.pl", "777111222");
        Person person4 = new Person("Natalia", "Grzelak", "nataliagrzelak@wp.pl", "999777111");
        Person person5 = new Person("Kacper", "Duszek", "kacperduszek@wp.pl", "999111000");
        Person person6 = new Person("Johny", "Bravo", "johnybravo@wp.pl", "444555111");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        Menu menu = new Menu();
        menu.menuForAction(personList);
    }
}

