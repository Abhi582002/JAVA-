//Checks the  String First Letter is Lowercase or Uppercase it Will be Printed to the Next Character. 

package CQuestion;

import java.util.Scanner;

public class NextAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet (uppercase or lowercase):");
        char inputChar = sc.next().charAt(0);
        char nextChar;  // Declare nextChar here so it can be accessed later

        if ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'a' && inputChar <= 'z')) {
            // Calculate the next alphabet
            if (inputChar == 'Z') {
                nextChar = 'A';  // Wrap around for 'Z'
            } else if (inputChar == 'z') {
                nextChar = 'a';  // Wrap around for 'z'
            } else {
                nextChar = (char) (inputChar + 1);  // Increment the character
            }

            // Display the next alphabet
            System.out.println("The next alphabet after '" + inputChar + "' is: " + nextChar);
        } else {
            System.out.println("Invalid input! Please enter a valid alphabet.");
        }

        // Closing the scanner
        sc.close();
    }
}
