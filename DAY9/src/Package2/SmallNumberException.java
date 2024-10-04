package Package2;

public class SmallNumberException extends Exception
{
	String msg;
	public SmallNumberException()
	{
	msg = "SmallNumberException";
	}
	@Override
	public String toString()
	{
		return msg;
	}
}
