package ArrayList;

import java.util.*;
public class VectorDemo 
{
  public static void main(String[] args) 
	{
	  Vector <Integer> v=new Vector<Integer>();
	 v.addElement(10);
	 v.addElement(20);
	  v.addElement(30);
	
	  System.out.println("Vector Size:"+v.size()); 
	  System.out.println("Vector Capacity:"+v.capacity());
	  
	  System.out.println("Using Syso:"+v);
	  v.addElement(10);
		 v.addElement(20);
		  v.addElement(30);
	  v.addElement(30);
	  v.addElement(10);
		 v.addElement(20);
		  v.addElement(30);
		  v.addElement(30);
	  
	  System.out.println("Using Syso:"+v);
	  System.out.println("Vector Size:"+v.size()); 
	  System.out.println("Vector Capacity:"+v.capacity());
	  
	  v.remove(1);
	  v.remove(2);
	  System.out.println("Vector Size:"+v.size()); 
	  System.out.println("Vector Capacity:"+v.capacity());
	  
	  
	  	  
	  System.out.println("Using Enumeration:");
	  //hasMoreElements(),nextElement()
	  Enumeration<Integer> enm=v.elements();
	  while(enm.hasMoreElements())
	  {
		  int num=enm.nextElement();
		  System.out.println(""+num);
	  }
	  
	  
	  
	  
	  
		
	}

}
