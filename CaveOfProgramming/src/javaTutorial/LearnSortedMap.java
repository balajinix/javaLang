package javaTutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnSortedMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		System.out.println("hashmap:\n");
		testMap(hashMap);
		System.out.println("\nlinkedHashMap:\n");
		testMap(linkedHashMap);
		System.out.println("\ntreeMap:\n");
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(100, "Dog");
		map.put(4, "Cat");
		map.put(53, "Tiger");
		for (Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
}
