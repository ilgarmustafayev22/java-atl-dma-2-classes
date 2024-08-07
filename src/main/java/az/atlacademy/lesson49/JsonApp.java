package az.atlacademy.lesson49;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonApp {

    public static void main(String[] args) {
        Person bob = new Person(1L, "Bob", 90);
        System.out.println(bob);
        System.out.println();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String value = objectMapper.writeValueAsString(bob);
            System.out.println(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
