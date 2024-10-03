package Package5;

public class student 
{
	private int sno;
	private	String sname;
	private String SAddress;
	private int SMarks;
	
	public student()
	{
		super();
		sno = 05;
		sname = "ABHI";
		SAddress = "SHIV COLONY";
		SMarks = 80;
	}
	
	public student(int sno, String sname, String saddress, int smarks)
	{
		super();
		this.sno = sno;
		this.sname = sname;
		SAddress = saddress;
		SMarks = smarks;
	}
	public void display()
	{
		System.out.println("Student Number is:"+sno);
		System.out.println("Student Name is :"+sname);
		System.out.println("Student Address is :"+SAddress);
		System.out.println("Student Marks are :"+SMarks);
	}
}

