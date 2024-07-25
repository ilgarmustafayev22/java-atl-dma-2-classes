package az.atlacademy.lesson36;

import java.util.HashSet;

public class HashSetApp {

    public static void main(String[] args) {
        // Step 1: Create two HashSets to store email addresses
        HashSet<String> emailSet1 = new HashSet<>();
        HashSet<String> emailSet2 = new HashSet<>();

        // Step 2: Add email addresses to the first HashSet
        emailSet1.add("alice@example.com");
        emailSet1.add("bob@example.com");
        emailSet1.add("charlie@example.com");
        emailSet1.add("diana@example.com");

        // Step 2: Add email addresses to the second HashSet
        emailSet2.add("charlie@example.com");
        emailSet2.add("diana@example.com");
        emailSet2.add("eve@example.com");
        emailSet2.add("frank@example.com");

        // Step 3: Merge the two sets (union)
        HashSet<String> mergedSet = new HashSet<>(emailSet1);
        mergedSet.addAll(emailSet2);
        System.out.println("Merged email addresses: " + mergedSet);

        // Step 4: Find common email addresses (intersection)
        HashSet<String> commonSet = new HashSet<>(emailSet1);
        commonSet.retainAll(emailSet2);
        System.out.println("Common email addresses: " + commonSet);

        // Step 5: Remove a group of email addresses from the merged set (bulk operation)
        HashSet<String> emailsToRemove = new HashSet<>();
        emailsToRemove.add("alice@example.com");
        emailsToRemove.add("frank@example.com");
        mergedSet.removeAll(emailsToRemove);
        System.out.println("Merged email addresses after removal: " + mergedSet);

        // Step 6: Iterate through the final set and print all email addresses
        System.out.println("Final email addresses in the set:");
        for (String email : mergedSet) {
            System.out.println(email);
        }
    }

}
