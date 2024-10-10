package ArrayList;

import java.util.*;


public class TreeDemo {

	public static void main(String[] args) {

		Set<Integer> numSet1= new HashSet<>();
					
		numSet1.add(100);
		numSet1.add(500);
		numSet1.add(60);
		numSet1.add(100);  // duplicate
		numSet1.add(1200);
		numSet1.add(400);
		numSet1.add(550);
		numSet1.add(570);
		
		System.out.println("Using Syso numSet1:"+numSet1);
		
	Set<Integer> numSet2 = new TreeSet<Integer>();
		
		numSet2.add(100);
		numSet2.add(500);
		numSet2.add(60);  //
		numSet2.add(100); //
		numSet2.add(1100);
		numSet2.add(400);
		numSet2.add(550);
		numSet2.add(570);
		
		System.out.println("Using Syso numSet2:"+numSet2);	
		
		
		System.out.println("Ans:"+numSet1.containsAll(numSet2));
						
		// using forEach loop
		System.out.println("Using forEach loop: numset1:");
		for(Integer val:numSet1)
		{
			System.out.println(val);
		}
		
		// using Iterator
		System.out.println("\n\nUsing Iterator numSet2:");
		Iterator<Integer> it = numSet2.iterator();
		while(it.hasNext())
		{
			Integer ob = it.next();
			System.out.println(ob);
		}
		
	}

}