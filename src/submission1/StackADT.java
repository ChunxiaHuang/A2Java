package submission1;

import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Iterator;

public class StackADT<E> implements Serializable {

    public void push(E toAdd) {
        /**
         * Add an item to the top of the stack
         * pre-condition: the item is not null
         * post-condition: the item will be added to the top of the stack
         * @param toAdd the item to be added
         * @throws NullPointerException when the item to add is null
         */
    }

    public E pop() {
        /**
         * Remove the top item of the stack
         * pre-condition: the stack is not empty
         * post-condition: the size will be reduced by 1
         * @return the item being removed
         * @throws EmptyStackException when the stack is empty
         */
        return null;
    }

    public E peek() {
        /**
         * Look at the top item of the stack without removing it
         * pre-condition: the stack is not empty
         * post-condition: the stack remains unchanged
         * @return the item at the top of the stack
         * @throws EmptyStackException when the stack is empty
         */
        return null;
    }

    public void clear() {
        /**
         * Remove all items from the stack
         * pre-condition: none
         * post-condition: the stack will be empty
         */
    }

    public boolean isEmpty() {
        /**
         * Check if the stack is empty
         * pre-condition: none
         * post-condition: none
         * @return true if the stack is empty, false
         */
        return false;
    }

    public Object[] toArray() {
        /**
         * Convert the stack to an array
         * pre-condition: none
         * post-condition: none
         * @return an array containing all items in the stack
         */
        return null;
    }

    public E[] toArray(E[] holder) {
        /**
         * Convert the stack to an array of a specific type
         * pre-condition: the provided array is not null
         * post-condition: none
         * @param holder the array to hold the stack items
         * @return an array containing all items in the stack
         * @throws NullPointerException when the provided array is null
         */
        return null;
    }

    public boolean contains(E toFind) {
        /**
         * Check if the stack contains a specific item
         * pre-condition: the item is not null
         * post-condition: none
         * @param toFind the item to find
         * @return true if the stack contains the item, false otherwise
         * @throws NullPointerException when the item to find is null
         */
        return false;
    }

    public int search(E toFind) {
        /**
         * Find the position of an item in the stack
         * pre-condition: none
         * post-condition: none
         * @param toFind the item to find
         * @return the 1-based position of the item in the stack, or -1 if not found
         */
        return 0;
    }

    public Iterator<E> iterator() {
        /**
         * Get an iterator for the stack
         * pre-condition: none
         * post-condition: none
         * @return an iterator for the stack
         */
        return null;
    }

    public boolean equals(StackADT<E> that) {
        /**
         * Compare this stack with another stack
         * pre-condition: none
         * post-condition: none
         * @param that the stack to compare with
         * @return true if the stacks are equal, false otherwise
         */
        return false;
    }

    public int size() {
        /**
         * Get the size of the stack
         * pre-condition: none
         * post-condition: none
         * @return the number of items in the stack
         */
        return 0;
    }
}