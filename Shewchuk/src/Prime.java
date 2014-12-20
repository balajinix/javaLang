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

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer i = Integer.parseInt(input);
        //System.out.println(i);
        int j = (int) Math.sqrt(i);
        boolean flag = true;
        for (int k = 2; k <= j; k++) {
        	if (i % k == 0) {
        		System.out.println("Not Prime");
        		int q = i / k;
        		String message = "The factors are: ";
        		Integer qq = new Integer(q);
        		Integer kk = new Integer(k);
        		message = message.concat(qq.toString());
        		message = message.concat(" and ");
        		message = message.concat(kk.toString());
        		System.out.println(message);
        		flag = false;
        		break;
        	}
        }
        if (flag) {
        	System.out.println("Prime");
        }
	}

}
