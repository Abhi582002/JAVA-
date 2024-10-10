package Package6;

import java.util.stream.Stream;

public class Demo4 
{

	public static void main(String[] args) 
	{
		System.out.println("Parallel stream and foreach:");
		Stream.of("AAA","BBB","CCC")
		.parallel()
		.forEach(x -> System.out.println("value : "+x));
		
		System.out.println();
		
		System.out.println("Parallel stream and forEachOrdered:");
		Stream.of("AAA","BBB","CCC")
		.parallel()
		.forEachOrdered (x -> System.out.println("value:" +x));
	}

}
