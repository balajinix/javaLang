
public class LinkedList {
	
	public class ListNode {
		private int item;
		public ListNode next;
		public ListNode(int value) {
			item = value;
			next = null;
		}
	}
	
	private int listSize;
	private ListNode head;
	
	// constructor
	public LinkedList() {
		listSize = 0;
		head = null;
	}
	
	public void insertItem(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		listSize++;
	}
	
	public int deleteItem(int value) {
		if (head.item == value) {
			head = head.next;
			listSize--;
			return 1;
		}
		ListNode temp = head;
		while (temp.next != null) {
			if (temp.next.item == value) {
				temp.next = temp.next.next;
				listSize--;
				return 1;
			}
		}
		return 0;
	}
	
	public void printList() {
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.item);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();
		myList.insertItem(10);
		myList.insertItem(5);
		//myList.printList();
		myList.deleteItem(19);
		myList.printList();
	}

	public int getListSize() {
		return listSize;
	}

}
