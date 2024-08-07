package az.atlacademy.lesson48;

import java.io.*;

public class File02App {

    private static final String RESOURCE = "src/main/java/az/atlacademy/lesson48/resources/";

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "number.txt", true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            Integer number = 0;
            for (int i = 1; i <= 10; i++) {
                number++;
                bos.write(number.byteValue());
            }
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "number.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            int sum = 0;
            for (byte aByte : bytes) {
                sum += aByte;
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
