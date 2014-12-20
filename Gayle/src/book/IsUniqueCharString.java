package book;

public class IsUniqueCharString {

	public static void main(String[] args) {
		String str = "balji";
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch, i+1) != -1) {
				System.out.println(ch + " occurs more than once. String not unique.");
				return;
			}
		}
		System.out.println("Unique");
	}

}
