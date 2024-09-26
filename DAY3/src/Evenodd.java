import java.util.Scanner;
public class Evenodd {

	public void evenoddmethod(int n)
	{
		if(n%2==0)
		{
			System.out.println("The Number is Even.");
		}
		else
		{
			System.out.println("The Number is Odd.");
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		
		Evenodd EO = new Evenodd();
		EO.evenoddmethod(n);
	}
}
