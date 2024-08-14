package az.atlacademy.module01.lesson27;

import java.util.Optional;

public class Task01App {

    public static void main(String[] args) {

       //Integer i = requireNonNull(1);
       //String s = requireNonNull("s");
       //Boolean b = requireNonNull(true);
        // Object object = requireNonNull(null);


        Box<Integer> integerBox = new Box<>(1);
        //integerBox.setData(true);

        Box<String> s1 = new Box<>(null);
        if (s1.isEmpty()) {
            System.out.println("===");
        } else {
            System.out.println(s1);
        }
        String foo = foo(null);
        System.out.println(foo);
        // Box box = new Box(true);
        // box.setData(1);
        // System.out.println(box.getData());
    }


    ////  }

    // public void requireNonNull(LocalDate localDate){
    //     if (localDate == null){
    //         throw new CustomNullPointerException();
    //     }
    // }
//
    // public void requireNonNull(Integer integer){
    //     if (integer == null){
    //         throw new CustomNullPointerException();
    //     }
    // }
    //
    // public void requireNonNull(Object object){
    //     if (object == null){
    //         throw new CustomNullPointerException();
    //     }
    // }

    public static <T> Optional<T> requireNonNull(Optional<T> box) {
        if (box.isEmpty()) {
            System.out.println("customnull");
        }
        return Optional.empty();
    }

    public static String foo(String s){
        return s;
    }


}
