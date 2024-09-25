import java.util.Scanner;
public class program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the Selling price :");
				Double sell = sc.nextDouble();
				
				System.out.println("Enter the Cost price :");
				Double cost = sc.nextDouble();
				
				if(sell > cost)
				{
					System.out.print("Profit incurred");
				}
				else if(cost>sell)
				{
					System.out.print("Loss incurred");
				}
				else
				{
					System.out.print("nor Profit nor Loss incurred");
				}
	}
}
