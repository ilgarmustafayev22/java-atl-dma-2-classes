package az.atlacademy.module01.lesson48;

import java.io.*;
import java.util.Arrays;

public class File01App {

    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson48/resources/";

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "hello.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hello World !".getBytes());
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "hello.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (byte aByte : bytes) {
                char a = (char) aByte;
                System.out.print(a);
            }
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello");
        }


    }

}
