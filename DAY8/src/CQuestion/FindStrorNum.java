//Checks the Number is Digit or Number Or Special Character.

package CQuestion;


import java.util.Scanner;

public class FindStrorNum {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
       
        String input = sc.next(); 
        if (input.length() == 0) { 
            System.out.println("No character entered.");
            sc.close();
            return; 
        }
        char ch = input.charAt(0);         
        
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter");
           
            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is in upperCase");
            } else {
                System.out.println(ch + " is a lowerCase");
            }
        } 
    
        else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Character");
        }

       
        sc.close();
    }
}