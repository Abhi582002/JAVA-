package Package4;

public class NegativeNumberException extends Exception
{
	String msg;
	public NegativeNumberException()
	{
		msg = "NegativeNumberException";
	}
	public NegativeNumberException(String msg)
	{
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		return msg;
	}
	@Override
	public String getMessage()
	{
		return "NegativeNumberException";
	}
}

