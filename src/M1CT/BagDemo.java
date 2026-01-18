package M1CT;

/*
 * M1CT BagDS - Project Task List
 *
 * Setup
 * // DONE: Confirm project builds and runs (BagDemo main prints a message).
 * // DONE: Initialize Git Local Repository
 * // DONE: Initial Commit
 * // DONE: Link to GitHub and do Initial push
 *
 * Bag ADT Implementation
 * // DONE: Make sure I have any needed imports
 * // TODO: Create Bag<T> class.
 * // TODO: Add internal storage (ArrayList).
 * // TODO: Implement add(T item).
 * // TODO: Implement remove(T item) to remove one occurrence if it exists.
 * // TODO: Implement contains(T item).
 * // TODO: Implement count(T item).
 * // TODO: Add a toString() method to print bag contents.
 *
 * Demo Requirements
 * // TODO: Create a Bag instance in main.
 * // TODO: Add several elements including duplicates.
 * // TODO: Print bag contents.
 * // TODO: Test contains() for a few elements.
 * // TODO: Test count() for a few elements.
 * // TODO: Remove an element from the bag.
 * // TODO: Print bag contents again.
 * // TODO: Test contains() for the removed element.
 * // TODO: Test count() for the removed element.
 *
 * Final Checks
 * // TODO: Add short method comments explaining purpose and behavior.
 * // TODO: review pseudocode to confirm it matches the final code.
 */
import java.util.ArrayList;
import java.util.List;

public class BagDemo {

	public static void main(String[] args) {
		System.out.println("BagDS Project Working");

	}

}

class Bag<T> {
	private final List<T> items;
	
	public Bag() {
		items = new ArrayList<>();
	}
	
	public void add(T item) {
		// TODO: implement (add)
	}
	
	public void remove(T item) {
		// TODO: implement this (remove)
	}
	
	public boolean contains(T item) {
		// TODO: implement this (contains)
		return false;
	}
	
	public int count(T item) {
		// TODO: implement this (count)
		return 0;
	}
	
	// Overrides Object.toString() to display the bag contents
	@Override
	public String toString() {
		return items.toString();
	}
}
