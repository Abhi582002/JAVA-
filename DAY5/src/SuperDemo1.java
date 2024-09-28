class Test
{
   int n;
   public Test() 
   {
	n=10;
   }
   public static void print()
   {
	   System.out.println("static method print...Parent");
   }
}//end class
class Demo extends Test
{
   int n;
   public Demo() 
   {
	 n=20;
   }	
   public void display()
   {
	int n=30;   
	System.out.println("Value of n:"+super.n); 
	System.out.println("Value of n:"+this.n);
	System.out.println("Value of n:"+n);
   }
   public static void print()
   {
	  Test.print();
	   System.out.println("static method print child...");
   }
}//end class


public class SuperDemo1 
{
  public static void main(String[] args) 
  {
     Demo d1= new Demo(); // d1[n/n]
     d1.display();
     Demo.print();
  }//end main
}//end class