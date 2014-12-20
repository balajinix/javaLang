package algorithms;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class KnuthShuffle {
	private static void printArray(Vector<Integer> array) {
		for (Integer i : array)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int n = userInput.nextInt();
		Vector<Integer> array = new Vector<Integer>();
		for (int i=0;i<n;i++)
			array.add(i+1);
		for (int i=0;i<n;i++) {
			double r = Math.random();
			int j = (int) (i * r);
			System.out.println("Random number: " + j);
			Collections.swap(array, i, j);
			printArray(array);
		}
	}

}
