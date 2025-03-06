import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // Get the sentence input from the user
        String sentence = getSentenceInput();
        
        // Count the words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get the sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine().trim(); // Trim to remove leading/trailing spaces
    }

    // Method to count the words in the sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }
        
        // Split the sentence by spaces and count the words
        String[] words = sentence.split("\\s+"); // Split by one or more spaces
        return words.length;
    }
}