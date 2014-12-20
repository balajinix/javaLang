package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayInit {
	public static void reverse(List<Double> list) {
		Collections.reverse(list);
	}
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			//System.out.println(d[i]);
		}
		List<Double> list = new ArrayList<Double>();
		list.add((double) 10);
		list.add((double) 20);
		System.out.println(list);
		reverse(list);
		System.out.println(list);
		System.out.println((int) (10 + Math.random() * (20-10)));
	}
}
