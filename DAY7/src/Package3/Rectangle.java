package Package3;
public class Rectangle extends MyShape implements Printable
{
  float len,bdt;
  public Rectangle() 
  {
	len=bdt=0;
  }
  public Rectangle(float len,float bdt) 
  {
	this.len=len;
    this.bdt=bdt;
  }
  @Override
  public void area() 
  {
    float area=len*bdt;
    System.out.println("Area of Rectangle:"+area);
  }
  @Override
  public void print() 
  {
	System.out.println("LEN:"+len);
	System.out.println("bdt:"+bdt);
  }
}