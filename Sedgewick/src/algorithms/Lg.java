package algorithms;

import java.util.Scanner;

public class Lg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			double value = scanner.nextInt();
			if (value == -1) break;
			System.out.println(Math.log(value)/Math.log(2));
		}
	}
}
