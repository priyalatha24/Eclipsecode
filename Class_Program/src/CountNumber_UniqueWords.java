import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountNumber_UniqueWords {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        // Convert the input string to lowercase and split it into words.
        String[] words = input.toLowerCase().split(" ");
        // Create a set to store the unique words.
        Set<String> uniqueWords = new HashSet<>();
        // Add each word to the set.
        for (String word : words) {
            uniqueWords.add(word);
        }
        // Print the number of unique words.
        System.out.println("The number of unique words is: " + uniqueWords.size());
    }
}
