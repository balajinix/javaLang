package hellojava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LearnFileStream {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		String filename = "/Users/gbalaji/toRead.txt";
		br = new BufferedReader(new FileReader(filename));
		//br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}
}
