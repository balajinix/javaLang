package algorithms;

public class Deck {
	public static void main(String[] args) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
		                  "Jack", "Queen", "King", "Ace"
		                };
		String[] deck = new String[ranks.length * suits.length];
		for (int i = 0; i < ranks.length; i++) 
		    for (int j = 0; j < suits.length; j++) {
		        deck[suits.length*i + j] = ranks[i] + " of " + suits[j]; 
				System.out.println(ranks[i] + " of " + suits[j]);
		    }
	}
}
