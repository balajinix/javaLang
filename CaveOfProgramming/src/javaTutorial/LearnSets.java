package javaTutorial;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		printSets("HashSet", set1);
		Set<String> set2 = new LinkedHashSet<String>();
		printSets("linkedSet", set2);
		Set<String> set3 = new TreeSet<String>();
		printSets("TreeSet", set3);
		//System.out.println(set1);
		Set<String> set11 = new HashSet<String>();
		set11.add("tiger");
		set11.add("mouse");
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set11);
		System.out.println(intersection);
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set11);
		System.out.println(difference);
	
	}

	public static void printSets(String type, Set<String> set1) {
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		System.out.println(set1);
	}

}
