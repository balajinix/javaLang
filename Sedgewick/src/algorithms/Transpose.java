package algorithms;

import java.util.Arrays;

public class Transpose {
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
		
		for (int i=0; i<a.length;i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		
		for (int i=0;i<a.length;i++) {
			for (int j=i;j<a.length;j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
		for (int i=0; i<a.length;i++) {
			System.out.println(Arrays.toString(a[i]));
		}

	}
}
