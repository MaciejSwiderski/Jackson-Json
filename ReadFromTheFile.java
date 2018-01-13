package org.java2.maciej.swiderski.zadanie009ogolne.zadanie3;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.java2.maciej.swiderski.zadanie009ogolne.zadanie3.CreateAFileAndWriteToIt.destination;

public class ReadFromTheFile {


    public void ToOnlyReadFile() {

        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Person> personListToRead = mapper.readValue(new File(destination), new TypeReference<List<Person>>() {
            });
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personListToRead);
            System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
