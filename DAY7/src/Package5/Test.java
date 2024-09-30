package Package5;

public class Test implements interface1,interface2 
{
  @Override
  public void m1() 
  {
	  interface1.super.m1();
  }
  public static void main(String[] args) 
  {
    Test ref = new Test();
    ref.m1();
   }
}//end cl