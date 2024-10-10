package ArrayList;

import java.util.*;
public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
        LinkedList <Integer> numList= new LinkedList<>(); 		
       
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);
      
        System.out.println("\n\nUsing List Iterator:");
	ListIterator <Integer> it1= numList.listIterator();
	while(it1.hasNext())
	{
		int ele=it1.next();
		System.out.println(""+ele);
	}
        
        System.out.println("First Element:"+numList.getFirst());
        
        System.out.println("Last Element:"+numList.getLast());
        
        numList.addFirst(100);
        System.out.println("\n\nUsing Syso:"+numList);
        numList.addLast(150);
        System.out.println("\n\nUsing Syso:"+numList);
		 
      
          int ele=numList.element();
          System.out.println("\n\nUsing element, First Element:"+ele);
        	
      

	}

}