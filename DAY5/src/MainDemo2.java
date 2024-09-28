class ParentClass2
{
	int a;
	public ParentClass2()
	{
		int a=10;	 
		System.out.println("Parent class Default Constructor Called..");
	}	
}
class Mgr extends ParentClass2
{
  int b;	
  public Mgr() 
  {
	  b=20;
	  System.out.println("Child class Default Constructor Called..");
  }	
  public void display()
  {
	  System.out.println("a:"+a+"b:"+b);
  }
}
public class MainDemo2
{
	public static void main(String[] args) 
	{
		Mgr m1 = new Mgr(); //m1[a/b] 
		m1.display();
	}
}