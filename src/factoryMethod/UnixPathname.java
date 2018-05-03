package factoryMethod;

/**
 * @author Matheus Rosa
 * 
 * Concrete Product: implements the product interface
 *
 */
public class UnixPathname extends Pathname {

	public UnixPathname(String pathname) {
		this.pathname = pathname;
	}
	
	@Override
	public String getSeparator() {
		return "/";
	}

}
