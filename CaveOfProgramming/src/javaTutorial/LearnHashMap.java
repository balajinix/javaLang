package javaTutorial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(3, "Three");
		map.put(11, "Eleven");
		map.put(11, "eleven");
		map.put(2, "Two");
		// one way to access the values with keys
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
		// traverse over key, value pairs
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}
	
	HashSet<Long> hs = new HashSet<Long>();
	
}
