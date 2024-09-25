import java.util.Scanner;

public class program9 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int a = n*n;
		int sum =0;
		int temp = n;
		while(temp!=0)
		{
			int b = temp%10;
			temp = temp/10;
			sum = sum + b;
		}
		
		if(sum == n)
		{
			System.out.println("The Number is Neon Number.");
		}
		else
		{
			System.out.println("The Number is not a Neon Number.");
		}
	}
}
