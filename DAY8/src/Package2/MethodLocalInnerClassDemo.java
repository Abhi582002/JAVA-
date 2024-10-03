package Package2;

class Outer 
{
	int n;
	static int Cnt = 10;
	Outer()
	{
		n=10;
	}
	static public void displayCnt()
	{
		System.out.println("Value of cnt:"+Cnt);
	}
	public void m1()
	{
		final int z=100;
		class Inner
		{
			int a;
			Inner()
			{
				a=20;
			}
			public void display()
			{
				System.out.println("Value of a:"+a);
				System.out.println("Value of z:"+z);
			}
		}
		Inner ob = new Inner();
		ob.display();
	}
}
public class MethodLocalInnerClassDemo 
{
 public static void main(String[] args) 
 {
   Outer ob= new Outer();
   ob.m1();
 }//end main
}//end class