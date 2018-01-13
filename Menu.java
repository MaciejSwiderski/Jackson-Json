package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public void menuForAction(List<Person> personList) {

        MenuMethods menuMethods = new MenuMethods();
        DataFromUser dataFromUser = new DataFromUser();
        CreateAFileAndWriteToIt createAFileAndWriteToIt = new CreateAFileAndWriteToIt();
        ReadFromTheFile readFromTheFile = new ReadFromTheFile();

        Scanner scanner = new Scanner(System.in);
        System.out.println("From the list below choose an appropriate action\n1 - WARNING ! - Delete a list to the defaul contacts only\n2 - Provide new contacts\n3 - Look up for a contact\n4 - Show actual contacts\n5 - The End");
        int number = scanner.nextInt();

        switch (number){

            case 1:
                System.out.println("Are you sure you want to delete actual list with contacts? type Y/N");
                String question = scanner.next();
                if(question.equalsIgnoreCase("y"))
                    createAFileAndWriteToIt.createAndWrite(personList);
                System.out.println("Above is a list with default contacts only");
                break;
            case 2:
                System.out.println("how many contacts you would like to add?");
                int howMany = scanner.nextInt();
                while(howMany>0) {
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
                break;
            case 3:
                menuMethods.search();
                break;
            case 4:
                readFromTheFile.ToOnlyReadFile();
                break;
            case 5:
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("You have not chosen any action");
                menuForAction(personList);
        }
    }
}