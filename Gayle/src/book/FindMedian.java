package book;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FindMedian {

	public static void balanceHeaps(Queue<Integer> heap1, Queue<Integer> heap2) {
		int diff = heap1.size() - heap2.size();
		if (diff == 0 || diff == 1 || diff == -1) return;
		if (diff > 0) {
			while (!heap1.isEmpty()) {
				diff = heap1.size() - heap2.size();
				if (diff == 0 || diff == 1 || diff == -1) return;
				heap2.add(heap1.remove()); diff--;
			}
		} else {
			while (!heap2.isEmpty() && diff <= 0) {
				diff = heap1.size() - heap2.size();
				if (diff == 0 || diff == 1 || diff == -1) return;
				heap1.add(heap2.remove());
				diff++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Queue<Integer> maxHeap = new PriorityQueue<Integer>(n/2+1, Collections.reverseOrder());
		Queue<Integer> minHeap = new PriorityQueue<Integer>(n/2+1);
		for (int i=0;i<n;i++) {
			int val = scanner.nextInt();
			if (maxHeap.isEmpty() && minHeap.isEmpty()) {
				maxHeap.add(val); continue;
			}
			if (!maxHeap.isEmpty() && val <= maxHeap.peek()) {
				while (!maxHeap.isEmpty() && maxHeap.peek() > val) {
					minHeap.add(maxHeap.remove());
				}
				maxHeap.add(val);
			} else {
				while (!minHeap.isEmpty() && val > minHeap.peek()) {
					maxHeap.add(minHeap.remove());
				}
				minHeap.add(val);
			}
			balanceHeaps(maxHeap, minHeap);
		}
		scanner.close();
		if (maxHeap.size() == minHeap.size()) {
			System.out.println((maxHeap.peek() + minHeap.peek())/2);
		} else if (maxHeap.size() > minHeap.size()){
			System.out.println(maxHeap.peek());
		} else {
			System.out.println(minHeap.peek());
		}
	}

}
