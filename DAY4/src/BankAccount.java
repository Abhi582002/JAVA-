import java.util.Scanner;

public class BankAccount
{
	public static void main(String[]args)
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		Account acc[]= new Account[100];
		do
		{
			System.out.println("\n1)Create Account");
			System.out.println("\n2)Deposit");
			System.out.println("\n3)Withdraw");
			System.out.println("\n4)Transfer");
			System.out.println("\n5)Display All Accounts");
			System.out.println("\n6)Display AccOUNT details by City");
			System.out.println("\n7)Display Account Details by Acccount Id");
			System.out.println("\n8)Exit");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			switch (ch)
			{
			case 1:
					acc[Account.cnt]=new Account();
				   acc[Account.cnt-1].createAccount();
				   break;
				   
			case 2:
					System.out.println("Enter the acount number to be deposit:");
				   int ac1=sc.nextInt(); 
				   System.out.println("Enter the amount:");
				   float amt=sc.nextFloat();
				   int flag=0;
				   for(int i=0;i<Account.cnt;i++)
				   {
					   if(acc[i].ano==ac1)
					   {
						   acc[i].deposit(amt);
						   flag=1;
						   break;
					   }
				   }
				   if(flag==0)
					   System.out.println("\nInvalid Account Number:...!!");
				   		break;
			case 3:
					System.out.println("Enter the acount number to be withdraw:");
					ac1=sc.nextInt();
					System.out.println("Enter the amount:");
					amt=sc.nextFloat();
					flag=0;
					for(int i=0;i<Account.cnt;i++)
			        {
			    	 if(acc[i].ano==ac1)
			    	  {
			    		 acc[i].withdraw(amt);
			    		 flag=1;
			    		 break;
			    	  }
			        }
					if(flag==0)
				    	 System.out.println("\nInvalid Account Number...!!");
				       break;
			
			case 4:
					System.out.println("\nAcount Details are");	 
					for(int i=0;i<Account.cnt;i++)
					{
						acc[i].display();	
					}
					break;
					
			case 5:
					System.exit(0);
					break;
			default:
			    	System.out.println("Wrong Choice..!! Try Again...");
			    	break;	   
			}
		}while(ch != 5);
		
	}
}
