import java.util.Scanner;
public class Celcius 
{
	

	public static void main(String []args) 
	{
		Scanner sc = new Scanner (System.in);
		float c;
		System.out.println("Enter the Temperture in Celcius :");
		c = sc.nextFloat();
		float f = (float)(9/5*c)+32;
		System.out.println(" "+f);
	}
}
