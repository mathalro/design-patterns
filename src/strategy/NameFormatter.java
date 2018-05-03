package strategy;

/**
 * Design pattern: Strategy
 * 
 * Objectives: define an algorithm family that can be used independently of the
 * clients that use it
 * 
 * Strategy: interface to the algorithms
 * 
 * @author Matheus Rosa
 *
 */
public interface NameFormatter {
	public String format(String name);
}
