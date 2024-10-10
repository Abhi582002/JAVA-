package ArrayList;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {

	
	public static void main(String[] args) {
		
		Queue<Integer> numQ = new PriorityQueue<Integer>();
		
		numQ.add(100);
		numQ.offer(500);
		numQ.offer(60);
		numQ.add(100);
		numQ.offer(1200);
		
		System.out.println("Peek element: " + numQ.peek());
		
		System.out.println("Retriving elements from queue:");
		
		while(!numQ.isEmpty())
		{
			Integer iob = numQ.poll();  //remove()
			System.out.println(iob);
		}
		
	}

}