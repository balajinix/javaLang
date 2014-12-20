package algorithms;

import java.util.Scanner;

// Quick Union

public class UF2 {

	private int[] id;
	
	public UF2(int size) {
		//size = size;
		id = new int[size];
		for (int i=0;i<size;i++) {
			id[i] = i;
		}
	}
	
	public int connectNodes(int i, int j) {
		// basic validation
		if (i<0 || j < 0 || i >= id.length || j >= id.length) {
			return -1;
		}
		
		int iRoot = findRoot(i);
		int jRoot = findRoot(j);
		
		// if both the nodes pointed by i & j are same, then connected
		if (iRoot == jRoot) {
			System.out.println("Already Connected");
			return 0;
		}
		
		id[iRoot] = jRoot;
		
		return jRoot;
	}

	private int findRoot(int p) {
		while (id[p] != p) p = id[p];
		return p;
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter array size:");
		
		// get array max size
		int size = Integer.parseInt(userInput.nextLine());
		UF uf = new UF(size);
		
		// initially array should have same values as index
		uf.printUF();
		
		// get user inputs now
		String line;
		while (userInput.hasNextLine()) {
			// input can have two integers per line
			line = userInput.nextLine();
			
			// if user wants to exit, so be it
			if (line.equals("exit")) {
				break;
			}
			
			// there shd be a better way to do this
			String[] str_a = line.split(" ");
			if (str_a.length != 2) {
				System.out.println("Error: " + line);
				return;
			}
			
			// this will create connection or tell if its connected
			int i = Integer.parseInt(str_a[0]);
			int j = Integer.parseInt(str_a[1]);
			uf.connectNodes(i, j);
		}
	}
}
