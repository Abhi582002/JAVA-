package Package1;

import java.util.*;
public class PropertiesDemo 
{
  public static void main(String[] args) 
	{
	  
	  Properties p=new Properties();
	  
	  p.put("Name","Amit");
	  p.put("Add","Pune");
	  p.put("Mno","985465478");
	
	  String ename=p.getProperty("Name");
	  String eadd=p.getProperty("Add");
	  String emno=p.getProperty("Mno");
	  
	  System.out.println("Name:"+ename);
	  System.out.println("Address:"+eadd);
	  System.out.println("Mob No:"+emno);
	  
	  
		
	}

}
