package Package4;
public class Demo implements Printable 
{
	@Override
	public void m1() 
	{
	 System.out.println("m1 method...");
	}
    public static void main(String[] args) 
    {
      Demo d1= new Demo();
      d1.m1();
      d1.m2();
      Printable.m3();
     }
}