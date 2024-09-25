 
public class student {
	
	int roll_no;
	float perc;
	String name;
	
	public void initstudent()
	{
		 roll_no = 5;
		 perc = 72;
		 name = "ABHISHEK";
	}
	
	public void printDetails()
	{
		System.out.println("The Roll Number is :"+roll_no);
		System.out.println("The Percentage are :"+perc);
		System.out.println("The Name is :"+name);
	}
	
	public static void main(String[]args)
	{
		student std = new student();
		std.initstudent();
		std.printDetails();
	}
}
