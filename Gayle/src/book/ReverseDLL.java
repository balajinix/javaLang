package book;

public class ReverseDLL {
	
	public static class Node {
		public int item;
		public Node next;
		public Node prev;
		public Node(int i) {
			item = i;
			next = null;
			prev = null;
		}
	}

	public static Node reverseDLL(Node head) {
		while (head != null) {
			Node next = head.next;
			head.next = head.prev;
			head.prev = next;
			if (next == null) return head;
			head = next;
		}
		return null;
	}
	
	public static Node reverseSLL(Node head) {
		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			if (next == null) return current;
			current = next;
		}
		return null;
	}
	public static void main(String[] args) {
		Node tail = null;
		Node head = null;
		System.out.println("Linked List");
		for (int i=1;i<=3;i++) {
			Node current = new Node(i);
			current.prev = tail;
			current.next = null;
			if (head == null) head = current;
			if (tail != null)
				tail.next = current;
			tail = current;
		}
		Node runner = head;
		while (runner != null) {
			System.out.println(runner.item);
			runner = runner.next;
		}
		head = reverseDLL(head);
		runner = head;
		System.out.println("Reverse DLL");
		while (runner != null) {
			System.out.println(runner.item);
			runner = runner.next;
		}
		head = reverseSLL(head);
		runner = head;
		System.out.println("Reverse SLL");
		while (runner != null) {
			System.out.println(runner.item);
			runner = runner.next;
		}
	}

}
