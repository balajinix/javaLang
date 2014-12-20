import java.util.HashSet;


public class LearnHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(3);
		set.add(10);
		set.add(20);
		set.add(30);
		if (set.contains(20) == true)
			System.out.println("Exists");
	}
}
