package javaTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIterator {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("rabbit");
		animals.add("dog");

		Iterator<String> iter = animals.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter.remove();
		for(String animal : animals) {
			System.out.println(animal);
		}
	}

}
