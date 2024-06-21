package submission1;

/**
 * This interface displays the abstract method for stack
 * @param <E> the type of items in the stack
 */
public interface StackADT<E> {

	/**
	 * Add an item on the top of the stack
	 * pre-conditions: the item is not null
	 * post-conditions: the size of the stack will be added by 1
	 * @param item  the item to be added to the top of the stack
	 */
	void push(E item);
	
	/**
	 * 
	 * Remove the top item of the stack
	 * pre-condition: the stack is not empty
	 * post-condition: the size will be reduced by 1
	 * @return the item being removed
	 */
	E pop();
	
	/**
	 * Look at the item on the top of the stack
	 * pre-condition: the stack is not empty
	 * post-condition: None
	 * @return the item on the top of the stack
	 */
	E peek();
	
	/**
	 * Return the number of items in the stack
	 * pre-condition: None
	 * post-condition: None
	 * @return the number of the items in the stack
	 */
	int size();
	
	/**
	 * Check if the stack is empty
	 * pre-condition: None
	 * post-condition: None
	 * @return return true if the stack is empty, return false if not
	 */
	boolean isEmpty();
	
	/**
	 * Remove all items in the stack
	 * pre-condition: None
	 * post-condition: the size of the stack will be 0
	 */
	void clear();
	
	/**
	 * Return an array contains all items of the stack in order
	 * pre-condition: None
	 * post-condition: create an array containing all items of the stack
	 * @return an array containing all items of the stack
	 */
	E[] toArray();
	
	/**
	 * Check if the stack contains a specific item
	 * pre-condition: None
	 * post-condition: None
	 * @param item the item to be checked
	 * @return return true if the item is found in the stack, return false if not 
	 */
	boolean contains(E item);
	
	/**
	 * Return the position of the item of the stack
	 * pre-condition: the stack is not empty
	 * post-condition: None
	 * @param item the item to be searched
	 * @return the position of the item, return -1 if item not found
	 */
	int search(E item);

	
}
