package book;

import java.util.Scanner;

public class StringPermutation {
	
	public static void recurse(String str, int level, String res) {
		//System.out.println(str + " " + level + " " + res);
		if (level == str.length()) {
			System.out.println(res);
		}
		for (int i=0; i<str.length();i++) {
			if (res.contains(String.valueOf(str.charAt(i)))) continue;
			String res1 = res + str.charAt(i);
			recurse(str, level+1, res1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		if (str.isEmpty()) return;
		recurse(str, 0, "");
	}

}
