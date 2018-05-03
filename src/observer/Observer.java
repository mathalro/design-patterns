package observer;

/**
 * Design pattern: Observer
 * 
 * Objective: define a dependency on to much between objects so that one objects
 * changes its states all its dependents are notified.
 * 
 * Abstract Observer: define the notifications 
 * 
 * @author Matheus Rosa
 *
 */
public interface Observer {
	public void notified();
}
