package az.atlacademy.lesson49;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionApp {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Person person = new Person(2L, "A", 21);
        String name = person.getClass().getName();
        System.out.println(name);

        Field[] fields = person.getClass().getFields();
        System.out.println(Arrays.toString(fields));

        Field field = person.getClass().getDeclaredField("age");
        System.out.println(field);

        String packageName = person.getClass().getPackageName();
        System.out.println(packageName);

        person.getClass().isAnonymousClass();

    }
}
