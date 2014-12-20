package book;

public class RotateMatrix {
	
	public static int rotateMatrix(int[][] a, int si, int sj, int ei, int ej) {
		if ((ei - si) <= 1) return 1;
		// this doesn't achieve the rotation :( need to fix.
		for (int i=0; i<=(ei-si); i++) {
			int temp = a[si][sj+i];
			a[si][sj+i] = a[ei-i][sj];
			a[ei-i][sj] = a[ei][ej-i];
			a[ei][ej-i] = a[ei-i][ej];
			a[ei-i][ej] = temp;
		}
		return rotateMatrix(a, si+1, sj+1, ei-1, ej-1);
	}
	
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++)
			System.out.print(a[i][j] + " ");
			System.out.println();
		}
		rotateMatrix(a,0,0,2,2);
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++)
			System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

}
