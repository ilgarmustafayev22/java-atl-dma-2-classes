package az.atlacademy.module01.lesson17;

public interface Car {

     public abstract void drive();

     default void foo(){
          System.out.println("a");
     }

}
