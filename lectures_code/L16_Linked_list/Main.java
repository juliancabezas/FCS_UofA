class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//System.out.println("Value " + list.head.value);
		//System.out.println("Next node " + list.head.next);
		list.print(); //

		list.addTail(new Node(2));
		list.addHead(new Node(5));
		list.addHead(new Node(8));
		list.print(); // 8 -> 5 -> 2
		list.addTail(new Node(6));
		list.addTail(new Node(9));
		list.print(); // 8 -> 5 -> 2 -> 6 -> 9
		list.delete(8);
		list.print(); // 5 -> 2 -> 6 -> 9
		list.delete(9);
		list.print(); // 5 -> 2 -> 6
		list.delete(11);
		list.print(); // 5 -> 2 -> 6
		list.delete(2);
		list.print(); // 5 -> 6
		list.delete(5);
		list.print(); // 6
		list.delete(6);
		list.print(); //
		list.delete(8);
		list.print(); //

	}
}