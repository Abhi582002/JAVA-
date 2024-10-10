//Use Dinctinct{},peek{},limit{},skip{},methods on the list created in the 2nd Problem Statement.

package Package6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 
{

	public static void main(String[] args) 
	{
		 List<Integer> list = new ArrayList<>(Arrays.asList(52, 11, 33, 44, 22, 11, 44, 52));
		 System.out.println("Distinct Values:");
		 list.stream()
         .distinct() // Remove duplicates
         .forEach(System.out::println);
		 
		 System.out.println("\nUsing peek to multiply by 2 and display:");
	      list.stream()
	      .peek(x -> System.out.println("Before multiplying by 2: " + x))
          .map(x -> x * 2) 
          .peek(x -> System.out.println("After multiplying by 2: " + x))
          .forEach(System.out::println);
	      
	      System.out.println("\nFirst 3 elements:");
	        list.stream()
	            .limit(3) 
	            .forEach(System.out::println);
	        
	        
	        System.out.println("\nSkip first 2 elements:");
	        list.stream()
	            .skip(2) 
	            .forEach(System.out::println);
	        
	        
	        System.out.println("\nAscending Order:");
	        list.stream()
	            .sorted() 
	            .forEach(System.out::println);
	        
	        System.out.println("\nDescending Order:");
	        list.stream()
	            .sorted(Comparator.reverseOrder()) 
	            .forEach(System.out::println);
	}

}
