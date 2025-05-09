public class Node<T> {

	private T item; // item = data = payload
	private Node<T> next; // link = pointer = reference to another Node (in this case, the next Node)

	// constructor #1
	public Node(T item) {
		this.item = item;
		next = null;
	}
	
	// constructor #2
	public Node(T item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	// getters
	public T getItem() { return item; }
	public Node getNext() { return next; }
	
	// setters
	public void setItem(T item) { this.item = item; }
	public void setNext(Node next) { this.next = next; }

}