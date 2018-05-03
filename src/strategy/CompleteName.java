package strategy;

/**
 * Concrete Strategy: strategy algorithms
 * 
 * @author Matheus Rosa
 *
 */
public class CompleteName implements NameFormatter {

	@Override
	public String format(String name) {
		return name;
	}

}
