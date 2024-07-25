package az.atlacademy.lesson40;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberFile {

    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson40/resource/";
    public static final File FILE = new File(RESOURCE + "numbers.txt");

    public static void main(String[] args) {
        // Rəqəmləri fayla yazmaq
       try {
           FileWriter fw = new FileWriter(FILE);
           for (int i = 1; i <= 10; i++) {
               fw.write(i + "\n");
           }
           fw.close();
           System.out.println("Rəqəmlər fayla yazıldı.");
       } catch (IOException e) {
           System.out.println("Bir xəta baş verdi.");
           e.printStackTrace();
       }

        // Fayldan rəqəmləri oxuyub toplamaq
        try {
            Scanner reader = new Scanner(FILE);
            int sum = 0;
            while (reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine());
                sum += number;
            }
            reader.close();
            System.out.println("Rəqəmlərin cəmi: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Fayl tapılmadı.");
            e.printStackTrace();
        }
    }
}

