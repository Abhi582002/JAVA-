import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		int prime = 0;
		
		for(int i=2;i< n/2;i++)
		{
			if(n%2==0 || n%3==0)
			{
				prime = 1;
				break;
			}
			if(n%i==0)
			{
				prime =1;
			}
			
		}
			if (prime ==0)
			{
				System.out.println(n+" is a Prime Number");
			}
			else
			{
				System.out.println(n+" is  not a Prime Number");
			}
	}

}
