package Package2;

import java.util.Scanner;

public class Numbercheck 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		
		try 
		{
			if(number >=0 && number <=10)
			{
				throw new SmallNumberException();
			}
			else if (number >=11 && number <=15)
			{
				throw new ProperNumberException();
			}
			else if(number >=16 &&  number <=20)
			{
				throw new GreaterNumberException();
			}
			else
			{
				System.out.println("The Number is Out of Specific Range");
			}
		}
			catch(SmallNumberException | ProperNumberException | GreaterNumberException e)
			{
			e.printStackTrace();
			}
			
		
	}
}
