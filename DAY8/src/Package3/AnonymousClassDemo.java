package Package3;

class Outer
{
	public int n;
	Employee e1 = new Employee()
		{
		int incentives = 1000;
		@Override
		public void display()
		{
			super.display();
			System.out.println("Employee Incentives :"+incentives);
		}
		};
	
	I iob = new I()
		{
		@Override
		public void show()
		{
			System.out.println("HI from Show Method..");
		}
		};
		}
	public class AnonymousClassDemo 
	{
	 public static void main(String[] args) 
	 {
	   Outer ob = new Outer();
	   ob.n=10;
	   ob.e1.display();
	   
	   ob.iob.show();
	 }
	}
