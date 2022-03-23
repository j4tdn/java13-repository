package testing;

import java.util.Queue;
import java.util.Stack;

public class Ex02 {
	public static void main(String[] args) {
		// STACK: FILO ===> KTT
		// QUEUE: FIFI
		Stack<Integer> stack = new Stack<>();
		// Queue<Integer> queue = new ...
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		Integer pop = stack.pop();
		System.out.println("pop: " + pop);
		
	}
}
