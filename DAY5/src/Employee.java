
public class Employee 
{
	int eid;
	String ename;
	int esal;
	MyDate dob;
	public Employee()
	{
		eid=101;
		ename="ABHI";
		esal=15000;
		dob=new MyDate (12,2,2002);
	}
	public Employee(int eid,String ename,int esal,MyDate dob)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.dob=dob;
	}
	public void display ()
	{
		System.out.println("\n\nEmployee Id:"+eid);
		System.out.println("\n\nEmployee Name:"+ename);
		System.out.println("\n\nEmployee Salary:"+esal);
		System.out.println("\n\nEmployee DOB:"+dob);
	}
	public static void main(String[]args)
	{
		Employee e1 = new Employee();
		MyDate d = new MyDate(24,2,2002);
		Employee e2 = new Employee(102,"WADU",20000,d);
		e1.display();
		e2.display();
	}
}






