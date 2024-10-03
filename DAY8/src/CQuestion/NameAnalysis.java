package CQuestion;

import java.util.Scanner;

public class NameAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a name (containing three words):");
        String fullName = sc.nextLine();

        // Split the name into words
        String[] words = fullName.split(" ");
        

        if (words.length != 3) {
            System.out.println("Please enter exactly three words.");
            sc.close();
            return; 
        }
     
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(word.charAt(0)).append(". ");
            }
        }
        System.out.println("Initials: " + initials.toString().trim());

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length of the longest word: " + longestWord.length());

        sc.close();
    }
}

