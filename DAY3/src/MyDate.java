

	public class MyDate 
	{
	  int d;
	  int m;
	  int y;
	  public MyDate() 
	  {
	     d=m=y=0;   // chain assignment 
	  }
	  public MyDate(int d,int m,int y) 
	  {
	    this.d=d;
	    this.m=m;
	    this.y=y;
	  }  
	    @Override
	  public String toString()
	  {
		  return " "+d+"/"+m+"/"+y;
	  }
	  public static void main(String[] args) 
	  {
	     MyDate d1=new MyDate(1,1,2001);
	     System.out.println("d1:"+d1.toString());
	     System.out.println("d1:"+d1);
	  }
	}



