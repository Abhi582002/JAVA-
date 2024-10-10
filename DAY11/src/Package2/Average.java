package Package2;

public class Average<T extends Number> 
{
	T []arr;
	
	public Average(T[]arr)
	{
		super();
		this.arr = arr;
	}
	public double average()
	{
		double sum = 0.0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum +arr[i].doubleValue();
		}
		return sum/arr.length;
	}
	public static void main(String[]args)
	{
		Integer iArr [] = {10,40,60,90};
		Average <Integer> iob = new Average<Integer>(iArr);
		System.out.println(iob.average());
		
		Double dArr [] = {12.1,52.6,56.9,98.4};
		Average <Double> dob = new Average<Double>(dArr);
		System.out.println(dob.average());
	}
}
