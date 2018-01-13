package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import java.util.Scanner;

public class MenuMethods {

    public void search() {

        LookUpTheRest lookUpTheRest = new LookUpTheRest();
        System.out.println("Type whatever you want to look up a contact by");
        Scanner scanner1 = new Scanner(System.in);
        String textToFind = scanner1.nextLine();
        lookUpTheRest.sortByName(textToFind);
    }
}
