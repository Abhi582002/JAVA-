import java.util.Scanner;
public class Account 
{
	int ano;
	String cname;
	float abal;
	String city;
	static int cnt;
	static
	{
		cnt=0;
	}
	public Account()
	{
		ano=++cnt;
		cname=null;
		abal=0.0f;
		city=null;
	}
	public void createAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Account no:"+ano);
		System.out.println("\nCustomer  name:");
		cname =sc.next();
		System.out.print("\nAccount Balance:"+abal);
		System.out.print("\nCutomer city:");
		city = sc.next();
	}
	public void deposit(float amt)
	{
		if(amt>0)
		{
			abal=abal+amt;
			System.out.println("Amount Deposited Successfully...!");
		}
		else
		{
			System.out.println("Invalid Amount...!");
		}
	}
	public void withdraw(float amt)
	{
		if(abal>=amt)
		{
			abal=abal-amt;
			System.out.println("Amount withdraw Successfully...!");
		}
		else
		{
			System.out.println("Insufficient Balance..!");
		}
	}
	public void display()
	{
		System.out.println("\n\nAccount No:"+ano);
		System.out.println("\n\nCustomer Name:"+cname);
		System.out.println("\n\nAccount Balance:"+abal);
		System.out.println("\n\nCustomer City:"+city);
	}
}
