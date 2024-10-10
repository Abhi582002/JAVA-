package Package1;

import java.util.*;
public class PhoneDirectory 
{
 public static void main(String[] args) 
 {
  	    Map<String,Long> m = new Hashtable<String,Long>();
		
		m.put("Ashish Kumar", 9867563422L);
		m.put("Shreyaa Patel", 7645434324L);
		m.put("Madhuri Khanna", 8899340000L);
		m.put("Rahul Patil", 9011557342L);
		
		m.put("Rahul Patil", 900000001L);  
		// duplicate keys not allowed
		//this entry replace previous value
		
		
		System.out.println("Using Syso:\n"+m);
		long phNo = m.get("Rahul Patil");
		
		System.out.println("Phone no of Rahul Patil: " + phNo);
		
	} 

}
