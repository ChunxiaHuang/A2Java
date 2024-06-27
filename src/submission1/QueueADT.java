package submission1;

import java.io.Serializable;
import java.util.Iterator;

public interface QueueADT<E> extends Serializable {

	 /**
     * Add an item to the end of the queue
     * pre-condition: the item is not null
     * post-condition: the item will be added to the end of the queue
     * @param toAdd the item to be added
     * @throws NullPointerException when the item to add is null
     */
    public void enqueue(E toAdd);

    /**
     * Remove the front item of the queue
     * pre-condition: the queue is not empty
     * post-condition: the size will be reduced by 1
     * @return the item being removed
     * @throws EmptyQueueException when the queue is empty
     */
    public E dequeue();

    /**
     * Look at the front item of the queue without removing it
     * pre-condition: the queue is not empty
     * post-condition: the queue remains unchanged
     * @return the item at the front of the queue
     * @throws EmptyQueueException when the queue is empty
     */
    public E peek();
  
    /**
     * Remove all items from the queue
     * pre-condition: none
     * post-condition: the queue will be empty
     */
    public void dequeueAll();

    /**
     * Check if the queue is empty
     * pre-condition: none
     * post-condition: none
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Get an iterator for the queue
     * pre-condition: none
     * post-condition: none
     * @return an iterator for the queue
     */
    public Iterator<E> iterator();

    /**
     * Compare this queue with another queue
     * pre-condition: none
     * post-condition: none
     * @param that the queue to compare with
     * @return true if the queues are equal, false otherwise
     */
    public boolean equals(QueueADT<E> that);

    /**
     * Convert the queue to an array
     * pre-condition: none
     * post-condition: none
     * @return an array containing all items in the queue
     */
    public Object[] toArray();

    /**
     * Convert the queue to an array of a specific type
     * pre-condition: the provided array is not null
     * post-condition: none
     * @param holder the array to hold the queue items
     * @return an array containing all items in the queue
     * @throws NullPointerException when the provided array is null
     */
    public E[] toArray(E[] holder);

    /**
     * Check if the queue is full (optional method)
     * pre-condition: none
     * post-condition: none
     * @return true if the queue is at capacity, false otherwise
     */
    public boolean isFull();

    /**
     * Get the size of the queue
     * pre-condition: none
     * post-condition: none
     * @return the number of items in the queue
     */
    public int size();
}