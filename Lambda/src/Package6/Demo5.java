//Create An ArrayList of 7 Integer.Filter the Element that Are Divisible by 5.Display the Numbers


package Package6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Demo5 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new  ArrayList<>(Arrays.asList(56,85,63,295,456,175,23));
		List<Integer> res = list.stream()
							.filter(value ->value % 5 == 0)
							.collect(Collectors.toList());
							
							System.out.println(Arrays.toString(res.toArray()));

	}

}
