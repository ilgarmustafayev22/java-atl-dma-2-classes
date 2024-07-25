package az.atlacademy.lesson38;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapApp {

    private static HashMap<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Phone Book Application");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addContact(scanner);
                case 2 -> removeContact(scanner);
                case 3 -> findContact(scanner);
                case 4 -> displayAllContacts();
                case 5 -> System.out.println("Exiting the application.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact added successfully.");
    }

    private static void removeContact(Scanner scanner) {
        System.out.print("Enter name of the contact to remove: ");
        String name = scanner.nextLine();
        if (phoneBook.remove(name) != null) {
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void findContact(Scanner scanner) {
        System.out.print("Enter name to find: ");
        String name = scanner.nextLine();
        String phoneNumber = phoneBook.get(name);
        if (phoneNumber != null) {
            System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("All Contacts:");
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
            }
        }
    }
}


