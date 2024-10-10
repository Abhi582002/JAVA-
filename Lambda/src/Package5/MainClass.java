package Package5;

public class MainClass 
{
	public static void main(String[]args)
	{
		PersonFactory p = Person :: new;
		
		System.out.println("Constructor is not Called yet");
		System.out.println(p.get(30,"ABHISHEK"));
	}
}
