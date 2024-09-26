
public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int terms = 10;
		printFibonacci(terms);
	}
	public static void printFibonacci(int terms)
	{
		int first = 0,second = 1;
		
		System.out.println("Fibonacci Series :");
		
		for(int i = 0;i < terms; i++)
		{
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
