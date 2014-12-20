import java.util.Scanner;

public class ArrayStructures {
	private static int arraySize=0;
	private int[] array;
	static Scanner userInput = new Scanner(System.in);
	ArrayStructures() {
		System.out.println("Enter the array size:");
		if (userInput.hasNextInt()) {
			arraySize = userInput.nextInt();
		} else {
			System.out.println("Invalid entry");
		}
		// now we dynamically allocate memory for the array
		array = new int[arraySize];
		for (int i=0;i<arraySize;i++) {
	    	array[i] = (int) (Math.random() * 100 + 1);
	    }
	}
	private void printArray() {
		System.out.println("----------");
		for (int i=0;i<arraySize;i++) {
			System.out.println("| " + i + " | " + array[i] + " |");
		}
		System.out.println("----------");
	}
	
	private void deleteAndMove(int index) {
		for (int i=0;i<arraySize;i++) {
			if (i == index) {
				for (int j = i+1; j < arraySize; i++,j++) {
					array[i] = array[j];
				}
				arraySize-=1;
				break;
			}
		}
	}
	public static void main(String[] args) {
		ArrayStructures myArray = new ArrayStructures();
		myArray.printArray();
		System.out.println("Enter index to delete:");
		if (userInput.hasNextInt()) {
			int del_index = userInput.nextInt();
	        myArray.deleteAndMove(del_index);
	        myArray.printArray();
		} else {
			System.out.println("No value entered.");
		}
	}
}

