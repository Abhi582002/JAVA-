public class Demo 
{
  int x;
  int y;
  public Demo() 
  {
	 x=y=10;
  }
  public Demo(int x,int y) 
  {
	 this.x=x;
	 this.y=y;
  }
  @Override
  public String toString() 
  {
	return " x:"+x+" y:"+y;
  }  
  public static void main(String[] args) 
  {
     final Demo d1= new Demo(10,20);
     System.out.println("d1:"+d1);
     //d1= new Demo(20,30);
     d1.x=30;
     d1.y=40;
     System.out.println("d1:"+d1);

 }
}