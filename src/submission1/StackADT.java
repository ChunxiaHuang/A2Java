package submission1;

import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Iterator;

public interface StackADT<E> extends Serializable {

	 /**
     * Add an item to the top of the stack
     * pre-condition: the item is not null
     * post-condition: the item will be added to the top of the stack
     * @param toAdd the item to be added
     * @throws NullPointerException when the item to add is null
     */
    public void push(E toAdd);

    /**
     * Remove the top item of the stack
     * pre-condition: the stack is not empty
     * post-condition: the size will be reduced by 1
     * @return the item being removed
     * @throws EmptyStackException when the stack is empty
     */
    public E pop();
    
    /**
     * Look at the top item of the stack without removing it
     * pre-condition: the stack is not empty
     * post-condition: the stack remains unchanged
     * @return the item at the top of the stack
     * @throws EmptyStackException when the stack is empty
     */
    public E peek();

    /**
     * Remove all items from the stack
     * pre-condition: none
     * post-condition: the stack will be empty
     */
    public void clear();
    
    /**
     * Check if the stack is empty
     * pre-condition: none
     * post-condition: none
     * @return true if the stack is empty, false
     */
    public boolean isEmpty();

    /**
     * Convert the stack to an array
     * pre-condition: none
     * post-condition: none
     * @return an array containing all items in the stack
     */
    public Object[] toArray();

    /**
     * Convert the stack to an array of a specific type
     * pre-condition: the provided array is not null
     * post-condition: none
     * @param holder the array to hold the stack items
     * @return an array containing all items in the stack
     * @throws NullPointerException when the provided array is null
     */
    public E[] toArray(E[] holder);

    /**
     * Check if the stack contains a specific item
     * pre-condition: the item is not null
     * post-condition: none
     * @param toFind the item to find
     * @return true if the stack contains the item, false otherwise
     * @throws NullPointerException when the item to find is null
     */
    public boolean contains(E toFind);


    /**
     * Find the position of an item in the stack
     * pre-condition: none
     * post-condition: none
     * @param toFind the item to find
     * @return the 1-based position of the item in the stack, or -1 if not found
     */
    public int search(E toFind);

    /**
     * Get an iterator for the stack
     * pre-condition: none
     * post-condition: none
     * @return an iterator for the stack
     */
    public Iterator<E> iterator();

    /**
     * Compare this stack with another stack
     * pre-condition: none
     * post-condition: none
     * @param that the stack to compare with
     * @return true if the stacks are equal, false otherwise
     */
    public boolean equals(StackADT<E> that);

    /**
     * Get the size of the stack
     * pre-condition: none
     * post-condition: none
     * @return the number of items in the stack
     */
    public int size();
}