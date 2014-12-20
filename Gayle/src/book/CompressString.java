package book;

public class CompressString {

	public static String compress(String orig) {
		if (orig.length() <= 2) return orig;
		int count = 1;
		StringBuffer sb = new StringBuffer();
		char ch = orig.charAt(0);
		for (int i=1;i<orig.length();i++) {
			if (orig.charAt(i) == ch) {
				count++;
			} else {
				sb.append(ch); sb.append(count);
				ch = orig.charAt(i); count = 1;
			}
		}
		sb.append(ch); sb.append(count);
		String str = sb.toString();
		if (str.length() < orig.length()) return str; 
		return orig;
	}
	public static void main(String[] args) {
		System.out.println(compress("aabcccccaaa"));
	}

}
