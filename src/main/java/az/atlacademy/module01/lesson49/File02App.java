package az.atlacademy.module01.lesson49;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File02App {

    public static final String RESOURCES = "src/main/java/az/atlacademy/lesson49/resources/";
    public static final Path PATH = Paths.get(RESOURCES + "person02.txt");

    public static void main(String[] args) {
        Person bob = new Person(1L, "Bob", 90);
        System.out.println(bob);
        System.out.println();

        ObjectMapper objectMapper = new ObjectMapper();
        String value = "";
        try {
            value = objectMapper.writeValueAsString(bob);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            Files.writeString(PATH, value);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String jsonPerson = Files.readString(PATH);
            System.out.println(jsonPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
