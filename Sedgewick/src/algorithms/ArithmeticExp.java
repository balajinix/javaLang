package algorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArithmeticExp {
	
	public static int compute(char c, int a, int b) {
		switch (c) {
		case '+': return a + b;
		case '-': return a - b;
		case '*': return a * b;
		case '/': return a / b;
		case '%': return a % b;
		}
		return -1;
	}
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		Deque<Character> opStack = new ArrayDeque<Character>();
		Scanner inputScanner = new Scanner(System.in);
		String text = inputScanner.nextLine();
		Scanner scanner = new Scanner(text);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int a = scanner.nextInt();
				stack.push(a);
			} else {
				String s = scanner.next();
				char c = s.charAt(0);
				if (c == '(') continue;
				else if (c == ')') {
					if (stack.size() < 1) {
						System.out.println("Error");
						break;
					}
					char op = opStack.pop();
					int value = compute(op, stack.pop(), stack.pop());
					stack.push(value);
				} else {
					opStack.push(c);
				}
			}
		}
		System.out.println(stack.pop());
		scanner.close();
		inputScanner.close();
	}

}
