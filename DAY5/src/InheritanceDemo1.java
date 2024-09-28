class Emp
{
	public void calSal()
	{
		System.out.println("BSAL+HRA+DA");
	}
	public int calSal(String allow)
	{
		System.out.println("BSAL+HRA+DA+"+"allow");
		return 0;
	}
}
	class Mgr2 extends Emp
	{
		@Override	
		public void calSal()
		{
			System.out.println("BSAL+HRA+DA+Incentives");
		}
	}
public class InheritanceDemo1 
	{
	public static void main(String[] args) 
	{
		//parent class reference refer child class object	 
		Emp e1= new Emp();
		e1.calSal();
		e1= new Mgr2();
		e1.calSal();  
	}
}