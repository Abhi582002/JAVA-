package Package2;

public class Average1 <T extends Number> 
{
T []arr;
	
	public Average1(T[]arr)
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
	public boolean isSameAvg(Average1<?> ob)//Wild Card Character.
	{
		if(this.average()==ob.average())
			return true;
		
		return false;
	}
	public static void main(String[]args)
	{
		Integer iArr [] = {10,40,60,90};
		Average1 <Integer> iob = new Average1<Integer>(iArr);
		
		Double dArr [] = {12.1,52.6,56.9,98.4};
		Average1 <Double> dob = new Average1<Double>(dArr);

		if(iob.isSameAvg(dob))
			System.out.println("Same Averages");
		else
			System.out.println("Different Averages");
	}
}
