package Package6;

import Package5.student;

class outer 
{
	student s1 = new student()
		{
			public void display()
			{
			super.display();
			}	
		};
	Batch b1 = new Batch() 
	{
		public void display()
		{
		super.display();
		}
	};
}
public class Test
{
	public static void main(String[]args)
	{
		outer ob = new outer();
		ob.s1.display();
		ob.b1.display();
	}
}
