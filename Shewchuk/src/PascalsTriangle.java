
public class PascalsTriangle {

	private int array[][];
	private int arraySize;
	
	public void createPT(int n) {
		arraySize = n;
		array = new int[n][];
		for (int i=0;i<n;i++) {
			array[i] = new int[i+1];
		    array[i][0] = 1;
		    for (int j=1;j<i;j++) {
		    	array[i][j] = array[i-1][j-1] + array[i-1][j];
		    }
		    array[i][i] = 1;
		}
	}
	
	public void printPT() {
		for (int i=0;i<arraySize;i++) {
			for (int j=0;j<=array[i].length-1;j++) {
				System.out.print("|" + array[i][j]);
			}
			System.out.println("|");
		}
	}
	
	public static void main(String[] args) {
		PascalsTriangle pt = new PascalsTriangle();
		pt.createPT(10);
		pt.printPT();
	}

}
