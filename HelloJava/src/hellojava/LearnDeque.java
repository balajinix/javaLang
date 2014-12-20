package hellojava;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnDeque {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for (int i=1;i<11;i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int val = stack.peek();
			System.out.println(val);
			
			val = stack.pop();
			System.out.println(val);
			
			}
	}
}
