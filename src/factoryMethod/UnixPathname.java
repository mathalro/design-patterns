package factoryMethod;

/**
 * Concrete Product: implements the product interface
 * 
 * @author Matheus Rosa
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
