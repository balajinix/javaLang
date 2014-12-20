/**
 * 
 */

/**
 * @author gbalaji
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i;
		int j=0;
		while (j<3) {
			j++;
			i = new Integer(j+10);
		    System.out.println("Hello World " + i);
		}
		String name = "1";
		Integer k = Integer.parseInt(name);
		System.out.println(k);
	}

}
