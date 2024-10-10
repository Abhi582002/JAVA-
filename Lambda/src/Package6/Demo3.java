package Package6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Demo3 
{
	public static void main(String[]args)
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> res = list.stream()
				.filter(value -> value % 2 ==0)
				.peek(value -> System.out.println("Filtered "+ value))
				.map(value -> value * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(res.toArray()));
		
		List<Integer> ans = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
//		List<Integer> ans = list.stream()
//				.limit(3)
//				.collect(Collectors.toList());
//		
//		List<Integer> ans = list.stream()
//				.skip(2)
//				.collect(Collectors.toList());
	}

}
