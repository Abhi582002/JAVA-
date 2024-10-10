package Package6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 
{
	public static void main(String[]args)
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(52,11,33,44,22));
		System.out.println("Ascending Order:");
		list.stream().sorted()
		.forEach(System.out::println);
		
		System.out.println("\nDescending Order:");
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
