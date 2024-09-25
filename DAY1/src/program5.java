//import java.util.Scanner;
//public class program5 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Year :");
//		int n = sc.nextInt();
//		
//		if(n % 400==0 || n % 4==0 && n % 100 !=0)
//		{
//			System.out.println("This is A Leap Year.");
//		}
//		else
//		{
//			System.out.println("This is not a Leap Year.");
//		}
//	}
//}

import java.util.Scanner;
public class program5
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year :");
		
		int n = sc.nextInt();
		
		if(n % 400==0 || n % 4==0 && n % 100!=0)
		{
			System.out.println("This is a Leap year.");
		}
		else
		{
			System.out.println("This is Not A Leap Year.");
		}
	}
	
	
	
	
	
	
}