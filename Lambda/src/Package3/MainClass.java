package Package3;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass 
{
	public static void main(String[]args)
	{ 	
		ArrayList <Person> arr = new ArrayList <Person>();
		
		arr.add(new Person (23, "ABHI"));
		arr.add(new Person (56, "JAY"));
		arr.add(new Person (75, "SHREE"));
	
	Collections.sort(arr,PersonComparator::compareAge);
	
	for(Person p :arr)
		System.out.println(p.getAge());
	}
}
