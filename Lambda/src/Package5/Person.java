package Package5;

public class Person 
{
	int age;
	String name;
	Person(int a,String nm)
	{
		age = a;
		name = nm;
	}
	
	void person()
	{
		age = 0;
		name = "Default";
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "name:" + name + "---" + "age is" +age;
	}
}
