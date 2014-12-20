package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
	public static void main(String[] args) {
		int a[] = {1, 2, 2, 2, 3, 4, 4, 6};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0;i<a.length;i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.printf("%s %d %3.2f\na\n", "balaji", 1, 0.3456);
	}
}
