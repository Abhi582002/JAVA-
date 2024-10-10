package Package1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{
  public static void main(String[] args) 
	{
   
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		m.put(1,1000);
		m.put(3,2000);
		m.put(2,3000);
		m.put(5,1000);
		m.put(4,5000);
				
		System.out.println("Using Syso:\n"+m);
		/*
		// single element using get method
		int no = m.get(3);
		System.out.println("value of key: " +no);
		
		Iterator <Integer>  it = m.keySet().iterator();
		while(it.hasNext())
		{
		  int n=it.next();
		  System.out.println(n+": "+m.get(n));
		}
		
       */		
		
		
		
		System.out.println("Using Map.Entry:\n");
		
		 // Get a set of the entries
	    
		Set setdata = m.entrySet();
	      
	      // Get an iterator
       Iterator i = setdata.iterator();
	     
	   // Display elements 
       while(i.hasNext()) 
	      {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	    
		
		
	}
}
