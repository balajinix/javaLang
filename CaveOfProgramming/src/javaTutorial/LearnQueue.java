package javaTutorial;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LearnQueue {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		stack.push("india");
		stack.pop();
		stack.peek();
		Queue<String> q1 = new ArrayBlockingQueue<String>(3);
		
		q1.add("fox");
		q1.add("dog");
		q1.add("tiger");
		try {
			q1.add("lion");
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException");
		}
		Iterator<String> iter = q1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter.remove();
		for (String str: q1) {
			System.out.println(str);
		}
	}
}
