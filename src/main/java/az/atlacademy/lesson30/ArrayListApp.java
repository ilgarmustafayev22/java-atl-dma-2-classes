package az.atlacademy.lesson30;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingCart = new ArrayList<>();

        // Keep adding items until user chooses to quit
        while (true) {
            System.out.println("Enter item name (or 'q' to quit): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("q")) {
                break;
            }

            shoppingCart.add(item);
        }

        // Print the cart contents
       System.out.println("\nYour shopping cart:");
       for (String item : shoppingCart) {
           System.out.println(item);
       }

      // // Remove an item
      // System.out.println("\nEnter the name of an item to remove: ");
      // String itemToRemove = scanner.nextLine();

      // if (shoppingCart.remove(itemToRemove)) {
      //     System.out.println(itemToRemove + " removed from the cart.");
      // } else {
      //     System.out.println(itemToRemove + " not found in the cart.");
      // }

      // System.out.println("\nUpdated shopping cart:");
      // for (String item : shoppingCart) {
      //     System.out.println(item);
      // }
    }

}
