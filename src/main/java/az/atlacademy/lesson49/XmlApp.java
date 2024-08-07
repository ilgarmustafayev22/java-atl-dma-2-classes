package az.atlacademy.lesson49;

import com.fasterxml.jackson.xml.XmlMapper;

import java.io.IOException;

public class XmlApp {

    public static void main(String[] args) {
        Person bob = new Person(1L, "Bob", 90);
        System.out.println(bob);
        System.out.println();

        XmlMapper xmlMapper = new XmlMapper();
        try {
            String value = xmlMapper.writeValueAsString(bob);
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
