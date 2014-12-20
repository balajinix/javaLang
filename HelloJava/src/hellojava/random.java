package hellojava;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		int min=1;
		int max=5;
		Random rand = new Random();
		int r = (Integer) rand.nextInt((max-min)+1) + min;
		System.out.println(r);
	}

}
