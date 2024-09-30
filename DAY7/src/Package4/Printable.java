package Package4;

public interface Printable 
{
  abstract public void m1();	
  default void m2()
  {
	  System.out.println("m2...default method..!");
  }
  static void m3()
  {
	  System.out.println("m3...static method..!");
  }
}