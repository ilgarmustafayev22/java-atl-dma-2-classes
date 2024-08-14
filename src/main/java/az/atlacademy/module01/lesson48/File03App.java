package az.atlacademy.module01.lesson48;

import java.io.*;

public class File03App {

    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson48/resources/";

    public static void main(String[] args) {
        Person person = new Person(1L, "John", 22);

    //    try {
    //        FileOutputStream fos = new FileOutputStream(RESOURCE + "person.ser");
    //        ObjectOutputStream oos = new ObjectOutputStream(fos);
    //        oos.writeObject(person);
    //        oos.close();
    //        fos.close();
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "person.ser");
            ObjectInputStream bis = new ObjectInputStream(fis);
            Object object = bis.readObject();
            if (object instanceof Person) {
                System.out.println(object);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
