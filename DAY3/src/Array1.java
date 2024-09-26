//import java.util.Scanner;
//public class Array1 
//{
// public static void main(String[] args) 
// { 
//	 Scanner sc = new Scanner(System.in);
//	 int n;
//	 System.out.println("Enter the Size of an Array :");
//	 n = sc.nextInt();
//	
//    int num[]= new int[n];
//   System.out.println("Enter the array elements:");
//		   for(int i=0;i<num.length;i++)
//		    {
//			   num[i]=sc.nextInt(); 
//		    }
//   System.out.println("Array Elements are:");
//		   for(int i=0;i<num.length;i++)
//		    {
//			 System.out.println(" "+num[i]);
//		    }
//  }
//}

import java.util.Scanner;
public class Array1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the Size of ana Array:");
		n = sc.nextInt();
		
		int num[] = new int[n];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :");
		for(int i=0 ;i<num.length;i++)
		{
			System.out.println(" "+num[i]);
		}	
	}	
}