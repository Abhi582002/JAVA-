//Write a JAVA program to accept a username and password from user (admin & admin123).
//Give Three Attempt if not then raise InvalidUserNameException or InvalidPasswordException..


package Package5;

import java.util.Scanner;
public class UserLogin 
{
	 private static final String USERNAME = "admin";
	 private static final String PASSWORD = "admin123";
	 
	 public static void validateLogin(String username, String password) throws InvalidUserNameException,InvalidPasswordException
	 {
		 if (!username.equals(USERNAME))
		 {
			 throw new InvalidUserNameException();
		 }
		 if (!password.equals(PASSWORD))
		 {
			 throw new InvalidPasswordException();
		 }
		 System.out.println("Login successful!");
	 }
	 
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		  int attempts = 3;
		  
		  while (attempts > 0)
		  {
			  System.out.println("Enter Username:");
	          String username = sc.nextLine();
	          
	          System.out.println("Enter Password:");
	          String password = sc.nextLine();
	          
	          try
	          {
	        	  validateLogin(username, password);
	        	  break;
	          }
	          catch(InvalidUserNameException | InvalidPasswordException e)
	          {       	  
	        		  System.out.println(e.getMessage());  
	        		  attempts--;
	        		  
	        		  if (attempts > 0) 
	        		  {
	        			  System.out.println("You have "+ attempts + " attempt(s) left.");
	        		  }
	        		  else
	        		  {
	        			  System.out.println("Maximum login attempts exceeded.");
	        		  }
	          }
		  }
	 }
}
