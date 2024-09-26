//import java.util.Scanner;
//public class Array2 
//{
// public static void main(String[] args) 
// {
//		// int num[][]={{10,20},{30,40}};  // Java Notation
//		   // int [][]num={{10,20},{30,40}};  // Java Notation
//		   
//	int num[][]={{10,20},{30,40}};
//			System.out.println("Matrix is:");
//			for(int i=0;i<2;i++)
//			{
//			  for(int j=0;j<2;j++)
//			  {
//			    System.out.print(" "+num[i][j]);	  
//			  }
//			  System.out.print("\n");
//			}
//	}
//}
import java.util.Scanner;
public class Array2
{
	public static void main(String[]args)
	{
		int num[][]= {{10,20},{30,40}};
		System.out.println("Matrix is :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+num[i][j]);
			}
		}
	}
}
