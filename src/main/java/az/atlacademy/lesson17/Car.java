package az.atlacademy.lesson17;

public interface Car {

     public abstract void drive();

     default void foo(){
          System.out.println("a");
     }

}
