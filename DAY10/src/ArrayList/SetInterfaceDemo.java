package ArrayList;

import java.util.*;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceDemo 
{
  public static void main(String[] args) 
	{

		Set<Integer> numSet = new HashSet<Integer>();
		
			
		numSet.add(100);
		numSet.add(500);
		numSet.add(60);
		numSet.add(100);  // duplicate
		numSet.add(1200);
		numSet.add(400);
		numSet.add(550);
		numSet.add(570);
		
	
		
		System.out.println("Using Syso:"+numSet);
		
		// using forEach loop
		System.out.println("Using forEach loop");
		for(Integer val:numSet)
		{
			System.out.println(val);
		}
		
		// using Iterator
		System.out.println("\n\nUsing Iterator");
		Iterator<Integer> it = numSet.iterator();
		while(it.hasNext())
		{
			Integer ob = it.next();
			System.out.println(ob);
		}
		
		
	  
	
	}

}
