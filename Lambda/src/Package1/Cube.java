package Package1;
import java.util.Scanner;
public class Cube 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		Lambda1 res = (n)-> System.out.println("Cube :"+(n*n*n));
		res.cube(sc.nextInt());
	}
}
