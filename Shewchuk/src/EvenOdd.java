/**
 * 
 */

/**
 * @author gbalaji
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		int j=-1;
		if (args.length > 0) {
        	System.out.println(args[0]);
    		Integer i = Integer.parseInt(args[0]);
    		j = Integer.valueOf(i);
    		
        } else {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	//String s = br.readLine();
        	try {
        		j = Integer.parseInt(br.readLine());
        	} catch (NumberFormatException nfe) {
        		System.err.println("Invalid Format!");
        	}
        }
		if (j % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
