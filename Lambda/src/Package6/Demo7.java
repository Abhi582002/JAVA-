//Sort a list created in 2nd problem statement first in Ascending order and then Descending order .
//Display the Final list in each case.Print the Total number of elements in the List.


package Package6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Demo7 
{
	public static void main(String[]args)
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(554,151,326,478,62));
		System.out.println("Ascending Order:");
		list.stream().sorted()
		.forEach(System.out::println);
		
		System.out.println("\nDescending Order:");
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}
}
