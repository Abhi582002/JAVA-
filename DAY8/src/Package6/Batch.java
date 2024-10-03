package Package6;

public class Batch 
{
	protected int bno;
	private String bname;
	
	public Batch() 
	{
		super();
		bno = 5050;
		bname = "WADU";
	}
	
	public Batch(int bno, String bname) 
	{
		super();
		this.bno = bno;
		this.bname = bname;
	}
	public void display()
	{
		System.out.println("The Batch Number is:"+bno);
		System.out.println("The Batch Name is:"+bname);
	}
}
