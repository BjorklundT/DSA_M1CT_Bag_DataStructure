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
 * // DONE: Create Bag<T> class Skeleton.
 * // TODO: Add internal storage (ArrayList).
 * // DONE: Implement add(T item).
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
		
		Bag<String> bag = new Bag<>();
		
		bag.add("Eric"); 
		bag.add("Nate");
		bag.add("Eric"); // duplicate testing
		bag.add("Timothy");
		bag.add("Tyler");
		bag.add("Timothy"); // duplicate testing
		
		System.out.println("Bag's current contents: " + bag);

	}

}

class Bag<T> {
	private final List<T> items;
	
	// Adds one item to the bag
	public Bag() {
		items = new ArrayList<>();
	}
	
	public void add(T item) {
		items.add(item);
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
