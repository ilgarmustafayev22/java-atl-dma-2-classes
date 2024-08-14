package az.atlacademy.module01.lesson24;

public class Human {

   //public static final String EXAMPLE = "A";

   //public static void foo(){
   //    System.out.println("b");
   //}
   static {
       System.out.println("static");
   }

   {
       System.out.println("non-static");
   }

}
