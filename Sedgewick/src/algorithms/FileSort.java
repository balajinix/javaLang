package algorithms;

import java.io.File;
import java.util.Scanner;

public class FileSort {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String line = userInput.nextLine();
		File directory = new File(line);
		if (directory.exists() && directory.isDirectory()) {
			System.out.println("List of files in " + line);
		} else {
			System.out.println(line + ": No such directory.");
			return;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			System.out.println(file.getPath());
		}
	}

}
