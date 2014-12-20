package book;

import java.util.Scanner;

public class UnsortedSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		int max = -1;
		int min = n;
		for (int i=0;i<n;i++) {
			for (int j=i;j>0;j--) {
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					if (j > max) max = j;
					if (j-1 < min) min = j-1;
				}
			}
		}
		if (max != -1)
		System.out.println(min + " " + max);
	}

}
