
public class SwapDemoPassByValue 
{
	public static void swap(MyDate dt1,MyDate dt2)
	{
		MyDate temp;
		temp=dt1;
		dt1=dt2;
		dt2=temp;
	}
	
	public static void main(String[]args)
	{
		MyDate d1 = new MyDate(1,1,2001);
		MyDate d2 = new MyDate(2,2,2002);
		System.out.println("Before Swap");
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		swap (d1,d2);
		System.out.println("after swap");
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
	}
}
