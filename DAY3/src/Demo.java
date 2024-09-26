


	public class Demo 
	{
	   int x;
	   public Demo() 
	   {
	     x=0;
	   }
	   public Demo(int x) 
	   {
	     this.x=x;
	   }
	  public static void display(Demo d1)
	  {
		d1.x=d1.x+20;  
	  }	
	 public static void main(String[] args) 
	 {
	   Demo d1=new Demo(10);
	   System.out.println("d1:BEFORE:"+d1.x);
	   display(d1);
	   System.out.println("d1:AFTER:"+d1.x);
	 }
	}
