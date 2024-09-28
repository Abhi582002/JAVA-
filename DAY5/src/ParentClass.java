class Employees
{
	public void calSal()
	{
		System.out.println("HRA+DA+BSAL");
	}
}
class Manager extends Employees
{
	public void calIncentives()
	{
		System.out.println("Incentives");
	}
}
public class ParentClass
{
	public static void main(String[]args)
	{
		Employees e1 = new Employees();
        e1.calSal();
		
		Manager m1 = new Manager();
		m1.calSal();
		m1.calIncentives();
	}
}
