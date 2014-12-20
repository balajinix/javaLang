package javaTutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Worker implements Comparable<Worker> {
	private String name;
	public Worker(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Worker arg0) {
		if (name.length() > arg0.name.length())
			return 1;
		else if (name.length() < arg0.name.length())
			return -1;
		return name.compareTo(arg0.name);
	}
}

public class LearnComparable {

	public static void main(String[] args) {
		List<Worker> list = new ArrayList<Worker>();
		SortedSet<Worker> set = new TreeSet<Worker>();
		addElements(list);
		showElements(list);
		addElements(set);
		showElements(set);
	}

	private static void addElements(Collection<Worker> col) {
		col.add(new Worker("Joe"));
		col.add(new Worker("Ronie"));
		col.add(new Worker("Mike"));
		col.add(new Worker("Clare"));
		col.add(new Worker("Sue"));
	}
	
	private static void showElements(Collection<Worker> col) {
		for (Worker p: col) {
			System.out.println(p);
		}
	}
}
