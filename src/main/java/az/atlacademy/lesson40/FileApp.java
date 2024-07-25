package az.atlacademy.lesson40;

import java.io.*;
import java.util.Iterator;

public class FileApp {

    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson40/resource/";
    public static final File FILE = new File(RESOURCE + "a.txt");

    public static void main(String[] args) {

        // try (FileWriter fw = new FileWriter(FILE)){
        //     fw.write("Hello World!");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        try (FileReader fr = new FileReader(FILE)) {
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
