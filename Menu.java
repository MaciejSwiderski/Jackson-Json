package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public void menuForAction(List<Person> personList) {

        MenuMethods menuMethods = new MenuMethods();
        DataFromUser dataFromUser = new DataFromUser();
        CreateAFileAndWriteToIt createAFileAndWriteToIt = new CreateAFileAndWriteToIt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("From the list below choose an appropriate action:\n1 - Show a list with default contacts\n2 - Provide new contacts\n3 - Look up for a contact\n4 - The End");
        int number = scanner.nextInt();

        switch (number) {

            case 1:
                createAFileAndWriteToIt.createAndWrite(personList);
                break;
            case 2:
                System.out.println("how many contacts you would like to add?");
                int howMany = scanner.nextInt();
                while (howMany > 0) {
                    System.out.println("Type a name");
                    String name = scanner.next();
                    System.out.println("Type a surname");
                    String surname = scanner.next();
                    System.out.println("Type an email address");
                    String email = scanner.next();
                    System.out.println("Type a phone number");
                    String phoneNumber = scanner.next();
                    dataFromUser.addNewContact(personList, name, surname, email, phoneNumber);
                    howMany--;
                }
                System.out.println(personList);
                break;
            case 3:
                System.out.println();
                menuMethods.search();
                break;
            case 4:
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("You have not chosen any action");
                menuForAction(personList);
        }
    }
}