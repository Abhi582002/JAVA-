package CQuestion;

import java.util.Scanner;
public class Ascii 
{
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the Character:");
	char ch1 = sc.next().charAt(0);
	
	System.out.println("Enter the Character:");
	char ch2 = sc.next().charAt(0);
	
	int a = (int)ch1;
	int b = (int)ch2;
	
	 System.out.println("The ASCII value of '" + ch1 + "' is: " + a);
     System.out.println("The ASCII value of '" + ch2 + "' is: " + b);
     
     int sum = a + b;
     int difference = Math.abs(a - b);
     
     
     System.out.println("The sum of the ASCII values is: " + sum);
     System.out.println("The difference of the ASCII values is: " + difference);
	 }	
}
