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
 * // DONE: Add internal storage (ArrayList).
 * // DONE: Implement add
 * // DONE: Implement remove to remove one occurrence if it exists.
 * // DONE: Implement contains.
 * // DONE: Implement count.
 * // DONE: Add a toString() method to print bag contents.
 *
 * Demo Requirements
 * // DONE: Create a Bag instance in main.
 * // DONE: Add several names including duplicates.
 * // DONE: Print bag contents.
 * // DONE: Test contains() for a few names.
 * // DONE: Test count() for a few names.
 * // DONE: Remove an name from the bag.
 * // DONE: Print bag contents again.
 * // DONE: Test contains() for the removed name.
 * // DONE: Test count() for the removed name.
 * // DONE: Final Commit
 * // DONE: Push GitHub
 */
import java.util.ArrayList;
import java.util.List;

public class BagDemo {

	public static void main(String[] args) {	
		Bag<String> bag = new Bag<>();
		
		bag.add("Eric"); 
		bag.add("Nate");
		bag.add("Eric"); // duplicate testing
		bag.add("Timothy");
		bag.add("Tyler");
		bag.add("Timothy"); // duplicate testing
		
		System.out.println("BEFORE Removal:");
		System.out.println("Bag's current contents: " + bag);
		
		System.out.println("\nContains Test:\n");
		
		System.out.println("Contains Eric? " + bag.contains("Eric"));
		System.out.println("Contains Sina? " + bag.contains("Sina"));
		
		System.out.println("\nCount Test:\n");
		
		System.out.println("Count of Eric: " + bag.count("Eric"));
		System.out.println("Count of Nate: " + bag.count("Nate"));
		System.out.println("Count of Timothy: " + bag.count("Timothy"));
		System.out.println("Count of Tyler: " + bag.count("Tyler"));
		
		System.out.println("\nAFTER Removal:\n");
		
		System.out.println("Removing one occurrence of Eric and Timothy");
		bag.remove("Eric");
		bag.remove("Timothy");

		System.out.println("\nResults of Removal:");
		System.out.println("Bag contents after removal: " + bag);
		System.out.println("Contains Eric? " + bag.contains("Eric"));
		System.out.println("Count of Eric: " + bag.count("Eric"));
		System.out.println("Contains Timothy? " + bag.contains("Timothy"));
		System.out.println("Count of Timothy: " + bag.count("Timothy"));

	}

}

class Bag<T> {
	private final List<T> items;
	
	public Bag() {
		items = new ArrayList<>();
	}
	
	/** Adds an item to the bag. Duplicates are allowed. */
	public void add(T item) {
		items.add(item);
	}
	
	/** Removes one occurrence of the item from the bag, if it exists. */
	public void remove(T item) {
	    int index = items.indexOf(item);

	    if (index >= 0) {
	        items.remove(index);
	    }
	}
	
	/** Returns true if the item exists in the bag, otherwise false. */
	public boolean contains(T item) {
		return items.contains(item);
	}
	
	/** Returns the number of times the item appears in the bag. */
	public int count(T item) {
	    int total = 0;

	    for (T currentItem : items) {
	        if (currentItem == null && item == null) {
	            total++;
	        } else if (currentItem != null && currentItem.equals(item)) {
	            total++;
	        }
	    }

	    return total;
	}
	
	/** Returns a string representation of the bag contents. */
	@Override
	public String toString() {
		return items.toString();
	}
}
