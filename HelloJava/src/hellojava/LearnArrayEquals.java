package hellojava;

import java.util.Arrays;

public class LearnArrayEquals {
	public static void main(String[] args) {
		int[] a = {1, 2, 4};
		int[] b = {1, 4, 5};
		int[] c = {1, 2, 4};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
	}
}
