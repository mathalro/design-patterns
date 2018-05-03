package composite;

import java.util.Vector;

/**
 * Design pattern: Composite
 * 
 * Objective: Create hierarchies all-part allowing to treating uniformly objects
 * and objects family.
 * 
 * Component: composite interface, generic behavior and management of children.
 * 
 * @author Matheus Rosa
 *
 */
public abstract class Product {
	String reference;
	String description;
	double cost;
	Vector<Product> components = null;
	
	boolean isComposite() {
		return false;
	}

	public final boolean compose(Product part) {
		if (isComposite()) {
			if (components == null)
				components = new Vector<>();
			components.add(part);
		}

		return isComposite();
	}

	abstract double price();
}
