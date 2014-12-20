package algorithms;

public class FixedCapacityStack<Item> {
	private int N;
	private Item[] items;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int cap) {
		items = (Item[]) new Object[cap];
		N = 0;
	}
	public void push(Item new_item) {
		items[N] = new_item;
		N++;
	}
	public Item pop() {
		Item retItem = items[--N];
		items[N] = null;
		return retItem;
	}
	public boolean isEmpty() {
		return (N==0);
	}
	public int size() {
		return N;
	}
	public void print() {
		for (int i=N-1;i>=0;i--) {
			System.out.println(items[i]);
		}
	}
	
	public static void main(String[] args) {
		FixedCapacityStack<Integer> stack = new FixedCapacityStack<Integer>(10);
		for (int i=0;i<10;i++) {
			stack.push(i);
		}
		stack.print();
	}
}
