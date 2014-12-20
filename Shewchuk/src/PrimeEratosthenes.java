import java.util.Scanner;

public class PrimeEratosthenes {

	public void printPrimes(int n) {
		// this method is supposed to print all prime numbers till (including) n
		boolean prime[] = new boolean[n+1];
		for (int i=2;i<=n;i++) {
			prime[i] = true;
		}
		for (int divisor = 2; divisor*divisor <= n; divisor++) {
			if (prime[divisor]) {
				for (int i=2*divisor; i<=n;i = i + divisor) {
					prime[i] = false;
				}
			}
		}
		for (int i=2;i<=n;i++) {
			if (prime[i]) {
				System.out.print(i + " ");	
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeEratosthenes p = new PrimeEratosthenes();
		System.out.println("Enter n:");
		Scanner userInput = new Scanner(System.in);
		if (userInput.hasNextInt()) {
			int i = userInput.nextInt();
			p.printPrimes(i);
		}
	}

}
