package practice;

import java.util.Scanner;

public class DistanceBetweenWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] tokens = sentence.split("\\s|\\n]", -1);
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();
		int min = Integer.MAX_VALUE;
		int pos = 0;
		String prev_word = "";
		int prev_pos = -1;
		for (String word : tokens) {
			System.out.println(word);
			++pos;
			if (word.equals(word1) || word.equals(word2)) {
				
				if (prev_word.isEmpty()) {
					prev_word = word;
					prev_pos = pos;
					continue;
				}
				if (prev_word.equals(word)) {
					prev_pos = pos;
					continue;
				} else {
					if ((pos - prev_pos) < min)
						min = pos - prev_pos;
				}
				prev_word = word;
			}
		}
		System.out.println(min);
	}

}
