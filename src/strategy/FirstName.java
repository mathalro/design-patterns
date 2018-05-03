package strategy;

/**
 * Concrete Strategy: strategy algorithms
 * 
 * @author Matheus Rosa
 *
 */
public class FirstName implements NameFormatter {

	@Override
	public String format(String name) {
		return name.split(" ")[0];
	}

}
