package Package4;

import java.util.ArrayList;
import java.util.Collections;


import Package3.Person;
public class MainClass 
{
	public static void main(String[]args)
	{
		ArrayList <Person> arr = new ArrayList<Person>();
	
		arr.add(new Person (25, "ABHI"));
		arr.add(new Person (96, "JAY"));
		arr.add(new Person (55, "SHREE"));
		
		PersonComparator1 obj=new PersonComparator1();
		Collections.sort(arr, obj::compareName);
		
		for(Person p :arr)
		System.out.println(p.getName()+ "---"+p.getAge());
		
	}

}
