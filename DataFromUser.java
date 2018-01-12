package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataFromUser {

    String destination = "C:\\Users\\Maciej\\Desktop\\file.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<Person> addNewContact(List<Person> personList, String name, String surname, String email, String phone) {

        personList.add(new Person(name, surname, email, phone));
        try {
            mapper.writeValue(new File(destination), personList);
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personList);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
