package algorithms;

import java.util.Scanner;

public class UF {

	private int[] id;
	
	public UF(int size) {
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
		// if both the nodes pointed by i & j are same, then connected
		if (id[i] == id[j]) {
			System.out.println("Already Connected");
			return 0;
		}
		// else the jvalue must be written to all nodes having ivalue
		int ivalue = id[i];
		int jvalue = id[j];
		for (int k=0;k<id.length;k++) {
			if (id[k] == ivalue) {
				id[k] = jvalue;
			}
		}
		return -1;
	}
	
	public void printUF() {
		for (int i=0; i<id.length;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i=0; i<id.length;i++) {
			System.out.print(id[i] + " ");
		}
		System.out.println();
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
			uf.printUF();
		}
	}
}
