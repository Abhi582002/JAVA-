package Package7;

public class Demo implements Cloneable 
{
  int x;
  int y;
  public Demo() 
  {
	x=y=0;
  }
  public Demo(int x,int y) 
  {
	this.x=x;
	this.y=y;
  }
  @Override
  public String toString() 
  {
	return " [x="+x+" y="+y+"]";
  }	
  /*@Override
  protected Object clone() throws CloneNotSupportedException 
  {
		return super.clone();
  }*/
  
  @Override
  protected Demo clone() throws CloneNotSupportedException 
  {
	   Demo temp= new Demo();
		temp.x=this.x;
		temp.y=this.y;
		return temp;
  }
  public static void main(String[] args) throws CloneNotSupportedException 
  {
    Demo d1= new Demo(10,20);
    Demo d2= d1;// Shallow cloning 
    System.out.println("d1:"+d1);
    System.out.println("d2:"+d2);
    Demo d3=d1.clone();
    System.out.println("d3:"+d3);
    System.out.println("d1:"+d1.hashCode());
    System.out.println("d2:"+d2.hashCode());
    System.out.println("d3:"+d3.hashCode());
  }//end main
}//end class