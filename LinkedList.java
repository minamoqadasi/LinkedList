public class LinkedList<T> implements LinkedListInterface<T> {

	private Node<T> head; // the head Node is the entry point to the Linked List
	private int size; // number of items stored in the Linked List

	public void newHead(T item) {
		if(item == null) { //check if item is null
			System.out.println("Item is null, unable to create a new head.");
			return;
		}
		head = new Node<T>(item, head); //if not null, create a new Node for head
		System.out.println("New head added.");
		size++;													//(item, head) is showing the new Node and head is the pointer
	}																	//for the box that has two parts, one is the item and one is the pointer



	public void deleteHead() {
		if(head == null) { // OR isEmpty OR size() == 0, if head is null we don't need to do anything to delete it
			System.out.println("Linked list is empty, unable to delete head.");
		}
		else { //set head to the next Node and it will get rid of the previously assigned head
			head = head.getNext();
			System.out.println("Head was removed, assigned a new head.");
			size--; //size smaller because we have one less item
		}
	}



	public void newTail(T item){
		if(item == null) {
			System.out.println("Item is null, unable to create a new tail.");
			return;
		}
		if(head == null) { //if head is null create new Node with null pointer because it's tail
			head = new Node<T>(item, null);
			System.out.println("New tail was added, the only item in the linked list, so tail is also head.");
			size++;
			return;
		} else {
			Node<T> temp = head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node<T> newTail = new Node<T>(item, null); //how to declare a new Node, since it's for Tail the pointer is null
			temp.setNext(newTail);
		}
		System.out.println("New tail added.");
		size++;
	}



	public void deleteTail() {
		if(head == null) {
			System.out.println("Linked list is empty, unable to delete tail");
			return;
		}
		else if(head.getNext() == null) { //if the ll has only one Node
			head = null;
		} else {
			//IMPORTANT NOTE: if we just keep moving the head, we will lose all the previous info; therefore, use a temporary head to check all the Nodes in the ll
			Node<T> temp = head; //create temporary head so we don't lose all the info in our ll
			while(temp.getNext().getNext() != null) {
				temp = temp.getNext(); //moving through the ll to find the second to last Node
			}
			temp.setNext(null); //now set its next pointer to null which will remove Tail
		}
		System.out.println("Tail removed.");
		size--;
	}



	// delete Node in the middle
	public void deleteItem(T item) {
		if(head == null) { //check if the head is null
			System.out.println("Linked list is empty, unable to delete item.");
			return;
		}
		if(head.getItem().equals(item)) { //check if the item is at the head
			deleteHead();										//then we just call deleteHead() method without any other procedure
			return;
		}
		//make sure the item is not null, before looping
		Node<T> temp = head; //set temporary head
		while(temp.getNext() != null) {
			if(temp.getNext().getItem().equals(item)) {
				temp.setNext(temp.getNext().getNext()); //we're trying to make the pointer skip/jump over the item that user wants to remover
				size--;																	//and that will remove the item because no pointer is pointing at it
				System.out.println("Item removed.");
				return;
			}
			temp = temp.getNext(); //go to next Node
		}
		System.out.println("Item not found.");
		// check if head is null
		// check if item is the head Node
		// if size is > 1, loop, use a temp variable to traverse, look for a matching object,
	}



	public boolean contains(T item) {
		if(item == null) { //check if item is null
			System.out.println("Item is null, unable to check if linked list contains the item.");
			return false;
		}
		Node<T> temp = head; //set temporary head
		while(temp != null) {
			if(temp.getItem().equals(item)) {
				return true;
		  }
		temp = temp.getNext();
  	}
		return false;
	}



	public void clear(){
		head = null;
		size = 0;
	}



	public int size() { //why the size method gives the wrong number
		return size;
	}



	public boolean isEmpty() {
		return size == 0;
	}



	public void print() {
		System.out.print("\n\ n");
		Node<T> temp = head;
		System.out.print("head");
		while(temp != null) {
			System.out.print(" -> " + temp.getItem());
			temp = temp.getNext();
		}
		System.out.print(" -> null\n");
	}

}
