public class CandyMain1 {

	public static void main(String[] args) {

		// declare a linked list interface and init. to a linked list
		LinkedListInterface<Candy> ll = new LinkedList<Candy>();

		Candy c1 = new Candy("Twix", 12345);
		Candy c2 = new Candy("Mars", 12346);
		Candy c3 = new Candy("Jolly Ranchers", 12347);

		ll.newHead(c1);
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.newHead(c2);
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.newHead(c3);
		ll.print();
		System.out.println("Size: " + ll.size());

		ll.deleteHead();
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.deleteHead();
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.deleteHead();
		ll.print();
		System.out.println("Size: " + ll.size());

		ll.newTail(c1);
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.newTail(c2);
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.newTail(c3);
		ll.print();
		System.out.println("Size: " + ll.size());

		ll.deleteTail();
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.deleteTail();
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.deleteTail();
		ll.print();
		System.out.println("Size: " + ll.size());

		ll.newHead(c1);
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.newHead(c2);
		ll.print();
		System.out.println("Size: " + ll.size());
		ll.newHead(c3);
		ll.print();
		System.out.println("Size: " + ll.size());

		ll.deleteItem(c2);
		ll.print();
		System.out.println("Size: " + ll.size());

		System.out.println("Does the linked list contain item " + c2 + "?" + ll.contains(c2));

		System.out.println("Size: " + ll.size());

		ll.clear();
		ll.print();
		System.out.println("Size: " + ll.size());

		System.out.println("Is the linked list empty? " + ll.isEmpty());
		System.out.println("Size: " + ll.size());

		System.out.println("New size: " + ll.size());

		// Complete all methods in the LinkedList.java class
		// Call each method and be sure to call print after each call
		// Be sure each call is working correctly
	}

}
