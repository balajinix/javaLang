import java.net.*;
import java.io.*;

public class URLTest {

	public static void main(String[] args) throws MalformedURLException {
		String url_name = "http://www.yahoo.com/";
		URL u = new URL(url_name);
		try {
			InputStream ins = u.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(ins));
			System.out.println(br.readLine());
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
	
	
}
