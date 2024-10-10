package ArrayList;

import java.util.Stack;

public class StackDemo
{
	public static void main(String[] args)
	{
		
		Stack<Integer> numSt = new Stack<Integer>();
		numSt.push(30);
		numSt.push(70);
		numSt.push(40);
		numSt.push(10);
		numSt.push(40);
		
		System.out.println("Top of Stack:" + numSt.peek());
		
		int idx = numSt.search(70);
		System.out.println("Index no of element 70 from top: " + idx);
		
		while(!numSt.empty())  // it will check weather stack is empty or not
		{
			int ele = numSt.pop();
			System.out.println(ele);
		}
		
	}

}