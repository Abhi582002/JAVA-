//write a JAVA program to accept number and check number is positive if number is negative then display NegativeNumberException

package Package4;

import java.util.Scanner;
public class NumberCheck 
{
	 public static void checkNumber(int number) throws NegativeNumberException
	 {
		 if (number < 0)
		 {
			 throw new NegativeNumberException();
		 }
		 else
		 {
			 System.out.println("The number is positive.");
		 }
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int number = sc.nextInt();
		 
		 try
		 {
			 checkNumber(number); 
		 }
		 catch (NegativeNumberException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
