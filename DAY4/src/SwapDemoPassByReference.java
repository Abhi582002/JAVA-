class MyDate1
{
	int d;
	int m;
	int y;
	
	public MyDate1()
	{
		d=m=y=0;
	}
	public MyDate1(int d,int m,int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
	}
	@Override
	public String toString()
	{
		return " "+d+" "+m+" "+y;
	}
}





public class SwapDemoPassByReference 
{
	public static void swap(MyDate dt[])
	{
		MyDate temp;
		temp=dt[0];
		dt[0]=dt[1];
		dt[1]=temp;		
	}
	public static void main(String[]args)
	{
		MyDate d[]=new MyDate[2];
		d[0]=new MyDate (1,1,2001);
		d[1]=new MyDate (2,2,2002);
		System.out.println("Before Swap");
		System.out.println("d[0]:"+d[0]);
		System.out.println("d[1]:"+d[1]);
		swap(d);
		System.out.println("After Swap");
		System.out.println("d[0]:"+d[0]);
		System.out.println("d[1]:"+d[1]);
	}
}











