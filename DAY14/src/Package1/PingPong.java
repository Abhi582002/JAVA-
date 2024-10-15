package Package1;

public class PingPong extends Thread 
{
   @Override
	public void run() 
    {
	
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"\t" + Thread.currentThread().getName());
		}
		System.out.println("Done");
	}

	public static void main(String[] args) 
	{
	
		Thread t1 = new PingPong();
		Thread t2 = new PingPong();
		
		t1.setName("Ping");
		t2.setName("Pong");
		
		t1.start();
		t2.start();
	}

}