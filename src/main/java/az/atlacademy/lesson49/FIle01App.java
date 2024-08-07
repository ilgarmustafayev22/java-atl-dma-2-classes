package az.atlacademy.lesson49;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIle01App {

    public static final String RESOURCES = "src/main/java/az/atlacademy/lesson49/resources/";
    public static final Path PATH = Paths.get(RESOURCES + "person.txt");
    public static void main(String[] args) {

        try {
            Files.writeString(PATH, "Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String word = Files.readString(PATH);
            System.out.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
