package javaTutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnLists {
	
	public static void main(String[] args) {
		/*
		List<Integer> myList = new ArrayList<Integer>();
		for (int i=0;i<5;i++) {
			myList.add((int) (Math.random()*100 + 1));
		}
		for (Integer i : myList)
			System.out.println(i);
		*/
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		// sending arraylist
		measureTimings("ArrayList", arrayList);

		measureTimings("LinkedList", linkedList);
	}
	
	public static void measureTimings(String type, List<Integer> list) {
		for (int i=0;i<1E5;i++) {
			list.add(i);
		}
		//list.remove(0);
		long start = System.currentTimeMillis();
		/*for (int i=0; i<1E5;i++) {
			list.add(i);
		}*/
		for (int i=0; i<1E5;i++) {
			list.add(list.size()-100,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(type + " takes " + (end-start) + " ms");
	}
	
}
