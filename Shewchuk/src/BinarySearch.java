import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
	
	private static int getIndex(int[] array, int l, int r, int seek) {
		if (r < l) {
			return -1;
		}
		int m = (l + r)/2;
		if (seek == array[m]) {
			return m;
		} else if (seek < array[m]) {
			return getIndex(array, l, m-1, seek);
		} else {
			return getIndex(array, m+1, r, seek);
		}
	}
	
	public static void main(String[] args) {
		int a = 100;
		assert(a == 100):"Assert failed";
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int arraySize=10;
		//BinarySearch bs = new BinarySearch();
		System.out.println("Enter a value");
		Scanner userInput = new Scanner(System.in);
		int value = userInput.nextInt();
		int index = BinarySearch.getIndex(array, 0, arraySize-1, value);
		System.out.println(index);
		System.out.println(Arrays.binarySearch(array, 5));
		// shuffle
		int i=0;
		for (i=0;i<array.length;i++) {
			int r = (int) (i + Math.random() * (array.length - 1 - i));
			//System.out.println(r + " is the random value");
			int temp = array[i]; array[i] = array[r]; array[r] = temp;
		}
		
		System.out.println(Arrays.binarySearch(array, 5));
	}

}
