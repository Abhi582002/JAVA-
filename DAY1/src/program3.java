//import java.util.Scanner;
//public class program3 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.print("Enter the Integer Value :");
//		int n = sc.nextInt();
//		
//		System.out.print("Enter the Float value :");
//		float m = sc.nextFloat();
//		
//		System.out.print("Enter the Double value :");
//		Double p = sc.nextDouble();
//		
//		System.out.print("Enter the String :");
//		String str1 = sc.next();
//		sc.nextLine();
//		
//		System.out.print("Enter the String (Multi Words):");
//		String str2 = sc.nextLine();
//		
//		System.out.print("Enter the Character String :");
//		char ch = sc.next().charAt(0);
//		
//		System.out.println("Integer Value :"+n);
//		
//		System.out.println("Float Value :"+m);
//		
//		System.out.println("Double Value:"+p);
//		
//		System.out.println("String Value :"+str1);
//		
//		System.out.println("String Value :"+str2);
//		
//		System.out.println("Character value :"+ch ;
//		
//	}
//
//}

import java.util.Scanner;
public class program3{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Integer Value :");
		int a = sc.nextInt();
		
		System.out.println("Enter the Float Value:");
		Float b = sc.nextFloat();
		
		System.out.println("Enter the Double Value:");
		Double c = sc.nextDouble();
		
		System.out.println("Enter the String");
		String str1 = sc.next();
		sc.nextLine();
		
		System.out.println("Integer Value :"+a);
		
		System.out.println("Float Value :"+b);
		
		System.out.println("Double Value :"+c);
		
		System.out.println("The String is :"+str1);
		
	}
}