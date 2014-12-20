package javaTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyCompartor implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return (arg0 == arg1) ? 0 : (arg0 > arg1) ? -1 : 1;
	}
	
}

class LearnSorting {

	public static void main(String[] args) {
		//lists();
		objects();
	}
	
	public static void lists() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(1);
		list.add(6);
		Collections.sort(list, new MyCompartor());
		System.out.println(list);
	}
	
	public static void objects() {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(3, "Veeru"));
		list.add(new Person(2, "Catherine"));
		list.add(new Person(1, "Bob"));
		Collections.sort(list, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return (p1.getId() == p2.getId()) ? 0 : ((p1.getId() > p2.getId()) ? 1 : -1);
			}
		});
		System.out.println(list);
	}

}
