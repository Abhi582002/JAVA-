package Package1;

import java.util.Scanner;
public class Test 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			int fact = 1,i=1;
			
			if ( n<0)
			{
				throw new NegativeNumberException();
			}	
			while(i<=n)
			{
				fact = fact*1;
				i++;
			}
			System.out.println("Factorial of a Number :"+fact);
		}
		catch(NegativeNumberException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}
}
//System.out.println(e);
//System.out.println(e.getMessage());