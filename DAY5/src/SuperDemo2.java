class Emp1
{
  int n;
  public Emp1() 
  {
   n=10;
   System.out.println("Default constructor.. Parent");
  }
  public Emp1(int n) 
  {
   this.n=n;
   System.out.println("Parameterized constructor.. Parent");
  }	
}//end class
class Mgr1 extends Emp1
{
  int m;
  public Mgr1() 
  {
   super(20);	  
   m=15;
   System.out.println("Default constructor.. Child");
  }
  public Mgr1(int m) 
  {
   super(10);	  
   this.m=m;
   System.out.println("Parameterized constructor.. Child");
  }
}//end class

public class SuperDemo2 
{
 public static void main(String[] args) 
 {
   Mgr1 m1= new Mgr1();
   Mgr1 m2= new Mgr1(30);

 }//end main
}//end class