public interface LinkedListInterface<T> {

	public void newHead(T item);

	public void deleteHead();

	public void newTail(T item);

	public void deleteTail();

	public void deleteItem(T item); // delete Node in the middle

	// O(N)
	public boolean contains(T item);

	// O(1)
	public void clear();

	// O(1)
	public int size();

	// O(1)
	public boolean isEmpty();

	// O(N)
	public void print();

}
