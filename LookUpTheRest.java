package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.java2.maciej.swiderski.zadanie009ogolne.zadanie3.CreateAFileAndWriteToIt.destination;

public class LookUpTheRest extends Menu {

    public void sortByName(String textToFind) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Person> personList = mapper.readValue(new File(destination), new TypeReference<List<Person>>() {
            });
            personList.stream().filter(person -> person.getName()
                    .toUpperCase()
                    .contains(textToFind))
                    .forEach(System.out::println);

            personList.stream().filter(person -> person.getSurname().toUpperCase().contains(textToFind.toUpperCase())).forEach(System.out::println);

            personList.stream().filter(person -> person.getEmailAddress().toUpperCase().contains(textToFind.toUpperCase())).forEach(System.out::println);

            personList.stream().filter(person -> person.getPhoneNumber().toUpperCase().contains(textToFind.toUpperCase())).forEach(System.out::println);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
